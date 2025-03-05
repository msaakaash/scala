import java.util.Scanner
import scala.math._
def armstrong(a:Int):String = {
    var original: Int = a;
    var temp2 : Int = a;
    var count : Int = 0;
    var rem : Int = 0;
    var total : Int = 0;
    
    while(temp2!=0){
        rem = temp2 % 10;
        total+=(rem*rem*rem)
        temp2/=10;
    }
    if(a>1 && a<10) "Armstrong"
    else if(original == total) "Armstrong"
    else "not a Armstrong"
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        var number : String = armstrong(a);
        println(number);
    }
}