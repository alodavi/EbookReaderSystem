package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait Account extends User{
    def no: String
    def name: String
    def accountDetails:String
    def accountType: Int
}
