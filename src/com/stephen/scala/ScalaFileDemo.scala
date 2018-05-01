package com.stephen.scala

import java.io.{File, PrintWriter}

import scala.io.Source

object ScalaFileDemo {
  def main(args: Array[String]): Unit = {
    //    var line = Console.readLine()
    //    print(line)

    var w = new PrintWriter(new File("test.txt"));
    w.write("ok\r\n ok")
    w.close()

    Source.fromFile("test.txt").getLines().foreach {
      println
    }
  }
}
