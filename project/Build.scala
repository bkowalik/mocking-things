import sbt._
import Keys._

object Build extends Build {

  lazy val project = Project("mocking-things", file("."))
    .settings(
      version := "0.1.0",
      scalaVersion := "2.11.8",
      libraryDependencies ++= Seq(
        "com.chuusai" %% "shapeless" % "2.3.0",
        "org.scalatest" %% "scalatest" % "2.2.4" % "test",
        "org.scalamock" %% "scalamock-scalatest-support" % "3.2.2" % "test"
      )
    )

}
