package com.atguigu.chapter7

import scala.collection.mutable.ListBuffer

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 9:23
  */

// 可变列表ListBuffer
object Test05_ListBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建
    val list1: ListBuffer[Int] = new ListBuffer[Int]
    val list2: ListBuffer[Int] = ListBuffer(1,2,3)

    // 2. 添加元素
    list1.append(10)
    list1.prepend(21, 13)
    list2.insert(1, 27)

    list1 += 15 += 11    // 后面连续追加，相当于append，但是有返回值，可以连续调用
    12 +=: 19 +=: list1

    println(list1)
    println(list2)

    println("====================================")

    // 3. 连接两个list
    val list3 = list1 ++ list2    // list1、list2不变
    list1 ++= list2
    list2 ++=: list1
    println(list1)
    println(list2)
    println(list3)

    println("==============================")

    // 4. 修改元素
    list3(5) = 31
    list2.update(3, 79)

    // 5. 删除元素
    list3.remove(3, 2)
    list3 -= 3
    println(list3)

    val list4 = list3 - 2
  }
}
