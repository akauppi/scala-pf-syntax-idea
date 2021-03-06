// build.sbt
//
name := "scala-pf-syntax-idea"
scalaVersion := "2.12.6"

scalacOptions ++= Seq(
  "-deprecation",
  "-encoding", "utf8",
  "-feature",
  "-unchecked",
  "-language", "postfixOps"
)

libraryDependencies += "org.scalatest" %% "scalatest" % "3.0.5" % Test
