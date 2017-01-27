package io.github.yeghishe

import akka.http.scaladsl.model.StatusCodes

class StatusServiceTest extends ServiceTestBase with StatusService {
  import io.circe.generic.auto._

  "StatusService" when {
    "GET /status" should {
      "return time" in {
        Get("/status") ~> routes ~> check {
          status should be(StatusCodes.OK)
          responseAs[Status].uptime should include("milliseconds")
        }
      }
    }
  }
}
