package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 16:24
  */

// 特征叠加顺序
object Test14_TraitOverlying {
  def main(args: Array[String]): Unit = {
    val myBall = new MyBall()
    println(myBall.describe())
  }
}

// 定义一个父特征
trait Ball{
  def describe(): String = "ball"
}

// 定义子特征
trait Color extends Ball{
  var color: String = "yellow"
  override def describe(): String = color + "-" + super.describe()
}

trait Category extends Ball{
  var category: String = "foot"
  override def describe(): String = category + "-" + super.describe()
}

// 定义子类，继承两种特征
class MyBall extends Category with Color{
  override def describe(): String = super.describe()
}