object q28 {
  def duplicates[T](li: List[T]): List[T] = {
    li.diff(li.distinct)
  }
	def main(args: Array[String]): Unit = {
	  val list_1 = List(1,2,3,3,4,4,5,6,7)
	  println("Original List:"+list_1)
	  val set = duplicates(list_1)
	  println("Duplicates:"+set)
	  
	}
}