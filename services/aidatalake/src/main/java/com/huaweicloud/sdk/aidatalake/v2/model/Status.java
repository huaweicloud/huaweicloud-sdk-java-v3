package com.huaweicloud.sdk.aidatalake.v2.model;

import java.util.Objects;

/**
 * **参数解释**：资源状态。 **取值范围**：   - PREPARING：创建中。   - RELEASING：释放中。   - RUNNING：运行中。   - SCALEIN：缩容中。   - SCALEOUT：扩容中。   - FREEZING：冻结中。   - DELETED：已删除。   - DELETING：删除中。   - FAILED：失败。   - ORDER_PAYING：订单支付中。 
 */
public class Status {

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        return true;
    }

    @Override
    public int hashCode() {
        return Objects.hash();
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Status {\n");
        sb.append("}");
        return sb.toString();
    }

}
