package Scala_Learning_Part_2

/*When a subclass has the same name method as
 * defined in the parent class, it is known as method overriding.
 * When subclass wants to provide a specific implementation for the
 * method defined in the parent class, it overrides method from parent class.*/

class School {
  def NumberOfStudent() = {
    0
  }
}
class class_1 extends School {
  override def NumberOfStudent() = {
    30
  }

}
class class_2 extends School {
  override def NumberOfStudent() = {
    32
  }
}

class class_3 extends School {
  override def NumberOfStudent() = {
    29
  }
}
object Method_Overriding_1 {

  def main(args: Array[String]) {

    //creating instances of all sub-classes

    var one = new class_1()
    var two = new class_2()
    var three = new class_3()

    //display number of student class_1:
    println("Number of student in class 1 is: " + one.NumberOfStudent())

    //class 2:
    println("Number of student in class 2 is: " + two.NumberOfStudent())

    //class 3:
    println("Number of student in class 3 is: " + three.NumberOfStudent())

  }

}