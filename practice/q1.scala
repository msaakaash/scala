import java.util.Scanner
def triples(a:Int,b:Int):Int = {
    var sum:Int = (a + b)
    if(a!=b) sum
    else sum*3
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        println("Enter a number 2:")
        var b:Int = nm.nextInt();
        var number : Int = triples(a,b);
        println(number);
    }
}