package ru.itvitality.csc.api.message;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import jakarta.validation.constraints.NotNull;
import lombok.Builder;
import lombok.Data;
import lombok.RequiredArgsConstructor;

@Data
@RequiredArgsConstructor
@Builder(toBuilder = true)
@JsonDeserialize(builder = TMessage.TMessageBuilder.class)
public class TMessage {
    @NotNull
    private final THeader header;
    private final TBody body;
}
