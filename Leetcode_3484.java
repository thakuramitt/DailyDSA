//https://leetcode.com/problems/design-spreadsheet/description/

public class Leetcode_3484 {
    private int[][] sheet;
    private int rows;

    public int[] parseCell(String cell) {
        char ch = Character.toUpperCase(cell.charAt(0));
        int col = ch - 'A';

        String subStr = cell.substring(1);
        int row = Integer.parseInt(subStr) - 1;

        if (row < 0 || row >= rows) {
            throw new IllegalArgumentException("Row out of range: " + cell);
        }
        if (col < 0 || col >= 26) {
            throw new IllegalArgumentException("Column out of range: " + cell);
        }
        return new int[]{row, col};
    }

    public Spreadsheet(int rows) {
        sheet = new int[rows][26];
        this.rows = rows;
    }

    public void setCell(String cell, int value) {
        int[] helper = parseCell(cell);
        sheet[helper[0]][helper[1]] = value;
    }

    public void resetCell(String cell) {
        int[] helper = parseCell(cell);
        sheet[helper[0]][helper[1]] = 0;
    }

    public int getValue(String formula) {
        if(formula == null || formula.length() == 0) return 0;

        String[] parts = formula.substring(1).split("\\+");
        int sum = 0;

        for(String part : parts) {
            part = part.trim();
            if(part.isEmpty()) continue;

            if(Character.isLetter(part.charAt(0))) {
                int[] helper = parseCell(part);
                sum += sheet[helper[0]][helper[1]];
            } else {
                sum += Integer.parseInt(part);
            }
        }

        return sum;
    }
}
