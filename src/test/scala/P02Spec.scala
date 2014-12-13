package org.p99.scala

import org.scalatest._
import P02.penultimate

class P02Spec extends UnitSpec {


	"penultimate" should "be right" in {
		val res = penultimate(List(1, 1, 2, 3, 5, 8))
    assert(res == Some(5))
	}
"penultimate" should "fail for small lists" in {
    assert(penultimate(Nil) == None)
    assert(penultimate(3::Nil) == None)
  }

}

