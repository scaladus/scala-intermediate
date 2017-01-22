package example

import org.specs2.mutable.Spec

class HelloSpec extends Spec {
  "The Hello object" should {
    "say hello" in {
      Hello.greeting must be_==("hello")
    }
  }
}
