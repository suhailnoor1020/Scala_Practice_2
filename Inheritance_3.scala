package Scala_Learning_Part_2

/*									 -- Multilevel Inheritance: 
 * 
 * In Multilevel Inheritance, a derived class 
 will be inheriting a base class and as well as the derived class also 
	act as the base class to another class.*/

//base class
class i_am_class1{
  var name: String = "Mr. Noor"
}

//derived class from i_am_class1
//this class will be base class for i_am_class3
class i_am_class2 extends i_am_class1{
  var age: Int = 35
}

//derived class from i_am_class2
class i_am_class3 extends i_am_class2{
  //declare method
  def result(){
    var discover: String = "Amsterdam"
    println("My name is: "+name)
    println("My age is: "+ age)
    println("The Place I wish to travel: "+ discover)
  }
  
}


object Inheritance_3 {
  
  def main(args:Array[String]){
    
    //creating object from last claas called, here --i_am_class3
    var obj = new i_am_class3();
    obj.result()
  }
  // explanation: class 2 inherit from class1 and class 3 inherit from class 2. and finally we call class 3 which 
  //bring out all including previous class.
  
}