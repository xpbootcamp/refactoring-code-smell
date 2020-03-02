package cn.xpbootcamp.code_smell.$16_temporary_field.unecessary_field;

import lombok.Data;
import java.util.Date;

@Data
public class ProductBatch {
    private String name;
    private String batchId;
    private int batchCountTotal;
    private int batchCountLeft;
    private Date expiredDate;
}
