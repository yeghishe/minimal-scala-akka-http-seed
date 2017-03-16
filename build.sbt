name := "minimal-scala-akka-http-seed"
organization := "io.github.yeghishe"
version := "0.0.1"
scalaVersion := "2.12.1"
scalacOptions := Seq("-unchecked", "-feature", "-deprecation", "-encoding", "utf8")

resolvers += Resolver.jcenterRepo

libraryDependencies ++= {
  val catsV          = "0.9.0"
  val akkaHttpV      = "10.0.3"
  val circeV         = "0.7.0"
  val ficusV         = "1.4.0"
  val scalaMockV     = "3.4.2"
  val catsScalatestV = "2.2.0"

  Seq(
    "org.typelevel"     %% "cats-core"       % catsV,
    "com.iheart"        %% "ficus"           % ficusV,
    "com.typesafe.akka" %% "akka-http"       % akkaHttpV,
    "de.heikoseeberger" %% "akka-http-circe" % "1.12.0",
    "io.circe"          %% "circe-core"      % circeV,
    "io.circe"          %% "circe-generic"   % circeV,
    "io.circe"          %% "circe-parser"    % circeV,
    "org.scalamock"     %% "scalamock-scalatest-support" % scalaMockV     % "it,test",
    "com.ironcorelabs"  %% "cats-scalatest"              % catsScalatestV % "it,test",
    "com.typesafe.akka" %% "akka-http-testkit"           % akkaHttpV      % "it,test"
  )
}

lazy val root = project.in(file(".")).configs(IntegrationTest)
Defaults.itSettings
Revolver.settings
enablePlugins(JavaAppPackaging)


initialCommands := """
import cats._
import cats.data._
import cats.implicits._
import akka.actor._
import akka.pattern._
import akka.util._
import scala.concurrent._
import scala.concurrent.duration._
""".stripMargin
