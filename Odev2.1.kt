// Görev 1: İç açılar toplamını hesaplayan metod
fun calculateInteriorAngles(sides: Int): Int {
    // İç açılar toplamı = (Kenar sayısı - 2) * 180
    if (sides < 3) throw IllegalArgumentException("Kenar sayısı 3'ten küçük olamaz!")
    return (sides - 2) * 180
}

// Görev 2: Maaş hesaplayan metod
fun calculateSalary(days: Int): Int {
    // 1 günde 8 saat çalışılıyor
    val totalHours = days * 8
    var salary = 0

    // 160 saate kadar normal ücret: 10 ₺/saat
    // 160 saatten sonrası mesai ücreti: 20 ₺/saat
    if (totalHours <= 160) {
        salary = totalHours * 10
    } else {
        salary = (160 * 10) + ((totalHours - 160) * 20)
    }
    return salary
}

// Görev 3: Kota ücretini hesaplayan metod
fun calculateQuotaFee(gb: Int): Int {
    // 50 GB = 100 ₺
    // Kota aşımından sonra her 1 GB = 4 ₺
    val baseQuota = 50
    val baseFee = 100
    val extraFeePerGb = 4

    return if (gb <= baseQuota) {
        baseFee
    } else {
        baseFee + (gb - baseQuota) * extraFeePerGb
    }
}

// Test için main fonksiyonu
fun main() {
    // Görev 1 Test
    println("Görev 1: İç açılar toplamı (5 kenar): ${calculateInteriorAngles(5)} derece") // 540

    // Görev 2 Test
    println("Görev 2: Maaş (20 gün): ${calculateSalary(20)} ₺") // 1600
    println("Görev 2: Maaş (25 gün): ${calculateSalary(25)} ₺") // 2200

    // Görev 3 Test
    println("Görev 3: Kota ücreti (40 GB): ${calculateQuotaFee(40)} ₺") // 100
    println("Görev 3: Kota ücreti (60 GB): ${calculateQuotaFee(60)} ₺") // 140
}