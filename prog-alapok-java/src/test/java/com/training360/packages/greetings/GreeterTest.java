package com.training360.packages.greetings;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

class GreeterTest {

    @Test
    void sayHello2() {
        // Given
        Greeter greeter = new Greeter();

        // When
        String hello = greeter.sayHello2();

        // Then
        assertEquals("Hello World!", hello);
    }

    @Test
    void sayHello3() {
        Greeter greeter = new Greeter();
        assertNotNull(greeter);
    }
}