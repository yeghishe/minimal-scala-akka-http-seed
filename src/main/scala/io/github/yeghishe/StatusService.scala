package io.github.yeghishe

import java.lang.management.ManagementFactory
import akka.http.scaladsl.server.{Directives, Route}
import scala.concurrent.duration._

trait StatusService extends BaseService {
  import Directives._
  import io.circe.generic.auto._

  protected case class Status(uptime: String)

  override protected def routes: Route =
    get {
      log.info("/status executed")
      complete(Status(Duration(ManagementFactory.getRuntimeMXBean.getUptime, MILLISECONDS).toString()))
    }
}
