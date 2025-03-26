object q30 {
  def evenSum(li: List[Int]): Unit = {
    var sum = 0
    for(i <- li){
      if(i % 2 == 0){
        sum += i
      }
    }
    println("Sum of Elements:"+sum)
  }
	def main(args: Array[String]): Unit = {
	  val list_1 = List(1,2,3,3,4,5,6,7)
	  val even = list_1.filter(_ % 2 == 0)
	  print("Even elements:")
	  println(even.mkString(", "))
	  evenSum(list_1)
	  
	}
}