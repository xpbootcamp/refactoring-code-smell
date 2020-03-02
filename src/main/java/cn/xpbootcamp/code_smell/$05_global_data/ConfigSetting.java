package cn.xpbootcamp.code_smell.$05_global_data;

import java.util.Calendar;

public class ConfigSetting {
    public void UpdateConfig(String config) {
        Application.count++;
        Application.config = config.substring(0, 8);
        // update other config
    }

    public void UpdateSettings(String adminSetting) {
        Application.count++;
        Application.config = adminSetting.substring(4, 8) + Calendar.getInstance().get(Calendar.YEAR);
        // update other setting
    }

    public void clearSettings() {
        Application.count = 0;
        Application.config = "zh/cn/2020";;
        // set other settings
    }
}
