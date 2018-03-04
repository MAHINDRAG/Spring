package com.app;

public class SimpleFactory {
 public   Object createObject(String name){
	 if("emp".equalsIgnoreCase(name)){
		 return new Employee(10,"ABCD");
	 }else{
		 return new Address(104,"Rayachoty");
	 }
	
 }
}
