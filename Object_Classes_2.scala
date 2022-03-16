package Scala_Learning_Part_2

// here we call class name and inside class name we call a function definition
// without mentioning var/val

class hollis1(id:Int, name:String){
  
  def studentName(){
    println(id+ " " +name)
  }
}


object Object_Classes_2 {
  
  def main(args: Array[String]){
    
    var mn = new hollis1(101, "Hasan Abdullah")
  //  passing the constructor value
    
    mn.studentName()
    // calling function by using an function name
    
    
    
    
    
    
  }
  
}