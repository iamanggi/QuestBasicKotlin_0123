package com.example.pam_prak1

// Lambda Functions
// Lambda Functions adalah fungsi yang tidak memiliki nama
// Lambda Functions biasanya digunakan untuk membuat fungsi yang sederhana
// Lambda Functions menggunakan tanda panah (->) untuk memisahkan parameter atau body fungsi

fun uppercaseString(string: String):String{
    return string.uppercase()
}

// Dapat ditulis dalam ekspresi lambda sbb:
fun main(){
    uppercaseString("hello")
    println({string: String -> string.uppercase()}("hello"))
    //HELLO
}