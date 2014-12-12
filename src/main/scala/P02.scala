package org.p99.scala

object P02 {
  
  def penultimate[A](xs: List[A]) : Option[A] = xs match {
    case Nil => None
    case x::Nil => None
    case _ => Some( (xs reverse)(1) )
  }
}
