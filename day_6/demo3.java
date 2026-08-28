package day_6;

public class demo3 {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() - adds text to the end
        sb.append(" World");
        System.out.println("After append: " + sb);

        // 2. insert() - inserts text at a specific index
        sb.insert(5, ",");
        System.out.println("After insert: " + sb);

        // 3. reverse() - reverses the entire string
        sb.reverse();
        System.out.println("After reverse: " + sb);

        // 4. delete() - removes characters between two indices
        sb.reverse(); // reverse back first
        sb.delete(5, 6); // removes the comma we inserted
        System.out.println("After delete: " + sb);

        // 5. replace() - replaces a range of characters
        sb.replace(0, 5, "Hi");
        System.out.println("After replace: " + sb);
    }


}
