package org.example.app.service;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class DivisionTest {

    private Division service;

    @BeforeEach
    void setUp() {
        service = new Division();
    }
    @Test
    @DisplayName("Test division of two numbers is expected result")
    void test_Division_Of_Two_Numbers_Expected_Result() {
        assertEquals(2, service.divide(6,3));
    }

    @Test
    @DisplayName("Test division of two numbers is unexpected result")
    void test_Division_Of_Two_Numbers_Unexpected() {
        assertNotEquals(4,service.divide(6,2));
    }


    @Test
    @DisplayName("Test calculation result right rounding")
    void test_Result_Right_Rounding() {
        assertEquals("4,55", service.roundRes(4.5525));
    }

    @Test
    @DisplayName("Test calculation result wrong rounding")
    void test_Result_Wrong_Rounding() {
        assertNotEquals("4.552", service.roundRes(4.5525));
    }

    @AfterEach
    void tearDown() {
        service = null;
    }
}