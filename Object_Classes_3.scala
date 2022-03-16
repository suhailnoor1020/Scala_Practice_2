package Scala_Learning_Part_2


// this are almost same as Object_Classes_2 page. 
// heere we will se how the records are stored, nothing new in here
class student3(name:String, id:Int){
  def getRecord(){
    println("Name of the studnet is: "+ name)
    
    println("Student id is: " + id)
    println()// make a empty line after each record between students
  }
}
object Object_Classes_3 {
  def main(args: Array[String]){
    
   var record = new student3("Hasan AL Abdullah", 101)
   var record2 = new student3("Noor Suhail", 102) 
   
   record.getRecord()// for student 1
   
   record2.getRecord()// for studnet2
  }
  
}