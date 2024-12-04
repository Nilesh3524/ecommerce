package com.main.ecommerce.services;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.main.ecommerce.entities.Admin;
import com.main.ecommerce.entities.Product;

@Service
public interface AdminServices {

    Optional<Admin> getAdminById(long id);

    Optional<List<Product>> getProductsByAdmin(Admin admin);
    
}