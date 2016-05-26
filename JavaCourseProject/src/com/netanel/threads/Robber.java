package com.netanel.threads;

public class Robber implements Runnable {
	//
	// Attributes
	//
	private TreasureChest treasureChest;
	private int robberID;
	private static int counter = 1;
	private boolean stop = false;

	//
	// Constructor
	//
	public Robber(TreasureChest treasureChest) {
		this.treasureChest = treasureChest;
		robberID = counter++;
	}

	//
	// Functions
	//
	public int getRobberID() {
		return robberID;
	}

	public void stopPlease() {
		// set the stop flag and notify threads waiting for treasureChest
		this.stop = true;
		synchronized (treasureChest) {
			treasureChest.notify();
		}
	}

	public void run() {
		// Run as long as the stop flag is false
		while (!stop) {
			if (!treasureChest.isEmpty()) {
				try {
					// Rob a coin and get the number of coins left. 
					int leftInChest = treasureChest.robCoin();
					System.out.println(
							"I, Robber No." + robberID + " stole a coin. left in the chest: " + leftInChest);
				} catch (Exception e) {
					System.out.println("I, Robber No." + robberID + " tried to steal a coin, but the chest was empty.");
				}
			} else {
				try {
					// If chest is empty, wait for it to become full again
					synchronized (treasureChest) {
						//System.out.println("I, Robber No." + robberID + " will wait untill the chest is full again");
						treasureChest.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}
		// Print on exit
		System.out.println("Robber No." + robberID + " has left the building.");
	}

	@Override
	public String toString() {
		return "I'm Robber No. " + robberID;
	}
}
