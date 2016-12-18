package scala

import scala.language.implicitConversions

/**
  * Created by anurag on 18/12/16.
  */
class A(val n: Double)
object A {
  implicit def str(a: A): String = "A: %f" format a.n
}
class B(val x: Int) extends A(x*1.0)
object B {
  implicit def str(b: B): String= "B :%d" format b.x
}
object Test {
  def main(args:Array[String]){
    val apexRDD = new ApexRDD[(Double,Int)] ((11.0,11))
    apexRDD.testingArea1()
    apexRDD.testingArea()
    val b = new B(5)
    val s: String = b  // s == "A: 2"
    println(s)

  }
}
