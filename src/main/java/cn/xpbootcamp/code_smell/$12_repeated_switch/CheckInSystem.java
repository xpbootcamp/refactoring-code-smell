package cn.xpbootcamp.code_smell.$12_repeated_switch;

import java.util.HashMap;
import java.util.Map;

public class CheckInSystem {
    private Map<String, String> checkInRecords = new HashMap<>();

    public  boolean checkIn(String fingerprint){
        Employee employee = EmployeeRepository.query(fingerprint);
        int type = employee.getType();
        String record;
        switch (type) {
            case Employee.ENGINEER:
                record = "I am an Engineer, My Name is" + employee.getName();
                break;
            case Employee.SALESMAN:
                record = "I am a Salesman, My Name is" + employee.getName();
                break;
            case Employee.MANAGER:
                record = "I am a Manager, My Name is" + employee.getName();
                break;
            default:
                record = "";
        }
        if (checkInRecords.isEmpty()) {
            return false;
        }
        checkInRecords.put(fingerprint, record);

        return true;
    }
}
