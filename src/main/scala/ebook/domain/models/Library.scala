package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */


case class Library(
                  books: Option[Map[Int, Book]]
                  )