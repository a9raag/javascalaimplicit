package scala

/**
  * Created by anurag on 18/12/16.
  */
class PairRDDFunction[K,V](self:RDD[(K,V)]) {
  def testingArea(): Unit ={
    println("we are in testing area")
  }
}
