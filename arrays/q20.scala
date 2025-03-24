object q20{
  def getTwo(arr: Array[Int]): (Int,Int) = {
    val sort_arr = arr.sorted
    var left = 0
    var right = sort_arr.length - 1
    var minSum = Int.MaxValue
    var pair = (0, 0)
    
    while (left < right) {
      val sum = sort_arr(left) + sort_arr(right)
      if (math.abs(sum) < math.abs(minSum)) {
        minSum = sum
        pair = (sort_arr(left), sort_arr(right))
      }
      
      if (sum < 0) left += 1
      else right -= 1
    }
    pair
  }

  def main(args: Array[String]): Unit = {
   val arr2 = Array(-5, -2, -1, 0, 3, 7, 9)
    val result2 = getTwo(arr2)
    println(s"The two elements whose sum is closest to zero are: ${result2._1} and ${result2._2}")
  }
}
