package Scala_Learning_Part_2

//base class or parent class or super class

//            single inheritance--


class helloname{
  var name: String = "Noor";
}

//derived class
class importclass extends helloname{
  var article_no: Int = 79;
  
  //declare a method
  def show(){
    println("Author name: "+ name)
    println("Total number of publication: " + article_no)
  }
}

object Inheritance_2 {
  //driver code
  def main(args: Array[String]){
    val obj = new importclass()
    obj.show()
  }
  
  /*Explanation: In the above example --helloname-- is the base class 
   * and --importclass-- is 
   * the derived class which is derived from helloname using extends keyword. 
   * In the main method when we create the object of --importclass-- class, a copy 
   * of all the methods and fields of the base class acquires memory in this 
   * object. That is why by using the object of the derived class we can 
   * also access the members of the base class. 
 */
  
}