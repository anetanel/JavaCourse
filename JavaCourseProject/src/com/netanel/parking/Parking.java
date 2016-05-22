package com.netanel.parking;

public class Parking {
	//
	// Attributes
	//
	private Transport[] transports;
	private int currentNum;

	//
	// Constructors
	//
	public Parking(int numOfParkingSpots) {
		transports = new Transport[numOfParkingSpots];
	}

	//
	// Getters
	//
	public int getCurrentNum() {
		return currentNum;
	}

	//
	// Functions
	//

	public void parkNewTransport(Transport transport) {
		// Adds a Transport to the transports array (parks a transport in the
		// parking lot)
		
		// First, check for free space.
		if (currentNum < transports.length) {
			// Find an empty spot
			for (int i = 0; i < transports.length; i++) {
				if (transports[i] == null) {
					transports[i] = transport;
					currentNum++;
					//System.out.println("New transport added to spot " + i + ".");
					break;
				}
			}
		} else {
			System.out.println("No more parking spots left!");
		}
	}

	public void releaseTransport(int spotNumber) {
		// removes a Transport from the transports array (releases a transport
		// from the parking lot)
		
		// Check for spot validity.
		if (spotNumber < 0 || spotNumber >= transports.length) {
			System.out.println("Invalid parking spot number!");
			return;
		}
		if (transports[spotNumber] != null) {
			transports[spotNumber] = null;
			currentNum--;
		} else {
			System.out.println("Parking spot " + spotNumber + " is already empty!");
		}
	}

	public void getParkingStatus() {
		// Prints the current parking lot status
		System.out.println("Parking Lot Status Report:");
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) {
				System.out.println("Spot " + i + ": Empty");
			} else {
				System.out.println("Spot " + i + ": " + transports[i]);
			}
		}
		System.out.println("\n");
	}

	public Transport getTransportByColor(String color) {
		// returns the first occurrence of a transport with given color.
		// if not found, a new default transport is returned.
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) continue;
			if (transports[i].getColor().toUpperCase().equals(color.toUpperCase())) {
				return transports[i];
			}
		}
		System.out.println("Color " + color + " not found! Returning a new default Transport.");
		return new Transport();
	}

	public int countVehicle() {
		// Returns number of Vehicles
		int count = 0;
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] instanceof Vehicle) {
				count++;
			}
		}
		return count;
	}
	
	public int countCar() {
		// Returns number of Cars
		int count = 0;
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] instanceof Car) {
				count++;
			}
		}
		return count;
	}
	
	public int countTruckOfColorAndWeight(String color, int minWeight, int maxWeight) {
		// Returns number of Trucks of specified color and weight range.
		int count = 0;
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) continue;
			//Casting Transport to Truck, to use getWeight
			if (transports[i] instanceof Truck && 
				color.toUpperCase().equals(transports[i].getColor().toUpperCase()) &&
				((Truck)(transports[i])).getWeight() > minWeight &&
				((Truck)(transports[i])).getWeight() < maxWeight)
			{
					count++;
			}
		}
		return count;
	}
	
	public int countBikeOfGear(int minGear, int maxGear) {
		// Returns number of Bikes with specific gear range
		int count = 0;
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) continue;
			//Casting Transport to Bike, to use getGear
			if (transports[i] instanceof Bike && 
				((Bike)(transports[i])).getGear() > minGear &&
				((Bike)(transports[i])).getGear() < maxGear)
			{
					count++;
			}
		}
		return count;
	}
	
	public Transport[] getTransportByMaxVelocity(int maxVelocity) {
		// Return an array of Transports that match specific maxVelocity.
		
		// Initiate a temp array that will hold the indexes of matches 
		int[] tempArr = new int[transports.length];
		int countMatch=0;
		for (int i = 0; i < transports.length; i++) {
			if (transports[i] == null) continue;
			if (transports[i].getMaxVelocity() == maxVelocity)
			{
				//add 1 to the index, so 0 is never explicitly assigned and can be used as a stop marker   
				tempArr[countMatch] = i+1;
				countMatch++;					
			}
		}
		
		Transport[] returnTransport = new Transport[countMatch];
		// Iterate over the temp array until encountering 0 which means end of array
		for (int i = 0; i < tempArr.length; i++) {
			if (tempArr[i] == 0) break;
			returnTransport[i] = transports[tempArr[i]-1];
		}
		
		return returnTransport;
	}
	
	//
	// toString
	//
	@Override
	public String toString() {
		return "Parking lot has " + currentNum + " spots taken out of " + transports.length + ".";
	}
}
