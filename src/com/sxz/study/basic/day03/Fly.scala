package com.sxz.study.basic.day03

trait Fly {

    final val name: String = "bird"

    final def fly(name: String): Unit ={
        println(s"看， ${name} 在飞...")
    }



}
