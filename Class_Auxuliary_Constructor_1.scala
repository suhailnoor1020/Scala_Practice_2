package Scala_Learning_Part_2

//Constructors are used to initializing the object’s state.
//a constructor also contains a collection of statements 
//Statements are executed at the time of object creation
/*In Scala Program, the constructors other than the primary constructor 
 * are known as Auxiliary Constructors.
 */

/*We are allowed to create any number of auxiliary constructors in our Scala class, 
 * but a scala class contains only one primary constructor.
 */

//................one auxiliary constructor................



// primary constructor

class isConstructor(Lname: String, Tname: String){
  
  var noArticle = 0;
  
  def show()
  {
   println("Language name: " + Lname);
   println("Topic name: " + Tname);
   println("Number of articles published: " + noArticle)
    
  }
  
  //auxilary constructor
  
  def this(Lname: String, Tname: String, noArticle: Int){
    
    this(Lname, Tname)
    this.noArticle = noArticle
    
  }
  
}


  //creating main object

object Class_Auxuliary_Constructor_1 {

    //creating main method
  def main(args: Array[String]){
    
    //creating object of isConstructor
    
    var obj = new isConstructor("Scala", "Auxilary Constructor", 1)
    obj.show()
    
    
    //step   1:   creating class with parameter(l: String, t: String)
    //step   2:   under class create take another variable or not
    //step 2.1:   under class cretae udf, like def show() i created
    //step   3:   under class now create auxilary constructor
    //step   4:   def this(name: string, t: String, step2 : type od data)
    //              { this. step1 agruments (see my example above)
    //                   this.step2 variable   }
    //step   5: now main object
    //step   6: under main method we call the class and udf
    //           (create new obj = new (class name we created))
    //        finally, obj.udf name, here which is show().
    //        done
    
    
  }
  
}