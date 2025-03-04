package com.mario.proto.data;

import jakarta.annotation.Nonnull;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

/**
 * POJO for Medicines
 */

@Entity
@Table(name = "medicines")
public class Medicines {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "id")
	private Long id;
	@Nonnull
	private String name;
	@Nonnull
	private String manufacturer;
	@Nonnull
	private String price;
	@Nonnull
	private String type;

	public Medicines() {

	}

	public Medicines(Long id, String name, String manufacturer, String price, String type) {
		super();
		this.id = id;
		this.name = name;
		this.manufacturer = manufacturer;
		this.price = price;
		this.type = type;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getManufacturer() {
		return manufacturer;
	}

	public void setManufacturer(String manufacturer) {
		this.manufacturer = manufacturer;
	}

	public String getPrice() {
		return price;
	}

	public void setPrice(String price) {
		this.price = price;
	}

	public String getType() {
		return type;
	}

	public void setType(String type) {
		this.type = type;
	}

	@Override
	public String toString() {
		return "Medicines [id=" + id + ", name=" + name + ", manufacturer=" + manufacturer + ", price=" + price
				+ ", type=" + type + "]";
	}

}
