//Final method declare in the parent class can't be override.

class Shape{
  //defining final variable
  final val area = 15;
}
class Rectangle extends Shape{
  override val area = 100;
  def display(){
    println("Thge area of rectangle is: "+ area)
  }
}

//creating object

object Scala_Final_2{
  //main method
  def main(args: Array[String]){
    var result = new Rectangle()
    result.display()
    
  }
  
}

/*output: prog.scala:5: error: overriding value area in class Shapes of type Int;
 value area cannot override final member
override val area:Int = 100
             ^
one error found.
