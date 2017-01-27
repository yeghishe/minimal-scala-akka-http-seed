package io.github

import akka.actor.ActorSystem
import akka.event.Logging
import de.heikoseeberger.akkahttpcirce.CirceSupport
import akka.http.scaladsl.server.Route
import akka.event.LoggingAdapter
import scala.concurrent.ExecutionContext

package object yeghishe {
  trait BaseComponent extends Config {
    protected implicit def log: LoggingAdapter
    protected implicit def executor: ExecutionContext
  }

  trait BaseService extends BaseComponent with CirceSupport {
    protected def routes: Route
  }
}

