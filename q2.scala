case class Book(title: String, author: String, isbn: String)

var library: Set[Book] = Set(
    Book("Madol Doova", "Martin Wickramasinghe", "1"),
    Book("Gamperaliya", " Martin Wickremasinghe", "2"),
    Book("Thunmanhandiya", " Mahagama Sekara", "3")
)

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

def searchByTitle(title: String): Unit = {
    val booksFound = library.filter(_.title==title)
    if (booksFound.nonEmpty) {
      booksFound.foreach { book =>
        println(s"Found book - Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No book found with title: $title")
    }
  }

def displayBooksByAuthor(author: String): Unit = {
    val booksByAuthor = library.filter(_.author==author)
    if (booksByAuthor.nonEmpty) {
      booksByAuthor.foreach { book =>
        println(s"Title: ${book.title}, Author: ${book.author}, ISBN: ${book.isbn}")
      }
    } else {
      println(s"No books found by author: $author")
    }
  }

def main(args: Array[String]): Unit = {

    var newb=Book("Mai mara prasangaya", "Mahinda Prasad Masimbula", "4")

    var continue = true

    while (continue) {

      println("Choose an Option: \n1 Add a book \n2 Remove a book  \n3 Check if a book exists \n4 Display library \n5 Search for a book by title \n6 Display all books by an author \n7 Exit")


      val choice = scala.io.StdIn.readInt()

      choice match {
        case 1 => addBook(newb)
        case 2 => removeBook("3")
        case 3 => checkBook("2")
        case 4 => displayLibrary()
        case 5 => searchByTitle("Gamperaliya")
        case 6 => displayBooksByAuthor("Martin Wickremasinghe")
        case 7 => continue = false
        case _ => println("Invalid choice. Please try again.")
      }
    }
}
