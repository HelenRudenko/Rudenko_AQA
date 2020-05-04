public class While {
    public static void main(String[] args) {
        int length = 37;
        int size = 1000;
        int c = 1;
        while (length <= size ){
            size = size - length ;
            System.out.println("Кусок отрезан " + c);
            c++;
        }


        System.out.println("Недостаточно материала " + size);




    }
}
