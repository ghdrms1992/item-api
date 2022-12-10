package com.ohk.hss.itemapi.item.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;

@Entity(name = "item")
@Getter
public class ItemEntity {

    @Id
    private Long itemNo;
    private String itemName;
}
