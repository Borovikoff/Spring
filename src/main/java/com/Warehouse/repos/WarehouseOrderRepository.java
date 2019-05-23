package com.Warehouse.repos;

import com.Warehouse.domain.WarehouseOrder;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

public interface WarehouseOrderRepository extends CrudRepository<WarehouseOrder,Integer> {
    List<WarehouseOrder> findById(Long tag);
    WarehouseOrder findAllById(Long tag);
    Integer deleteById(Long tag);
}
