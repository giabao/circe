scalaVersion := "2.13.3"

scalacOptions += "-deprecation"

libraryDependencies ++= Seq(
  "io.circe"    %% "circe-generic"  % "0.13.0",
  "io.circe"    %% "circe-iteratee" % "0.13.0",
  "io.iteratee" %% "iteratee-files" % "0.19.0"
)
