package patikaOdevUcakBileti;

import java.util.Scanner;

public class Application {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		// CUSTOMER nesnemizi oluþturduk 
		Customer customer = new Customer();
		
		// ve konsoldan aldýðýmýz verilerimizi set ettik.
		System.out.println("Enter your name: ");
		String customerName = sc.nextLine();
		customer.setName(customerName);
		
		System.out.println("Enter your surname: ");
		String customerSurname = sc.nextLine();
		customer.setSurname(customerSurname);
		
		System.out.println("Enter your age: ");
		int customerAge = sc.nextInt();
		customer.setAge(customerAge);
		
		System.out.println("Enter your trip distance: ");
		int journeyDistance = sc.nextInt();
		customer.setJourneyDistance(journeyDistance);
		
		System.out.println("Enter your tripT type(1 - one-way  2 - round-trip ): ");
		int tripType =sc.nextInt();
		
		System.out.println("your name: " + customerName + "\n" +
							"your surname: " + customerSurname + "\n" +
							"your age: " + customerAge + "\n" +
							"journey distance (km) : " + journeyDistance + "\n" + 
							"trip type(1 - one-way  2 - round-trip) :" + tripType);
		System.out.println("************************************\n");
		System.out.println("**** WELCOME " + customerName + " *****\n");
		
		
		
		double normalPrice = journeyDistance * 0.10;
		
		// Senaryo'nun istediði indirimleri koþullu ifadelerde kullanmak üzere  normal fiyat üzerinden deðiþkenlere atadýk
		
		double childDiscount = (normalPrice * 0.50);
		double childDiscountPrice = normalPrice - childDiscount;
		
		double youngDiscount = (normalPrice * 0.10);
		double youngDiscountPrice = normalPrice - youngDiscount;
		
		double oldDiscount = (normalPrice * 0.30);
		double oldDiscountPrice = normalPrice - oldDiscount;
		
		// Girilen yaþ ve mesafe bilgileri negatif sayý , yolculuk tipi 1 ve ya 2 deðil ise hata mesajý yayýnladýk.
		if(customerAge < 0 || journeyDistance < 0 || tripType < 1 || tripType > 2 ) {
			System.out.println("please  enter valid value ! ");
		}
		else {
			if(customerAge < 12) {
				if(tripType == 2) {
					double tripDiscount = (childDiscountPrice * 0.20);
					double tripDiscountPrice = childDiscountPrice - tripDiscount;
					
					System.out.println("Price: " + tripDiscountPrice + "TL"); // TL( Turkish Lira)
				}
				else {
					System.out.println("Price: " + childDiscountPrice + "TL");
				}
				
			}
			else if( 12 < customerAge && customerAge < 24 ) {
				if(tripType == 2) {
					double tripDiscount = (youngDiscountPrice * 0.20);
					double tripDiscountPrice = youngDiscountPrice - tripDiscount;
					
					System.out.println("Price: " + tripDiscountPrice + "TL");
				}
				
				else {
					System.out.println("Price: " + youngDiscountPrice + "TL");
				}
				
			}
			else if(  65 < customerAge) {
				if(tripType == 2) {
					double tripDiscount = (oldDiscountPrice * 0.20);
					double tripDiscountPrice = oldDiscountPrice - tripDiscount;
					System.out.println("Price: " + tripDiscountPrice + "TL");
				}
				else {
					System.out.println("Price: " + oldDiscountPrice + "TL");
				}
				
				
			}
			
		}
			
		
		
		
		

	}

}
