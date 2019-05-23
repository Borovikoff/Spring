package com.Warehouse.repos;

import com.Warehouse.domain.Warehouse;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseRepository extends CrudRepository <Warehouse,Integer> {
    List<Warehouse> findByWarehouseAddressContaining(String tag);
    Integer findById(Long tag);
    Integer deleteById(Long tag);
}
