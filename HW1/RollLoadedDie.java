public class RollLoadedDie {
    public static void main(String[] args) {
        double r = Math.random();
        int result;
        if (r < 1.0/8.0) result = 1;
        else if (r < 2.0/8.0) result = 2;
        else if (r < 3.0/8.0) result = 3;
        else if (r < 4.0/8.0) result = 4;
        else if (r < 5.0/8.0) result = 5;
        else result = 6;
        System.out.println(result);
    }
}
