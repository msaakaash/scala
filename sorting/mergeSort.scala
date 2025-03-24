object HelloWorld {
  def mergeSort(arr: Array[Int]): Array[Int] = {
    if(arr.length<=1) arr
    else{
      val mid = arr.length/2
      val left = mergeSort(arr.slice(0,mid))
      val right = mergeSort(arr.slice(mid,arr.length))
      merge(left,right)
    }
  }
  
  def merge(left: Array[Int],right: Array[Int]): Array[Int] = {
    val merged = Array.ofDim[Int](left.length + right.length)
    var (i, j, k) = (0, 0, 0)
    while(i<left.length && j<right.length){
      if(left(i)<right(j)){
        merged(k) = left(i);
        i=i+1;
      }else{
        merged(k) = right(j);
        j=j+1
      }
      k=k+1
    }
      while (i < left.length) {
      merged(k) = left(i)
      i += 1
      k += 1
    }

    while (j < right.length) {
      merged(k) = right(j)
      j += 1
      k += 1
    }

    merged
  }
  
	def main(args: Array[String]): Unit = {
	  val arr = Array(2,-3,6,1,3,0)
	  val sorted = mergeSort(arr);
	  println("Sorted Array:"+sorted.mkString(", "))
	}
}