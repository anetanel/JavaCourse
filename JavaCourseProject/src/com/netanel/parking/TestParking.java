package com.netanel.parking;

public class TestParking {
	public static void main(String[] args) {
			Truck t1 = new Truck(1000, 2011);
			Truck t2 = new Truck(2000, 2012,"Black", 180);
			
			Car c1 = new Car(2011);
			Car c2 = new Car(2012,"Red",190);
			
			Bike b1 = new Bike(11);
			Bike b2 = new Bike(12,"Blue",30);
			
			Parking p1 = new Parking(5);
						
			p1.parkNewTransport(t1);
			p1.parkNewTransport(t2);
			p1.parkNewTransport(c1);
			p1.parkNewTransport(c2);
			p1.parkNewTransport(b1);
			p1.parkNewTransport(b2);
			p1.getParkingStatus();
			
			p1.releaseTransport(2);
			p1.getParkingStatus();
			
			p1.parkNewTransport(b2);
			p1.getParkingStatus();
			
			System.out.println("Black transports:\n" + p1.getTransportByColor("black") + "\n");
			
			System.out.println("Number of Vehicles: " + p1.countVehicle());
			
			System.out.println("Number of Cars: " + p1.countCar());
			
			System.out.println("Number of black trucks, weighing between 999 to 999999: " + p1.countTruckOfColorAndWeight("black", 999, 999999));
			System.out.println("Number of black trucks, weighing between 5000 to 999999: " + p1.countTruckOfColorAndWeight("black", 5000, 999999));
			
			System.out.println("Number of Bikes with between 4 and 15 gears: " + p1.countBikeOfGear(4, 15));
			
			Transport[] trans1 = p1.getTransportByMaxVelocity(0);
			System.out.println("Transports with Max Velocitiy 0:");
			for (int i = 0; i < trans1.length; i++) {
				System.out.println(trans1[i]);
			}
			
			Bike b3 = new Bike(12);
			Bike b4 = new Bike(12);
			System.out.println(b3.equals(b4));
			
			

	}
}
