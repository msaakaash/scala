object sum{
  def sumNumbersInString(s: String) : Int = {
    val pattern = "\\d+".r
    pattern.findAllIn(s).map(_.toInt).sum
  }
  
  def main(args :Array[String]): Unit = {
    val input = "abc12xyz8mno80"
    val result = sumNumbersInString(input)
    println(s"Sum of numbers in the string: $result")
  }

}