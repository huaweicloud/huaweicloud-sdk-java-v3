package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 模式空间信息。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
 */
public class WorkloadSchemaReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "schema_name")

    private String schemaName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "perm_space")

    private String permSpace;

    public WorkloadSchemaReq withSchemaName(String schemaName) {
        this.schemaName = schemaName;
        return this;
    }

    /**
     * **参数解释**： 模式空间名称。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return schemaName
     */
    public String getSchemaName() {
        return schemaName;
    }

    public void setSchemaName(String schemaName) {
        this.schemaName = schemaName;
    }

    public WorkloadSchemaReq withPermSpace(String permSpace) {
        this.permSpace = permSpace;
        return this;
    }

    /**
     * **参数解释**： 模式空间阈值。 **约束限制**： 不涉及。 **取值范围**： 不涉及。 **默认取值**： 不涉及。
     * @return permSpace
     */
    public String getPermSpace() {
        return permSpace;
    }

    public void setPermSpace(String permSpace) {
        this.permSpace = permSpace;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WorkloadSchemaReq that = (WorkloadSchemaReq) obj;
        return Objects.equals(this.schemaName, that.schemaName) && Objects.equals(this.permSpace, that.permSpace);
    }

    @Override
    public int hashCode() {
        return Objects.hash(schemaName, permSpace);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WorkloadSchemaReq {\n");
        sb.append("    schemaName: ").append(toIndentedString(schemaName)).append("\n");
        sb.append("    permSpace: ").append(toIndentedString(permSpace)).append("\n");
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
