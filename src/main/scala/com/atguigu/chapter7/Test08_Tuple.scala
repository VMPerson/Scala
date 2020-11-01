package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 11:39
  */
// scala元组Tuple
object Test08_Tuple {
  def main(args: Array[String]): Unit = {
    // 1. 创建元组对象
    val tuple1: (Int, String, Double) = (11, "hello", 2.5)
    println(tuple1)

    // 2. 访问元组中的数组
    println(tuple1._1 + "\t" + tuple1._2 + "\t" + tuple1._3)
    println(tuple1.productElement(1))     // 索引从0开始

    println("===================")

    // 3. 遍历
    for( elem <- tuple1.productIterator ){
      println(elem)
    }

    println("===================")

    // 4. 元组和map
    // Map类型的元素key-value对就是一个特殊的元组，二元组
    val map1 = Map(1 -> 13, 2 -> 25)
    val map2 = Map((1, 13), 2 -> 25)

    // 5. 元组嵌套
    // 元组的元素可以是任何数据类型
    val tuple2 = (11, "hello", (2.5, 35), ("hello", "scala"), List(1,3))
    println( tuple2._2 + "\t" + tuple2._4._2 )
  }
}
