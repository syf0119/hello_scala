package com.it.angry

abstract class Demo {
  var name:String
  def say(arg:String):Int

}
class DemoSpec extends Demo {
  override var name: String = "jack"

  override def say(arg: String): Int = {
    1
    2
    3
    4
    4
    12
  }
}


object Main {
  def main(args: Array[String]): Unit = {
     val obj=   new DemoSpec
    val result=obj.say("hello")
    println(result)
  }
}