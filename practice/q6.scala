import java.util.Scanner

object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a temp:")
        var a:Int = nm.nextInt();
        var message = if(a>=80){
            "Go play golf"
        }else if(a>70 && a<79){
            "Put on a jacket"
        }else{
            "It is way too cold"
        }
        println(message);
    }
}