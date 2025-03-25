//Student class
class Student(val name: String,val m1: Int,val m2: Int,val m3: Int){
    def totalMarks(): Int = m1 + m2 + m3
    def average(): Int = (totalMarks)/3
}

//creating object with companion object
object Student{
    def apply(name: String,m1: Int,m2: Int,m3: Int): Student = {
        new Student(name,m1,m2,m3)
    }
}

//creating objects using the companion object
val s1 = Student("Aakaash",95,95,95)
val s2 = Student("Aiyyappan",100,90,90)

println(s"${s1.name}'s total marks: ${s1.totalMarks} and average marks:${s1.average()}")
println(s"${s2.name}'s total marks: ${s2.totalMarks} and average marks:${s2.average()}")
