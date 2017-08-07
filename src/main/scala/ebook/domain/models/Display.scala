package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */

trait Display extends Book with User{
  def activeBook:Book
  def activeUser:User
}