public class LabTask2 {

    public static double circleArea(int radius) {
        return Math.PI * radius * radius;
    }

    public static double sphereVolume(double radius) {
        return (4.0 / 3.0) * Math.PI * Math.pow(radius, 3);
    }

    public static void findSpace(int diameter, String type) {
        if (type == null) {
            System.out.println("Wrong Parameter");
            return;
        }
        int radius = diameter / 2;
        String key = type.toLowerCase();
        switch (key) {
            case "circle":
                System.out.println(circleArea(radius));
                break;
            case "sphere":
                System.out.println(sphereVolume(radius));
                break;
            default:
                System.out.println("Wrong Parameter");
        }
    }

    public static void main(String[] args) {
        System.out.println(circleArea(5));
        System.out.println(sphereVolume(5.0));
        findSpace(10, "circle");
        findSpace(5, "sphere");
        findSpace(10, "square");
    }

}
