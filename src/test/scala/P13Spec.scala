package org.p99.scala

import org.scalatest._

import P13.encode

class P13Spec extends UnitSpec {
  it should "do run length encoding" in {
    assert(encode(Nil) == Nil)
    assert(encode(List("goody")) == List((1, "goody")))
    assert(encode(List(2, 2, 2, 4, 1,1,1,1)) ==
      List((3,2), (1,4), (4,1)))
  }
}

