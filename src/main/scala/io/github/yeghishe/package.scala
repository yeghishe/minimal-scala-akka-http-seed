package io.github

import akka.event.LoggingAdapter
import akka.http.scaladsl.server.Route
import de.heikoseeberger.akkahttpcirce.CirceSupport

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

