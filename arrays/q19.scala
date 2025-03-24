object q19{
  def getDifference(arr: Array[Int]): Int = {
    require(arr.length >= 1, "Array length must be at least 1")
    arr.max - arr.min
  }

  def main(args: Array[String]): Unit = {
    val nums = Array(7, 1, 9, 4)
    println("Difference between max and min: " + getDifference(nums))
  }
}
