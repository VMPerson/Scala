package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/28 16:38
  */

// 简化/归约reduce，折叠fold
object Test13_HighLevelFun_Reduce {
  def main(args: Array[String]): Unit = {
    val list = List(1,2,3,4)

    // 1. reduce
    val sum1: Int = list.reduce( (sum: Int, newData: Int) => sum + newData )
    val sum2 = list.reduce( _ + _ )
    val sum3 = list.reduceLeft( _ + _ )
    val sum4 = list.reduceRight( _ + _ )

    println(sum1)
    println(sum2)
    println(sum3)
    println(sum4)

    println("===========================")

    // 左右归约的测试：相减
    println( list.reduceLeft(_ - _) )    // -8, 1-2-3-4
    println( list.reduceRight(_ - _) )   // -2, 1-(2-(3-4))

    // 作业： 对于List(3,4,5,8,10)进行reduce测试
    val list2 = List(3,4,5,8,10)
    println( list2.reduceLeft(_ - _) )    // -24, 3-4-5-8-10
    println( list2.reduceRight(_ - _) )    // 6, 3-(4-(5-(8-10)))

    // 2. fold
    val sum10 = list.fold(10)(_ + _)    // 10 +1+2+3+4
    println(sum10)
    println( list.fold(10)(_ - _) )    // 10 -1-2-3-4
    println( list2.foldRight(11)(_ - _) )    // 3-(4-(5-(8-(10-11)))
  }
}
