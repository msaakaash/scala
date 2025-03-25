import scala.io.StdIn

object TemperatureConverter{
  def celsiusToFahrenheit(c : Double) : Double = ((c * 9)/5) + 32
  def fahrenheitToCelsius(f : Double) : Double = ((f-32)*5)/9
}


object Main extends App{
  println("Enter the temperature value:")
  val temp = StdIn.readDouble()
  
  println("Enter the unit C or F")
  val unit = StdIn.readLine().toUpperCase()
  
  if(unit == "C"){
    val converted = TemperatureConverter.celsiusToFahrenheit(temp)
    println(f"$temp%.2f°C is equal to $converted%.2f°F")
  }else if(unit == "F"){
    val converted = TemperatureConverter.fahrenheitToCelsius(temp)
    println(f"$temp%.2f°F is equal to $converted%.2f°C")
  }
}