import scala.io.Source
class Employee(val name: String,val salary: Double){
  def display(): Unit = {
    println(s"Employee: $name, Salary: $$salary, Bonus: $$${Employee.bonus(salary)}")
  }
}


object Employee{
  
  def bonus(salary: Double): Double = salary*0.10
  
  
  def apply(csv: String): Employee = {
    val Array(name,salary) = csv.split(",").map(_.trim)
    new Employee(name,salary.toDouble)
  } 
}


object PayrollSystem extends App{
  val filename = "employees.csv"
  val employees = Source.fromFile(filename).getLines().map(Employee.apply).toList
  
  employees.foreach(_.display())
}