package com.ohk.hss.itemapi.item.service;

import com.ohk.hss.itemapi.item.dto.ItemDto;
import com.ohk.hss.itemapi.item.entity.ItemEntity;
import com.ohk.hss.itemapi.item.repository.ItemRepository;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
@Slf4j
public class ItemService {

    private final ItemRepository itemRepository;

    public List<ItemDto.Response> getItems() {
        List<ItemEntity> itemEntityList = itemRepository.findAll();
        log.info("[ItemService >> getItems] itemEntityList : {}", itemEntityList);
        return ItemDto.Response.from(itemEntityList);
    }
}
