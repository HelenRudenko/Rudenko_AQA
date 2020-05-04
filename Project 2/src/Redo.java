public class Redo {
    public static void main(String[] args) {
        int n = 15;
        int x = 1;
        int y = 0;
        while (y < n ){
            y = x*x;
            x++;
            if (y >= 15)
                break;
            System.out.println(y + " ");



        }
}
}