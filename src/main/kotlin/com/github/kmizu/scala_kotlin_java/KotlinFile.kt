package com.github.kmizu.scala_kotlin_java

open class KotlinClass(open val name: String)

fun main(args: Array<String>) {
    println(KotlinClass("Kotlin").name)
}