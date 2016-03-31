package com.virtuslab.blog

class MockingCaseClassesTest extends BaseTest {

  it should "first try" in {
    case class Foo(a: String)
    class MockableFoo extends Foo("")

    Set(stub[MockableFoo], stub[MockableFoo], stub[MockableFoo], stub[MockableFoo])
  }

  it should "second try" in {
    case class Foo(a: String)
    class MockableFoo extends Foo("")

    intercept[NullPointerException] {
      Set(stub[MockableFoo], stub[MockableFoo], stub[MockableFoo], stub[MockableFoo], stub[MockableFoo])
    }
  }

  it should "third try" in {
    case class Foo(a: Int)
    class MockableFoo extends Foo(0)

    Set(stub[MockableFoo], stub[MockableFoo], stub[MockableFoo], stub[MockableFoo], stub[MockableFoo])
  }

  it should "fourth try" in {
    case class Foo(a: Int)
    class MockableFoo extends Foo(0)
    case class Bar(a: String)
    class MockableBar extends Bar("")

    stub[MockableFoo].hashCode
    intercept[NullPointerException] {
      stub[MockableBar].hashCode
    }
  }

}
