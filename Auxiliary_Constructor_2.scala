package Scala_Learning_Part_2

//................more than one auxiliary constructor................

//auxiliary constructor

class moreAuxiliaryConstructor {

  private var companyName = " ";
  private var employee = 0;

  //creating function

  def show() {
    println(" name of the company: " + companyName)
    println("Number of employee: " + employee)
  }
  //an auxiliary constructor no 1

  def this(companyName: String) {
    this()
    this.companyName = companyName

  }
  // auxiliary constructor no 2:
  def this(companyName: String, employee: Int) {

    this(companyName) // call previous auxiliary constructor

    this.employee = employee
  }

}

object Auxiliary_Constructor_2 {

  def main(args: Array[String]) {

    //calling primary constructor

    val obj1 = new moreAuxiliaryConstructor
    obj1.show()

    // first auxiliary constructor
    val obj2 = new moreAuxiliaryConstructor("Noor's Scala Tutorial")
    obj2.show()

    val obj3 = new moreAuxiliaryConstructor("Noor's Scala Tutorial", 3500)
    obj3.show()
  }
}

/*Some Important Points About Auxiliary Constructor
 

1.	In a single class, we are allowed to create one or more than one auxiliary 
	constructors, but they have different signatures or parameter-lists.
2.	Each auxiliary constructor must call one of the previously defined constructors, 
	this would be primary constructor or previous auxiliary constructor.
3.	The invoke constructor may be a primary or previous auxiliary constructor 
	that comes textually before the calling constructor.
4.	The first statement of the auxiliary constructor must contain this keyword.
*/


