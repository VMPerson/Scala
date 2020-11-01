package com.atguigu.chapter4

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 15:29
  */
object Test03_While {
  def main(args: Array[String]): Unit = {
    // 1. while
    var a: Int = 5
    while( a >= 1 ){
      println("this a while loop " + a)
      a -= 1
    }

    // 2. do-while
    var b: Int = 5
    do {
      println("this a do-while loop " + b)
      b -= 1
    } while(b >= 1)
  }
}
