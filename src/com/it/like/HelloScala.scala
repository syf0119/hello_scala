package com.it.like
import scala.collection.mutable.ArrayBuffer
import scala.collection.mutable.ListBuffer
import scala.collection.mutable.Map

object HelloScala {
  def main(args: Array[String]): Unit = {

    val x=1.+(1)

    val function=(x:Int,y:Int)=>x+y

    //println(function(1,2))


    var arr1=new Array[Int](5)
    val arr2=Array(1,2,3,4,3,1,4)
    //for(x<-arr2) println(x)
   // println(arr2(1))


    //val arr=ArrayBuffer("add","addad","dadad")
    //arr.append("end")
    //arr+="end"
    //arr.remove(2)
    //arr-="dadad"
    //for(str<-arr) println(str)
    //for(x<-0.until(arr.length)) println(arr(x))
    val arr=ArrayBuffer(4,3,2,1,2)
   // println(arr.sorted.reverse)

    val tuple1=("tom",20,"male")
    //println(tuple1._1)
    val tuple2="tim"->"beijing"
//println(tuple2._2)

    var list=List(2,34,1,2,12,2,421,34)
list=List(1,3,5,7,9)
    val list1="we"::"adad"::"adad"::Nil
    //println(list1(2))
    val listFlat=List(list,list1)
    val listBuffer=ListBuffer[Int]()
    //val listBuffer2=Nil
    listBuffer.append(34)
    listBuffer+=54
    listBuffer+=100
    //println(listBuffer)
    val ages=List(20,31,18,30)
    val names=List("jcak","snow","tony")
    val nameAge=names.zip(ages)
    //println(names.mkString(","))

    val nums1=List(1,2,3,4,4)
    val nums2=List(3,4,4,5)
    //println(nums1.diff(nums2))
    val set=Set(1,2,3,3,1,2,34,10)
   // println(set+1000)
    var map=Map("tom"->12,"jack"->19,"alice"->16,"tom"->19)
    //println(map("tom")=20)
    map("tom")=28

    //println(map - "alice")
   // println(map)


    val iter=list.iterator
    //while(iter.hasNext) println(iter.next())
    //list.foreach(x=>println(x))
    //println(list.map(_+1))
    //println(list.map((x:Int)=>{x+1}))


    //val a = List("hadoop hive spark flink flume", "kudu hbase sqoop storm")
 //println(a.flatMap(_.split(" ")).filter(_.length==5))
    //println(List(3,1,2,9,7).sorted)
    val a = List("01 hadoop", "02 flume", "03 hive", "04 spark")
   // println(a.sortBy(_.split(" ")(1).substring(2,3)))
    //println("12345".substring(4,5))
    val b = List(2,3,1,6,4,5)
    //println(b.sortWith(_<_))

    val c = List("张三"->"男", "李四"->"女", "王五"->"男")
    //println(c.groupBy(_._2))
    val map1=c.groupBy(_._2)
   // println(map1.map(_._2.size))


    val d = Map("张三"->"男", "李四"->"女", "王五"->"男")
    println(d.map(println(_)))














    //method
  }
  def method=println("hello")






def add(num:Int*):Int=num.sum
  def add(x:Int=0,y:Int=0):Int=x+y
  def m3(a:Int,b:Int)=a+b
  def sum(a:Int,b:Int):Int=a+b
  def recursion(a:Int):Int={
    if(a<1) 1
    else {
       a*recursion(a-1)
    }
  }



}
