name := "kamon-test"

version := "1.0"

scalaVersion := "2.11.7"

libraryDependencies ++= Seq(
  "io.kamon" %% "kamon-core" % "0.4.0"
  // [Optional]
  ,"io.kamon" %% "kamon-newrelic" % "0.4.0"
  , "io.kamon" %%  "kamon-system-metrics"  % "0.4.0"
  )