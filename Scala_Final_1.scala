/*In Scala, Final is a keyword and used to impose restriction on super class or parent 
class through various ways. We can use final keyword along with 
1. variables, 
2. methods and 
3. classes.*/

// scala final
//Final is a keyword, which is used to prevent inheritance of super class members into derived class.

class Vehicle{
  final val speed: Int = 60
}
class Bike extends Vehicle{
  override val speed: Int = 100
  
  def show(){
    println(speed)
  }
}
object Scala_Final_1{
  def main(args: Array[String]){
    var obj = new Bike()
    obj.show()
    
    
  }
}

//output: value speed cannot override final member 
