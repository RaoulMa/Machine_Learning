/*
 The word polymorphism means having many forms. In programming, polymorphism means same function
 name (but different signatures) being uses for different types.
 */

public class Polymorphism {

    public int sum(int x, int y){
        return x + y;
    }

    public int sum(int x, int y, int z){
        return x + y + z;
    }

    public static void main(String args[]){

        System.out.println("polymorphism example");

        Polymorphism poly = new Polymorphism();

        System.out.println(poly.sum(1,2));
        System.out.println(poly.sum(1,2,3));

        }
}

