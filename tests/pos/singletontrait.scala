object Test {
  def foo[T <: Singleton](x: T): T = x

  val a: 1 = foo(1)
}
