name := "OwaspASER"

version := "1.0"

scalaVersion := "2.12.2"

enablePlugins(JettyPlugin)
enablePlugins(PlayScala)

resolvers += Resolver.sonatypeRepo("snapshots")

libraryDependencies ++= {
  val liftVersion = "3.1.0"
  Seq(
    guice,
    "org.scalatestplus.play" %% "scalatestplus-play" % "3.0.0",
    "com.h2database"         % "h2"                  % "1.4.194",
    "net.liftweb"            %% "lift-webkit"        % liftVersion % "compile",
    "ch.qos.logback"         % "logback-classic"     % "1.1.3"
  )
}
