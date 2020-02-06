package com.example.demo;

import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.Item;
@Repository
public interface ItemRepository extends MongoRepository<Item, String>{
 
}

	

