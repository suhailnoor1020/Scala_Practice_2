package Scala_Learning_Part_2
//one class is allowed to inherit the features of another class
//we can achieve inheritance by using extends keyword and a class must extends to 
//other class.


//--Single Inheritance: In single inheritance, derived class inherits 
//the features of one base class

class Noor{
  var salary: Float = 130000
}

class Programmer extends Noor{
  
  // when i extends Noor to Programmer, that means i also bring salary 120000
  //to programmer class. now programmer class owns Noor class inheritance. 
  
  
  var bonus: Int = 15000// this owns only in programmer class. 
  
  println("My salary is : "+ salary)
  println("Bonus I got from company is: "+ bonus)
  
  
}


object Inheritance_1 {
  def main(args: Array[String]){
    
    //declaring sub-class calling here
    new Programmer()
  }
  /*Important terminology: 
 

1. Super Class: The class whose features are inherited is known as 
superclass(or a base class or a parent class).
2. Sub Class: The class that inherits the other class is known as 
subclass(or a derived class, extended class, or child class). 
3. The subclass can add its own fields and methods in addition to the 
superclass fields and methods.
4. Reusability: Inheritance supports the concept of “reusability”, i.e. 
when we want to create a new class and there is already a class that 
includes some of the code that we want, we can derive our new class 
from the existing class. By doing this, we are reusing the fields and 
methods of the existing class.*/
  
}