package smell.$21_alternative_classes_with_different_interfaces;

import java.util.Arrays;
import java.util.List;

public class IPChecker {

    public boolean checkIfIpValid(String ipAddress) {
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
