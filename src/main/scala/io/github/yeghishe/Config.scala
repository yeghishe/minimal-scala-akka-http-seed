package io.github.yeghishe

import com.typesafe.config.ConfigFactory
import net.ceedubs.ficus.Ficus
import net.ceedubs.ficus.readers.ArbitraryTypeReader
import net.ceedubs.ficus.readers.namemappers.implicits

trait Config {
  import Ficus._
  import ArbitraryTypeReader._
  import implicits.hyphenCase

  protected case class HttpConfig(interface: String, port: Int)

  private val config = ConfigFactory.load()
  protected val httpConfig: HttpConfig = config.as[HttpConfig]("http")
}

object Config extends Config
