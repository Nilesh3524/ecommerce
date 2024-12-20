package com.main.ecommerce.entities;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class User {
	@Id
	@GeneratedValue(strategy = GenerationType.AUTO)
	private long id;
	private String name;
	private String email;
	private String mobileNo;
	private String password;
	private boolean isActive ;
	private boolean isDeleted ;
	private String registationDate;
	private String loginDate;
	private String updateDate;
	private List<Long> myOrders = new ArrayList<>();
	private List<Long> myCart = new ArrayList<>();

}
