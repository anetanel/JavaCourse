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
		this.stop = true;
		synchronized (treasureChest) {
			treasureChest.notify();
		}
	}

	public void run() {
		while (!stop) {
			if (!treasureChest.isEmpty()) {
				try {
//					treasureChest.robCoin();
//					System.out.println(
//							"I, Robber No." + robberID + " stole a coin. left in the chest: " + treasureChest.getCoins());
					System.out.println(
							"I, Robber No." + robberID + " stole a coin. left in the chest: " + treasureChest.robCoin());

				} catch (Exception e) {
					System.out.println("I, Robber No." + robberID + " tried to steal a coin, but the chest was empty.");
				}
			} else {
				try {
					synchronized (treasureChest) {
						treasureChest.wait();
					}
				} catch (InterruptedException e) {
					e.printStackTrace();
				}
			}
		}

		System.out.println("Robber No." + robberID + " has left the building.");
	}

	@Override
	public String toString() {
		return "I'm Robber No. " + robberID;
	}
}
