package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 15:18
  */
object Test13_Lazy {
  def main(args: Array[String]): Unit = {
    lazy val res: Int = sum(2, 3)
    println("1. main()")
    println("2. res = " + res)
  }
  def sum(i: Int, i1: Int) = {
    println("3. sum()")
    i + i1
  }
}
