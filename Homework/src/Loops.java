public class Loops {

    public static void main(String[] args) {
    for (int i = 0; i <100; i++) {
        if ( i % 2 ==0) 
        System.out.println(i);
        }
        for (int  i = 100; i >= 0; i-=3 ) { // i-=3 is same as (i = i-3)
            System.out.println(i);

        }
        for (int i = 0; i <100; i++) {
            if ( i % 2 == 1)
            System.out.println(i);
        }

        for (int i = 0; i <100; i++)  // i = i+1

            if ((i % 3) == 0) 
                System.out.println("Hello");
            else if ((i % 5) == 0) 
                System.out.println("World");
            else if  (i % 3 == 0 && i % 5 == 0) 
               System.out.println("Hello World");
            else
               System.out.println(i); 
            }


    }