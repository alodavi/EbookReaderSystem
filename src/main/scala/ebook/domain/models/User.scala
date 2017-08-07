package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */

trait User extends UserManager{
  def userId: Int
  def userDetails: String
}