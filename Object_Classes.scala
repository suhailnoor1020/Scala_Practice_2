package Scala_Learning_Part_2


// first here we call a class name Student. after the class name we have to declare 
//constructor

// parameter i mean student particular which are here name and age.
//before giving the parameter we also specify the var/val and 
//data type which we will use. 

class Student(var name: String, var age: Int);

// using var means we can change the value. if we use 
//val then we can never change the value. 

object Object_Classes {
  // object has two characteristics:
  //1. state: data values of an object are known as its state, reflects the properties of the object
  //2. functionality that an object perform is known as behavior.reflects the response of the object
  //3. Identity: It gives a unique name to an object and enables one 
  //object to interact with other objects.

  def main(args: Array[String]): Unit = {

    var intro = new Student("Shahed", 35)
    // this is the format we have to use when we call class inside the main function 

    //println(intro.name + " " + intro.age)
    
    intro.name = "Hasan_Abdullah" 
    // as i use var, that is why I could able to change the
    //value. 
    intro.age = 36
    
    println(intro.name+ " "+ intro.age)

  }

}