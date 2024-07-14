import scala.io.StdIn.readLine

def getProductList():List[String]={
    var product:List[String]=List()
    var input:String=""

    println("Enter product names. Type 'done' when finished:")

    while (input != "done") {
      input = readLine()
      if (input != "done") {
        product = product :+ input
      }
    }
    product
}

