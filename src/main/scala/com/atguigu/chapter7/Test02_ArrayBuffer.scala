package com.atguigu.chapter7

import scala.collection.mutable
import scala.collection.mutable.ArrayBuffer

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved
  *
  * Project: scala0421
  * Package:
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/27 15:03
  */

// 可变数组ArrayBuffer，在执行添加或删除操作时，直接在原数组上进行
object Test02_ArrayBuffer {
  def main(args: Array[String]): Unit = {
    // 1. 创建数组
    val arr1: ArrayBuffer[Int] = new ArrayBuffer[Int]()
    val arr2 = ArrayBuffer(1,2,3)
//    println(arr1.mkString(","))
    println(arr2)

    println("===============================")

    // 2. 访问和修改数组元素
    println(arr2(1))
    arr2.update(2, 33)
    println(arr2)
    println("===============================")

    // 3. 向数组中添加元素
    val newArr1 = arr1.+:(25)    // 不改变原数组的值，返回一个新数组；不推荐使用
    println(arr1)
    println(newArr1)
    println(arr1 == newArr1)

    val newArr2 = arr1.+=(23)    // 要改变原数组
    arr1 += 17     // += 是表示追加元素到数组末尾
    19 +=: arr1
    println(arr1)
    println(newArr2)
    println(arr1 == newArr2)

    // 使用语义化对象方法来进行添加元素（推荐）
    arr1.append(36, 10)     // 在末尾追加
    arr1.prepend(23, 1, 21)    // 在头部追加
    arr1.insert(2, 14, 59)    // 在指定位置插入元素
    println(arr1)
    println(newArr2)

    // 4. 删除数组中元素
    arr1 -= 3    // 没有3元素，无效
    arr1 -= 23
    println(arr1)

    arr1.remove(5, 2)     // 从5位置开始删，删2个
    println(arr1)

    arr1.appendAll(arr2)
    arr1 ++= ArrayBuffer(24, 59)

    println("==========================")

    // 5. 可变数组和不可变数组的转换
    val arr: ArrayBuffer[Int] = ArrayBuffer(1,3,4)
    val newArr: Array[Int] = arr.toArray
    println(arr)
    println(newArr.mkString("--"))

    val buffer: mutable.Buffer[Int] = newArr.toBuffer
    println(buffer)

  }
}
