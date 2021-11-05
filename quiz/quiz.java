package quiz;
import java.util.Scanner;

public class quiz {

	public static void main(String[] args) {
		
		int sayi;
		
		Scanner input = new Scanner(System.in);
		System.out.println("Sayıyı giriniz");
		
		sayi = input.nextInt();
		
		if (sayi > 99 && sayi <1000) {
			int birler = sayi % 10;
			int onlar = ((sayi % 100) - birler)/10;
			int yüzler = sayi / 100;
			//System.out.println(birler);
			//System.out.println(onlar);
			//System.out.println(yüzler);
			
			String birlerOkunus = "";
			String onlarOkunus = "";
			String yuzlerOkunus = "";
			
			switch(birler){
			case 0: 
				break;
			case 1:
				birlerOkunus = "bir";
				break;
			case 2:
				birlerOkunus = "iki";
				break;
			case 3:
				birlerOkunus = "üç";
				break;
			case 4:
				birlerOkunus = "dört";
				break;
			case 5:
				birlerOkunus = "beş";
				break;
			case 6:
				birlerOkunus = "altı";
				break;
			case 7:
				birlerOkunus = "yedi";
				break;
			case 8:
				birlerOkunus = "sekiz";
				break;
			case 9:
				birlerOkunus = "dokuz";
				break;
			default: break;
			}
			
			switch(onlar){
			case 0: 
				break;
			case 1:
				onlarOkunus = "on";
				break;
			case 2:
				onlarOkunus = "yirmi";
				break;
			case 3:
				onlarOkunus = "otuz";
				break;
			case 4:
				onlarOkunus = "kırk";
				break;
			case 5:
				onlarOkunus = "elli";
				break;
			case 6:
				onlarOkunus = "altmış";
				break;
			case 7:
				onlarOkunus = "yetmiş";
				break;
			case 8:
				onlarOkunus = "seksen";
				break;
			case 9:
				onlarOkunus = "doksan";
				break;
			default: break;
			}
			
			switch(yüzler){
			case 1:
				yuzlerOkunus = "yüz";
				break;
			case 2:
				yuzlerOkunus = "ikiyüz";
				break;
			case 3:
				yuzlerOkunus = "üçyüz";
				break;
			case 4:
				yuzlerOkunus = "dörtyüz";
				break;
			case 5:
				yuzlerOkunus = "beşyüz";
				break;
			case 6:
				yuzlerOkunus = "altıyüz";
				break;
			case 7:
				yuzlerOkunus = "yediyüz";
				break;
			case 8:
				yuzlerOkunus = "sekizyüz";
				break;
			case 9:
				yuzlerOkunus = "dokuzyüz";
				break;
			default: break;
			}
			
			System.out.println(yuzlerOkunus + " " + onlarOkunus + " " + birlerOkunus );
		}else System.out.println("Geçerli bir sayı giriniz.");	
	}
}

