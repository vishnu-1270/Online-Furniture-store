package com.FSS.FurnitureSaleStore.dao;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.FSS.FurnitureSaleStore.model.Item;

@Repository
public interface IItem extends JpaRepository<Item,Long>{
	
	List<Item> findByCategory(String category);

}
