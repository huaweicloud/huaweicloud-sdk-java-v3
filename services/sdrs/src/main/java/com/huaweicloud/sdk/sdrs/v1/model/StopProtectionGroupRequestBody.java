package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 保护组停止保护请求体
 */
public class StopProtectionGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stop-server-group")

    private Object stopServerGroup;

    public StopProtectionGroupRequestBody withStopServerGroup(Object stopServerGroup) {
        this.stopServerGroup = stopServerGroup;
        return this;
    }

    /**
     * 标识保护组停止保护操作。该参数目前默认值为空。
     * @return stopServerGroup
     */
    public Object getStopServerGroup() {
        return stopServerGroup;
    }

    public void setStopServerGroup(Object stopServerGroup) {
        this.stopServerGroup = stopServerGroup;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        StopProtectionGroupRequestBody that = (StopProtectionGroupRequestBody) obj;
        return Objects.equals(this.stopServerGroup, that.stopServerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(stopServerGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopProtectionGroupRequestBody {\n");
        sb.append("    stopServerGroup: ").append(toIndentedString(stopServerGroup)).append("\n");
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
