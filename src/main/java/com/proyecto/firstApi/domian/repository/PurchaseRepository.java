package com.proyecto.firstApi.domian.repository;


import java.util.List;
import java.util.Optional;

import com.proyecto.firstApi.domian.Purchase;

public interface PurchaseRepository {
    List<Purchase> getAll();
    Optional<List<Purchase>> getByClient(String clientId);
    Purchase save(Purchase purchase);

}
