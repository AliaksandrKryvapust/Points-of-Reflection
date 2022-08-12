import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
    int [] a =new int[]{10, -10};
    int [] b = new int[]{-10, 10};
        System.out.println(Arrays.equals(reflectPoint(a, b), new int[]{-30, 30}));
    }
    public static int[] reflectPoint(int[] p, int[] q) {
        int [] result = new int[2];
        result[0]=2*q[0]-p[0];
        result[1]=2*q[1]-p[1];
        return result;
    }
}
