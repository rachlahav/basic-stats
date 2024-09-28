public class MinMaxCalculation {
    public static double max(double... numbers) {
        double max = (double) Double.MIN_VALUE;
        for (double num : numbers) {
            if (num > max) {
                max = num;
            }
        }
        return max;
    }

    public static double min(double... numbers) {
        double min = (double) Double.MAX_VALUE;
        for (double num : numbers) {
            if (num < min) {
                min = num;
            }
        }
        return min;
    }
}
