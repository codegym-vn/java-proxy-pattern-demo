package com.codegym;

public class Main {

    public static void main(String[] args) {
	    ProxyImage proxyImage = new ProxyImage("CodeGym Logo.png");

	    Client client = new Client();
	    client.displayImage(proxyImage);
    }
}
