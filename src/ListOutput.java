import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;

public class ListOutput {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        List<String> list = new ArrayList<>();

        list.add("Hello!");
        list.add("Learn Java,");
        list.add("do not give up!");

        Field arrayOfStrings = list.getClass().getDeclaredField("elementData");
        arrayOfStrings.setAccessible(true);

        Object[] elements = (Object[]) arrayOfStrings.get(list);

        for (Object value : elements) {
            if (value != null) {
                System.out.println(value);
            }
        }
    }
}
