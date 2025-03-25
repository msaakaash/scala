import scala.collection.mutable.ArrayBuffer

case class Student(name: String,id: Int,age: Int)

class StudentManagement{
  private val students = ArrayBuffer[Student]()
  
  def add(student: Student): Unit = {
    students += student
  }
  
  def remove(id: Int): Unit = {
    students --= students.filter(_.id == id)
  }
  
  def sort() : Unit = {
    students.sortInPlaceBy(_.id)
  }
  
  def display() : Unit = {
    println("Students::")
    students.foreach(println)
  }
}

object Main extends App{
  val st = new StudentManagement()
  
  st.add(Student("Aiyyappan",2,20))
  st.add(Student("Anna Liza",3,20))
  st.add(Student("Aakaash ",1,20))
  
  st.display()
  
  st.sort()
  
  st.display()
  
  st.remove(3)
  
  st.add(Student("Midhru",36,20))
  
  st.display()
 
}