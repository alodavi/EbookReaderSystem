package ebook.app

import ebook.domain.models.{Book, User}
import ebook.service.DisplayService

/**
  * Created by aloisia.davi on 08.08.17.
  */
object PrintUserAndBook extends App{
  val commonUser = User(1, "I like science fiction and fantasy!")
  val commonBook = Book(3, "A Masterpiece!", 50)
  DisplayService.displayUser(commonUser)
  DisplayService.displayBook(commonBook)
}
