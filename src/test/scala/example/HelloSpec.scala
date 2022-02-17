package example

import org.scalatest.matchers.should.Matchers
import org.scalatest.wordspec.AnyWordSpecLike

class HelloSpec extends AnyWordSpecLike with Matchers {
  "The Hello object" should {
    "say hello" in {
      Hello.greeting shouldEqual "hello"
    }
  }
}
