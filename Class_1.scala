package Scala_Learning_Part_2

// class is a user defined blueprint from which objects are created.
//a class combine the fields and methods(member of function which defines actions)
//in a single unit.

/*1. Keyword class: A class keyword is used to declare the type class.
2. Class name: The name should begin with a initial letter (capitalized by convention).
3. Superclass(if any):The name of the class’s parent (superclass), if any, preceded
		by the keyword extends. A class can only extend (subclass) one parent.
4. Traits(if any): A comma-separated list of traits implemented by the class,
		if any, preceded by the keyword extends. A class can implement more than one trait.
5. Body: The class body is surrounded by { } (curly braces)*/

class FirstClass {
  //class variable
  var name = "Apple";
  var shareno = 100000;

  //class method
  def Display {
    println("Name of the company is: " + name)
    println("Number of shares of Apple company is: " + shareno)
  }
}
object Class_1 {

  //main method
  def main(args: Array[String]) {

    var result = new FirstClass();
    result.Display;
  }

}