package com.example.kotlinbasics

class CustomTriple<A : Any,  B : Any, C : Any>(
    var first: A,
    var second: B,
    var third: C
){
    fun printTypes(){
        println("The Type Of First is ${first::class}")
        println("The Type Of Second is ${second::class}")
        println("The Type Of Third is ${third::class}")
    }

}