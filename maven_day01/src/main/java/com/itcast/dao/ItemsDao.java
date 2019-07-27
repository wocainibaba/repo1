package com.itcast.dao;

import com.itcast.domain.items;

public interface ItemsDao {
    public items findById(Integer id);
}
