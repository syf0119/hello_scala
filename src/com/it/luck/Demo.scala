package com.it.luck

case class Person(var name:String,var age:Int)
class Animal(var height:Int,var kind:String)
object Main{
  def main(args: Array[String]): Unit = {

   val per= Person("jack",25)
    println(per.hashCode())
  }
}

