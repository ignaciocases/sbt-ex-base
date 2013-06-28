import sbt._
import Common._
import Dependencies._

lazy val exercises = (
  ExercisesProject("exercises")
  settings()
)

lazy val inline = (
  InlineProject("inline")
  settings()
)

// Custom keys for this build.

val gitHeadCommitSha = taskKey[String]("Determines the current git commit SHA")

val makeVersionProperties = taskKey[Seq[File]]("Creates a version.properties file we can find at runtime.")

gitHeadCommitSha in ThisBuild := Process("git rev-parse HEAD").lines.head
