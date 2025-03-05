import java.util.Scanner
def diff(a:Int):Int = {
    var diff:Int = (a - 51).abs
    if(a<=51) diff
    else diff*3
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        var number : Int = diff(a);
        println(number);
    }
}