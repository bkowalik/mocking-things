package com.virtuslab.blog

import org.scalamock.scalatest.MockFactory
import org.scalatest.{FlatSpec, Matchers}

abstract class BaseTest
  extends FlatSpec
    with Matchers
    with MockFactory
