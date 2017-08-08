package ebook.service

import ebook.domain.models.Book

/**
  * Created by aloisia.davi on 08.08.17.
  */
trait BookService extends Book{

  def turnPageForward(book: Book):Book = {
    val newPage = book.page + 1
    book.copy(page = newPage)
  }

  def turnPageBackward(book: Book):Book = {
    val newPage = book.page - 1
    book.copy(page = newPage)
  }
}

object BookService extends BookService
