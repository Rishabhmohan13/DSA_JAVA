package Recursion;
import java.util.*;
import java.io.*;
import java.math.*;

class towerOfHanoi {
    static int moves=0;
    static void towerofHanoi(int n, char from_peg, char to_peg, char aux_peg) {
        if (n == 1) {
            System.out.println((++moves) +" - Move disk 1 from peg " + from_peg + " to peg " + to_peg);
            return;
        }
        towerofHanoi(n - 1, from_peg, aux_peg, to_peg);
        System.out.println((++moves)+" - Move disk " + n + " from peg " + from_peg + " to peg " + to_peg);
        towerofHanoi(n - 1, aux_peg, to_peg, from_peg);
    }

    // Driver code

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter no. of disks: ");
        int n = sc.nextInt();; // number of disks
        towerofHanoi(n, 'A', 'C', 'B'); // A , B and C are names of peg
    }
}
