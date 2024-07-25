package com.huaweicloud.sdk.idmeclassicapi.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * QueryParentDTO
 */
public class QueryParentDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "childId")

    private String childId;

    public QueryParentDTO withChildId(String childId) {
        this.childId = childId;
        return this;
    }

    /**
     * **参数解释：**  子节点实例ID。  **约束限制：**  不涉及。  **取值范围：**  -9223372036854775808到9223372036854775807的整数。  **默认取值：**  不涉及。 
     * @return childId
     */
    public String getChildId() {
        return childId;
    }

    public void setChildId(String childId) {
        this.childId = childId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        QueryParentDTO that = (QueryParentDTO) obj;
        return Objects.equals(this.childId, that.childId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(childId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryParentDTO {\n");
        sb.append("    childId: ").append(toIndentedString(childId)).append("\n");
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
