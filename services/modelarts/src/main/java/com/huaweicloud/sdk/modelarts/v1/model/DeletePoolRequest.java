package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeletePoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-ModelArts-User-ID")

    private String xModelArtsUserID;

    public DeletePoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：系统生成的资源池名称。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public DeletePoolRequest withXModelArtsUserID(String xModelArtsUserID) {
        this.xModelArtsUserID = xModelArtsUserID;
        return this;
    }

    /**
     * **参数解释**：实际的外部租户ID，如果有的话，工作空间鉴权以该ID为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return xModelArtsUserID
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-ModelArts-User-ID")
    public String getXModelArtsUserID() {
        return xModelArtsUserID;
    }

    public void setXModelArtsUserID(String xModelArtsUserID) {
        this.xModelArtsUserID = xModelArtsUserID;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeletePoolRequest that = (DeletePoolRequest) obj;
        return Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.xModelArtsUserID, that.xModelArtsUserID);
    }

    @Override
    public int hashCode() {
        return Objects.hash(poolName, xModelArtsUserID);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeletePoolRequest {\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    xModelArtsUserID: ").append(toIndentedString(xModelArtsUserID)).append("\n");
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
