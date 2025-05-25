package com.algaworks.algasensors.temperature.processing.api.model;

import io.hypersistence.tsid.TSID;

import java.time.OffsetDateTime;
import java.util.UUID;

public record TemperatureLogOutput(
        UUID id,
        TSID sensorId,
        OffsetDateTime registeredAt,
        Double value

) {

}
