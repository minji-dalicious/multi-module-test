package com.kurrant.multi.domain;

import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;

import java.time.LocalDate;

@Getter
@NoArgsConstructor
public class Period {
    LocalDate startDateTime;
    LocalDate endDateTime;

    @Builder
    public Period(LocalDate startDateTime, LocalDate endDateTime) {
        this.startDateTime = startDateTime;
        this.endDateTime = endDateTime;
    }
}
