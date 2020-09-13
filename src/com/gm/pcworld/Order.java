package com.gm.pcworld;

public class Order {
	private final int orderId;
	private PC[] computers;
    private static int ordersCounter;
	private static int pcCounter;
	static final int MAX_PC = 10;
	
	public Order() {
		orderId = ++ordersCounter;
		computers = new PC[MAX_PC];
	}
	
	public void addPC(PC pc) {
		if(pcCounter < MAX_PC) {
			computers[pcCounter++] = pc;
		}else {
			System.out.println("Max exceeded: " + MAX_PC );
		}
	}
	
	public void showOrder() {
		System.out.println("{");
		System.out.println("\tOrder: " + orderId + ",");
		System.out.println("\tPC_count: " + pcCounter + ",");
		for(int i = 0; i < pcCounter; i++) {
			System.out.println("\t" + computers[i]);
		}
		System.out.println("}");

	}
}
