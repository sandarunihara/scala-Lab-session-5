error id: file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q1.scala:[362..362) in Input.VirtualFile("file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q1.scala", "import scala.io.StdIn.readLine

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

def ")
file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q1.scala
file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q1.scala:18: error: expected identifier; obtained eof
def 
    ^
#### Short summary: 

expected identifier; obtained eof