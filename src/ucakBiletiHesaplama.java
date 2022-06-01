import java.util.Scanner;

public class ucakBiletiHesaplama {

	public static void main(String[] args) {
		
    /*Kullanıcıdan alınan değerler geçerli (mesafe ve yaş değerleri pozitif sayı, 
    yolculuk tipi ise 1 veya 2) olmalıdır. Aksi takdirde 
    kullanıcıya "Hatalı Veri Girdiniz !" şeklinde bir uyarı verilmelidir.
	Kişi 12 yaşından küçükse bilet fiyatı üzerinden %50 indirim uygulanır.
	Kişi 12-24 yaşları arasında ise bilet fiyatı üzerinden %10 indirim uygulanır.
	Kişi 65 yaşından büyük ise bilet fiyatı üzerinden %30 indirim uygulanır.
	Kişi "Yolculuk Tipini" gidiş dönüş seçmiş ise bilet fiyatı üzerinden %20 
	indirim uygulanır.*/

		int yas, yolculukTipi = 0 ;
		double mesafe;
		double fiyat, tekYon, CiftYon ;
		double indirim012 = 0.5;
		double indirim1224 = 0.10;
		double indirim65 = 0.30;
		
		
		
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Koray Havayollarını Tercih Ettiğiniz için Teşekkür ederiz");
		System.out.println("Lütfen Yaşınızı Giriniz ");
		yas = input.nextInt();
		System.out.println("Lüten Gitmek İstediğiniz Mesafeyi Km Cinsinden giriniz ");
		mesafe = input.nextInt();
		System.out.println("Tek yön için -1 , Gidiş-Dönüş için - 2 basınız ");
		yolculukTipi  = input.nextInt();
		
		
		tekYon = mesafe * 0.10 ;
		CiftYon = mesafe * 0.20 ;
		
		
		if (yolculukTipi == 1 && yas >0 && yas <=12 ) {
			System.out.println("Bilet Fiyatınız : " + (tekYon - ( tekYon * indirim012)));
		}
		if (yolculukTipi == 2 && yas >0 && yas <=12 ) {
			System.out.println("Bilet Fiyatınız : " + (CiftYon - ( CiftYon * indirim012)));
		}
		if (yolculukTipi == 1 && yas >12 && yas <=24 ) {
			System.out.println("Bilet Fiyatınız : " + (tekYon - ( tekYon * indirim1224)));
	}
		if (yolculukTipi == 2 && yas >12 && yas <=24 ) {
			System.out.println("Bilet Fiyatınız : " + (CiftYon - ( CiftYon * indirim1224)));
	}
		if (yolculukTipi == 1 && yas >=65 ) {
			System.out.println("Bilet Fiyatınız : " + (tekYon - ( tekYon * indirim65)));
	}
		if (yolculukTipi == 2 && yas >=65 ) {
			System.out.println("Bilet Fiyatınız : " + (CiftYon - ( CiftYon * indirim65)));
	} else if (yolculukTipi == 1 && yas >24 && yas <=64 ) {
		System.out.println("Bilet Fiyatınız : " + tekYon);
	}else if (yolculukTipi == 2 && yas >24 && yas <=64 ) {
		System.out.println("Bilet Fiyatınız : " + CiftYon);
	}
	else if (yolculukTipi != 1 || yolculukTipi !=2) {
			System.out.println("Yanlış değer Girdiniz !");
		}
	}
	}

