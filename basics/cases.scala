val num:Int = 10
val result = num match {
  case 1 => "One"
  case 10 => "Ten"
  case _ => "Other"
}
println(result)