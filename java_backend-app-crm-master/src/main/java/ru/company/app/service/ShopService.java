package ru.company.app.service;

import org.springframework.stereotype.Service;
import ru.company.app.repository.ShopRepository;

@Service
public class ShopService {

    private final ShopRepository shopRepository;

    public ShopService(ShopRepository shopRepository) {
        this.shopRepository = shopRepository;
    }


}
