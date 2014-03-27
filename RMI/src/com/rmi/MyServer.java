package com.rmi;

import java.rmi.*;  
import java.rmi.registry.*;  
  
public class MyServer{  
  
public static void main(String args[]){  
try{  
  
Adder stub=new AdderRemote();  
Naming.rebind("rmi://localhost:8080/sonoo",stub);  
  
}catch(Exception e){System.out.println(e);}  
}  
  
} 