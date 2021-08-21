public class Practice {



    public static void numbersToThirty() {

        for (int a = 0; a <= 30; a++) {
            System.out.println(a);

        }
    }

    public static void numbersFromThirty() {

        for (int a = 30; a >= 0; a--) {
            System.out.println(a);

        }
    }
    public static void evenNumbers() {

        for(int a = 0; a <= 30; a +=2) {
            System.out.println(a);
        }
    }
    public static void someNumbers() {

        for (int a = 2; a <= 8; a++) {
            System.out.println(a);

        }
    }
    public static void factorialOperation(){
        int number = 5;
        long factorial = 1;
        int a = 1;
        while(a <= number)
        {
            factorial = factorial * a;
            a++;
        }
        System.out.println(factorial);
    }

    public static void someTriangle(){
        for(int i=1;i<=5;i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void someOtherTriangle(){
        for(int i=0; i<5; i++) {
            for(int j=2*(5-i); j>=0; j--) {
                System.out.print(" ");}
            for(int j=0; j<=i; j++) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void christmasTree(){
        for (int i=0; i<5; i++) {
            for (int j=5-i; j>1; j--) {
                System.out.print(" ");}
            for (int j=0; j<=i; j++ ) {
                System.out.print("* ");
            }

            System.out.println();
        }
    }

    public static void main(String[] args){
        numbersToThirty();
        System.out.println("-----");
        numbersFromThirty();
        System.out.println("-----");
        evenNumbers();
        System.out.println("-----");
        someNumbers();
        System.out.println("-----");
        factorialOperation();
        System.out.println("-----");
        someTriangle();
        System.out.println("-----");
        someOtherTriangle();
        System.out.println("-----");
        christmasTree();

    }
}