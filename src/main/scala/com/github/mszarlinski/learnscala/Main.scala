package com.github.mszarlinski.learnscala

import scalaz._
import Scalaz._

/**
 * @author mszarlinski on 2017-02-12.
 */
object Main extends App {
   val names: List[String] = List("ala", "ma", "kota")

  def count[F[_] : Functor](fs: F[String]): F[Int] = fs.map(_.length)

  println(count(names))
}
