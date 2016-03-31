package com.virtuslab.blog

class IntroductionTest extends BaseTest {

  it should "hello world" in {
    class Foo {
      def bar = 5
    }

    val m = mock[Foo]

    m.bar _ expects() returning 6

    m.bar === 6
  }

}
