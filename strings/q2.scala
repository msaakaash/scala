import scala.collection.mutable.{Set,HashMap}
object duplicates{
  def duplicate(str: String): String = {
    var seen = Set[Char]()
    val duplicates = HashMap[Char,Int]()
    for(ch <- str){
      if(ch != ' '){
      if(seen.contains(ch)){
        duplicates += (ch -> (duplicates.getOrElse(ch,0)+1))
      }else{
        seen += ch
      }
    
    }}
    duplicates.map {
      case (k,v) => s"$k -> $v"
    }.mkString("\n")
  }
  def main(args: Array[String]): Unit = {
    val input = "AakaasH Mani Suresh"
    val result = duplicate(input);
    println(result)
  }
}