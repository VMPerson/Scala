package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 10:40
  */

// 测试闭包和柯里化
object Test08_ClosureAndCurrying {
  def main(args: Array[String]): Unit = {

    // 0. 先写一个两数求和函数
    def add( a: Int, b: Int ): Int = {
      a + b
    }
    // 通用性好，适用性就会差

    // 1. 闭包的场景：适用性更强的场景
    // （1）方案1：直接定死a的值
    def addByFour(b: Int): Int = 4 + b
    // 适用性强，通用性就差；场景扩展时比较麻烦
    def addByFive(b: Int): Int = 5 + b

    // (2)方案2：不要定死a的值，而是作为外层函数的参数传入
    // 定义一个函数的函数，它可以根据不同的a值，得到addByFour、addByFive一类的具体的函数
    def addByA(a: Int): Int=>Int = {
      def addB(b: Int): Int = {
        a + b
      }
      addB
    }

    // lambda表达式简写
    def addByA1(a: Int): Int=>Int = a + _

    // 那么之前的具体函数就可以写为
    val addByFour1 = addByA(4)
    val addByFive1 = addByA1(5)

    println(addByFour1(6))
    println(addByFive1(7))

    addByA(4)(6)
    addByA1(5)(7)

    // 2. 函数柯里化
    def addCurrying(a: Int)(b: Int): Int = a + b

    println(addCurrying(8)(9))

    val addByEight = addCurrying(8)(_)    // 偏应用函数，用下划线代表不传第二个参数，得到中间函数
    println(addByEight(19))

    val addByNine = add(9, _)
    println(addByNine(13))
  }
}
