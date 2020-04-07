package com.it.laugh
trait TraitSport{
  println("sport")
  def sport
}

trait TraitRun extends TraitSport {
  println("run")
  def run

}
trait TraitWalk extends TraitSport {
  println("walk")
  def walk
}
abstract class Animal{
  println("animal")
  var weight:String
  var age:Int
  def eat
}
trait TraitMix{
  def mix=println("mix")
}

class Person extends Animal with TraitRun with TraitWalk {
  override def run: Unit = println("run")

  override def walk: Unit = println("walk")

  override var weight: String = "60kg"
  override var age: Int = 18

  override def eat: Unit =println("eat bread")

  override def sport: Unit = println("do sport")
}

object  Main{
  def main(args: Array[String]): Unit = {
    val obj=new Person with TraitMix
    println("**************")
    obj.walk

  }
}
