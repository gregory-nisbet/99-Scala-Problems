package org.p99.scala

import org.scalatest._
import P03.nth

class P03Spec extends UnitSpec {

  "nth" should "give the nth member of the list" in {
    assert(nth(3, List(4, 3, 8, 12, 2)) == 12)
    assert(nth(0, List(3, 4)) == 3)
  }

 "nth" should "fail if the index is out of bounds" in {
    intercept[IndexOutOfBoundsException] {
      nth(-1, List())
    }
  } 

}

