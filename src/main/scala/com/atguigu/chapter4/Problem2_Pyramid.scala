package com.atguigu.chapter4

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 16:59
  */
object Problem2_Pyramid {
  def main(args: Array[String]): Unit = {
    for (agent <- 1 to 9){
      val num = agent * 2 - 1
      val mie = 9 - agent
      println(" " * mie + "*" * num)
    }

    for( i <- 1 to 9; m = i * 2 - 1; n = 9 - i ){
      println(" " * n + "*" * m)
    }
    for( i <- 1 to 9 ) println(" " * (9-i) + "*" * (i*2-1))

    for( m <- 1 to 17 by 2; n = (17 - m) / 2 )
      println(" " * n + "*" * m)
  }
}
