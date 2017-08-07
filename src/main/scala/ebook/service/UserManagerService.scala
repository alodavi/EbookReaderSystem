package ebook.service

import ebook.domain.models.{User, UserManager}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait UserManagerService extends UserManager{

  def addUser(id:Int, details:String, accountType:Int):User

  def find(id:Int):User

  def remove(user: User):Boolean

  def remove(id:Int):Boolean

  def renewMembership:Unit
}