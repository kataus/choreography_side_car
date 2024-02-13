package ru.itvitality.csc.api;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.util.UUID;

@Data
@RequiredArgsConstructor
@Builder(toBuilder = true)
@JsonDeserialize(builder = AdapterRequest.AdapterRequestBuilder.class)
public class AdapterRequest {
    private UUID actionId;
    private String srcAlias;
    private UUID correlationId;
    private Object data;
}
