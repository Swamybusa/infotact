package com.infotact.enterprise_warehouse_management_system.model;

import jakarta.persistence.Entity;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="inventoryItems")
@Data
public class InventoryItem {
	
	private Long id;
	private Integer quantity;
	
	@ManyToOne
	@JoinColumn(name="product_id")
	private Product product;
	
	@ManyToOne
	@JoinColumn(name="storage_bin_id")
	private StorageBin storageBin;

}
