import java.lang.reflect.Field;
import java.util.HashMap;
import java.util.Map;

public class HashMapOutput {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < 100; i++) {
            map.put(i, i);
        }

        Field tableField = map.getClass().getDeclaredField("table");
        tableField.setAccessible(true);

        Object[] tableArray = (Object[]) tableField.get(map);

        for (Object obj : tableArray) {
            if (obj != null) {
                System.out.println(obj);
            }
        }
    }
}
