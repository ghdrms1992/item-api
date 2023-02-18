package com.ohk.hss.item.controller;

import com.ohk.hss.item.dto.ItemDto;
import com.ohk.hss.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = {"/api/i/items"})
public class ItemController {

    private final ItemService itemService;

    @GetMapping(value = {""})
    public ResponseEntity<?> getItems() {
        List<ItemDto.Response> itemList = itemService.getItems();
        log.info("[ItemController >> getItems] itemList : {}", itemList);
        return ResponseEntity.ok().body(itemList);
    }

    @GetMapping(value = {"/{itemNo}"})
    public ResponseEntity<?> getItem() {
        return null;
    }

    @PostMapping(value = {""})
    public ResponseEntity<?> addItem() {
        return null;
    }

    @PatchMapping(value = {"/{itemNo}"})
    public ResponseEntity<?> updateItem() {
        return null;
    }

    @DeleteMapping(value = {"/{itemNo}"})
    public ResponseEntity<?> deleteItem() {
        return null;
    }
}