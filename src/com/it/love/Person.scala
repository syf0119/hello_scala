package com.it.love


import java.text.SimpleDateFormat
import java.util.Date

class Person(var name:String="",var age:Int=0) {

//  def say= println(this.age+this.name)
//
//  def setName(name:String)=this.name=name
//  def setAge(age:Int)=this.age=age
  def getAll=age->name

  def this(gender:String){
    this("tom",19)
  }
  println("构造器调用")


}
object Main{
  def main(args: Array[String]): Unit = {
    val person=new Person

    //println(person.getAll)
   // println(Dog)
    //Dog.printNUms
    println(DateUtils.format(new Date()))

  }
  def run=println("running")
}


object Dog{
  def printNUms=println("9".*(10))
}
object DateUtils{
  def format(date:Date):String={
  return new SimpleDateFormat("yyyy-mMM-dd HH:mm").format(date);
  }

}
object Mian2 extends App{
  def hello=println("hello")
  hello
}

