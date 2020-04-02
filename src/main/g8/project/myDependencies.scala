
import sbt._
import Keys._

object myDependencies {

  // Define here the versions of your dependencies
  lazy val version = new {
    val scalaTest  = "3.1.1"
    val scalactic  = "3.1.1"
    val catsEffect = "2.1.1"
  }

  // Dependencies uses in all the modules
  lazy val commonProjectDependencies = new {
    val test = "org.scalatest" %% "scalatest" % version.scalaTest % Test
  }

  lazy val $module0;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test
  )

  lazy val $module1;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test
  )

  lazy val $module2;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test
  )

  lazy val $module3;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test,
    "org.scalactic" %% "scalactic" % version.scalactic
  )

  lazy val $module4;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test
  )

  lazy val $module5;format="word,lower"$Dependencies = Seq(
    commonProjectDependencies.test,
    "org.typelevel" %% "cats-effect" % version.catsEffect
  )
}
