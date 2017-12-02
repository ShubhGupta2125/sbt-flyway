libraryDependencies ++= Seq(
  "org.postgresql" % "postgresql" % "9.3-1100-jdbc4",
  "com.typesafe.slick" %% "slick" % "2.1.0",
  "org.slf4j" % "slf4j-nop" % "1.6.4",
  "com.h2database" % "h2" % "1.4.191"
)

flywayUrl := "jdbc:postgresql://localhost:5432/flywayexample?user=flywayexample&password=flywayexample"

