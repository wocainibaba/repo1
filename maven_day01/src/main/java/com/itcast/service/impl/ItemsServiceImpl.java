package com.itcast.service.impl;

import com.itcast.dao.ItemsDao;
import com.itcast.domain.items;
import com.itcast.service.ItemsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Autowired
    private ItemsDao itemsDao;


    public items findById(Integer id) {
        return itemsDao.findById(id);
    }
}
