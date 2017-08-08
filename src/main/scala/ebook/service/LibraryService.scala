package ebook.service

import ebook.domain.models.{Book, Library}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait LibraryService extends BookService{

  def addBoook(id:Int, details:String)(implicit library: Library): Option[Book] ={
    if(!library.books.contains(id)) Some(Book(id, details)) else None
  }

  def removeById(id: Int)(implicit library: Library):Library={
    val filteredBooks:Option[Map[Int, Book]] = if(library.books.contains(id)) Some(library.books.filterKeys(Set(id))) else None
    Library(filteredBooks.get)
  }

  def remove(book: Book)(implicit library: Library):Library=removeById(book.id)

  def find(id:Int)(implicit library: Library):Option[Book] = library.books.get(id)
}

object LibraryService extends LibraryService
