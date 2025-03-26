object q27 {
  def palindrome[T](list: List[T]): Int = {
    var l = 0
    var r = list.length-1
    var flag = 0
    while(l<r){
      if(list(l)!=list(r)){
        flag = 0
        return 0
      }
      l+=1 
      r-=1
    }
   1
  }
	def main(args: Array[String]): Unit = {
	  val list_1 = List(3,4,5,6,7)
	  val list_2 = List(1,2,3,2,1)
    val result = palindrome(list_1)
    val result_2 = palindrome(list_2)
    if(result==1) println(list_1+ "is a palindrome")
    else println(list_1+ "is not a palindrome")
    if(result_2 == 1) println(list_2+"is a palindrome")
    else println(list_2+"is not a palindrome")
	}
}