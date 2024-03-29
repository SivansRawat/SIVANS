class Solution {
    private int numRows;
    private int toothWidth;

    public String convert(String s, int numRows) {
        this.numRows = numRows;
        this.toothWidth = Math.max(0, numRows - 2);
        StringBuilder result = new StringBuilder(s.length());
        for (int n = 0; n < numRows; n++) { // loop over rows
            for (int g = 0; ; g++) { // loop over intersections (row ∩ zigzag)
                int charIndex = f(n, g);
                if (charIndex >= s.length()) break;
                result.append(s.charAt(charIndex));
            }
        }
        return result.toString();
    }

    private int f(int n, int g) {
        if (isSpecialCase(n)) return n + g * (numRows + toothWidth);
        if (isVerticalIntersection(g)) return n + (g / 2) * (numRows + toothWidth);
        else return f(n, g - 1) + 2 * (numRows - n - 1);
    }

    private boolean isSpecialCase(int n) {
        return n == 0 || n == numRows - 1;
    }

    private boolean isVerticalIntersection(int g) {
        return g % 2 == 0;
    }
}