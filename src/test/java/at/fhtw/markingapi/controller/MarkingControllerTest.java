package at.fhtw.markingapi.controller;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class MarkingControllerTest {
    @Test
    void calculateGrade() {
        var controller = new MarkingController();
        var result1 = controller.calculateGrade(0);
        var result2 = controller.calculateGrade(50);
        var result3 = controller.calculateGrade(80);
        var result4 = controller.calculateGrade(110);

        assertEquals(result1, 5);
        assertEquals(result2, 4);
        assertEquals(result3, 2);
        assertNotEquals(result4, 1); //wrong input
    }
}