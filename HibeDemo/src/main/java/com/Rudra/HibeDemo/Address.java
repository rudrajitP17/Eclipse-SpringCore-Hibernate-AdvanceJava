package com.Rudra.HibeDemo;

import java.util.Date;

import javax.persistence.*;

@Entity
@Table(name = "Student_Address")
public class Address 
{
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="address_id")
	private int addressid;
	
	@Column(length=50, name="STREET")
	private String Street;
	
	@Column(length=50, name="CITY")
	private String City;
	
	@Column(name="Is_Open")
	private boolean isOpen;
	
	@Transient
	private double x;
	
	@Column(name="DATE")
	@Temporal(TemporalType.DATE)
	private Date datetime;
	
	@Lob
	private byte[] image;
	
	public Address(int addressid, String street, String city, boolean isOpen, double x, Date datetime, byte[] image) {
		super();
		this.addressid = addressid;
		Street = street;
		City = city;
		this.isOpen = isOpen;
		this.x = x;
		this.datetime = datetime;
		this.image = image;
	}

	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getAddressid() {
		return addressid;
	}

	public void setAddressid(int addressid) {
		this.addressid = addressid;
	}

	public String getStreet() {
		return Street;
	}

	public void setStreet(String street) {
		Street = street;
	}

	public String getCity() {
		return City;
	}

	public void setCity(String city) {
		City = city;
	}

	public boolean isOpen() {
		return isOpen;
	}

	public void setOpen(boolean isOpen) {
		this.isOpen = isOpen;
	}

	public double getX() {
		return x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public Date getDatetime() {
		return datetime;
	}

	public void setDatetime(Date datetime) {
		this.datetime = datetime;
	}

	public byte[] getImage() {
		return image;
	}

	public void setImage(byte[] image) {
		this.image = image;
	}
	
	
}
