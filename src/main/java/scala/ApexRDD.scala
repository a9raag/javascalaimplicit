package scala

import scala.language.implicitConversions

/**
  * Created by anurag on 18/12/16.
  */
class ApexRDD[T](rdd:T) extends RDD(rdd){

}
object ApexRDD{

  implicit def add[K,V](r: ApexRDD[(K,V)]): PairApexRDDFunctions[K, V] ={
    println("We are in ApexRDD implicit")
    new PairApexRDDFunctions[K,V](r)
  }
}
