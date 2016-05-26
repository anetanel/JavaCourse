package com.netanel.threads;

public class TreasureChest {
	//
	// Attributes
	//
	private int coins;

	//
	// Constructor
	//
	public TreasureChest(int coins) {
		this.coins = coins;
	}

	//
	// Functions
	//
	public int getCoins() {
		return coins;
	}

	public synchronized void addCoins(int amount) {
		// Adds coins to this chest and notifies all the waiting threads
		coins += amount;
		this.notifyAll();
	}

	public boolean isEmpty() {
		return coins == 0;
	}

	public synchronized int robCoin() throws Exception {
		// "Robs" coins from this chest and returns the current number of coins
		if (coins < 1) {
			throw new Exception("No more coins left! Try elsewhere!");
		}
		return coins--;
	}
}
