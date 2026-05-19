package com.infotact.enterprise_warehouse_management_system.model;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="products")
@Data
public class Product {
	
	private Long id;
	private String name;
	private String sku;
	private Double price;
	
	@OneToMany(mappedBy = "products")
	private List<InventoryItem> inventoryItems;	

}
