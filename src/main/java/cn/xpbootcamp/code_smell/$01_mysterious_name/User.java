package cn.xpbootcamp.code_smell.$01_mysterious_name;

public class User {

    String ad; // 地址
    String sex; // 性别

    int vehiclesCount; //车数量
    String[] CarNumber; //车牌号

    String friendList =  "<ul><li>aaa</li><li>bbb</li></ul>"; // 朋友视图列表
    User[] friendsList; // 朋友列表

    public void setAd(String param1) {
        this.ad = param1;
    }
}
