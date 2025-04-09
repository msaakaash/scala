object HelloWorld {
  
  def twoLargest(arr: Array[Int]) : (Int,Int) = {
    var largest = Int.MinValue;
    var secLargest = Int.MinValue;
    for(i <- arr){
      if(largest<i){
        secLargest = largest
        largest = i
      }else if(largest>i && secLargest<i){
        secLargest = i
      }
    }
    (secLargest,largest)
  }
  
	def main(args: Array[String]): Unit = {
	  val arr = Array(1,5,2,3,2,1,7,3,6)
	  var (small,large) = twoLargest(arr)
	  val product = small*large
	  println(s"The largest item is :$large")
	  println(s"The second largest item is:$small")
	  println(s"The maximum product is :$product")
	}
}