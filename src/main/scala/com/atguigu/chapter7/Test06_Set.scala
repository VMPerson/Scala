package com.atguigu.chapter7

import scala.collection.mutable
//import scala.collection.mutable.{Set => muSet}

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 10:06
  */

// 集Set：元素不能重复、无序
object Test06_Set {
  def main(args: Array[String]): Unit = {
    // 1. 不可变Set
    // 1.1 创建
     val set1: Set[Int] = Set(1,2,3,5,2,6,3,7,1,6)
    println(set1)
    println("===================")
    // 1.2 添加元素
    val set2: Set[Int] = set1 + 21
    println(set1)
    println(set2)
    println("===================")
    // 1.3 删除元素
    val set3 = set2 - 13 - 6
    println(set2)
    println(set3)
    println("===================")
    // 1.4 两个set合并
    val set4 = Set(12, 56, 98)
    val set5 = set3 ++ set4
    println(set3)
    println(set4)
    println(set5)

    println("===============================")

    // 2. 可变Set
    // 2.1 创建
    val set6: mutable.Set[Int] = mutable.Set(1,2,3,4)

    // 2.2 添加元素
    val flag1: Boolean = set6.add(17)
    val flag2 = set6.add(2)
    println(set6)
    println(flag1)
    println(flag2)

    // 2.3 删除元素
    set6.remove(3)
    println(set6.remove(5))
    println(set6)

    // 2.4 其它符号用法
    set6 += 29 += 36
    set6 -= 1 -= 2
    println(set6)

    // 2.5 合并两个set
    set6 ++= set1
    println(set1)
    println(set6)

    // 2.6 遍历
    for( elem <- set6 ) println(elem)
    set6.foreach(println)
  }
}
