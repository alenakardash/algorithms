import java.lang.reflect.Field;
import java.util.Map;
import java.util.TreeMap;

public class TreeMapDepth {
    public static void main(String[] args) throws NoSuchFieldException, IllegalAccessException {
        Map<Integer, Integer> treeMap = new TreeMap<>();

        for (int i = 0; i < 10; i++) {
            treeMap.put(i, i);
        }

        Object root = getFieldValue(treeMap, "root");

        iterate(root);

        System.out.println("Tree Depth = " + treeDepth(root));
    }

    private static void iterate(Object node) throws NoSuchFieldException, IllegalAccessException {
        if (node == null) {
            return;
        }

        Object leftNode = getFieldValue(node, "left");
        Object rightNode = getFieldValue(node, "right");
        Object key = getFieldValue(node, "key");
        Object value = getFieldValue(node, "value");

        iterate(leftNode);
        System.out.println(key + ": " + value);

        iterate(rightNode);
    }

    private static Object getFieldValue(Object object, String fieldName) throws NoSuchFieldException, IllegalAccessException {
        Field field = object.getClass().getDeclaredField(fieldName);
        field.setAccessible(true);

        return field.get(object);
    }

    private static int treeDepth(Object root) throws NoSuchFieldException, IllegalAccessException {
        if (root == null) {
            return 0;
        }
        int left = treeDepth(getFieldValue(root, "left"));
        int right = treeDepth(getFieldValue(root, "right"));

        return Math.max(left, right) + 1;
    }
}