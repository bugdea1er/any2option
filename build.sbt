name := "any2option"
version := "1.0"
homepage := Some(url("https://github.com/bugdea1er/any2option"))
description := "Implicit conversion method to convert any value to option"
licenses := List("Apache-2.0" -> url("https://github.com/bugdea1er/any2option/blob/main/LICENSE"))
developers := List(Developer("bugdea1er", "Ilya Andreev", "@bugdea1er", url("https://github.com/bugdea1er")))
scalaVersion := "2.13.11"

lazy val root = project in file(".")
libraryDependencies += "org.scalatest" %% "scalatest" % "3.2.15" % Test
