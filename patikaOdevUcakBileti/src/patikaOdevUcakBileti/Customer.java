package patikaOdevUcakBileti;

// Entity Sýnýfýmýz uçak bileti alýcak kiþinin bilgilerini tutucak.OOP mantýðýyla müsteriyi bir nesne boyutuna indirgedik gerçek hayatý buraya taþýdýk.

public class Customer {
	
	private String name;
	
	private String surname;
	
	private int age;	
	
	private int journeyDistance;
	

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getSurname() {
		return surname;
	}

	public void setSurname(String surname) {
		this.surname = surname;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public int getJourneyDistance() {
		return journeyDistance;
	}

	public void setJourneyDistance(int journeyDistance) {
		this.journeyDistance = journeyDistance;
	}
	
	

}
