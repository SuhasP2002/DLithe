import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class twostack {

    public static void main(String[] args) {

        Stack<Integer> first = new Stack<>();
        Stack<Integer> second = new Stack<>();
        Scanner sc = new Scanner(System.in);
        Integer n = sc.nextInt();

        for(int i = 0; i < n; i++) {
            int num = sc.nextInt();
            switch(num) {
                case 1:
                    int a = sc.nextInt();
                    first.push(a);
                    break;

                case 2:
                    if(second.isEmpty()){
                        while(!first.isEmpty()) {
                            second.push(first.pop());
                        }
                    }
                    switch(num) {
                        case 3:
                            second.pop();
                            break;
                        case 4:
                            System.out.println(second.peek());
                            break;
                    }
                    break;
            }
        }


    }
}
   
