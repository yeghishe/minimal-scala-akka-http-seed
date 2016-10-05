name          := "minimal-scala-akka-http-seed"
organization  := "io.github.yeghishe"
version       := "0.0.1"
scalaVersion  := "2.11.8"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val scalazV          = "7.3.0-M5"
  val akkaV            = "2.4.11"
  val ficusV           = "1.2.7"
  val scalaTestV       = "3.0.0"
  val scalaMockV       = "3.3.0"
  val scalazScalaTestV = "1.0.0"
  Seq(
    "org.scalaz"        %% "scalaz-core"                       % scalazV,
    "com.typesafe.akka" %% "akka-http-core"                    % akkaV,
    "com.typesafe.akka" %% "akka-http-experimental"            % akkaV,
    "com.typesafe.akka" %% "akka-http-spray-json-experimental" % akkaV,
    "com.iheart"        %% "ficus"                             % ficusV,
    "org.scalatest"     %% "scalatest"                         % scalaTestV       % "it,test",
    "org.scalamock"     %% "scalamock-scalatest-support"       % scalaMockV       % "it,test",
    "org.scalaz"        %% "scalaz-scalacheck-binding"         % scalazV          % "it,test",
    "org.typelevel"     %% "scalaz-scalatest"                  % scalazScalaTestV % "it,test",
    "com.typesafe.akka" %% "akka-http-testkit"                 % akkaV            % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings
Revolver.settings
enablePlugins(JavaAppPackaging)

initialCommands := """|import scalaz._
                      |import Scalaz._
                      |import akka.actor._
                      |import akka.pattern._
                      |import akka.util._
                      |import scala.concurrent._
                      |import scala.concurrent.duration._""".stripMargin

