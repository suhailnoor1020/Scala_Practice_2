package Scala_Learning_Part_2


//llows us to define methods of same name but having different parameters 
//or data types. It helps to optimize code.
//It is the ability to redefine a function in more than one form
// in a class using one oer more function using same name
/*the methods can have the same name but with different parameter list 
 * (i.e. the number of the parameters, the order of the parameters, and 
 * data types of the parameters) within the same class.
 */

class overloading{
  def add(x:Int, y:Int){
    var summation = x + y
    println("The summation of x and y is: " + summation)
    
  }
  
  //again using same function name
  
  def add(x:Int, y:Int, z: Int){
    
    var summation = x+y+z;
    println("summation of 3 variables is: "+ summation)
  }
}

object Method_Overloading_1 {
  
  /*
Why do we need Method Overloading ??
If we need to do the same kind of operation in different ways i.e. 
for different inputs. In the example described below, we are doing 
the addition operation for different inputs. It is hard to find many 
different meaningful names for single action.

-------Different ways of doing overloading methods-----

Method overloading can be done by changing:

The number of parameters in two methods.
The data types of the parameters of methods.
The Order of the parameters of methods.*/

  def main(args: Array[String]){
    
    
    var obj = new overloading()
    obj.add(10,15)
    obj.add(11,13,15)
    
  }
  
}