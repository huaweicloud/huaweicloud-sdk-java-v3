package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ModifyNodePriorityRequestBody
 */
public class ModifyNodePriorityRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private String priority;

    public ModifyNodePriorityRequestBody withPriority(String priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 故障倒换优先级。  故障倒换优先级的取值范围为1~16以及-1。取正数时数字越小，优先级越大，即故障倒换时，主节点会优先倒换到优先级高的只读节点上，优先级相同的只读节点选为主节点的概率相同。取-1时表示节点不参与故障倒换，当单可用区实例超过两个只读节点，或者多可用区实例修改后的可用区多于1个时可以设置成-1。 
     * @return priority
     */
    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModifyNodePriorityRequestBody that = (ModifyNodePriorityRequestBody) obj;
        return Objects.equals(this.priority, that.priority);
    }

    @Override
    public int hashCode() {
        return Objects.hash(priority);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModifyNodePriorityRequestBody {\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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
