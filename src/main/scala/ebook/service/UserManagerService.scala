package ebook.service

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait UserManagerService[User]{
  def users: Map[Int, User]

  def addUser(id:Int, details:String, accountType:Int):User

  def find(id:Int):User

  def remove(user: User):Boolean

  def remove(id:Int):Boolean

  def renewMembership:Unit
}