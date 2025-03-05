import java.util.Scanner
def remove(a:String,b:Int):String = {
    a.take(b-1)+a.drop(b)
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a string")
        var a:String = nm.nextLine()
        
        println("Enter the position")
        var b:Int = nm.nextInt();
        var modified : String = remove(a,b);
        println(modified);
    }
}