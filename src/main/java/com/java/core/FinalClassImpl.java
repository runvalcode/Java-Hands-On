package com.java.core;

class Stamp {
	 String stampCountry;
	 boolean isSecure;
	
	public Stamp(String stampCountry, boolean isSecure) {
		super();
		this.stampCountry = stampCountry;
		this.isSecure = isSecure;
	}
}

// immutable (NOT PURELY IMMUTABLE)
final class Money {
	
	private final long identificationNumber;
	private final int releaseYear;
	private final int noteValue;
	
	// shallow or deep/defensive copy.
	private final Stamp stamp;
	
	public long getIdentificationNumber() {
		return identificationNumber;
	}
	
	public int getReleaseYear() {
		return releaseYear;
	}
	
	public int getNoteValue() {
		return noteValue;
	}
	
	/* giving shallow copy
	public Stamp getStamp() {
		return stamp;
	} */
	
	//giving defensive copy
	public Stamp getStamp() {
		return new Stamp(stamp.stampCountry, stamp.isSecure);
	}

	/* shallow copy
	Money(long identificationNumber, int releaseYear, int noteValue,Stamp stamp) {
		this.identificationNumber = identificationNumber;
		this.releaseYear = releaseYear;
		this.noteValue = noteValue;
		this.stamp = stamp;
	} */
	
	// defensive copy
	public Money(long identificationNumber, int releaseYear, int noteValue,Stamp stamp) {
		this.identificationNumber = identificationNumber;
		this.releaseYear = releaseYear;
		this.noteValue = noteValue;
		this.stamp = new Stamp(stamp.stampCountry, stamp.isSecure);
	}
	
}

public class FinalClassImpl {
	public static void main(String[] args) {
		Stamp stamp = new Stamp("India", true);
		
		
		Money noteMoney = new Money(978675l, 2026, 20,stamp);
		System.out.println("Identification No :: "+noteMoney.getIdentificationNumber()+" Year : "+noteMoney.getReleaseYear()+" Value : "+noteMoney.getNoteValue()+" Stamp :: "+stamp.stampCountry+" "+stamp.isSecure);
		noteMoney.getStamp().isSecure = false;
		System.out.println("Identification No :: "+noteMoney.getIdentificationNumber()+" Year : "+noteMoney.getReleaseYear()+" Value : "+noteMoney.getNoteValue()+" Stamp :: "+stamp.stampCountry+" "+stamp.isSecure);
		
	}
}
