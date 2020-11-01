package com.atguigu.chapter7

import scala.collection.mutable.ListBuffer

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 11:56
  */

// 集合的基本属性和常见操作
object Test09_CommonOp {
  def main(args: Array[String]): Unit = {
    // 以list为例
    val list = ListBuffer(1,2,4,5,58,5,9)
    val set = Set(1,3,2)

    // 1. 获取集合长度（序列）
    println(list.length)

    // 2. 获取集合的大小
    println(list.size)

    // 3. 循环遍历
    for (elem <- list) {println(elem)}
    list.foreach(println)
    // 迭代器
    for( elem <- list.iterator ) println(elem)

    // 4. 生成字符串
    println(list.mkString(","))

    // 5. 是否包含
    println(list.contains(5))
  }
}
