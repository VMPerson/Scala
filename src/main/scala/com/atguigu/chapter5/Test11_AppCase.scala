package com.atguigu.chapter5

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter5
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 14:09
  */
object Test11_AppCase {
  def main(args: Array[String]): Unit = {
    // 需求：实现一个函数，能够对数组中的每一个元素执行同样的处理操作，完成之后返回一个新的数组
    def arrayOp(arr: Array[Int], op: Int=>Int): Array[Int] = {
      // 用一个for循环遍历数组元素，用yield生成新的数组
      for( elem <- arr ) yield op(elem)
    }

    // 基于arrayOp可以定义不同的操作转换
    def addOne(a: Int): Int = a + 1
    val array: Array[Int] = Array(1,2,3,4)
    val newArray: Array[Int] = arrayOp(array, addOne)

    // 打印输出
    println(newArray.mkString(","))

    // 使用匿名函数
    arrayOp(array, (a: Int) => {a * 3})
    arrayOp(array, _ * 3)
    arrayOp(array, _ + 1)
  }
}
