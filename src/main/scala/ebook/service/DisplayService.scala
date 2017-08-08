package ebook.service

import ebook.domain.models.{Book, User}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService extends User with BookService{

  def displayBook(book: Book):Unit ={
    println("id="+book.id)
    println("details="+book.details)
    println("page="+book.page)
  }

  def displayUser(user: User):Unit={
    println("id="+user.id)
    println("details="+user.details)
  }

}

object DisplayService extends DisplayService
