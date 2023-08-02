public class Main {
    public static void main(String[] args) {
        System.out.println("For-each loop");
        /*For-each loop is used exclusively to loop through elements in an array:
        * Syntax:
        * for (type variableName : arrayName) {
        * //code block to be executed
        * }
        * */
        String[] cars= {"volvo", "BMW", "Ford", "Mazda"};
        for (String i : cars) {
            System.out.println(i); //This will output all elements in the cars array using a for-each loop.
            
        }
    }
}