package org.p99.scala

object P13 {
  def encode[X]( list : List[X] ):List[(Int,X)] = list match {
    case Nil => Nil
    case x::xs => combine((1, x), xs.map((y)=> (1, y)))
  }

  //@TailRecursive
  private def combine[X](item : (Int, X), items : List[(Int,X)]) : List[(Int,X)] = items match {
    case Nil => Nil
    case x::xs => 
      if (x._2 == item._2) {
        val first = (x._1 + item._1, x._2) 
        first :: combine(first, xs)
      } else {
        item :: combine(x, xs)
      }
  }

}


//encode :: [a] -> [(Int, a)]

//encodeInner :: [a] -> (Int, a) -> [(Int,a)]

