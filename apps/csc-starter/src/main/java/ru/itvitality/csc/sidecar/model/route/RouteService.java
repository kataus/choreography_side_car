package ru.itvitality.csc.sidecar.model.route;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

@Data
@AllArgsConstructor
@Builder
public class RouteService {
    private final String name;
    private final String path;
}
