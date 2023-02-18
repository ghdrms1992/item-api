package com.ohk.hss.event.dto;

import lombok.Builder;
import lombok.Data;

public class EventDto {

    @Builder
    @Data
    public static class Request {

        private Long eventNo;
        private Long userNo;
    }
}
