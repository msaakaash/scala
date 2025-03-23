object q1{
  def binarySearch(arr: Array[Int],target: Int,l: Int,r: Int) : Int ={
    if(l>r) return -1;
    val mid = l + (r-l)/2
    if(arr(mid)==target) mid
    else if(arr(mid)>target) binarySearch(arr,target,l,mid-1)
    else binarySearch(arr,target,mid+1,r)
  }


	def main(args: Array[String]): Unit = {
	var nums = Array(1,2,3,4,5,6)
	var target = 5
	var result = binarySearch(nums,target,0,nums.length-1)
  if(result == -1) println("Element Not Found.")
  else println(s"Element found at ${result + 1} position")
	
}}