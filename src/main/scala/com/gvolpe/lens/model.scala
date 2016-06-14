package com.gvolpe.lens

object model {

  case class Street(name: String, number: Int)
  case class Address(zip: String, street: Street)
  case class Company(name: String, address: Address)
  case class Employee(name: String, company: Company)

}
