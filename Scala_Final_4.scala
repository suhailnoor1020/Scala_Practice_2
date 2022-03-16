//Scala Final Classes

//If the class in Scala is final then it cannot inherit to derived class. 
//Inheritance restriction will be added by final keyword.



//calling class as final

final class Shapes{
    val height:Int = 15;
    val width :Int =25;
  final def display(){
    
  }
}
class Rectangle extends Shapes{
  
  // can not inherit Indoduction class
  override def display(){
    val area = height * width
  }
}

object Scala_Final_4{
  def main(args: Array[String]){
    var obj = new Rectangle()
    obj.display()
    
  }
  
}

/* outpu: prog.scala:4: error: illegal inheritance from final class Shapes
class Rectangle extends Shapes{
                        ^
one error found
