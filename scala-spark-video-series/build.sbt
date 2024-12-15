ThisBuild / version := "0.1.0-SNAPSHOT"

ThisBuild / scalaVersion := "2.13.15"

lazy val root = (project in file("."))
  .settings(
    name := "spark-video-course",
//    idePackagePrefix := Some("lk.inuka.sparkvideocourse")
  )

libraryDependencies += "org.apache.spark" %% "spark-core" % "3.5.3"

libraryDependencies += "org.apache.spark" %% "spark-sql" % "3.5.3" % "provided"
