package com.atguigu.chapter6

import scala.beans.BeanProperty

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/24 16:23
  */
object Test03_Class {
  def main(args: Array[String]): Unit = {
    // 创建对象
    val student: Student = new Student()

    // 通过对象的.方式访问属性
//    student.name    // error，无法访问
    student.sex = "male"
    println(student.getAge)
    println(student.sex)

  }
}

class Student{
  // scala中类的属性底层默认是会转成private，然后提供public的getter/setter
  private var name: String = "alice"

  // 如果想要生成符合java bean规范的get/set方法，可以直接在属性上加@BeanProperty
  @BeanProperty
  val age: Int = 18

  // 如果想要给属性赋默认空值，可以直接用_表示
  var sex: String = _

}