class Car constructor(brand: String) {

    val message1 = "brand is $brand".also(::println)

    init {
        println("1つ目のイニシャライザブロック")
    }

    val message2 = "length is ${brand.length}".also(::println)

    init {
        println("2つ目のイニシャライザブロック")
    }
}

fun main() {
    Car("Mazda")
}