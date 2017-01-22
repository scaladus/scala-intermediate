import sbt._

object Dependencies {

  val monocleVersion = "1.4.0"
  val circeVersion = "0.7.0"
  val catsVersion = "0.9.0"

  val cats = Seq("org.typelevel" %% "cats" % catsVersion)

  val circe = Seq(
    "io.circe" %% "circe-core" % circeVersion,
    "io.circe" %% "circe-generic" % circeVersion,
    "io.circe" %% "circe-parser" % circeVersion
  )

  val shapeless = Seq("com.chuusai" %% "shapeless" % "2.3.2")

  val monocle = Seq(
    "com.github.julien-truffaut" %% "monocle-core" % monocleVersion,
    "com.github.julien-truffaut" %% "monocle-macro" % monocleVersion,
    "com.github.julien-truffaut" %% "monocle-law" % monocleVersion % "test"
  )


  val all: Seq[ModuleID] = cats ++ circe ++ shapeless ++ monocle

  val specs2 = Seq("org.specs2" %% "specs2-core" % "3.8.7" % "test")
  val scalaCheck = Seq("org.scalacheck" %% "scalacheck" % "1.13.4" % "test")

  val allTest: Seq[ModuleID] = specs2 ++ scalaCheck
}
