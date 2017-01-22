import Dependencies._

addCompilerPlugin("org.scalamacros" % "paradise" % "2.1.0" cross CrossVersion.full)
addCompilerPlugin("org.spire-math" %% "kind-projector" % "0.9.3")

val simulacrum = Seq("com.github.mpilquist" %% "simulacrum" % "0.10.0")

lazy val root = (project in file(".")).
  settings(
    inThisBuild(List(
      organization := "de.sugdus",
      scalaVersion := "2.11.8",
      version := "0.1.0-SNAPSHOT"
    )),
    name := "intermediate",
    libraryDependencies ++= all ++ allTest ++ simulacrum
  )

