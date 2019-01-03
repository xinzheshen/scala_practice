package com.sxz.study.basic.day01

object MyFunction {

  def main(args: Array[String]): Unit = {
    // => 是函数标志
    //第一种方式
    val f1 = (x: Int) => x * 10
    println(f1) // <function1>   ---- 1表示该函数接收一个参数
    println(f1(3))

    //第二种方式
    val f2:(Int, Int) => (Int) = (x, y) => x * y
    println(f2) // <function2> ----- 2 表示该函数接收两个参数
    println(f2(2, 4))
  }


}
