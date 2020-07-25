package com.hariom.pool;

public interface ConnConsumer {
	
	//getFromBQ() / checkout() - consumer : get 1 connection obj from pool
	public ConnProducer checkout();
}
