package com.tvdat.Domain.MODELS;
import lombok.*;
@AllArgsConstructor
@NoArgsConstructor
@Data
public class Cafe {
	String name;
	int cost;
	
	public void cafe(String name, int cost) {
		this.name = name;
		this.cost = cost;
	}
}
