import java.util.Scanner
def palindrome(a:Int):String = {
    var rev:Int = 0;
    var temp:Int = a;
    var rem:Int = 0;
    while(temp!=0){
        rem = temp%10;
        rev = rev*10 + rem;
        temp/=10;
    }
    if(a==rev) "palindrome"
    else "not a palindrome"
}
object nambhathan{
    def main(args :Array[String]):Unit = {
        var nm = new Scanner(System.in)
        println("Enter a number 1:")
        var a:Int = nm.nextInt();
        var number : String = palindrome(a);
        println(number);
    }
}