// Veri sınıfı: Tüm değişkenleri bir yapı içinde tutmak için data class kullanıyorum
data class Information(
    // Genel bilgiler
    val sehir: String,
    val ulke: String,
    val telefon: String,
    val postaKodu: String,
    val email: String,
    val meslek: String,
    val stokMiktari: Int,
    val musteriAdi: String,
    val bakiye: Double,
    val dogumGunu: String,
    val maas: Double,
    val medeniDurum: String,
    val urun: String,
    val urunYorum: String,

    // Ödeme bilgileri
    val odemeTarihi: String,
    val odeme: Double,
    val siparisAdeti: Int,
    val arabaModeli: String,
    val kitapAdi: String,
    val yayinlamaTarihi: String,
    val indirimMiktari: Double,
    val odaSayisi: Int,
    val enlem: Double,
    val boylam: Double,
    val urunAdi: String,
    val yemekFiyati: Double,

    // Ürün ve detay bilgileri
    val marka: String,
    val muzikAdi: String,
    val videoSuresi: Int,
    val urunPuani: Int,
    val resimAdi: String,
    val dosyaFormati: String,
    val renk: String,
    val renkKodu: String,
    val telefonModeli: String,
    val ekranBoyutu: Double,
    val agirlik: Double,

    // Tarih ve süre bilgileri
    val ulusalGun: String,
    val tatilGunu: String,
    val rezervasyonTarihi: String,
    val sokakAdi: String,
    val otobusHatti: String,
    val kalanDakika: Int,
    val takipKodu: String,
    val kuponSuresi: Int,
    val kuponKodu: String,
    val faturaAdresi: String
)

// Main fonksiyonu: Değişkenlere örnek değerler atayıp yazdırıyorum
fun main() {
    // Değişkenlere örnek değerler atama
    val info = Information(
        sehir = "İstanbul",
        ulke = "Türkiye",
        telefon = "555-123-4567",
        postaKodu = "34000",
        email = "ornek@email.com",
        meslek = "Mühendis",
        stokMiktari = 100,
        musteriAdi = "Ali Veli",
        bakiye = 1500.50,
        dogumGunu = "15.03.1990",
        maas = 7500.0,
        medeniDurum = "Evli",
        urun = "Laptop",
        urunYorum = "Çok iyi bir ürün!",

        odemeTarihi = "26.04.2025",
        odeme = 2500.0,
        siparisAdeti = 3,
        arabaModeli = "Toyota Corolla",
        kitapAdi = "Kotlin Programlama",
        yayinlamaTarihi = "01.01.2023",
        indirimMiktari = 150.0,
        odaSayisi = 2,
        enlem = 41.0082,
        boylam = 28.9784,
        urunAdi = "Kulaklık",
        yemekFiyati = 75.0,

        marka = "Sony",
        muzikAdi = "Klasik Müzik",
        videoSuresi = 120,
        urunPuani = 8,
        resimAdi = "profil.jpg",
        dosyaFormati = "mp4",
        renk = "Mavi",
        renkKodu = "#0000FF",
        telefonModeli = "iPhone 14",
        ekranBoyutu = 6.1,
        agirlik = 0.5,

        ulusalGun = "29 Ekim",
        tatilGunu = "1 Mayıs",
        rezervasyonTarihi = "30.04.2025",
        sokakAdi = "Bahçe Sokak",
        otobusHatti = "34A",
        kalanDakika = 45,
        takipKodu = "TR123456",
        kuponSuresi = 30,
        kuponKodu = "INDIRIM50",
        faturaAdresi = "Bahçe Sokak No:5, İstanbul"
    )

    // Örnek olarak bazı değerleri yazdırma
    println("Şehir: ${info.sehir}")
    println("Müşteri Adı: ${info.musteriAdi}")
    println("Ürün: ${info.urun}, Yorum: ${info.urunYorum}")
    println("Telefon Modeli: ${info.telefonModeli}, Ekran Boyutu: ${info.ekranBoyutu} inç")
    println("Fatura Adresi: ${info.faturaAdresi}")
}