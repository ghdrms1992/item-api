package com.ohk.hss.item.dto;

import com.ohk.hss.item.entity.ItemEntity;
import lombok.AccessLevel;
import lombok.Builder;
import lombok.Data;
import lombok.Setter;

import java.util.List;

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
            return Response.builder()
                           .itemNo(itemEntity.getItemNo())
                           .itemName(itemEntity.getItemName())
                           .build();
        }

        public static List<ItemDto.Response> from(List<ItemEntity> itemEntityList) {
            return itemEntityList.stream()
                                 .map(ItemDto.Response::from)
                                 .toList();
        }
    }
}
