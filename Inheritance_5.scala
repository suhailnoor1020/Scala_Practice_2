package Scala_Learning_Part_2

//                    --Multiple Inheritance:---
/*one class can have more than one superclass and inherit features
 * from all parent classes. Scala does not support multiple inheritance
 * with classes, but it can be achieved by traits.
 */

trait father {

  def result1() // careful: no braces after method. here def is method.
}

trait mother {
  def result2()
}

//class that implement both 2 trait, father and mother

class child extends father with mother {
  def result1() {
    println("Understand trait 1")
  }

  def result2() {
    println("Here is trait 2")
  }
}

object Inheritance_5 {

  //driver code
  def main(args: Array[String]) {

    //creating object class child
    val obj1 = new child()
    obj1.result1()
    obj1.result2()
  }
// explanation: here father and mother is base class but
  //both are mergerd at child class. here is possible for 
  //using train in father and mother 
}