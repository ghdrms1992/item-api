package com.ohk.hss.itemapi.item.service;

import com.ohk.hss.itemapi.item.dto.ItemDto;
import com.ohk.hss.itemapi.item.entity.ItemEntity;
import com.ohk.hss.itemapi.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@RequiredArgsConstructor
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemDto.Response> getItems() {
        List<ItemEntity> itemEntityList = itemRepository.findAll();
        List<ItemDto.Response> itemResponseList = new ArrayList<>();
        for(ItemEntity item : itemEntityList) {
            itemResponseList.add(ItemDto.Response.from(item));
        }
        return itemResponseList;
    }
}
