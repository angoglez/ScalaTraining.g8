package m5

import cats.effect.{ExitCode, IO, IOApp}

object GymBotApp extends IOApp {

  // TODO: replace the contents by the code of your application
  override def run(args: List[String]): IO[ExitCode] =
    for {
      _ <- IO.delay { println("Hello App!") }
      _ <- IO.delay { println("Do your stuff here!") }
      exitCode <- IO.pure(ExitCode.Success)
    } yield exitCode

}
