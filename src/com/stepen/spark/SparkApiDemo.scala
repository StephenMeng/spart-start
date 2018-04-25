package com.stepen.spark

import org.apache.spark.{SparkConf, SparkContext}

object SparkApiDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mySpark")
    //setMaster("local") 本机的spark就用local，远端的就写ip
    //如果是打成jar包运行则需要去掉 setMaster("local")因为在参数中会指定。
    conf.setMaster("local")
    val sc = new SparkContext(conf)
//    partitionTest(sc)
    dependencyTest(sc)
  }

  def partitionTest(sc: SparkContext): Unit = {
    var rdd=sc.parallelize(1 to 10)
    println(rdd)
    println(rdd.partitions.size)
  }
  def dependencyTest(sc: SparkContext): Unit = {
    var rdd=sc.makeRDD(1 to 10)
    var mapRDD=rdd.map(x=>(x,x))
    println(mapRDD.dependencies)
  }
}
