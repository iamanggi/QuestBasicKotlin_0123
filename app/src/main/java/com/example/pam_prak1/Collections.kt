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


// Set adalah kumpulan data yang tidak memiliki posisi atau urutan dan hanya menyimpan data unik ( tidak ada duplikasi)
// Set bersifat unordered, artinya data yang dimasukkan tidak memiliki posisi tertentu
// set bersifat mutable dan read only, artinya data yang dimasukkan dapat diubah dan tidak dapat diubah
// Set Read-Only menggunakan setOf
// Set Mutable menggunakan mutableSetOf

fun ContohSet(){
    println()
    println("=== Set ===")

    //Set Read-Only
    val readOnlyAbjad = setOf("A", "B", "C")
    println(readOnlyAbjad)

    //Set Mutable
    val shape: MutableSet<String> = mutableSetOf("Circle", "Square", "Triangle")
    println(shape)

    //Menambahkan data ke dalam set Mutable
    shape.add("Rectangle")
    println(shape)

    //Menghapus data dari set Mutable
    shape.remove("Circle")
    println(shape)

    //Set Read-Only
    val shapesLocked: Set <String> = shape
    println(shapesLocked)
}