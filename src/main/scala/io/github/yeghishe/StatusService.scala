package io.github.yeghishe

import java.lang.management.ManagementFactory
import akka.http.scaladsl.server.Directives._
import scala.concurrent.duration._

trait StatusService extends BaseService {
  protected val statusRoutes = pathPrefix("status") {
    get {
      log.info("/status executed")
      complete(Status(Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toString()))
    }
  }
}
