package com.sxz.study.basic.day03

trait StudentTrait {

    type T

    def learn(s: T) = {
        println(s)
    }

}
