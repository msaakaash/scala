object q26 {
 
	def main(args: Array[String]): Unit = {
	  val list_1 = List(3,4,5,6,7)
	  val list_2 = List(1,3,2,4,5)
	 
	  val diff_1 = list_1.diff(list_2)
	  val diff_2 = list_2.diff(list_1)
	  val total = diff_1 ++ diff_2
	  
	  
	  println("Items in list1 but not in list2: " + diff_1)
    println("Items in list2 but not in list1: " + diff_2)
    println("Total difference: " + total)
	}
}