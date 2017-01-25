name := """example-app"""

version := "1.0-SNAPSHOT"

lazy val root = (project in file(".")).enablePlugins(PlayJava)

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  javaJdbc,
  cache,
  javaWs
)

// Play router style
routesGenerator := InjectedRoutesGenerator

// Application packaging
enablePlugins(DebianPlugin)
maintainer := “Sameh <sameh@nilogix.com>“
packageSummary := "example-app package"
packageDescription := "example-app package description"

