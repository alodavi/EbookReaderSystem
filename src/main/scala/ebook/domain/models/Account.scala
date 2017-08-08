package ebook.domain.models

import java.sql.Timestamp

/**
  * Created by aloisia.davi on 07.08.17.
  */

case class Account (
                  accountNo: String,
                  accountDetails:String,
                  accountType: Int,
                  dateOfCreation: Timestamp,
                  dateOfRenewal: Option[Timestamp],
                  dateOfEnding:Option[Timestamp]
                  )
