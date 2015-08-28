package kamontest

import kamon.Kamon

object GetStarted extends App {
  Kamon.start()


  val someHistogram = Kamon.metrics.histogram("some-histogram")
  val someCounter = Kamon.metrics.counter("some-counter")
  (1 to 10000).foreach(k => {
    (1 to 100000).foreach(v => {
      someHistogram.record(42 + k)
      someHistogram.record(50)
      someCounter.increment()
    })

    Thread.sleep(k,500)
  })

  // This application wont terminate unless you shutdown Kamon.
  Kamon.shutdown()
}