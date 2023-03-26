public class Main {
    public static double[] it(double B[][], double b[], double x[])
    {
        double x1[] = new double[B.length];
        for (int i = 0; i < x1.length; i++)
        {
            double sum = 0;
            for (int j = 0; j < B[i].length; j++)
            {
                sum += B[i][j]*x[j];
            }
            x1[i] = sum + b[i];
        }
        return x1;
    }
    public static void main(String[] args) {
        double B[][] = new double[][]
                {
                        {0.14, 0.23, 0.18, 0.17},
                        {0.12, -0.14, 0.08, 0.09},
                        {0.16, 0.24, 0, -0.35},
                        {0.23, -0.08, 0.05, 0.25}
                };
        double b[] = new double[] {-1.42, -0.83, 1.21, 0.65};
        double x[] = new double[] {0, 0, 0, 0};
        double[][] p = new double[31][];
        p[0] = x;
        for (int i = 0; i < 30; i++)
        {
            p[i + 1] = it(B, b, p[i]);
        }

        for (int i = 0; i < B.length; i++)
        {
            System.out.println(p[30][i]);
        }
    }
}