import java.util.HashMap;

public class Maps {
    public static void main(String[] args) {

        HashMap<String, Integer> empIds = new HashMap<>();

        empIds.put("Sharon", 1);
        empIds.put("Baron", 2);
        empIds.put("Sam", 3);

        System.out.println(empIds); // Order is not restored

        System.out.println("Sam's id is: " + empIds.get("Sam"));

        System.out.println("Is Tony added: " + empIds.containsKey("Tony"));

        System.out.println("Does anyone has the id as 1: " + empIds.containsValue(1));

        empIds.put("Sam", 104);
        System.out.println(empIds); // Sam's id is updated

        // replace

        // putIfAbsent

        // remove


    }
}
