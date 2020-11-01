package com.atguigu.chapter2

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/18 16:53
  */
object Test04_DataType {
  def main(args: Array[String]): Unit = {
    // 1. 整型
    val a1: Byte = 127
    val a2: Byte = -128

    // 编译的时候，编译器会判断当前数值是否在类型范围内
    val b1: Byte = 10
    val b2: Byte = 10 + 20    // IDEA报错，但实际是正确的
//    val b3: Byte = b1 + 20    // error: 不能判断 b1 + 20 的范围
    val b4: Byte = (b1 + 20).toByte
//    println(b4)

    val b5 = 134    // 默认整型是Int
    val b6: Long = 241354354343L

    // 2. 浮点类型（略）

    // 3. 字符类型
    // 字符常量是用单引号 ' ' 括起来的单个字符
    var c1: Char = 'a'
    println(c1 + 1)    // 字符a的ascii码是97，结果是98
    val c2: Char = 'a' + 1
    println(c2)

    // 4. 布尔类型（略）
  }
}
