package com.example.pam_prak1

// Data Class
// Data class adalah class yang digunakan untuk menyimpan data
// data class menyediakan fungsi untuk meng-override fungsi equals(), hasCode(), dan toString()
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa pembaruan

data class DataClass(
    val id: Int,
    var email: String
)

fun main() {
    val data = DataClass(1, "indra@gmail.com")
    println(data)

    // fungsi Equals
    val data2 = DataClass(1, "makan@gmail.com")
    println(data == data2) //false

    //fungsi Copy
    val data3 = data.copy()
    println(data3)

    //fungsi copy dengan perubahan
    val data4 = data.copy(email = "sahar@gmail.com")
    println(data4)

}