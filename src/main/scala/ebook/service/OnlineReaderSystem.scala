package ebook.service

import ebook.domain.models._

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait OnlineReaderSystem {

  def activeBook: Book

  def activeUser:User

  def getLibrary: Library

  def getUserManager: UserManager

  def getDisplay: Display

}

//object OnlineReaderSystem extends OnlineReaderSystem
