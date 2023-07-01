/*
 * Copyright 2023 Ilya Andreev
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package com.github.bugdea1er

/** Provides an implicit conversion method to convert any value to option */
package object any2option {
  import scala.language.implicitConversions

  /** Implicitly converts any value of type A to an Option[A]
    *
    * @example {{{
    *   import com.github.bugdea1er.any2option._
    *
    *   val intValue: Int = 42
    *   val optionValue: Option[Int] = intValue
    *   println(optionValue) // Some(42)
    *
    *   val stringValue: String = "Hello"
    *   val optionValue2: Option[String] = stringValue
    *   println(optionValue2) // Some("Hello")
    *
    *   val nullValue: Any = null
    *   val optionValue3: Option[Any] = nullValue
    *   println(optionValue3) // None
    * }}}
    * @tparam A type of the value
    */
  @inline implicit def any2option[A <: Any]: A => Option[A] = Option.apply
}
