package org.p99.scala

import org.scalatest._

class P01Spec extends UnitSpec {

  "last" should "return last element" in {
    val list = List(1,2,3,4)
    assert(P01.last(list) == Some(4))
  }

  "last" should "empty list" in {
    assert(P01.last(List()) == None)
  }

}

