package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SubtractionTest {

    private Subtraction service;

    @BeforeEach
    void setUp() {
        service = new Subtraction();
    }
    @Test
    @DisplayName("Test multiplication of two numbers is expected result")
    void test_Addition_Of_Two_Numbers_Expected_Result() {
        assertEquals(4, service.subtract(6,2));
    }

    @Test
    @DisplayName("Test multiplication of two numbers is unexpected result")
    void test_Addition_Of_Two_Numbers_Unexpected_Result() {
        assertNotEquals(1, service.subtract(6,2));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}