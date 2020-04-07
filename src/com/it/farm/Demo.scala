package com.it.farm
trait Run{
  def run
}

class Demo {
  def run=println("run")

}
object Main{
  def main(args: Array[String]): Unit = {
    val demo=new Demo with Run


    demo.run
  }
}