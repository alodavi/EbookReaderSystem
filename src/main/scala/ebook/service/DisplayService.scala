package ebook.service

import ebook.domain.models.{Book, Library, OnlineReader, User}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait DisplayService extends BookService{

  def displayBook(book: Book):Unit ={
    println("id="+book.id)
    println("details="+book.details)
    println("page="+book.page)
  }

  def displayUser(user: User):Unit={
    println("id="+user.usedId)
    println("details="+user.userDetails)
  }

//  def displayOnlineReader(onlineReader: OnlineReader): Unit ={
//    onlineReader.
//  }
}

object DisplayService extends DisplayService
