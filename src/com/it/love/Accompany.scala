package com.it.love

class Accompany {
private[this] def show:Unit=println("hello")
private def say:Unit=println("hi")
}
object Accompany extends App {
 val acc =new Accompany
  acc.say

}
