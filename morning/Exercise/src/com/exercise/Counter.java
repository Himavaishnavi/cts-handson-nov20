package com.exercise;
public class Counter implements Runnable{

	@Override
	public synchronized void run() {
		
		//by adding  synchronize : threads run one after other.
		//remove synchronize: threads run parallely.gets output mixed 
		Thread t=Thread.currentThread();
		//This give the name of the current thread.
		for(int i=1;i<50;i++)
			System.out.println("Counter:"+i+"name"+t.getName());
	}

}

