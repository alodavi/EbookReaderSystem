package ebook.service

import ebook.domain.models.{Book, User}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService{

  def displayBook(book: Book):Unit ={
    println("id="+book.id)
    println("details="+book.details)
    println("page="+book.page)
  }

  def displayUser(user: User):Unit={
    println("id="+user.id)
    println("details="+user.details)
  }

  def turnPageForward(book: Book):Book = {
    val newPage = book.page + 1
    book.copy(page = newPage)
  }

  def turnPageBackward(book: Book):Book = {
    val newPage = book.page - 1
    book.copy(page = newPage)
  }

}

object DisplayService extends DisplayService
