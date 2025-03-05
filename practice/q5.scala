import java.util.Scanner
def largest(a:Int,b:Int):Int = {
    if(a>=b && (a<=30 && a>=20)) a
    else if(a<=b && (b<=30 && b>=20)) b
    else if(a==30 || b==30)  30
    else 0
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        println("Enter a number 2:")
        var b:Int = nm.nextInt();
        var number : Int = largest(a,b);
        println(number);
    }
}