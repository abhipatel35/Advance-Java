import java.util.ArrayList;
import java.util.List;

public class Generics {

    public static void main(String[] args) {

        //without generics
        List names = new ArrayList();
        names.add("Abhi");
        String name = (String) names.get(0); //cast the object to a string while declaring a variable
        System.out.println("First name: " + name);
//        names.add(7); //if you uncommment this line it will not show error as we have not declared entire list as String list

        //with Generics
        List<String> names2 = new ArrayList();  // declaring a list as a string liist
        names2.add("Abhi");
        String name2 = names2.get(0);
        System.out.println("First name: " + name2);
//        names2.add(7);  //if you uncomment this line you can see that it will show compile time error as it will not allow any value without String.
    }
}
