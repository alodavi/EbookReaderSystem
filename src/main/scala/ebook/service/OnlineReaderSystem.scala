package ebook.service

import ebook.domain.models.{Book, Display, Library, User}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait OnlineReaderSystem {

  def library: Library

  //todo add usermanager case class

  def display:Display

  def activeBook: Book

  def activeUser:User

  def getLibrary: Library

  //getUserManager

  def getDisplay: Display

}

//object OnlineReaderSystem extends OnlineReaderSystem
