package org.p99.scala

import org.scalatest._
import P04.size

class P04Spec extends UnitSpec {
  it should "know its size" in {
    assert(size(List(1, 1 ,1)) == 3)
    assert(size(Nil) == 0)
  }
}

