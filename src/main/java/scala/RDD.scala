package scala

import scala.language.implicitConversions

/**
  * Created by anurag on 18/12/16.
  */
class RDD[T](val n: T)
object RDD {
  implicit def str[K,V](r: RDD[(K,V)]): PairRDDFunction[K, V] ={
    println("We are in RDD implicit")
    new PairRDDFunction[K,V](r)
  }
}