package com.example.kotlinbasics

class Triangle(
    val l: Double,
    val m: Double,
    val n: Double

) : Shape( "Triangle") {

    init {
        println("$name is created with a = $l and b = $m c = $n")
        println("$name area is ${area()}")
        println("$name perimeter is ${perimeter()}")

    }
    override fun area () = l * m

    override fun perimeter () = l + m + n

}