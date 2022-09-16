package com.tomas.dsmeta.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.tomas.dsmeta.entities.Sale;

public interface SaleRepository extends JpaRepository<Sale,Long> {

}
