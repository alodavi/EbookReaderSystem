package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait UserManager extends Account{
  def users: Map[Int, User]
}
