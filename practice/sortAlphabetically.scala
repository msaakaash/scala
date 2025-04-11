object HelloWorld {
	def main(args: Array[String]): Unit = {
	val li = List("Lakssa","midhru","Aakaash")
	println(s"Original List:$li")
	val sorted = li.sortWith(
	  (s,t) => s.charAt(0).toLower < t.charAt(0).toLower
	  )
	println("The elements in alphabetical order:")
	println(s"Sorted List:$sorted")
	}
}