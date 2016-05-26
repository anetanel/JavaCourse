package com.netanel.threads;

public class AliBabaMain {
	public static void main(String[] args) {
		// create chest
		TreasureChest chest = new TreasureChest(10);

		// create robbers
		Robber[] robbers = new Robber[40];
		for (int i = 0; i < robbers.length; i++) {
			robbers[i] = new Robber(chest);
		}

		// create robbers threads
		Thread[] threads = new Thread[40];
		for (int i = 0; i < threads.length; i++) {
			threads[i] = new Thread(robbers[i]);
		}

		// create Rothschild
		Rothschild R1 = new Rothschild(chest, 10);
		Thread T1 = new Thread(R1, "Rothschild");

		// run threads
		for (int i = 0; i < threads.length; i++) {
			threads[i].start();
		}
		T1.start();

		// wait for Rothschild
		try {
			T1.join();
		} catch (InterruptedException e) {
			e.printStackTrace();
		}

		// nicely stop all robbers
		for (int i = 0; i < robbers.length; i++) {
			robbers[i].stopPlease();
		}
	}
}
