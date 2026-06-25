package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * BindNodeItem
 */
public class BindNodeItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "quotaName")

    private String quotaName;

    public BindNodeItem withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：换绑的节点的名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BindNodeItem withQuotaName(String quotaName) {
        this.quotaName = quotaName;
        return this;
    }

    /**
     * **参数解释**：节点绑定的逻辑子池的ID。值为空则节点不绑定任何逻辑子池。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return quotaName
     */
    public String getQuotaName() {
        return quotaName;
    }

    public void setQuotaName(String quotaName) {
        this.quotaName = quotaName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BindNodeItem that = (BindNodeItem) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.quotaName, that.quotaName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, quotaName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BindNodeItem {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    quotaName: ").append(toIndentedString(quotaName)).append("\n");
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
