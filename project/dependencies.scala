import sbt._

object Dependencies {
  // Versions
  
  // Libraries
  val specs2 = "org.specs2" %% "specs2" % "2.0"
  
  // Projects
  val exercisesDependencies = Seq(specs2 % "test")
  val inlineDependencies = Seq(specs2 % "test")
}