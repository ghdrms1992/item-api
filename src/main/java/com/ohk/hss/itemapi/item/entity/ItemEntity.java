package com.ohk.hss.itemapi.item.entity;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.ToString;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import java.time.LocalDateTime;

@Entity
@Table(name = "item")
@Getter
@ToString
public class ItemEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long itemNo;

    @Column(nullable = false, length = 50)
    private String itemName;

    @Column(nullable = false)
    private int price;

    @Column(nullable = false)
    private int stock;

    @Column(nullable = false, length = 10)
    private String itemStatusCode;

    @Column
    private String itemDesc;

    @Column(nullable = false)
    @CreationTimestamp
    private LocalDateTime regDt;

    @Column(nullable = false)
    @UpdateTimestamp
    private LocalDateTime updateDt;
}
