package ebook.service

import java.sql.Timestamp

import ebook.domain.models.{Account, User, UserManager}

import scala.util.Try

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait UserManagerService extends UserManager{

  def addUser(id:Int, details:String)(implicit userManager: UserManager):Option[User] = {
    if(!userManager.users.contains(id)) Some(User(id, details)) else None
  }

  def find(id:Int)(implicit userManager: UserManager):Option[User] = userManager.users.get(id)

  def removeById(id: Int)(implicit userManager: UserManager):Try[UserManager] ={
    val filteredUsers: Option[Map[Int, User]] = if(users.contains(id)) Some(users.filterKeys(Set(id))) else None
   Try(UserManager(filteredUsers.get))
  }

  def remove(user: User)(implicit userManager: UserManager):Try[UserManager] = removeById(user.usedId)

  def renewMembership(account: Account, date: Timestamp):Try[Account] = Try(account.copy(dateOfRenewal = Some(date)))

  def closeAccount(account: Account, date: Timestamp):Try[Account] = Try(account.copy(dateOfEnding = Some(date)))

}

object UserManagerService extends UserManagerService