package com.ohk.hss.event.controller;

import com.ohk.hss.event.dto.EventDto;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.commons.lang3.StringUtils;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
@Slf4j
@RequestMapping(value = {"/api/e/events"})
public class EventController {

    private final RedisTemplate<String, String> redisTemplate;

    @PostMapping(value = {"/applications"})
    public ResponseEntity<?> addEventApplication(EventDto.Request evenRequest) {
        evenRequest.setEventNo(00001l);
        evenRequest.setUserNo(2023021800001l);

        ValueOperations<String, String> valueOperations = redisTemplate.opsForValue();
        String key = StringUtils.join(evenRequest.getEventNo(), ":", evenRequest.getUserNo());
        log.info("[EventController >> addEventApplication] key : {}", key);
        valueOperations.set(key, "1");

        String value = valueOperations.get(key);
        log.info("[EventController >> addEventApplication] value : {}", value);

        return ResponseEntity.ok().body(value);
    }
}
