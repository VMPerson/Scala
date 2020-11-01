package com.atguigu.chapter3

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter3
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/20 14:28
  */
object Test01_Operator {
  def main(args: Array[String]): Unit = {
    // 1. 比较运算符
    /*
      Java
      - ==比较的是对象的内存地址
      - equals默认也是比较地址，但String对equals方法进行了重写，进行字符串内容的比较
      Scala
        == 和 equals方法是一样的，都是比较内容是否相等
    * */
    val str1: String = new String("hello")
    val str2: String = "hello"
    println(str1 == str2)
    println(str1.equals(str2))

    println(str1.eq(str2))    // 比较两个String的引用地址

    println(3 == 3.0)   // true
    println(3 == "3")    // false

    // 2. 逻辑运算符
    def isNotEmpty(s: String): Boolean = {
      return s != null && !"".equals(s.trim())
    }

    println(isNotEmpty("abc"))
    println(isNotEmpty(""))
    println(isNotEmpty(null))

    // 3. 赋值运算符
    var a: Byte = 10
    var b: Int = 1
//    a += 1    // error
    b += 1
    println(b)
//    b ++    // scala没有自增自减运算符

    // 4. 位运算符
    val c = 25   // 0001 1001
    val d = -13   // 13 - 0000 1101, 反码 1111 0010，补码 1111 0011
    println(c << 2)   // 0110 0100，100，相当于乘以4
    println(c >> 2)   // 6
    println(d.>>(2))   // -4，除以4向下取整
    println(d >>> 2)

    // 运算符的本质：方法调用
    val n1: Int = 3
    val n2: Int = 6
    println( n1.+(n2) )

    println(7.5 toString)
  }
}
