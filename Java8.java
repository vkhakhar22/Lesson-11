import java.util.ArrayList;

class Main {
    public static void main(String[] args) {
        ArrayList<String> animals = new ArrayList<>();
        animals.add("Lion");
        animals.add("Cheetah");
        animals.add("Tiger");
        System.out.println("Printing current array");
        System.out.println(animals);
        animals.clear();
        System.out.println("Cleared Array" + animals);
        if (animals.isEmpty()) {
            System.out.println("Empty array");
        } else {
            System.out.println("Not an empty array");

        }
        animals.add("Lion");
        animals.add("Cheetah");
        animals.add("Tiger");
        System.out.println("The size of the array " + animals.size());
        System.out.println("Adding more elements " + animals.add("Cat"));
        System.out.println(animals);
        animals.remove(2);
        System.out.println(animals);
    }
}