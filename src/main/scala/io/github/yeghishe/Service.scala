package io.github.yeghishe

import akka.http.scaladsl.server.Directives._

trait Service extends BaseService {
  protected val serviceName = "my service"
  protected val routes = get {
    log.info("/ executed")
    complete("OK")
  }
}
