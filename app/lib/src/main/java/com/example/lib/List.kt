package com.example.lib

fun main (){
    val numbers =  listOf(1,5,4,3,2,6,7,8,9,10,23,23,12)
    val numeroX = numbers[2]
    var MaxNumber = numbers[0]
    for(number in numbers){
        if (number > MaxNumber)
            MaxNumber = number
    }
    println(MaxNumber)
}