package com.atguigu.chapter6

/**
  * Copyright (c) 2018-2028 尚硅谷 All Rights Reserved 
  *
  * Project: scala0421
  * Package: com.atguigu.chapter6
  * Version: 1.0
  *
  * Created by wushengran on 2020/7/25 9:24
  */
object Test06_ConstructorParam {
  def main(args: Array[String]): Unit = {
    val student2 = new Student2()
    student2.name

    val student3 = new Student3("alice", 18)
    println(student3.name + "  " + student3.age)

    val student4 = new Student4("bob", 25)
//    student4.name   // error，没有name属性

    val student5 = new Student5("cary", 40)
    student5.name
//    student5.age = 42    // error，不能对val重新赋值

    val student6 = new Student6("daisy", 23, "college")
    student6.age = 24
    student6.school = "atguigu"
    student6.printInfo()
  }
}

// 类的不同定义方式（主构造器不同）
// 1. 无参主构造器
class Student2{
  var name: String = _
  var age: Int = _
}

// 等价于
// 2. var类型的主构造器参数
class Student3(var name: String, var age: Int){}

// 3. 也可以参数前没有修饰符，但是当前的参数不会作为属性直接生成
class Student4( name: String, age: Int ){}

//class Student4( name_param: String, age_param: Int ){
//  var name: String = name_param
//  var age: Int = age_param
//}

// 4. val修饰的主构造器参数
class Student5( val name: String, val age: Int ){}


// 一般情况下，会同时提供主、辅构造器
class Student6( var name: String, var age: Int ){
  var school: String = "atguigu"
  println("主构造器")

  def this(name: String, age: Int, school: String){
    this(name, age)
    println("辅助构造器")
    this.school = school
  }

  def printInfo(): Unit ={
    println("Student6: " + this.name + "  " + age + "  " + this.school)
  }
}