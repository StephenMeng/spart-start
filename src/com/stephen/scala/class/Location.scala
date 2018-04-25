package com.stephen.scala.`class`

class Location(val xc: Int, val yc: Int, val zc: Int) extends Point(xc, yc) {
  var z: Int = zc

  override def range(): Int = {
    x * y * z
  }
}
