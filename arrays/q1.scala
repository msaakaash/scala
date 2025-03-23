object q1{
  def factorial(num : Int) : Int = {
  if(num==0) 1
  else num * factorial(num-1)
  }
  def modify(nums : Array[Int]) : Array[Int] ={
    val ans = new Array[Int](nums.length)
    var j = 0;
    for(i <- nums){
      if(i%2==1) {
          ans(j) = factorial(i)
      }else{
        ans(j) = i*i
      }
      j+=1
    }
    ans
  }
	def main(args: Array[String]): Unit = {
	var nums = Array(1,2,3,4,5,6)
	var modified_nums = modify(nums)
	println(modified_nums.mkString(","))
	}
}