import java.util.Scanner
object ifelse{
  def main(args : Array[String]){
    val scanner = new Scanner(System.in)
    println("Enter your name:")
    val name = scanner.nextLine()
    println("Hello "+name+",welcome!!!")
    println("Enter your age:")
    val age = scanner.nextInt()
    if(age>=18) println("Eligible to vote")
    else println("Not eligible to vote")
  }
}