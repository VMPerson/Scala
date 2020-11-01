package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 16:29
  */

// 不可变列表List
object Test04_List {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个List
    val list1: List[Int] = List(1,2,3,4)
    println(list1)

    println("====================")

    // 2. 向列表中添加元素，返回新的list
    val list2 = list1.+:(10)     // 加在前面
    val list3 = list2 :+ 23    // 加在后面
    println(list1)
    println(list2)
    println(list3)

    println("====================")

    // 3.scala的list类型，有两个实现，一个是Nil，表示空列表List();还有一个::，表示非空列表
    val list4 = list1.::(50)    // 把50添加到list开头
    println(list4)

    val list5 = 23 :: Nil
    val list6 = 32 :: list5
    val list7 = 10 :: 20 :: 34 :: 57 :: Nil
    println(list7)

    // 4. 扁平化
    val list8 = list6 :: list7
    println(list8)
    val list9 = list6 ::: list7
    println(list9)

    val list10 = list6 ++ list7
    println(list10)

    // 5. 获取元素
    println(list10(3))
    list10.foreach(println)
  }
}
