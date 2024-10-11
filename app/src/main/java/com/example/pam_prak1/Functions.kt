package com.example.pam_prak1

fun withoutParameter(){
    println(" == withoutParameter ==")
    println("Hello, world!")
}

fun withParameter(name: String){
    println()
    println("== withParameter ==")
    println("Hello, $name!")
}

//named argument
// named argument merupakan cara untuk mengambil fungsi dengan menyebutkan nama parameter
fun withNamedArgument(name: String, age: Int){
    println()
    println("== withNamedArgument ==")
    println("Hello, $name! You are $age years old.")
}
