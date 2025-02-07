public class Main {
    public static void main(String[] args) {
        MyArrayList<String> strings = new MyArrayList<>();

        for (int i = 0; i < 30; i++) {
            strings.add("Marsel");
        }

        MyArrayList<Human> people = new MyArrayList<>();

        people.add(new Human("Alice", 30));
        people.add(new Human("Bob", 25));
        people.add(new Human("Charlie", 35));

        System.out.println("Initial list:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }


        people.removeAt(1);
        System.out.println("\nAfter removing at index 1:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }


        people.remove(new Human("Charlie", 35));
        System.out.println("\nAfter removing Charlie:");
        for (int i = 0; i < people.size(); i++) {
            System.out.println(people.get(i));
        }


        int index = people.indexOf(new Human("Alice", 30));
        System.out.println("\nIndex of Alice: " + index);
    }
}
