minimal-scala-akka-http-seed
=========================

[![Build Status][build-status-badge]][build-status-url]
[![Code Quality][code-quality-badge]][code-quality-url]

[![Issues][issues-badge]][issues-url]

[![License][license-badge]][license-url]
[![Chat][chat-badge]][chat-url]

## To create a new project run

```
activator new <YOUR PROJECT NAME> minimal-scala-akka-http-seed
```

## Overview
The project is intended to be used as an activator template to generate akka http projects.
From the command line, you can execute `activator new <YOUR PROJECT NAME> minimal-scala-akka-http-seed` to generate a project. From activator UI find the template named `minimal-scala-akka-http-seed` and generate your project using it.

Once the project is generated you get few things out of the box:
* Most of the wiring is done in [Main](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Main.scala) file. Create new endpoints and add them to [this map](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Main.scala#L23), it will do the rest of wiring for you (status "path" in the map will become `/v1/status` endpoint). Think of those key-value mappings as /status is the prefix for all status routes, and there is a base prefix /v1.
* [Config](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/Config.scala) is handled using [Ficus](https://github.com/ceedubs/ficus). Make sure to create your case classes for new config values you add in typesafe config. You can later mix in `Config` trait or import your values from `Config` object.
* [Circe](https://github.com/circe/circe) for json encoding and decoding.
* The project comes with [Cats](http://typelevel.org/cats/) library also.
* [StatusService](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/StatusService.scala) which is more of a health check endpoint but the real goal is to act as a demo service. You'll be spending most of your time creating services and wiring those in Main file.
* [package](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/main/scala/io/github/yeghishe/package.scala) objects contains base classes so you don't have to repeat yourself for every service you create.
* The project uses [ScalaTest](http://www.scalatest.org/) for unit testing. Extend from [ServiceTestBase](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/test/scala/io/github/yeghishe/ServiceTestBase.scala) for your route tests. See [StatusServiceTest](https://github.com/yeghishe/minimal-scala-akka-http-seed/blob/master/src/test/scala/io/github/yeghishe/StatusServiceTest.scala) as an example.
* [Scalafmt](https://github.com/olafurpg/scalafmt) is being used for code formatting.
* [Scalastyle](http://www.scalastyle.org/) is being used fro code style checking.
* [Scoverage](https://github.com/scoverage/sbt-scoverage) is being used for code coverage .
* [Sbt Revolve](https://github.com/spray/sbt-revolver) is being used for local development.
* [Sbt native packager](https://github.com/sbt/sbt-native-packager) is being used  for packaging and deployment.


[build-status-badge]: https://img.shields.io/travis/yeghishe/minimal-scala-akka-http-seed.svg?style=flat-square
[build-status-url]: https://travis-ci.org/yeghishe/minimal-scala-akka-http-seed
[code-quality-badge]: https://img.shields.io/codacy/5a804d74bb8c4fc28117b0913f17bdd5.svg?style=flat-square
[code-quality-url]: https://www.codacy.com/app/ypiruzyan/minimal-scala-akka-http-seed
[issues-badge]: https://img.shields.io/github/issues/yeghishe/minimal-scala-akka-http-seed.svg?style=flat-square
[issues-url]: https://github.com/yeghishe/minimal-scala-akka-http-seed/issues
[license-badge]: https://img.shields.io/badge/License-Apache%202-blue.svg?style=flat-square
[license-url]: LICENSE
[chat-badge]: https://img.shields.io/badge/gitter-join%20chat-brightgreen.svg?style=flat-square
[chat-url]: https://gitter.im/yeghishe/minimal-scala-akka-http-seed
