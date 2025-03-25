import scala.collection.mutable.ArrayBuffer

case class Employee(name: String,id: Int,salary: Double,department: String)

class EmployeeManagement{
  private val emps = new ArrayBuffer[Employee]()
  
  //adding an Employee
  def add(em: Employee): Unit = {
    emps += em
  }
  
  //remove an Employee
  def remove(id: Int): Unit = {
    emps--=emps.filter(_.id==id)
  }
  
  //sorting salaries in descending order
  def sortBySalary(){
    emps.sortInPlaceBy(-_.salary)
  }
  
  //filter by department
  def department(depart: String): Unit = {
    val demps = emps.filter(_.department==depart)
    println(depart+":")
    demps.foreach(println)
  }
  
  //display
  def display(){
    println("Employees")
    emps.foreach(println)
  }
}

object Main extends App{
  val employees = new EmployeeManagement()
  
  //adding employees
  employees.add(Employee("Aakaash",301,2200000,"cs"))
  employees.add(Employee("Sonali",333,5000000,"ece"))
  employees.add(Employee("Anna Liza",303,1500000,"cs"))
  
  employees.display();
  
  //sort by salary
  employees.sortBySalary()
  
  employees.display()
  
  //remove 
  employees.remove(303)
  employees.display()
  
  //filter by department
  employees.department("cs")
}