package org.p99.scala

object P01 {
  def last[A](x : List[A]) : Option[A] = x match {
    case Nil => None
    case _ => Some(x(x.length-1))
  }

}
