package ru.itvitality.csc.api.dto;

import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;

@Getter
@AllArgsConstructor
@Builder(toBuilder = true)
@JsonDeserialize(builder = THeader.THeaderBuilder.class)
public class TBody {
    private final Object payload;
}
