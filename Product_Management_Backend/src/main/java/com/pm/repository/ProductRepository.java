package com.pm.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.pm.entity.Product;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long>{

}
