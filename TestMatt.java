
class TestMatt {

    public static void main (String args[]){
        System.out.println("Hello!");
        int x = 7;
        int y = 100;
        // int args[0];



        if ((x <= 3) && (y > x)){
            System.out.println("Good! x: "+ x);

        }else if ((x > 3) && !(x > y)) {
            System.out.println("Something else x: "+ x);

        }else {
            System.out.println("Bad! x: " + x);
        }

    }
}