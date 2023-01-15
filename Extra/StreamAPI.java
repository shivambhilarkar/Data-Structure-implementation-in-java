package StreamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;

public class Basics {
    /**
     * Filter Method is used to filter the objects based on condition.
     * This condition is also called as predicate.
      * @param
     */
    public static List<Integer> getEvenNumbers(List<Integer> list){
        //1.convert to stream.
        //2.apply filter method.
        //3. each element on collection of objects.
        //4. using predicate (boolean function) extract the result.
        //5. collect the result in you data structure. List, Set etc.
        return list.stream().filter((num) -> num % 2 == 0).collect(Collectors.toList());
    }

    public static List<Integer> getOddNumbers(List<Integer> list){
        return list.stream().filter((num) -> num % 2 != 0).collect(Collectors.toList());
    }


    /**
     * Map Method
     * This method is used when we want to perform operation on each element
     * from the collection of elements.
     * @param
     */
    public static List<Integer> getSqauredNumbers(List<Integer> list){
        return list.stream().map((num) -> num * num).collect(Collectors.toList());
    }
    public static List<Integer> getDoubleElements(List<Integer> list){
        return list.stream().map((num) -> num * 2).collect(Collectors.toList());
    }

    /** TODO
     * Reduce
     * Get the result of collection of object in single entity or element.
     * Don't know very much about
     * @param list
     */
    public static int getSumOfAll(List<Integer> list){
        return list.stream().reduce( 0 , (first , second) -> first + second);
    }

    public static void main(String[] args){
        Scanner scan = new Scanner(System.in);

        List<Integer> list = Arrays.asList(10,9,8,7,6,1,2,3,4,5);
        System.out.println("[ Input : "+ list +" ]");

        //print each element on new line
        //list.stream().forEach(System.out::println);

        long count = list.stream().count();
        System.out.println("[ count : "+ count + " ]");
        long oddCount = list.stream().filter((num) -> num % 2 == 0).count();
        System.out.println("[ Odd Count : "+ oddCount + " ]" );

        List<Integer>  ascending = list.stream().sorted().collect(Collectors.toList());
        List<Integer> descending = list.stream().sorted((a,b) -> b - a).collect(Collectors.toList());

        System.out.println("[ Sorted List : "+ ascending + " ]");
        System.out.println("[ Reverse Sorted List : "+ descending + " ]");

        List<Integer> lstSkip =  list.stream().skip(3).collect(Collectors.toList());
        System.out.println("[ Element skip : "+ lstSkip + " ]");

        List<Integer> firstLimited = list.stream().limit(5).collect(Collectors.toList());
        System.out.println("[ Limited Element : "+ firstLimited + " ]");

        //1. Filter Method
        //get even & odd number from list
        List<Integer> evenList = getEvenNumbers(list);
        List<Integer> oddList = getOddNumbers(list);

        System.out.println("[ Even List : "+ evenList + " ]");
        System.out.println("[ Odd List : "+ oddList + " ]");


        //2. Map Method
        List<Integer> squareList = getSqauredNumbers(list);
        List<Integer> doubleList = getDoubleElements(list);

        System.out.println("[ Squared Numbers : "+ squareList + " ]");
        System.out.println("[ Double Numbers : "+ doubleList +" ]");


        //3. Reduce Method
        int sum = getSumOfAll(list);
        System.out.println("[ Sum : "+ sum + " ]");

    }
}
