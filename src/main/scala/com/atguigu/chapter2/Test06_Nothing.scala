package com.atguigu.chapter2

import com.atguigu.chapter1.Student

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter2
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/20 10:06
  */
// 空值测试
object Test06_Nothing {
  def main(args: Array[String]): Unit = {
    // 1. Unit: 空值（AnyVal），一般用于表示函数没有返回值，只有唯一的实例()
    def m1(): Unit = {
      println("m1被调用执行")
    }
    println("Unit对象的返回值： " + m1())

    // 2. Null: 空引用（AnyRef），表示没有引用任何的对象
//    val a: Int = null   // error，Int属于AnyVal，不能赋null值
    var a = new Student("alice", 20)
    a = null
    println("Null对象的返回值： " + a)

    // 3. Nothing: 一般作为没有正常返回的方法的返回类型（抛出异常的时候）
    def m2(n: Int): Nothing = {
      if( n == 0 )
        throw new NullPointerException
      else
        throw new RuntimeException
    }
//    println("Nothing对象的返回值： " + m2(0))

    // Nothing是所有scala类型的子类，所以可以和任何返回值兼容
    def m3(n: Int): Int = {
      if( n == 0 )
        return n
      else
        throw new RuntimeException
    }
    println("m3返回值： " + m3(0))
  }
}
