package com.dbdky.csls;

import javax.xml.ws.Endpoint;

class ServicePublisherMT {
	private Endpoint endpoint;
	
	public static void main(String[] args) {
		ServicePublisherMT self = new ServicePublisherMT();
		self.create_endpoint();
		self.configure_endpoint();
		self.publish();
	}
	
	private void create_endpoint() {
		endpoint = Endpoint.create(new I2ServiceImpl());
	}
	
	private void configure_endpoint() {
		endpoint.setExecutor(new MyThreadPool());
	}
	
	private void publish() {
		int port = 8888;
		String url = "http://localhost:" + port +"/I2Service";
		Endpoint.publish(url, new I2ServiceImpl());
		//endpoint.publish(url);
		System.out.println("Publishing I2Service on port " + port);
	}
}