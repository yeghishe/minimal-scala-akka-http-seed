package io.github.yeghishe

import akka.event.LoggingAdapter
import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport
import akka.stream.ActorFlowMaterializer
import scala.concurrent.ExecutionContext

trait BaseService extends Protocol with SprayJsonSupport with Config {
  protected implicit def executor: ExecutionContext
  protected implicit def materializer: ActorFlowMaterializer
  protected def log: LoggingAdapter
}
