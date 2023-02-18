package com.ohk.hss.item.constant;

import lombok.RequiredArgsConstructor;

@RequiredArgsConstructor
public enum ItemStatus {
    PEND("10", "대기"),
    SELL("20", "판매"),
    END("30", "종료"),
    SOLD_OUT("40", "품절")
    ;

    public final String CODE;
    public final String NAME;
}
