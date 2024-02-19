import java.util.ArrayList;
import java.util.List;

public class GenericsMethods {

    static Integer[] intArray = {1, 4, 5, 23};
    static Character[] charArray = {'A', 'G', 'T', 'y'};
    static Boolean[] boolArray = {true, false, true};


//    //Case 1: when arrayToList Method is nor Generic Method
//    public static List arrayToList(Object[] array, List<Object> list){
//        for (Object object: array) {
//            list.add(object);
//        }
//            return list;
//    }

    //Case 2: When arrayToList Method is Generic Method
    public static <T> List<T> arrayToList(T[] array, List<T> list){
        for (T object: array) {
            list.add(object);
        }
        return list;
    }

    public static void main(String[] args) {
        List<Character> charList = arrayToList(charArray, new ArrayList<>());
        System.out.println(charList.get(0));

        List<Boolean> boolList = arrayToList(boolArray, new ArrayList<>());
        System.out.println(boolList.get(0));

        List<Integer> intList = arrayToList(intArray, new ArrayList<>());
        System.out.println(intList.get(0));

        //For case 1 below line will not show compile error and for case 2 it will display the compile time error
//        List<String> intList = arrayToList(intArray, new ArrayList<>());
//        System.out.println(intList.get(0));  //but for case 1 this Line will give ClassCastException the solution is to make arrayToList method a Generic Method
    }
}
