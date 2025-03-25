object InventoryManager{
  private var inventory: Map[String, Double] = Map()
  def add(product: String,amt: Double): Unit = {
    inventory = inventory + (product -> (inventory.getOrElse(product,0.0)+amt))
  }
  
  def getStock(product: String): Double = {
    inventory.getOrElse(product,0)
  }
  
  def display(): Unit = {
    for ((product, stock) <- inventory) {
      println(s"$product -> $stock")
      
    }
  }
  
  def remove(product: String):Unit = {
    inventory = inventory - product
  }
}


object OnlineStore extends App{
  
  //adding stock to inventory
  InventoryManager.add("Google",100)
  InventoryManager.add("Microsoft",200)
  
  InventoryManager.display()
  
  
  //get price of particular stock
  println(InventoryManager.getStock("Google"))
  
  
  //remove stock
  InventoryManager.remove("Google")
  
  InventoryManager.display()
}