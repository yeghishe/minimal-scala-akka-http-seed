package io.github.yeghishe

import akka.actor.ActorSystem
import akka.event.{ Logging, LoggingAdapter }
import akka.http.scaladsl.Http
import akka.stream.ActorFlowMaterializer
import scala.concurrent.ExecutionContext

object Main extends App with Config with Service {
  private implicit val system = ActorSystem()

  override protected implicit val executor: ExecutionContext = system.dispatcher
  override protected val log: LoggingAdapter = Logging(system, getClass)
  override protected implicit val materializer: ActorFlowMaterializer = ActorFlowMaterializer()

  Http().bindAndHandle(routes, httpInterface, httpPort)
}
