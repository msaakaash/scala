import java.util.Scanner
def thirtyOrSum(a:Int,b:Int):Boolean = {

    if(a==30 || b==30 || (a+b==30)) true
    else false
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        println("Enter a number 2:")
        var b:Int = nm.nextInt();
        var number : Boolean = thirtyOrSum(a,b);
        println(number);
    }
}