object q16{
  def reverse(arr: Array[Int]): Unit = {
    var low = 0
    var high = arr.length - 1 
    while(low < high){
      val temp = arr(low)
      arr(low) = arr(high)
      arr(high) = temp
      low += 1 
      high -= 1
    }
  }
  def main(args: Array[String]): Unit = {
    val arr = Array(2,3,-2,-4,0,1)
    println("Original Array:"+arr.mkString(","))
    reverse(arr)
    println("Reversed Array:"+arr.mkString(","))
  }
}