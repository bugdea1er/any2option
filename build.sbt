ThisBuild / name := "any2option"
ThisBuild / version := "1.0"
ThisBuild / homepage := Some(url("https://github.com/bugdea1er/any2option"))
ThisBuild / description := "Implicit conversion method to convert any value to option"
ThisBuild / licenses := List("Apache-2.0" -> url("https://github.com/bugdea1er/any2option/blob/main/LICENSE"))
ThisBuild / developers := List(Developer("bugdea1er", "Ilya Andreev", "@bugdea1er", url("https://github.com/bugdea1er")))
ThisBuild / scalaVersion := "2.13.11"

lazy val root = project in file(".")
ThisBuild / libraryDependencies += "org.junit.jupiter" % "junit-jupiter" % "5.9.2" % Test
