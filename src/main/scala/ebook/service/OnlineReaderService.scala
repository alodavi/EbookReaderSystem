package ebook.service

import ebook.domain.models.OnlineReader

/**
  * Created by aloisia.davi on 07.08.17.
  */
trait OnlineReaderService extends LibraryService with DisplayService with UserManagerService

object OnlineReaderService extends OnlineReaderService
