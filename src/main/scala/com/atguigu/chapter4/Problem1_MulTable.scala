package com.atguigu.chapter4

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter4
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/21 17:02
  */
object Problem1_MulTable {
  def main(args: Array[String]): Unit = {
    for(i <- 1 to 9; j <- 1 to i){
      print(j + " * " + i + " = " + i * j + "\t")
      if(i == j){
        println()
      }
    }
    // 另半个直角三角形的遍历
    for(i <- 1 to 9; j <- i to 9){}
  }
}
