package com.it.hate

class Person(var name:String="",val age:Int=10){
  def say=println("I am a person")
}
class Student extends Person{
 // override val age: Int = 30
  override def say=println("I am a student")
  def getAge=println(age)
}


object Main{
  def main(args: Array[String]): Unit = {
    val stu:Person=new Student
    if(stu.isInstanceOf[Person]){
      println("gagaga")
      val stu1=stu.asInstanceOf[Person]
    }


   val clazz= stu.getClass
    println(clazz)
    println(classOf[Student])



  }
}