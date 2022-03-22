import java.util.HashMap;
import java.util.Map;

public class PedometerManager {
    private Map<Integer, Integer> data = new HashMap<>();
    private int max = 0;

    public int add(int day, int steps){
        if(day <= 0 || steps < 0){
            return max = -1;
        } else {
            int newValue = data.getOrDefault(day, 0) + steps;
            data.put(day, newValue);
            for (int speed : data.keySet()){
                if (max < newValue) {
                    max = newValue;
                }
            }
            return max + 1 - steps;
        }
    }
}
