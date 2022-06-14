public class SummativeSums {
    public static void main(String[] args) {
        calc(new int[]{1, 90, -33, -55, 67, -16, 28, -55, 15});
        calc(new int[]{999, -60, -77, 14, 160, 301});
        calc(new int[]{10, 20, 30, 40, 50, 60, 70, 80, 90, 100, 110, 120, 130,
                140, 150, 160, 170, 180, 190, 200, -99});
    }
    public static void calc(int[] arr){
        int total = 0;
        for (int i: arr
        ) {
            total += i;
        }
        System.out.println(total);
    }
}
