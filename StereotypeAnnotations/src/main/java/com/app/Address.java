package com.app;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component("addrobj")
public class Address {
	@Value(value = "kadapa")
	private String loc;

	public String getLoc() {
		return loc;
	}

	public void setLoc(String loc) {
		this.loc = loc;
	}

	@Override
	public String toString() {
		return "Address [loc=" + loc + "]";
	}
	

}
