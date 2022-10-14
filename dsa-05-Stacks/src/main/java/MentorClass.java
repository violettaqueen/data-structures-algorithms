public class MentorClass {

    public static void main(String[] args) {

        System.out.println(factorial(4));


    }
    public static int factorial(int myNumber){
        if (myNumber <= 1){
            return 1;
        }
        return myNumber*factorial(myNumber-1);

    }
}
