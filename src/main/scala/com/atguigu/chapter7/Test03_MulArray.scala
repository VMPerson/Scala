package com.atguigu.chapter7

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter7
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 15:59
  */
object Test03_MulArray {
  def main(args: Array[String]): Unit = {
    // 1. 创建一个2*3的二维数组
    val arr: Array[Array[Int]] = Array.ofDim[Int](2, 3)

    // 2. 访问/修改数组元素
    arr(0)(2) = 19
    arr(1)(0) = 26

    // 3. 遍历
    for( i <- 0 until arr.length; j <- 0 until arr(i).length ){
      println(arr(i)(j))
    }
    // 简写
    for( i <- arr.indices; j <- arr(i).indices ){
      print(arr(i)(j) + "\t")
      if( j == arr(i).length - 1 ) println()
    }

    // 用foreach进行遍历
    arr.foreach( x => x.foreach(println) )
    arr.foreach( _.foreach(println) )

    println("=====================================")

    // 作业：创建一个五维数组 2*3*4*5*6，并遍历

    val fivedimArr: Array[Array[Array[Array[Array[Int]]]]] = Array.ofDim[Int](2,3,4,5,6)
    for{i <- fivedimArr.indices
         j <- fivedimArr(i).indices
         k <- fivedimArr(i)(j).indices
         m <- fivedimArr(i)(j)(k).indices
         n <- fivedimArr(i)(j)(k)(m).indices
    }{
      fivedimArr(i)(j)(k)(m)(n) = i * j * k * m * n
      //      println(fivedimArr(i)(j)(k)(m)(n))
    }

    println("======================")

    fivedimArr.foreach( _.foreach( _.foreach( _.foreach( _.foreach(println) ) ) ) )

  }
}
