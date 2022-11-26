package com.example.groceriesspringsoot.service;

import java.util.ArrayList;
import java.util.List;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import com.example.groceriesspringsoot.Entity.Groceries;

@Service
public class groceryservice {
	@Autowired
	JdbcTemplate jdbcTemplate;
	@PostConstruct
	public void executeMe() {
		
		Groceries g1=new Groceries();
		g1.setId(101);
		g1.setName("Rice");
		g1.setQuantity("25Kg");
		g1.setPrice(1200.75f);
		
		Groceries g2=new Groceries();
		g2.setId(102);
		g2.setName("Wheat");
		g2.setQuantity("25Kg");
		g2.setPrice(800.67f);
		
		List<Groceries> groce=new ArrayList<>();
		groce.add(g1);
		groce.add(g2);
		
//		books.forEach(x-> jdbcTemplate.update("Insert into Groceries values(?,?,?)",x.getId(),x.getName(),x.getQuantity,x.getPrice()));
//		
//		books=jdbcTemplate.query("Select *from Groceries", (rs,noofrows)-> new Book(rs.getInt("Id"),rs.getString("Title"),rs.getNString("Authname"),rs.getFloat("Price));
//		books.forEach(s->System.out.println(s));
		
//		jdbcTemplate.execute("Create Table Groceries1(Id int primary key,name varchar(35),quantity varchar(25),price decimal(5,2)");
//		jdbcTemplate.update("insert into Groceries value(103,'Floor','5Kg',100.82)");
//		jdbcTemplate.update("insert into Groceries value(104,'Pulse','5Kg',600.43)");
//		jdbcTemplate.update("update Groceries set price=789 where Id=104");
//		jdbcTemplate.update("Delete from Groceries where Id=102");


		
	}

}


