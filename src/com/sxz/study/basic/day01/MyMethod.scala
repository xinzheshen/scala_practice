package com.sxz.study.basic.day01

object MyMethod {

  def sum(a: Int, b: Int): Int = {
    a + b
  }

  def main(args: Array[String]): Unit = {
    println(sum(2, 3))

    // 方法转换为函数: 方法名+空格+下划线
    val f = sum _
    print(f(4, 5))
  }
}
