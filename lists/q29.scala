object q29 {
  def odd(li: List[Int]): Unit = {
    for(i <- li){
      if(i % 2 == 1){
        println(i)
      }
    }
  }
	def main(args: Array[String]): Unit = {
	  val list_1 = List(1,2,3,3,4,4,5,6,7)
	  odd(list_1)
	  
	}
}