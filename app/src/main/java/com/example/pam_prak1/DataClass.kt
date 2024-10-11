package com.example.pam_prak1

// Data Class
// Data class adalah class yang digunakan untuk menyimpan data
// data class menyediakan fungsi untuk meng-override fungsi equals(), hasCode(), dan toString()
// Data class juga menyediakan fungsi copy() untuk membuat salinan objek dengan beberapa pembaruan

data class DataClass(
    val id: Int,
    var email: String
)

