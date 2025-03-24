object HelloWorld {
  
  def quickSort(arr: Array[Int],l: Int,r: Int) : Unit = {
    if(l<r){
      val part = partition(arr,l,r)
      quickSort(arr,l,part-1)
      quickSort(arr,part+1,r)
    }
  }
  
  def partition(arr: Array[Int],l: Int,r: Int): Int = {
    val pivot = arr(r);
    var i = l-1
    for(j <- l until r){
      if(arr(j)<pivot){
        i+=1
        swap(arr,i,j)
      }
    }
    swap(arr,i+1,r)
    i+1
  }
  
  def swap(arr: Array[Int], i: Int, j: Int): Unit = {
    val temp = arr(i)
    arr(i) = arr(j)
    arr(j) = temp
  }
  
	def main(args: Array[String]): Unit = {
	  val nums = Array(2,-3,6,1,3,0)
	  quickSort(nums,0,nums.length-1);
	  println("Sorted Array:"+nums.mkString(", "))
	}
}