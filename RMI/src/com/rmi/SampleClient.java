package com.rmi;



import java.rmi.Naming;
import java.rmi.RMISecurityManager;
import java.rmi.RemoteException;

import RemoteMethodInvocation.AddServerlntf;

public class SampleClient {
public static void main(String[] args) throws Exception {
	System.setSecurityManager(new RMISecurityManager());
	try {
		String url="rmi//localhost:8080/ADD-Server";
		AddServerlntf remoteObject=(AddServerlntf)Naming.lookup(url);
		System.out.println("Sum="+remoteObject.sum(1, 2));
		
	} catch (RemoteException exc) {
		// TODO: handle exception
		System.out.println("Error in lookup:"+exc.toString());
	}
	catch (java.net.MalformedURLException exc) {
		// TODO: handle exception
		System.out.println("Malformed URL:"+exc.toString());
	}
	catch (java.rmi.NotBoundException exc) {
		// TODO: handle exception
		System.out.println("NoBounded:"+exc.toString());
	}
}
}
