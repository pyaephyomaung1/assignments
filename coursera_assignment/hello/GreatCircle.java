package hello;
public class GreatCircle {
    public static void main(String[] args) {
        double x1 = Math.toRadians(Double.parseDouble(args[0]));
        double y1 = Math.toRadians(Double.parseDouble(args[1]));
        double x2 = Math.toRadians(Double.parseDouble(args[2]));
        double y2 = Math.toRadians(Double.parseDouble(args[3]));

        double radius = 6371.0;

        double dx = x2 - x1;
        double dy = y2 - y1;

        double a = Math.pow(Math.sin(dx / 2), 2)
                 + Math.cos(x1) * Math.cos(x2) * Math.pow(Math.sin(dy / 2), 2);

        double c = 2 * Math.asin(Math.sqrt(a));

        double distance = radius * c;

        System.out.println(distance + " kilometers");
    }
}
