package com.example

import com.animal.Animal

case class MyBigCat(foo: String) extends Animal {
    def feels_like(): String = {
        foo
    }
}