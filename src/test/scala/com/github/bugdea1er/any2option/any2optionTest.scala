package com.github.bugdea1er.any2option

import org.junit.jupiter.api.Assertions.assertEquals
import org.junit.jupiter.api.Test

/** Tests for implicit any to option conversion */
final class any2optionTest {

  /** Tests implicit option conversion with Int */
  @Test def intConversion(): Unit = {
    val integer: Int = 42
    val option: Option[Int] = integer

    assertEquals(Some(integer), option)
  }

  /** Tests implicit option conversion with String */
  @Test def stringConversion(): Unit = {
    val string: String = "Hello"
    val option: Option[String] = string

    assertEquals(Some(string), option)
  }

  /** Tests implicit option conversion with null */
  @Test def nullConversion(): Unit = {
    val nullValue: Any = null
    val option: Option[Any] = nullValue

    assertEquals(None, option)
  }

  /** Tests that this conversion doesn't mess with regular assignment */
  @Test def optionConversion(): Unit = {
    val option1: Option[Int] = Some(42)
    val option2: Option[Int] = option1

    assertEquals(option1, option2)
  }

  /** Tests implicit option conversion with nested options */
  @Test def nestedOptionConversion(): Unit = {
    val option: Option[Int] = Some(42)
    val nested: Option[Option[Int]] = option

    assertEquals(Some(option), nested)
  }

  /** Shows one of possible uses */
  @Test def demonstration(): Unit = {
    def helper[T](flag: Boolean, value: => T): Option[T] = {
      if (flag) value else None
    }

    assertEquals(Some(42), helper(flag = true, 42))
    assertEquals(Some("Hello"), helper(flag = true, "Hello"))
    assertEquals(None, helper(flag = false, null))
  }
}
