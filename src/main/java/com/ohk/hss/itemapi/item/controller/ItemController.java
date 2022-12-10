package com.ohk.hss.itemapi.item.controller;

import com.ohk.hss.itemapi.item.dto.ItemDto;
import com.ohk.hss.itemapi.item.service.ItemService;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;


@RestController
@RequiredArgsConstructor
@RequestMapping(value = {"/i/items"})
public class ItemController {

    private final ItemService itemService;

    @GetMapping(value = {""})
    public ResponseEntity<?> getItems() {
        List<ItemDto.Response> itemList = itemService.getItems();
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