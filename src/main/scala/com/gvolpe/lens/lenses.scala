package com.gvolpe.lens

import com.gvolpe.lens.model._
import monocle.macros.GenLens

object lenses {

  private val _company = GenLens[Employee](_.company)
  private val _address = GenLens[Company](_.address)
  private val _street  = GenLens[Address](_.street)
  private val _stName  = GenLens[Street](_.name)

  val stNameLens = _company composeLens _address composeLens _street composeLens _stName

  // Same as above using symbolic syntax
  val stNameLensSymbolic = _company ^|-> _address ^|-> _street ^|-> _stName

  private val _price      = GenLens[Product](_.item.price)
  private val _majorPrice = GenLens[Price](_.major)
  private val _minorPrice = GenLens[Price](_.minor)

  private val MajorPriceFactor = 0.02
  private val MinorPriceFactor = 0.05

  val majorPriceLens = (_price ^|-> _majorPrice).modify(_ * (1 + MajorPriceFactor))
  val minorPriceLens = (_price ^|-> _minorPrice).modify(_ * (1 + MinorPriceFactor))

}
