package ebook.service

import ebook.domain.models.{ User, UserManager}

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait UserManagerService extends UserManager{

  def addUser(id:Int, details:String)(implicit userManager: UserManager):Option[User] = {
    if(!userManager.users.contains(id)) Some(User(id, details)) else None
  }

  def find(id:Int)(implicit userManager: UserManager):Option[User] = userManager.users.get(id)

//
  def remove(user: User):Boolean

  def remove(id:Int):Boolean

  def renewMembership:Unit
}

//object UserManagerService extends UserManagerService //todo after implementing