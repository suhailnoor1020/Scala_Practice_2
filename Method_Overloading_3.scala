package Scala_Learning_Part_2
 // -------By changing the Order of the parameters-----

class overloading3{
  def fun(name: String, eno: Int){
    println("Name of the watch company is: "+ name)
    println("Number of the watch company employee is: "+ eno)  
  }
  def fun(eno: Int, name: String){
   println("Name of the watch company is: "+ name)
   println("Name of the watch company is: "+ eno)
  }
  
}
object Method_Overloading_3 {
  def main(args: Array[String]): Unit = {
    
    //creating object of overloading3
    
    var obj2 = new overloading3()
    obj2.fun("Noor Scala", 100)
    obj2.fun("Noor Java", 200)
    
  }
  
}