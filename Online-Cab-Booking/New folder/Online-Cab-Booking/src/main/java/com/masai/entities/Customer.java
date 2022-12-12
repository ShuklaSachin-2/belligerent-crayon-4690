package com.masai.entities;

import java.util.ArrayList;
import java.util.List;



import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;

@Entity
public class Customer extends User{
	
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private Integer customerId;
	
	
	
	@OneToMany(cascade = CascadeType.ALL,mappedBy = "customer",orphanRemoval = true)
	@JsonIgnore
	List<TripDetails> tripDetailsList = new ArrayList<>();



	public Integer getCustomerId() {
		return customerId;
	}



	public void setCustomerId(Integer customerId) {
		this.customerId = customerId;
	}
	

	public List<TripDetails> getTripDetailsList() {
		return tripDetailsList;
	}



	public void setTripDetailsList(List<TripDetails> tripDetailsList) {
		this.tripDetailsList = tripDetailsList;
	}
	
	
	
	
}