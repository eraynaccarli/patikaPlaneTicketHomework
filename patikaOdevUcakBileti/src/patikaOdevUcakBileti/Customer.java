package patikaOdevUcakBileti;

// Entity S�n�f�m�z u�ak bileti al�cak ki�inin bilgilerini tutucak.OOP mant���yla m�steriyi bir nesne boyutuna indirgedik ger�ek hayat� buraya ta��d�k.

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
