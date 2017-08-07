package ebook.domain.models

/**
  * Created by aloisia.davi on 07.08.17.
  */

trait Library extends Account{
  def books: Map[Int, Book]
}