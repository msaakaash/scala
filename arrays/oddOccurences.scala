object OddOccurrence {
  def findOddOccurrence(nums: List[Int]): Int = {
    nums.foldLeft(0)((acc, num) => acc ^ num)
  }

  def main(args: Array[String]): Unit = {
    val nums = List(1, 2, 3, 2, 3, 3, 1, 1, 3)
    println(s"Number with odd occurrences: ${findOddOccurrence(nums)}")
  }
}
