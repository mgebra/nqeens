package com.example.nqueens;

import org.junit.Test;
import static org.junit.Assert.*;

public class NQueensTest {

    @Test
    public void testSolutionForNonPositiveN() {
        NQueens nQueens = new NQueens();
        assertEquals("Please enter positive integer", nQueens.placeQueens(0));
    }

    @Test
    public void testSolutionFor1Queen() {
        NQueens nQueens = new NQueens();
        assertEquals("[0:0]", nQueens.placeQueens(1));
    }

    @Test
    public void testNoSolutionFor2Queens() {
        NQueens nQueens = new NQueens();
        assertEquals("No solution", nQueens.placeQueens(2));
    }

    @Test
    public void testNoSolutionFor3Queens() {
        NQueens nQueens = new NQueens();
        assertEquals("No solution", nQueens.placeQueens(3));
    }

    @Test
    public void testSolutionFor4Queens() {
        NQueens nQueens = new NQueens();
        assertEquals("[0:1][1:3][2:0][3:2]", nQueens.placeQueens(4));
    }

    @Test
    public void testIsValidTrue1() {
        NQueens nQueens = new NQueens();
        assertTrue(nQueens.isValid(new Integer[]{0, 0, 0, 0, 0}, 0, 0));
    }

    @Test
    public void testIsValidTrue2() {
        NQueens nQueens = new NQueens();
        assertTrue(nQueens.isValid(new Integer[]{3, 0, 0, 0, 0}, 1, 1));
    }

    @Test
    public void testIsValidFalseSameColumn() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{0, 0, 0, 0, 0}, 1, 0));
    }

    @Test
    public void testIsValidFalseSameColumn1() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{0, 3, 0, 0, 0}, 2, 3));
    }

    @Test
    public void testIsValidFalseDiagonalsUp() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{0, 0, 0, 0, 0}, 1, 1));
    }

    @Test
    public void testIsValidFalseDiagonalsDown() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{7, 0, 0, 0, 0}, 2, 5));
    }

    @Test
    public void testIsValidFalseSameLine() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{0, 2, 0, 0, 0}, 2, 4));
    }

    @Test
    public void testIsValidFalseSameLineFar() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{0, 2, 10, 0, 0}, 3, 6));
    }

    @Test
    public void testIsValidFalseSameLineDown() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{7, 5, 0, 0, 0}, 3, 3));
    }

    @Test
    public void testIsValidFalseSameLineDownFar() {
        NQueens nQueens = new NQueens();
        assertFalse(nQueens.isValid(new Integer[]{7, 0, 3, 0, 0}, 3, 1));
    }
}
