package org.p99.scala

object P04 {

  def size[A](list : List[A]):Int = list match {
    case Nil => 0
    case _::rest => 1+ size(rest)
  }

}
