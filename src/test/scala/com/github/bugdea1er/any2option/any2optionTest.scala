package com.github.bugdea1er.any2option

import org.scalatest.flatspec.AnyFlatSpec
import org.scalatest.matchers.should

/** Tests for implicit any to option conversion */
final class any2optionTest extends AnyFlatSpec with should.Matchers {
  "Int" should "be implicitly converted to Option" in {
    val integer: Int = 42
    val option: Option[Int] = integer

    option should be (Some(integer))
  }

  "String" should "be implicitly converted to Option" in {
    val string: String = "Hello"
    val option: Option[String] = string

    option should be (Some(string))
  }

  "Null" should "be implicitly converted to None" in {
    val nullValue: Any = null
    val option: Option[Any] = nullValue

    option should be (None)
  }

  "Option" should "remain Option" in {
    val option1: Option[Int] = Some(42)
    val option2: Option[Int] = option1

    option1 should be (option2)
  }

  "Option" should "be implicitly converted to nested Option" in {
    val option: Option[Int] = Some(42)
    val nested: Option[Option[Int]] = option

    nested should be (Some(option))
  }
}
