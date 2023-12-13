import java.util.*;

public class Main {
    public static void main(String[] args) {

        List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
        List<String> msg = new ArrayList<>(List.of("word","java","word","java"));
        List<String> msg2 = new ArrayList<>(List.of("один", "два","два", "три", "три", "три"));
        task1(nums);
        task2(nums);
        task3(msg);
        task4(msg2);


    }

    public static void task1(List<Integer> nums){
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 != 0){
                System.out.println(nums.get(i));
            }
        }
        System.out.println("_______________________");
    }

    public static void task2(List<Integer> nums){
        Set<Integer> set = new HashSet<>(nums);
        nums.clear();
        nums.addAll(set);
        for (int i = 0; i < nums.size(); i++) {
            if(nums.get(i) % 2 != 0){
                System.out.println(nums.get(i));
            }
        }
        System.out.println("_______________________");
    }
    public static void task3(List<String> nums){
        Set<String> set = new HashSet<>(nums);
        nums.clear();
        nums.addAll(set);
        for (int i = 0; i < nums.size(); i++) {
            System.out.println(nums.get(i));
        }
        System.out.println("_______________________");
    }

    public static void task4(List<String> nums){
        Set<String> unique = new HashSet<String>(nums); // в конструктор кладем наш список
        for (String key : unique) {
            System.out.println(key + ":" + Collections.frequency(nums, key));
        }
    }


}
