package com.algaworks.algasensors.temperature.processing;

import org.junit.jupiter.api.Test;

import java.util.UUID;

public class UUODv7Test {

    @Test
    void shouldGenerateUUIDv7(){
        UUID uuid1 = IdGenerator.generateUUID();
        UUID uuid2 = IdGenerator.generateUUID();
        UUID uuid3 = IdGenerator.generateUUID();
        UUID uuid4 = IdGenerator.generateUUID();

        System.out.println(uuid1.timestamp());
        System.out.println(uuid2);
        System.out.println(uuid3);
        System.out.println(uuid4);
    }
}
