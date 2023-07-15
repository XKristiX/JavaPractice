public class GPAArray {
    public static void main(String[] args) {
        double[] gpas = new double[5];
        gpas[0] = 3.2;
        gpas[1] = 3.7;
        gpas[2] = 4.0;
        gpas[3] = 3.5;
        gpas[4] = 3.9;

        System.out.println("GPAs on a 4.0 scale of five students:");
        for (double gpa : gpas) {
            System.out.println(gpa);
        }
    }
}

