package ebook.service

import ebook.domain.models.Display

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService[Book, User, Int]{

  def displayBook(book: Book):Unit

  def displayUser(user: User):Unit

  def turnPageForward(pageNumber:Int):Display

  def turnPageBackward(pageNumber:Int):Display


}
