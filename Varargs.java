public class Varargs {

    public static void main(String[] args) {
        String item1 = "Apple";
        String item2 = "Banana";
        String item3 = "cake";
        String[] shoppingItem = {"rice", "milk", "bread"};
        printShoppingList(item1, item2, item3);
        printShoppingList(shoppingItem);
    }
//---------------Case 1: Without Varargs - In this case we have to write code and make changes as per the no of arguments(2 ITEMS, 3 ITEMS, ARRAY OF ITEMS)---------------------------------------------

//    //without vararg this will only print 2 argument
//    private static void printShoppingList(String string1, String string2) {
//        System.out.println("Shopping List");
//        System.out.println("1. " + string1);
//        System.out.println("2. " + string2);
//    }
//    //without vararg this will print only three arguments
//
//    private static void printShoppingList(String string1, String string2, String string3) {
//        System.out.println("Shopping List");
//        System.out.println("1. " + string1);
//        System.out.println("2. " + string2);
//        System.out.println("2. " + string3);
//    }
//
//    //without vararg when variables in form of array
//    private static void printShoppingList(String[] items) {
//        System.out.println("shopping List");
//        for (int i=0; i <items.length; i++){
//            System.out.println(i + 1 + ". " + items[i]);
//        }
//    }
//-----------------------------------------------------------------------------------

//---------------Case 2: With Varargs - CAN take variable of arguments. (varargs context: 3 DOTS ... ) ---------------------------------------------

    private static void printShoppingList(String... items) {
        System.out.println("shopping List");
        for (int i=0; i <items.length; i++){
            System.out.println(i + 1 + ". " + items[i]);
        }
        System.out.println("");
    }
//---------------------------------------------------------------------------------------

}
