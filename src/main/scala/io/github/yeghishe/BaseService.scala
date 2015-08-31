package io.github.yeghishe

import akka.actor.ActorSystem
import akka.event.{ Logging, LoggingAdapter }
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.stream.ActorMaterializer

trait BaseService extends Protocol with SprayJsonSupport with Config {
  protected def serviceName: String
  protected def system: ActorSystem
  protected def materializer: ActorMaterializer
  protected def log: LoggingAdapter = Logging(system, serviceName)
}
