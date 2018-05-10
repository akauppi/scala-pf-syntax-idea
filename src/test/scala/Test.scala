package test

import org.scalatest.{FlatSpec, Matchers}

class Test extends FlatSpec with Matchers {

  behavior of "Partial Function syntaxes"

  // Problem with full type after the cases are:
  //
  //  - long syntax (needing `PartialFunction`)
  //  - they are after the cases. If cases are long (often they are), this makes the return type go far, far,
  //    away from the function name. Unlike with normal functions.
  //
  it should "full type after the cases" in {
    val pf = { case 0 => "zero" } : PartialFunction[Any, String]

    pf(0) shouldBe "zero"
    pf.isDefinedAt(1) shouldBe false
  }

  // Problem with full type before the cases:
  //
  //  - long syntax (needing `PartialFunction`)
  //  - using 'val' instead of 'def' - primes the reader's brain wrong (like 'val f: Function1[String] = ...')
  //
  it should "full type before the cases" in {
    val pf: PartialFunction[Any,String] = { case 0 => "zero" }

    pf(0) shouldBe "zero"
    pf.isDefinedAt(1) shouldBe false
  }

  // Suggestion:
  //
  //  - short syntax (no need for `PartialFunction`)
  //  - uses 'def', making this look similar to a full function
  //
  it should "proposed 'def' syntax" ignore /*in*/ {
    /*
    // Gives "missing parameter type for expanded function" (Scala 2.12.6)
    def pf: String = { case 0 => "zero" }   // does not compile

    pf(0) shouldBe "zero"
    pf.isDefinedAt(1) shouldBe false
    */
  }
}