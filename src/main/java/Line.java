public class Line {

    public static String getA(String input) {
        String A = input.split("-")[0];
        return A;
    }

    public static String getB(String input) {
        String B = input.split("-")[1];
        return B;
    }


    public static String getX(String input) {
        String x = input.split(",")[0].substring(1);
        return x;
    }

    public static String getY(String input) {
        String tempY = input.split(",")[1];
        String Y = tempY.substring(0, tempY.length()-1);
        return Y;
    }

    public double calculate(String input) {
        String A = getA(input);
        String B = getB(input);
        double Ax = Double.parseDouble(getX(A));
        double Ay = Double.parseDouble(getY(A));
        double Bx = Double.parseDouble(getX(B));
        double By = Double.parseDouble(getY(B));

        double lineWidth = Math.sqrt(Math.pow(Ax - Bx, 2) + Math.pow(Ay - By, 2));
        return lineWidth;
    }
}
