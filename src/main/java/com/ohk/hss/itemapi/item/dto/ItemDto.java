package com.ohk.hss.itemapi.item.dto;

import com.ohk.hss.itemapi.item.entity.ItemEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

public class ItemDto {

    @Builder
    @Data
    @Setter(AccessLevel.NONE)
    public static class Request {

        private Long itemNo;
        private String itemName;
    }

    @Builder
    @Data
    @Setter(AccessLevel.NONE)
    public static class Response {

        private Long itemNo;
        private String itemName;

        public static ItemDto.Response from(ItemEntity itemEntity) {
            ItemDto.Response response = Response.builder()
                                                .itemNo(itemEntity.getItemNo())
                                                .itemName(itemEntity.getItemName())
                                                .build();
            return response;
        }
    }
}
