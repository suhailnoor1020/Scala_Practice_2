package Scala_Learning_Part_2

// scala does not contain concept of static keyword. scala has singleton object
//singleton object- defines single object of a class
// singleton object provides entry point of program execution
//if you do not create SO, then code compile successfully but noes not give any output.
//In Scala, a main method is always present in singleton object.

class AreaOfTheField {

  var length = 15;
  var width = 11;

  def area {
// method which gives the area of the field. 
    var ar = length * width;
    println("The length of the field is: " + length)
    println("The width of the field is: " + width)
    println("The area of the field is: "+ ar)
  }
}
//singleton object
object Singleton_Object_5 {
  def main(args: Array[String]){
    
  // creating object of  AreaOfTheField class
    
  var obj = new AreaOfTheField();
  obj.area

    
  }

}