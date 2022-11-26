package com.example.groceriesspringsoot.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@Data
@NoArgsConstructor
public class Groceries {

	
	private int id;
	private String name;
	private float price;
	private String quantity;
}
