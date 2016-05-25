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
	
	public void addCoins(int amount) {
		coins += amount;
	}
	
	public boolean isEmpty() {
		if (coins == 0) {
			return true;
		} else {
			return false;
		}
	}
	
	public void robCoin() {
		coins--;
	}
}
