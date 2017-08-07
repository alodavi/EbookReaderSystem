package ebook.service

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService[Book, User, Int]{

  def displayBook(book: Book):Unit

  def displayUser(user: User):Unit

  def turnPageForward(pageNumber:Int):Int

  def turnPageBackward(pageNumber:Int):Int


}
