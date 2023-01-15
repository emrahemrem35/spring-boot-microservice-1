package com.sha.springbootmicroserviceproduct.repository;

import com.sha.springbootmicroserviceproduct.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

/**
 * @author Emrah Emrem
 * @date 27.11.2022
 * @time 15:51
 * */
public interface IProductRepository extends JpaRepository<Product, Long> {

    void deleteById(Long id);
}
