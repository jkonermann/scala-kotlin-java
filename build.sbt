organization := "com.github.kmizu"

name := "scala-kotlin-java"

scalaVersion := "2.12.3"

scalacOptions ++= Seq("-unchecked", "-deprecation", "-feature", "-language:implicitConversions")

kotlinLib("stdlib")

assemblyJarName in assembly := "skj.jar"
