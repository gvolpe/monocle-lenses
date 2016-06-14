package com.gvolpe.lens

object LensApp extends App {

  import lenses._, model._

  // Basic example

  val me = Employee("Gabi Volpe", Company("PartialFlow", Address("1619", Street("Pedraza", 1234))))

  val meUpdatedSt = stNameLens.set("Dundrum Road")(me)

  println(me)
  println("After update...")
  println(meUpdatedSt)

  // Example 2

  val product = Product(1L, Item("pc", Price(430.57, 567.76)))

  println(minorPriceLens(majorPriceLens(product)))

}
