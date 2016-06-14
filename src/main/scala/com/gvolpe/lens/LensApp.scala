package com.gvolpe.lens

object LensApp extends App {

  import lenses._, model._

  val me = Employee("Gabi Volpe", Company("PartialFlow", Address("1619", Street("Pedraza", 1234))))

  val meUpdatedSt = stNameLens.set("Dundrum Road")(me)

  println(me)
  println("After update...")
  println(meUpdatedSt)

}
