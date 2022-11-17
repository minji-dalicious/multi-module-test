package com.kurrant.multi.sms;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@Getter
public class MessageDto {
    private String to;
//    String content;
    @Builder
    public MessageDto(String to) {
        this.to = to;
    }
}