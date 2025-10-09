package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：  开启/关闭查询队列参数体。  **约束限制**：  不涉及。
 */
public class OperateHtapQueryQueueControlReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enable_query_queue_select")

    private String enableQueryQueueSelect;

    public OperateHtapQueryQueueControlReq withEnableQueryQueueSelect(String enableQueryQueueSelect) {
        this.enableQueryQueueSelect = enableQueryQueueSelect;
        return this;
    }

    /**
     * **参数解释**：  查询队列的开关状态。  **约束限制**：  不涉及。  **取值范围**：  - true：表示开启。 - false：表示关闭。  **默认值**：  false。
     * @return enableQueryQueueSelect
     */
    public String getEnableQueryQueueSelect() {
        return enableQueryQueueSelect;
    }

    public void setEnableQueryQueueSelect(String enableQueryQueueSelect) {
        this.enableQueryQueueSelect = enableQueryQueueSelect;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OperateHtapQueryQueueControlReq that = (OperateHtapQueryQueueControlReq) obj;
        return Objects.equals(this.enableQueryQueueSelect, that.enableQueryQueueSelect);
    }

    @Override
    public int hashCode() {
        return Objects.hash(enableQueryQueueSelect);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OperateHtapQueryQueueControlReq {\n");
        sb.append("    enableQueryQueueSelect: ").append(toIndentedString(enableQueryQueueSelect)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /**
     * Convert the given object to string with each line indented by 4 spaces
     * (except the first line).
     */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
