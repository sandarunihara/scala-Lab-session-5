error id: file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q2.scala:[1065..1065) in Input.VirtualFile("file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q2.scala", "case class Book(title: String, author: String, isbn: String)

var library: Set[Book] = Set(
    Book("1984", "George Orwell", "1234567890"),
    Book("To Kill a Mockingbird", "Harper Lee", "1234567891"),
)

var x=Book("The Great Gatsby", "F. Scott Fitzgerald", "1234567892")

 def addBook(book: Book): Unit = {
    library += book
    println(s"Book added: ${book.title} by ${book.author}")
  }

def removeBook(isbn: String): Unit = {
    val bookToRemove = library.find(_.isbn == isbn)
    bookToRemove match {
      case Some(book) => library -= book
        println(s"Book removed: ${book.title} by ${book.author}")
      case None => println(s"No book found with ISBN: $isbn")
    }
  }

def checkBook(isbn: String): Boolean = {
    library.exists(_.isbn == isbn)
  }

def displayLibrary(): Unit = {
    if (library.isEmpty) {
      println("The library is empty.")
    } else {
      library.foreach { 
        book => println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    }
  }

def 

")
file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q2.scala
file:///E:/2nd%20Year/Semester%201/FC/practicals/session%205/scala-Lab-session-5/q2.scala:40: error: expected identifier; obtained eof

^
#### Short summary: 

expected identifier; obtained eof