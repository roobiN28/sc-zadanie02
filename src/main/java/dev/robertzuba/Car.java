package dev.robertzuba;

import lombok.Builder;

@Builder
public class Car {
    private String name;
    private String engine;
    private Integer productionYear;
}
