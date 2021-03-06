package com.balance.api.balanceapi.service;

import java.util.List;

import com.balance.api.balanceapi.domain.TriCount;

public interface ITriCountService {
    public boolean saveTriCount(TriCount triCount);

    public TriCount findTriCountById(Long triCountId);

    public List<TriCount> findAll();
}