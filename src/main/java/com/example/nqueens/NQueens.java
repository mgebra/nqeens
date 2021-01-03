package com.example.nqueens;

import java.util.ArrayList;
import java.util.List;

public class NQueens {

    private Integer[] columns;

    public String placeQueens(int n) {
        if (n < 1) {
            return "Please enter positive integer";
        } else {
            boolean isSuccess = placeQueens(n, 0, new Integer[n]);

            if (isSuccess) {
                return getSolutionString();
            } else {
                return "No solution";
            }
        }
    }

    private boolean placeQueens(int n, int row, Integer[] columns) {
        if (row == n) {
            this.columns = columns;
            return true;
        } else {
            for (int column = 0; column < n; column++) {
                if (isValid(columns, row, column)) {
                    columns[row] = column;
                    if (placeQueens(n, row + 1, columns)) {
                        return true;
                    }
                }
            }
        }

        return false;
    }

    public boolean isValid(Integer[] columns, int currentRow, int currentColumn) {
        List<Double> lines = new ArrayList<>();

        for (int row = 0; row < currentRow; row++) {
            int column = columns[row];

            // Check column
            if (currentColumn == column) {
                return false;
            }

            int columnDistance = currentColumn - column;
            int rowDistance = currentRow - row;

            // Check diagonals
            if (Math.abs(columnDistance) == rowDistance) {
                return false;
            }

            // check lines
            double line = (double) rowDistance / columnDistance;
            if (lines.contains(line)) {
                return false;
            } else {
                lines.add(line);
            }
        }

        return true;
    }

    private String getSolutionString() {
        StringBuilder sb = new StringBuilder();

        for (int i = 0; i < columns.length; i++) {
            sb.append("[").append(i).append(":").append(columns[i]).append("]");
        }

        return sb.toString();
    }
}
