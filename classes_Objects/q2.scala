class Bank(val accNo: String,private var balance: Double){
  def deposit(amt: Double): Unit = {
    balance += amt
    println(s"Deposited $$${amt}. New Balance: $$${balance}")
  }
  def withdraw(amt: Double): Unit = {
    if(amt <= balance){
      balance -= amt 
      println(s"Withdraw $$${amt}. New Balance: $$${balance}")
    }else{
      println("Insufficient balance")
    }
  }
  def showBalance(): Unit = println(s"Account Balance: $$${balance}")
}


val acc1 = new Bank("cbenu4cse22301",1000)

acc1.deposit(9000)
acc1.showBalance()
acc1.withdraw(5000)
acc1.showBalance()