name := "OwaspASER"

version := "1.0"

scalaVersion := "2.12.2"

enablePlugins(JettyPlugin)

libraryDependencies ++= {
  val liftVersion = "3.1.0"
  Seq(
    "net.liftweb"       %% "lift-webkit" % liftVersion % "compile",
    "ch.qos.logback" % "logback-classic" % "1.1.3"
  )
}
