package com.gvolpe.lens

import com.gvolpe.lens.model._
import monocle.macros.GenLens

object lenses {

  val _company = GenLens[Employee](_.company)
  val _address = GenLens[Company](_.address)
  val _street  = GenLens[Address](_.street)
  val _stName  = GenLens[Street](_.name)

  val stNameLens = _company composeLens _address composeLens _street composeLens _stName

  // Same as above using symbolic syntax
  val stNameLensSymbolic = _company ^|-> _address ^|-> _street ^|-> _stName

}
