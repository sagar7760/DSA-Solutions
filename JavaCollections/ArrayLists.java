package JavaCollections;
import java.util.ArrayList;
public class ArrayLists {
    public static void main(String[] args) {
       ArrayList<Integer> numbers = new ArrayList<>();//modern syntax
    //    ArrayList<Integer> numbers = new ArrayList<Integer>();//older syntax
         for(int i=0;i<=10;i++){
            numbers.add(i*10);
         }
         numbers.get(5);
         numbers.addLast(110);
         numbers.removeLast();
         numbers.set(4,55);
         System.out.println(numbers);
         System.out.println("Size of ArrayList: "+numbers.size());
        }
    }
