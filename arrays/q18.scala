object q18{
  def findCommonElements(arr1: Array[String],arr2: Array[String]): Array[String] = {
    val set = arr1.toSet 
    val result = scala.collection.mutable.ArrayBuffer[String]()
    for(i <- arr2){
      if(set.contains(i)){
        result += i
      }
    }
    result.toArray
  }
  def main(args: Array[String]): Unit = {
    val arr1 = Array("aakaash","aiyyappan","midhru")
    val arr2 = Array("aravind","aakaash")
    val result = findCommonElements(arr1,arr2)
    print("Array 1:")
    println(arr1.mkString(" ,"))
    print("Array 2:")
    println(arr2.mkString(" ,"))
    println("Common Elements :"+result.mkString(","))
  }
}