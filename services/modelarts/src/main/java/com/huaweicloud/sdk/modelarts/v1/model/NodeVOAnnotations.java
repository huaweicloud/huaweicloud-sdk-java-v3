package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 节点annotations
 */
public class NodeVOAnnotations {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "os.modelarts/npu-topology-placement")

    private String osModelartsNpuTopologyPlacement;

    public NodeVOAnnotations withOsModelartsNpuTopologyPlacement(String osModelartsNpuTopologyPlacement) {
        this.osModelartsNpuTopologyPlacement = osModelartsNpuTopologyPlacement;
        return this;
    }

    /**
     * **参数解释**：NPU卡的资源使用拓扑信息，长度为16的二进制编码，右起第一位编码代表卡1。其中，1表示占用，0表示空闲。例如，16卡的机型中卡1和卡15被占用，值为0100000000000001；8卡的机型中卡1和卡7被占用，返回值为0000000001000001。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return osModelartsNpuTopologyPlacement
     */
    public String getOsModelartsNpuTopologyPlacement() {
        return osModelartsNpuTopologyPlacement;
    }

    public void setOsModelartsNpuTopologyPlacement(String osModelartsNpuTopologyPlacement) {
        this.osModelartsNpuTopologyPlacement = osModelartsNpuTopologyPlacement;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeVOAnnotations that = (NodeVOAnnotations) obj;
        return Objects.equals(this.osModelartsNpuTopologyPlacement, that.osModelartsNpuTopologyPlacement);
    }

    @Override
    public int hashCode() {
        return Objects.hash(osModelartsNpuTopologyPlacement);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeVOAnnotations {\n");
        sb.append("    osModelartsNpuTopologyPlacement: ")
            .append(toIndentedString(osModelartsNpuTopologyPlacement))
            .append("\n");
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
