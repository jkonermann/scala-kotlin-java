package com.github.kmizu.scala_kotlin_java

object ScalaFile {
  class ScalaClass(val name: String) extends KotlinClass(name)

  def main(args: Array[String]): Unit = {
    println(new ScalaClass("Scala").name)
  }
}
