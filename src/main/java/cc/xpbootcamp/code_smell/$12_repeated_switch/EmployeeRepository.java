package cc.xpbootcamp.code_smell.$12_repeated_switch;

import java.util.HashMap;
import java.util.Map;

public class EmployeeRepository {
    private static Map<String, Employee> employees = new HashMap<>();

    public static Employee query(String fingerprint) {
        if (!employees.containsKey(fingerprint)) {
            throw new EmployeeNotExistException();
        }
        return employees.get(fingerprint);
    }
}
