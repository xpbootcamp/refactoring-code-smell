package cc.xpbootcamp.code_smell.$11_primitive_obsession;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class DeliveryManager {
    private String toAddress;
    private String fromAddress;

    public DeliverCenter allocateTo(){
        if (getProvince(toAddress).equals(getProvince(fromAddress))) {
            return DeliverCenter.LOCAL;
        }
        if (getProvince(toAddress).equals("湖北") && getCity(toAddress).equals("武汉")){
            System.out.println("因疫情原因站点暂无法派送");
            return DeliverCenter.LOCAL;
        }
        return DeliverCenter.FOREIGN;
    }

    private String getCity(String address) {
        return address.substring(address.indexOf("省") + 1, address.indexOf("市"));
    }

    private String getProvince(String address) {
        return address.substring(0, address.indexOf("省"));
    }
}
