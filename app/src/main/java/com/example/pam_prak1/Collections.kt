package com.example.pam_prak1

// List adalah kumpulan data yang disusun secara berurutan dari
// List bersifat ordered, artinya data yang dimasukkan akan memiliki poisis sesuai urutan
// List bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// List Read-Only menggunakan listOf
// List Mutable menggunakan mutableListOf


fun ContohList(){
    println("=== List ===")

    //List Read-Only
    val readOnlyAbjad = listOf("A", "B", "C")
    println(readOnlyAbjad)

    //list mutable
    val shape: MutableList<String> =         //<>tipe listnya yaitu string
        mutableListOf("Circle" , "Square", "Triangle")
    println(shape)

    //menambahkan data ke dalam list mutable
    shape.add("Circle")  //contoh methode
    println(shape)

    //menghapus data dari list mutable
    shape.remove("Triangle")
    println(shape)

    //mengubah data didalam list mutable
    shape[0] = "Oval"
    println(shape)

    //List Read-Only
    val shapesLocked: List<String> = shape
    println(shapesLocked)
}
