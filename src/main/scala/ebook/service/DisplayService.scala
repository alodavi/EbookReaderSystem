package ebook.service

import ebook.domain.models.{Book, Display, User}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService extends Display{

  def displayBook(book: Book):Unit

  def displayUser(user: User):Unit

  def turnPageForward(pageNumber:Int):Int

  def turnPageBackward(pageNumber:Int):Int


}
