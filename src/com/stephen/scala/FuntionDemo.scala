package com.stephen.scala

import com.stephen.scala.`class`.{Location, Point}

object FuntionDemo {
  def main(args: Array[String]): Unit = {
    println(matchTest(1))
    println(matchTest(2))
    println(matchTest(3))
    println(matchTest(12))

    var p1 = new Point(3, 5)
    println(p1.range())
    var p2 = new Point(3, 5)
    println(p2.isEqual(p1))
    var p3 = new Point(3, 6)
    println(p3.isEqual(p1))
    var l = new Location(3, 5, 6)
    println(l.range())
    //    println(sub(b = 3, a = 5))
    //    printStrings("a", "b", "c")
    //    println(apply(add, 2, 5))
    //
    //    var defaultAdd = add(8, _: Int)
    //    println(defaultAdd(7))
    //    println(concat("meng ", "fansai"))
    //
    //    array(7)
    //    listTest(6)
    //    iteratorTest(2)
  }

  def add(a: Int, b: Int): Int = {
    a + b;
  }

  def sub(a: Int, b: Int): Int = {
    a - b;
  }

  def printStrings(args: String*): Unit = {
    var i: Int = 0
    for (arg <- args) {
      println("Arg value[" + i + "] = " + arg)
      i = i + 1
    }
  }

  def apply(f: (Int, Int) => Int, v: Int, w: Int): Int = {
    f(v, w)
  }

  def concat(before: String, after: String): String = {
    before.concat(after)
  }

  def array(n: Int): Array[String] = {
    var result: Array[String] = Array("0", "" + n)
    for (item <- result) {
      println(item)
    }
    result
  }

  def listTest(n: Int): List[String] = {
    var l1 = "meng" :: ("fansai" :: Nil)
    var l2 = "x" :: ("y" :: Nil)
    for (item <- l1) {
      println(item)
    }
    for (item <- (l1.:::(l2))) {
      println(item)
    }
    l1
  }

  def iteratorTest(n: Int): Unit = {
    var l1 = Iterator("meng", "fan", "sai")
    while (l1.hasNext) {
      println(l1.next())
    }

  }

  def matchTest(x: Int): String = x match {
    case 1 => "meng"
    case 2 => "fan"
    case 3 => "sai"
    case _ => "ok"
  }
}
