// Görev 1: Celsius'u Fahrenheit'a dönüştüren metod
fun celsiusToFahrenheit(celsius: Double): Double {
    // F = C * 1.8 + 32
    return celsius * 1.8 + 32
}

// Görev 2: Dikdörtgenin çevresini hesaplayan metod
fun calculateRectanglePerimeter(length: Int, width: Int): Int {
    // Çevre = 2 * (uzunluk + genişlik)
    return 2 * (length + width)
}

// Görev 3: Faktöriyel hesaplayan metod
fun calculateFactorial(number: Int): Long {
    // Negatif sayılar için hata fırlat
    if (number < 0) throw IllegalArgumentException("Faktöriyel negatif sayı için hesaplanamaz!")
    // 0! = 1
    if (number == 0) return 1
    // Faktöriyel hesaplama
    var result: Long = 1
    for (i in 1..number) {
        result *= i
    }
    return result
}

// Görev 4: Kelime içinde harf sayısını bulan metod
fun countLetterInWord(word: String, letter: Char): Int {
    // Harf sayısını döngü ile hesapla
    var count = 0
    for (char in word) {
        if (char.lowercaseChar() == letter.lowercaseChar()) {
            count++
        }
    }
    return count
}
fun main() {
    println("Görev 1: 25°C -> Fahrenheit: ${celsiusToFahrenheit(25.0)}°F") // 77°F

    // Görev 2 Test
    println("Görev 2: Dikdörtgen çevresi (uzunluk: 5, genişlik: 3): ${calculateRectanglePerimeter(5, 3)}") // 16

    // Görev 3 Test
    println("Görev 3: 5! = ${calculateFactorial(5)}") // 120

    // Görev 4 Test
    println("Görev 4: 'Merhaba' kelimesinde 'a' harfi: ${countLetterInWord("Merhaba", 'a')} kez") // 2
}