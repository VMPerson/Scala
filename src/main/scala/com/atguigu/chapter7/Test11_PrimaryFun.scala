package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 15:13
  */
// 集合的初级计算函数
object Test11_PrimaryFun {
  def main(args: Array[String]): Unit = {
    // 以list为例
    val list = List(5,1,8,2,-3,4)

    // 1. 求和
//    var sum = 0
//    for (elem <- list) {
//      sum += elem
//    }
//    println(sum)
    println(list.sum)

    // 2. 求乘积
    println(list.product)

    // 3. 最大最小值
    println(list.max)
    println(list.maxBy( _.abs ))
    println(list.minBy( x => x.abs ))

    println("==========================")

    // 4. 排序
    // 4.1 sorted
    println(list.sorted)    // 从小到大正序排列
    println(list.sorted.reverse)     // 逆序

    println("==========================")

    // 4.2 sortBy：传入一个函数，表示对每个元素先做转换，然后对转换的结果进行排序
    println(list.sortBy( x => x.abs ))    //  对元素的绝对值进行排序
    println(list.sortBy( _.abs )(Ordering[Int].reverse))
    println(list.sortBy( _.abs ).reverse)

    // 4.3 sortWith：传入一个函数，有两个参数，得到一个Boolean值，表示集合中元素的比较规则
    println(list.sortWith( (x, y) => x < y ))
    println(list.sortWith( _ > _ ))
  }
}
