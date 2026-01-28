# ShoppEasy

ShoppEasy, Java ile geliştirilmiş basit bir konsol tabanlı alışveriş simülasyonudur. Kullanıcıdan ürün bilgileri alınır, toplam fiyat hesaplanır ve satın alma onayı sonrası stok güncellenir.

##  Proje Amacı
Bu projenin amacı; Java programlama dilinde nesne yönelimli programlama (OOP) mantığını, kullanıcı girdisi almayı ve temel doğrulama (validation) süreçlerini uygulamalı olarak öğrenmektir.

##  Proje Yapısı
- **Product**
  - Ürün adı ve adet bilgilerini tutar
  - Ürün bilgilerini ekrana yazdırır
  - Toplam tutarı hesaplar
- **ShoppingBasket**
  - Stok kontrolü yapar
  - Stok yeterliyse günceller, değilse kullanıcıyı uyarır
- **main**
  - Kullanıcıdan girişleri alır
  - Satın alma onayı sürecini yönetir
  - IBAN doğrulaması yapar (16 haneli, yalnızca rakam)

##  Özellikler
- Konsol üzerinden ürün adı ve miktar alma
- Toplam fiyat hesaplama
- YES / NO ile satın alma onayı
- IBAN format doğrulama
- Stok kontrolü ve güncelleme

##  Çalıştırma
1. Projeyi bir Java IDE’sinde (IntelliJ IDEA, Eclipse vb.) açın.
2. `quiz` paketi altındaki `main` sınıfını çalıştırın.
3. Konsoldaki yönergeleri takip edin.

##  Kazanımlar
Bu proje sayesinde:
- Java’da sınıf, metot ve constructor kullanımı
- Kullanıcı girdisi yönetimi (`Scanner`)
- Koşul yapıları (`if`, `switch-case`)
- Temel input validation (IBAN kontrolü)
- Basit stok yönetimi mantığı

##  Geliştirme Fikirleri
- Ürün fiyatını kullanıcıdan alma
- Birden fazla ürün ekleme desteği
- Stok bilgisini dinamik hale getirme
- IBAN doğrulamasını daha gelişmiş kurallarla genişletme
