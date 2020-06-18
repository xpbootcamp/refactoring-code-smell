package cn.xpbootcamp.code_smell.$02_duplicated_code.functional_semantics;

import java.util.Arrays;
import java.util.List;

public class IPChecker {

    public boolean checkIP(String ipAddress) {
        if (ipAddress.isEmpty()) {
            return false;
        }
        List<String> ipUnits = Arrays.asList(ipAddress.split("."));
        if (ipUnits.size() != 4) {
            return false;
        }
        for (int i = 0; i < 4; ++i) {
            int ipUnitIntValue;
            try {
                ipUnitIntValue = Integer.parseInt(ipUnits.get(i));
            } catch (NumberFormatException e) {
                return false;
            }
            if (ipUnitIntValue < 0 || ipUnitIntValue > 255) {
                return false;
            }
            if (i == 0 && ipUnitIntValue == 0) {
                return false;
            }
        }
        return true;
    }
}
