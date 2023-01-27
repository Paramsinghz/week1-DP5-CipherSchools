import java.util.LinkedList;

public class firstuniquechar {

    static void firstNonRepElement(String str) {
        LinkedList<Character> list = new LinkedList<Character>();

        list.add(str.charAt(0));

        for (int i = 1; i < str.length(); i++) {
            if (list.contains(str.charAt(i)))
                list.remove(list.indexOf(
                        str.charAt(i)));
            else
                list.add(str.charAt(i));
        }
        System.out.println(list.get(0));
    }

    public static void main(String[] args) {
        String str = "bab";

        // Function Call
        firstNonRepElement(str);
    }
}
