import sbt._
import Keys._

object Common {
  // add buildInfoSettings ++ 
  val commonSettings = Seq(
    organization := "org.hnlab.fp",
    version := "1.0",
    libraryDependencies += "org.specs2" % "specs2_2.10" % "2.0" % "test" 
  )
  
  def ExercisesProject(name: String): Project = {
    Project(name, file(name)).settings(commonSettings:_*)
  }
  
  def InlineProject(name: String): Project = {
    Project(name, file(name)).settings(commonSettings:_*)
  }

}