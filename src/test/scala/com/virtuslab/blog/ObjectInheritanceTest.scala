package com.virtuslab.blog

class ObjectInheritanceTest extends BaseTest {

  it should "inherit some methods but it does not" in {
    class Foo

    val m = stub[Foo]

    intercept[NoSuchMethodException] {
      m.hashCode _ when() returning 5
    }
  }
}
