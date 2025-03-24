object q17{
  def findCommonElements(arr1: Array[Int],arr2: Array[Int]): Array[Int] = {
    val set = arr1.toSet 
    val result = scala.collection.mutable.ArrayBuffer[Int]()
    for(i <- arr2){
      if(set.contains(i)){
        result += i
      }
    }
    result.toArray
  }
  def main(args: Array[String]): Unit = {
    val arr1 = Array(2,3,-2,-4,0,1)
    val arr2 = Array(0,1,2,-3,-9)
    val result = findCommonElements(arr1,arr2)
    print("Array 1:")
    println(arr1.mkString(" ,"))
    print("Array 2:")
    println(arr2.mkString(" ,"))
    println("Common Elements :"+result.mkString(","))
  }
}