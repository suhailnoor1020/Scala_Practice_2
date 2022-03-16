package Scala_Learning_Part_2

class moreAuxiliaryConstructor2 {

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

object AuxiliaryConstructor_2 {

  def main(args: Array[String]): Unit = {

    //calling primary constructor

    val obj1 = new moreAuxiliaryConstructor
    obj1.show()

    // first auxiliary constructor
    val obj2 = new moreAuxiliaryConstructor2("Noor's Scala Tutorial")
    obj2.show()

    val obj3 = new moreAuxiliaryConstructor2("Noor's Scala Tutorial", 3500)
    obj3.show()
  }
}