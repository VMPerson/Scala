package com.atguigu.chapter2

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/20 10:51
  */
object Test07_Cast {
  def main(args: Array[String]): Unit = {
    // 1. 自动类型转换
    //（1）自动提升原则：有多种类型的数据混合运算时，系统首先自动将所有数据转换成精度大的那种数据类型，然后再进行计算。
    val a1: Byte = 10
    val b1: Long = 30L
    val res1: Long = a1 + b1
    println(res1)

    //（2）把精度大的数值类型赋值给精度小的数值类型时，就会报错，反之就会进行自动类型转换。
//    val res2: Int = a1 + b1
    val res2: Int = (a1 + b1).toInt
    println(res2)

    //（3）（byte，short）和char之间不会相互自动转换。
    val a3: Byte = 10
    val b3: Char = 'a'
//    val c3: Byte = b3    // IDEA不报错，实际编译不过
    val c3: Int = a3
    println(c3)

    //（4）byte，short，char他们三者可以计算，在计算时首先转换为int类型。
    val a4: Short = 35
    val b4: Long = 46L
    val res4: Int = a3 + b3 + a4
    val res5: Long = a3 + b3 + a4 + b4
    println(res5)

    val n1: Float = 21.1244f
    val n2: Double = 12.324325325
    val n3: Long = 35
    println(n1 + n3)
//    println(n2)

    // 2. 强制类型转换
    //（1）将数据由高精度转换为低精度，就需要使用到强制转换
    val a5: Int = 2.9.toInt   // 取整数部分
    val a6: Int = -2.6.toInt
    println(a6)

    //（2）强转符号只针对于最近的操作数有效，往往会使用小括号提升优先级
    val a7: Int = (2.5 + 3.6.toInt).toInt
    val a8: Int = (2.5 + 3.6).toInt
    println(a7)
    println(a8)

    // 测试： 高精度数据强转低精度数据，超出低精度类型范围
    val m: Long= 214748364999L
    val n: Int = m.toInt
    println(n)

    // 3. String和数值类型的转换
    // (1)数值转换成字符串
    val str: String =  10 + ""
    // (2)字符串转数值
    val num1: Int = "123".toInt
//    val num2: Int = "12.3".toInt   // 编译不报错，但运行报错
    val num2: Int = "12.3".toDouble.toInt
    println(num2)
  }
}
