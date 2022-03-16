package Scala_Learning_Part_2

//                 -- Hierarchical Inheritance--
//  one class serves as a superclass (base class) for more than one subclass
class parent {
  var name1 = "Mr. Noor"
  var name2 = "Mr. suhail"
}

//derieved from parent class
class child1 extends parent {
  var age = 32
  def details1() {
    println("Name: " + name1)
    println("Age: " + age)
  }
  //derived from parent class

}
class child2 extends parent {
  var heights = 164

  //method
  def details2() {
    println("Name: " + name2)
    println("Height: " + heights)
  }
}
object Inheritance_4 {
  def main(args: Array[String]) {
    
    //creating objects of both derived class
    val ob1 = new child1();
    val ob2 = new child2();
    ob1.details1()
    ob2.details2()
    
    // here prant class works as superclass to all sub class.
    // rest of the things are same as inheritance 3. 

  }
}