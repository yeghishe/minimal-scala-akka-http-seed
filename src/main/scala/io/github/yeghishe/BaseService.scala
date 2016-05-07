package io.github.yeghishe

import akka.http.scaladsl.marshallers.sprayjson.SprayJsonSupport

trait BaseService extends BaseComponent with Protocol with SprayJsonSupport with Config
