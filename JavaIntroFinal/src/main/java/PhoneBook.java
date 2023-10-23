import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.Map;

class PhoneBook {
    private static HashMap<String, ArrayList<Integer>> phoneBook = new HashMap<>();

    public void add(String name, Integer phoneNum) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();

        if (phoneBook.containsKey(name)){
            phoneBook.get(name).add(phoneNum);

        }else{
            tmp.add(phoneNum);
            phoneBook.put(name,tmp);
        }
    }

    public ArrayList<Integer> find(String name) {
        ArrayList<Integer> tmp = new ArrayList<Integer>();

        if (phoneBook.containsKey(name)){
            return phoneBook.get(name);
        }else{
            return tmp;
        }

    }


    public void getPhoneBook() {
        phoneBook.entrySet().stream().sorted(new Comparator<Map.Entry<String, ArrayList<Integer>>>() {
            @Override
            public int compare(Map.Entry<String, ArrayList<Integer>> o1, Map.Entry<String, ArrayList<Integer>> o2) {
                return o2.getValue().size() - o1.getValue().size();
            }
        }
        ).forEach(e -> System.out.println(e.getKey() +": " + e.getValue()));

    }
}
