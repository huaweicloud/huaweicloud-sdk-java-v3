package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 保护组故障切换请求体
 */
public class FailoverProtectionGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failover-server-group")

    private Object failoverServerGroup;

    public FailoverProtectionGroupRequestBody withFailoverServerGroup(Object failoverServerGroup) {
        this.failoverServerGroup = failoverServerGroup;
        return this;
    }

    /**
     * 标识保护组故障切换操作。该参数目前默认值为空。
     * @return failoverServerGroup
     */
    public Object getFailoverServerGroup() {
        return failoverServerGroup;
    }

    public void setFailoverServerGroup(Object failoverServerGroup) {
        this.failoverServerGroup = failoverServerGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FailoverProtectionGroupRequestBody that = (FailoverProtectionGroupRequestBody) obj;
        return Objects.equals(this.failoverServerGroup, that.failoverServerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(failoverServerGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FailoverProtectionGroupRequestBody {\n");
        sb.append("    failoverServerGroup: ").append(toIndentedString(failoverServerGroup)).append("\n");
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
