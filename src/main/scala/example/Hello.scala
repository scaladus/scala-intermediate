package example

object Hello extends Greeting with App {
  println(greeting)
}

trait Greeting {

  type HelloTypeLambda = Either[?, Double]

  lazy val greeting: String = "hello"
}
