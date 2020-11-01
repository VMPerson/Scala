package com.atguigu.chapter8

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter8
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/29 14:37
  */
object Test03_MatchExtendsCase {
  def main(args: Array[String]): Unit = {
    // 1. 变量声明时，可以用元组、集合、样例类形式同时对里面的多个元素直接声明
    val (x, y) = (1, 2)
    println("x: " + x + ", y: " + y)

    val (stdId, name, age) = (9527, "junjie", 18)
    val List(first, second, _*) = List(23, 15, 67, 89)
    println("first: " + first +  ", second: " + second)

    println("===========================")

    // 2. for推导式里的模式匹配
    val list: List[(String, Int)] = List(("a", 1), ("b", 2), ("c", 3))
    val map: Map[String, Int] = Map("a" -> 1, "b" -> 2)

    for (elem <- list) {println("k: " + elem._1 + ", v: " + elem._2)}

    for( (word, count) <- list ) println("k: " + word + ", v: " + count)

    for( (word, _) <- list ) println("word: " + word)

    for( ("a", count) <- list ) println("a: " + count)
  }
}
