object q24 {
  def compute(list: List[Int]): (Int,Int) = {
    var s = 0 
    var p = 1
    for(i <- list){
      println(i)
      s+=i 
      p*=i
    }
    (s,p)
  }
	def main(args: Array[String]): Unit = {
	  val list = List(1,2,3,4,5)
	  println("Original List:"+list)
	  val (sum,prod) = compute(list)
	  println("Sum:"+sum)
	  println("Product:"+prod)
	}
}