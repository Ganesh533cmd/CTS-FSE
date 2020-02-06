package com.example.demo;
import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonFormat.Shape;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter


@Document(collection="items")
public class Item {
	@Id
	private String itemId;
	private String itemName;
	private double itemPrice;
	  @JsonFormat(shape=Shape.STRING, pattern="dd-MM-yyyy")
	  
	  private LocalDate date;
	  
	public Item(String itemName,double itemPrice) {
		super();
		this.itemName=itemName;
		this.itemPrice=itemPrice;
	}

}
