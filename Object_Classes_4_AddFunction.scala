package Scala_Learning_Part_2

// call class, inside class call function def and do function odd add

class summation {

  def adding(x: Int, y: Int) {
    var add = x + y;
    println("Summation : " + add)
  }
}
object Object_Classes_4_AddFunction {
  def main(args: Array[String]) {
    new summation().adding(10, 15)
    // new keyword + class name() + .(dot) + function name() 
    //inside function put output value
  }

}