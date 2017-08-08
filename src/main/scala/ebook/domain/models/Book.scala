package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */


case class Book(
               id: Int,
               details:String,
               page: Int = 0
               )