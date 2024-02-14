package ru.itvitality.csc.sidecar.model.route;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@AllArgsConstructor
@Builder
public class RouteConfig {
    private final String code;
    private final String name;
    private final List<RouteService> services;
}
