package io.github.yeghishe

import com.typesafe.config.ConfigFactory

trait Config {
  import net.ceedubs.ficus.Ficus._
  import net.ceedubs.ficus.readers.ArbitraryTypeReader._

  protected case class HttpConfig(interface: String, port: Int)

  private val config = ConfigFactory.load()
  protected val httpConfig = config.as[HttpConfig]("http")
}
