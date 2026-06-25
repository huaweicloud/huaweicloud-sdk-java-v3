package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowPoolRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-ModelArts-User-ID")

    private String xModelArtsUserID;

    public ShowPoolRequest withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池的ID，取值自资源池详情的metadata.name字段。 **约束限制**：不涉及。 **取值范围**：只能以小写字母开头，数字、中划线组成，不能以中划线结尾，且长度为36-63。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public ShowPoolRequest withXModelArtsUserID(String xModelArtsUserID) {
        this.xModelArtsUserID = xModelArtsUserID;
        return this;
    }

    /**
     * **参数解释**：租户ID，传递该参数鉴权以该租户ID为准。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
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
        ShowPoolRequest that = (ShowPoolRequest) obj;
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
        sb.append("class ShowPoolRequest {\n");
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
