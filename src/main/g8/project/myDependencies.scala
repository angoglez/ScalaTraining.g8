import sbt._
import Keys._

object myDependencies {

  lazy val version = new {
    val scalaTest = "3.1.1"
  }

  lazy val projectDependencies = new {
    val test = "org.scalatest" %% "scalatest" % version.scalaTest % Test
  }

  lazy val $module0;format="word,lower"$Dependencies = Seq(
    projectDependencies.test
  )

  lazy val $module1;format="word,lower"$Dependencies = Seq(
    projectDependencies.test
  )
}
