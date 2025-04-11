-- Define a Scala function that will identify whether a given numeric value is divisible by 2. Using
--this function, and starting from the left side to the right side of a list, remove all the elements 
--which are factors of two. But, the function must stop removing the elements as soon as a number
--literal is not a factor of two. [5] [CO04][BTL 3]
--Example: For the Input: 2, 8, 19, 20, 25, 50, 100, 10 ; Output is: 19, 20, 25, 50, 100, 10.
import scala.collection.mutable.Map
import scala.collection.mutable.ListBuffer

object HelloWorld {
	def main(args: Array[String]): Unit = {
	  val lt = List(2, 8, 19, 20, 25, 50, 100, 10)
	  val filtered = lt.dropWhile(n => n % 2 == 0)
	  println(s"Orinal List:$lt")
	  println(s"Filtered List:$filtered")
	}
}