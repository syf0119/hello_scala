package com.it.fare


trait DataValidHanlderTrait extends  {
   def handle(data:String): Unit = {
    println("验证数据...")
   // super.handle(data)
  }
}

trait SignatureValidHandlerTrait extends  {
   def handle(data: String): Unit = {
    println("校验签名...")
    //super.handle(data)
  }
}

class PayService extends DataValidHanlderTrait with SignatureValidHandlerTrait {
  override def handle(data: String): Unit = {
    println("准备支付...")
    super.handle(data)
  }
}
object Main {
  def main(args: Array[String]): Unit = {
    val service = new PayService
    service.handle("支付参数")
  }
}