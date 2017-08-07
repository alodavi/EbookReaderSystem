package ebook.service.interpreter

import ebook.domain.models.{Book, User}
import ebook.service.DisplayService

/**
  * Created by aloisia.davi on 07.08.17.
  */
class DisplayServiceInterpreter extends DisplayService[Book, User, Int]{
  def displayUser(user:User): Unit ={
    println(user)
  }

  def displayBook(book: Book): Unit = {
    println(book)
  }

  def turnPageBackward(pageNumber: Int): Int = {
    pageNumber
  }

  def turnPageForward(pageNumber: Int): Int = {
    pageNumber
  }
}
