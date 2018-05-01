package com.stepen.spark.api

import org.apache.spark.{SparkConf, SparkContext}

object PageRankDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mySpark")
    conf.setMaster("local")
    val sc = new SparkContext(conf)
    val links=sc.parallelize(Array(('A',Array('D')),('B',Array('A')),('C',Array('A','B')),('D',Array('A','C'))),2)
      .map(x=>(x._1,x._2)).cache()
    var ranks=sc.parallelize(Array(('A',1.0),('B',1.0),('C',1.0),('D',1.0)),2)
    for(i<-1 to 10){
      val contributions=links.join(ranks,2).flatMap{
        case (url,(link,rank))=>link.map(dest=>(dest,rank/link.size))
      }
      ranks=contributions.reduceByKey(_+_,2).mapValues(0.15+0.85*_)
    }
    for(v<-ranks){
      println(v)
    }
  }
}
