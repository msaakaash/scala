
object HelloWorld {

  def removeAt(arr: List[Int],in: Int): List[Int] = {
    val element = arr(in-1)
    val updated = arr.filter(_ !=element)
    updated
  }

	def main(args: Array[String]): Unit = {
	  val lt = List(1,2,3,4,5)
	  println(s"Original List:$lt")
	  val rd = removeAt(lt,4)
	  println(s"Updated List:$rd")
	}
}