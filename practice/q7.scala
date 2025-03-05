import java.util.Scanner;
object chumma{
    def main(args : Array[String]):Unit = {
        var nm = new Scanner(System.in);
        println("Enter your name:")
        var name = nm.nextLine();
        println("Enter your age:")
        var age = nm.nextInt();
        if(age>=18){
            println("You are eligible to drive ni99a");
        }else{
            println("You are not eligible to drive ni99a")
            println("Wait for "+(18-age)+" years")
        }
    }
}