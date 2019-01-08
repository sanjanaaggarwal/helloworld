class Hello {
    def  hi(): Unit =
  {
    println("welcome to scala");
  }

}
object test{
  def main(args:Array[String]): Unit =
  {
    val ob:Hello=new Hello();
    ob.hi();
  }
}
