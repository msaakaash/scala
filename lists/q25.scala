object q25 {
  def removeDup[T](list: List[T]): List[T] = {
    list.distinct
  }
	def main(args: Array[String]): Unit = {
	  val list = List(1,2,3,3,2,4,5)
	  println("Original List:"+list)
	  val modified = removeDup(list)
	  println("Modified List:"+modified)
	}
}