package m0.git

import org.scalatest.{FunSuite, Matchers}

class CalculationsTests extends FunSuite with Matchers {

  test("47 + 3 should be 50") {
    Calculations.add47(3) should equal(50)
  }
}
