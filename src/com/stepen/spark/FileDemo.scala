package com.stepen.spark

import org.apache.spark.{SparkConf, SparkContext}

object FileDemo {
  def main(args: Array[String]): Unit = {
    val conf = new SparkConf().setAppName("mySpark")
    //setMaster("local") 本机的spark就用local，远端的就写ip
    //如果是打成jar包运行则需要去掉 setMaster("local")因为在参数中会指定。
    conf.setMaster("local")
    val sc = new SparkContext(conf)
    partitionTest(sc)
  }

  def partitionTest(sc: SparkContext): Unit = {
    var rdd=sc.parallelize(1 to 10,2);
    println(rdd.partitions.size)
  }
}
