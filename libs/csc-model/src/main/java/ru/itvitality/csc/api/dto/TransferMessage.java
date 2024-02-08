package ru.itvitality.csc.api.dto;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

import java.time.LocalDateTime;
import java.util.UUID;

@Data
@RequiredArgsConstructor
@AllArgsConstructor
@Builder(toBuilder = true)
public class TransferMessage {
    private final UUID messageId;
    private final UUID activityId;
    private final UUID scenarioId;
    private final LocalDateTime creationDateTime;
    private final String authorAlias;
    private final Object payload;
}
