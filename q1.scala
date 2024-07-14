def getProductList():List[String]={
    var product:List[String]=List()
    var input:String=""

    println("Enter product names. Type 'done' when finished:")

    while (input != "done") {
      input = scala.io.StdIn.readLine()
      if (input != "done") {
        product = product :+ input
      }
    }
    product
}

def printProductList(product:List[String]):Unit={
    for(i<- 0 until product.length){
        println(s"${i+1}. ${product(i)}")
    }
}

def getTotalProducts(products: List[String]): Int = {
    products.length
  }


def main(args: Array[String]): Unit = {
    val productList = getProductList()
    println("\nProduct List:")
    printProductList(productList)
    println(s"\nTotal number of products: ${getTotalProducts(productList)}")
  }
