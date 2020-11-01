package com.atguigu.chapter7

import scala.collection.mutable

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 10:37
  */
// 映射map
object Test07_Map {
  def main(args: Array[String]): Unit = {
    // 1. 不可变
    // 1.1 创建
    val map1: Map[String, Int] = Map("a" -> 1, "b" -> 2, "c" -> 3)
    println(map1)

    // 1.2 遍历key-value对
    map1.foreach(println)
    map1.foreach((kv: (String, Int)) => println(kv))
    for (elem <- map1) {
      println(elem)
    }

    for( key <- map1.keys ) println("key: " + key)
    for( value <- map1.values ) println("value == " + value)

    println("=======================")
    // 1.3 访问具体数据
    println(map1.get("a").get)
    println(map1("a"))
    println(map1.get("d"))    // None
    println(map1.getOrElse("d", 0))

    println("===========================")

    // 2. 可变map
    // 2.1 创建
    val map2:mutable.Map[String, Int] = mutable.Map("a" -> 1, "b" -> 2, "c" -> 3)

    // 2.2 添加元素
    map2.put("d", 8)
    val map3 = map2 + (("e", 9))    // 添加元素，要注意双括号表示一个k-v对
    map2 += (("f", 17))
    println(map2)
    println(map3)

    println("==================")

    // 2.3 删除元素
    println(map2.remove("d"))
    map2 -= "c" -=  "a"
    println(map2)

    // 2.4 修改元素
    map2.update("a", 13)
    println(map2("b"))
    map2("b") = 31
    println(map2)

    println("=======================")

    // 2.5 合并两个map
    val map4 = map1 ++ map2    // 不改变map1、map2
    map2 ++= map1
//    map1 ++= map2     // 不可变map不能调++=
    println(map1)
    println(map2)    // 如果有相同的key，会被map1覆盖
    println(map4)    // 如果有相同的key，用map2的
  }
}
