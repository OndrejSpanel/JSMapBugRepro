package some.js

import scala.collection.mutable

trait ScalaCompat {
  def orderingFromFunction[T](f: (T, T) => Int): Ordering[T] = ???
}

trait Port extends ScalaCompat {
  type JSMap[T] = mutable.Map[String, T]
}
