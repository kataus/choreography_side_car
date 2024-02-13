package ru.itvitality.csc.api;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class StatusResponse {
    private Status status;
    private String message;

    public static StatusResponse success() {
        return StatusResponse.builder().status( Status.SUCCESS ).build();
    }
}
