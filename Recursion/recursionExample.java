package Recursion;
public class recursionExample{
    public static void main(String args[]){
        int i =0;
        Mymethod(i++);
    }

    private static void Mymethod(int num){
        System.out.println(num+ " This is my method!");
        Mymethod(num++);
    }
}