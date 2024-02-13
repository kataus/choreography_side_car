package ru.itvitality.csc.api.message;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

import java.time.LocalDateTime;
import java.util.UUID;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonDeserialize(builder = THeader.THeaderBuilder.class)
public class THeader {
    @NotBlank
    private final UUID messageId;
    private final UUID actionId;
    @NotBlank
    private final LocalDateTime createDateTime;
    @NotNull
    private final TMessageType messageType;
    private final String srcAlias;
    private final UUID correlationId;
}
