import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        PermutationsII permutationsII = new PermutationsII();
        System.out.println(permutationsII.permuteUnique(new int[]{1,1,2,2,3,3,4}).size());
        System.out.println(permutationsII.permuteUnique1(new int[]{1,1,2,2,3,3,4}).size());

    }
}