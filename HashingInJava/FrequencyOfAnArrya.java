package HashingInJava;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FrequencyOfAnArrya {
    public static void main(String[] args) {
        int[] nums = {1,2,2,3,1,4,4,4};
        List<List<Integer>> result = FrequencyCounter.countFrequencies(nums);
        System.out.println(result);
    }
}

/*
class Solution{
    public List<List<Integer>> countFrequencies(int[] nums) {
        HashMap<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        List<List<Integer>> result = new java.util.ArrayList<>();
        for (HashMap.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            List<Integer> pair = new java.util.ArrayList<>();
            pair.add(entry.getKey());
            pair.add(entry.getValue());
            result.add(pair);
        }
        return result;
    }
}
*/

class FrequencyCounter {
    public static List<List<Integer>> countFrequencies(int[] nums) {
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        List<List<Integer>> result = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            result.add(List.of(entry.getKey(), entry.getValue()));
        }
        return result;
    }
}

