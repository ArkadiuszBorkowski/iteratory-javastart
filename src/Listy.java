import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

class Listy {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>();
        names.add("Kasia");
        names.add("Basia");
        names.add("Basia");
        names.add("Basia");
        names.add("Kajtek");
        names.add("Wojtek");
        names.add("Maniek");

/*        for (int i = 0; i < names.size(); i++) {
            String name = names.get(i);
            System.out.println(name);
            if (name.equals("Basia")) {
                names.remove(i);
                i--;
            }
        }
        System.out.println(names);
*/
        Iterator<String> iterator = names.iterator();

        while (iterator.hasNext())  {
            String name = iterator.next();
            System.out.println(name);
            if (name.equals("Basia")) {
                names.remove("Basia");
            }
        }

        System.out.println(names);
    }



}