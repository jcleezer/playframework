/*
 * Copyright (C) Lightbend Inc. <https://www.lightbend.com>
 */
object FileWatchServiceInitializer {
  lazy val initialFileWatchService = play.dev.filewatch.FileWatchService.polling(500)
}