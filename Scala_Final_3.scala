/*Scala Final Methods:
Final method --CalArea-- in the parent class --(Shapes)-- indicate that, method cannot override in a child class --(Rectangle)--*/

class Shape{
  val height = 10;
  val width = 15;
  
  final def CallArea(){
  }
}
class Rectangle extends Shape{
  override def CallArea(){
    val area = 25;
    println(area)
  }
}

object Scala_Final_3{
  def main(args: Array[String]){
    var obj = new Rectangle();
    obj.CallArea()
    
  }
}
/* output: prog.scala:8: error: overriding method CalArea in class Shapes of type ()Unit;
 method CalArea cannot override final member
    override def CalArea(){
                     ^
one error found*/
