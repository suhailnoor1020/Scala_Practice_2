package Scala_Learning_Part_2

//---By changing the Data types of the parameters--//

class overloading2 {

  def fun(x: Int, y: Int, z: Int) {
    var sum = x + y + z
    println("Function 1 result is: " + sum)
  }

  def fun(x: Double, y: Double, z: Double) {

    var sum = x + y + z
    println("Function 2 result is: " + sum)
  }

}
object Method_Overloading_2 {

  def main(args: Array[String]): Unit = {

    //crerating object of class overloading2

    var obj1 = new overloading2()
    obj1.fun(10, 15, 20)
    obj1.fun(1.1, 2.2, 3.3)

  }

}