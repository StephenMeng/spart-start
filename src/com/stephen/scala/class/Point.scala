package com.stephen.scala.`class`

import com.stephen.scala.`trait`.Equal


class Point(xc: Int, yc: Int) extends Equal {
  var x: Int = xc
  var y: Int = yc

  def range(): Int = {
    x * y
  }

  override def isEqual(obj: Any): Boolean = {
    obj.isInstanceOf[Point] && obj.asInstanceOf[Point].x == x && obj.asInstanceOf[Point].y == y
  }
}
