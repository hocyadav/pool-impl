package com.hariom.pool;

public interface ConnProducer {
	
	public void execute(String taskToExecute);
	
	//addToBQ()/close() - producer : add connection back to pool
	public void close(ConnProducerImpl connObj);
	
}
