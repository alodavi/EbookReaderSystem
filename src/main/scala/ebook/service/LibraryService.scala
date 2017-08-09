package ebook.service

import ebook.domain.models.{Book, Library}

import scala.util.Try

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait LibraryService extends BookService{

  def addBoook(id:Int, details:String, page:Int)(implicit library: Library): Option[Book] ={
    if(!library.books.contains(id)) Some(Book(id, details, page)) else None
  }

  def removeById(id: Int)(implicit library: Library):Try[Library]={
    val filteredBooks= Some(library.books.get.filterKeys(Set(id)) )
    Try(Library(filteredBooks))
  }

  def remove(book: Book)(implicit library: Library):Try[Library]=removeById(book.id)

  def find(id:Int)(implicit library: Library):Try[Book] = Try(library.books.get(id))
}

object LibraryService extends LibraryService
