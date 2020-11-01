package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 14:08
  */

// 衍生集合
object Test10_DerivedCollection {
  def main(args: Array[String]): Unit = {
    // 以list为例
    val list1 = List(1,2,3,4,5,6,7)
    val list2 = List(4,5,6,7,8,9,10,11,12,20)

    // 1. 获取集合头部
    println(list1.head)

    // 2. 获取集合尾部
    println(list1.tail)

    // 3. 获取最后一个元素
    println(list1.last)

    // 4. 集合初始数据
    println(list1.init)

    // 5. 翻转，得到一个新的集合，原集合不变
    println(list1.reverse)

    // 6. 取前/后n个元素
    println(list1.take(3))
    println(list1.takeRight(5))
    println(list1)

    println("=====================")

    // 7. 去掉前/后n个元素
    println(list1.drop(3))
    println(list1.dropRight(4))
    println(list1)

    println("============================")

    // 两个集合进行计算，生成新的集合
    // 8. 并集，list相当于++
    val union: List[Int] = list1.union(list2)
    println("union: " + union)

    // 作业：测试两个set求并集

    // 9. 交集，取共同的部分
    val intersection = list1.intersect(list2)
    val intersection2 = list2.intersect(list1)
    println("intersection: " + intersection)

    // 10. 差集，属于A不属于B的那部分
    val diff1 = list1.diff(list2)
    val diff2 = list2.diff(list1)
    println(diff1)
    println(diff2)

    // 11. 拉链：两两配对，构成元组
    println("zip: " + list1.zip(list2))

    // 12. 滑窗
    for (elem <- list1.sliding(3)) {println(elem)}    // 默认步长为1
    for (elem <- list2.sliding(5, 2)) {println(elem)}
    for (elem <- list2.sliding(5, 5)) {println(elem)}    // 步长等于窗口大小，相当于滚动，没有重复元素

  }
}
