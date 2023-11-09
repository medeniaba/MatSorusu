import java.util.Random;
import java.util.Scanner;

public class MatSorusu {
	// sayi/faktöriyel hesaplama 
	
	

		public static void main(String[] args) {
			Scanner klavye = new Scanner(System.in);
			Random med = new Random();
			double toplam = 0 ;
			int faktor = 1;	
			double sayi = 0 ;
			for( int i = 1; i<10; i++ ) {
				
				sayi=Math.pow(i, i+1);
				faktor=faktor*(i+1);
				toplam=(double)sayi/faktor;}
				
				System.out.println("Toplam = "+toplam+1);
				}
		
			

	       
			
				
			}
		
			


