
class Person(val name: String,val age: Int){
  def display(): Unit = {
    println(s"Name:$name")
    println(s"Age:$age")
  }
}

object Person{
  def apply(json: String) : Person = {
    val data = json.split(",")
   if (data.length != 2) throw new IllegalArgumentException("Invalid input format. Expected 'name,age'")
  new Person(data(0).trim, data(1).trim.toInt)
  }
}


val p1 = new Person("Aakaash",20)
p1.display()

val p2 = Person("Midhru   ,     20")
p2.display()
