package com.netanel.threads;

public class Rothschild implements Runnable {
	//
	// Attributes
	//
	private TreasureChest treasureChest;
	private int bankAccount;

	//
	// Constructor
	//
	public Rothschild(TreasureChest treasureChest, int bankAccount) {
		this.treasureChest = treasureChest;
		this.bankAccount = bankAccount;
	}

	public void run() {
		int addedCoins;
		while (bankAccount > 0) {
			// Every 3 seconds, as log as the bank account is in surplus, add a random number of coins to the chest
			// and remove the same amount from the bank account.
			addedCoins = (int)(Math.random() * 10);
			treasureChest.addCoins(addedCoins);
			bankAccount -= addedCoins;
			System.out.println(Thread.currentThread().getName() + " added " + addedCoins
					+ " coins. Left in the bank account: " + bankAccount);
			if (bankAccount < 0) {
				System.out.println(Thread.currentThread().getName() + " says: OMG! I'm broke!");
			}
			try {
				Thread.sleep(3000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
		System.out.println(Thread.currentThread().getName() + " I'm done.");
	}
}
