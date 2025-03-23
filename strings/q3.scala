object CaseConverter{
  def swapCase(str: String): String = {
    var result = ""
    for(ch <- str){
      if(ch.isLower)  result += ch.toUpper
      else if(ch.isUpper) result += ch.toLower 
      else result += ch
    }
    result
  }
  def main(args: Array[String]): Unit = {
    val input = "AakaasH"
    val result = swapCase(input);
    println(result)
  }
}
