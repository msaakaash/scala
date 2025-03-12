object ReverseArray {
  def main(args: Array[String]): Unit = {
    // Example array
    var arr = Array(1, 2, 3, 4, 5)

    // Reversing the array in place
    var left = 0
    var right = arr.length - 1

    while (left < right) {
      // Swap elements
      val temp = arr(left)
      arr(left) = arr(right)
      arr(right) = temp
      left += 1
      right -= 1
    }

    // Print the reversed array
    println(arr.mkString(", "))
  }
}
