package com.atguigu.chapter4

import scala.collection.immutable
import scala.util.Random

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 10:30
  */
object Test02_For {
  def main(args: Array[String]): Unit = {
    // 1. 对范围数据进行遍历（闭区间，to）
    for( i <- 1 to 10 ){
      println(i)
    }
    // 相当于对象的方法调用1.to(10)

    // 2. 对范围数据进行遍历（半开半闭区间，until）
    for( i <- 1 until 10 ){
      println(i)
    }

    // 3. 更多的范围测试
    for( i <- 3 to 12 ){
      println(i)
    }
    // 如果反过来，没有输出
    for( i <- 10 to 1 ){
      println(i)
    }
    // 如果是小数，报错
//    for( i <- 2.5 to 10.5 ){
//      println(i)
//    }

    // 4. 跳出循环
    // 在scala里，没有continue和break关键字
    // 通过if判断，可以方便的跳出当前循环，实现continue的功能
    for( i <- 1 to 10 ){
//      if( i == 5 ){
////        continue;
//      } else
//        println(i)
      if( i != 5 ){
        println(i)
      }
    }

    // 5. 循环守卫（某些条件下直接跳过循环）
    for( i <- 1 to 10; if i != 5 ){
      println(i)
    }

    // 6. 循环步长
//    for( i <- 1 to 10; if i % 2 == 1 ){
//      println(i)
//    }
    for( i <- 1 to 10 by 2 ){
      println(i)
    }
    for( i <- 2.to(10).by(2) ){
      println(i)
    }

    // 步长和守卫同时使用
    for( i <- -10 to 10 by 2; if i%3 == 0){
      println(i)
    }

    // 倒序遍历
    for( i <- 10 to 1 by -1 ){
      println(i)
    }

    // 非整数步长
    for( i <- 2.5 to 10.5 by 1.5 ){
      println("非整数步长：" + i)
    }

    for( i <- 10 to 10 ){
      println(i)
    }

    // 步长不能为0
//    for( i <- 1 to 10 by 0 ){
//      print(i)
//    }

    // 7. 嵌套循环
    for( i <- 1 to 5 ){
      for( j <- 1 to 6 ){
        print("i:" + i + ",j:" + j + "\t")
      }
      print("\n")
    }

    for( i <- 1 to 5; j <- 1 to 6 ){
      print("i:" + i + ",j:" + j + "\t")
      if( j == 6 ) println()
    }

    // 8. 引入变量
    for( i <- 1 to 10; j = 10 - i ){
      println("i: " + i + ", j: " + j)
    }
//    for( i <- 1 to 10 ){
//      val j = 10 - i
//      println("i: " + i + ", j: " + j)
//    }
    for{
      i <- 1 to 10
      j = 10 - i
    }{
      println("i: " + i + ", j: " + j)
    }

    // 9. 循环返回值
    // 默认值是Unit
    val unit: Unit = for (i <- 1 to 10) {
      println(i)
      10
    }

    // 可以用yield关键字，定义一个表达式进行计算，得到的结果保存到一个集合类型中
    val res: immutable.IndexedSeq[Int] = for (i <- 1 to 10) yield i * i
    println(res)

    // 10. 遍历一般的集合类型
//    for( x <- Range.inclusive(1, 10, 1) ){}
    for( x <- Array(23,324,35,1.2,"hello") reverse ) println(x)
  }
}
