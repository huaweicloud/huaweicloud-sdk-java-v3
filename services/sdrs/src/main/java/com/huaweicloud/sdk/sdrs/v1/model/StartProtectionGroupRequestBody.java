package com.huaweicloud.sdk.sdrs.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 开启保护/重保护请求体 */
public class StartProtectionGroupRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start-server-group")

    private Object startServerGroup;

    public StartProtectionGroupRequestBody withStartServerGroup(Object startServerGroup) {
        this.startServerGroup = startServerGroup;
        return this;
    }

    /** 标识保护组开始保护操作。目前该参数为空。
     * 
     * @return startServerGroup */
    public Object getStartServerGroup() {
        return startServerGroup;
    }

    public void setStartServerGroup(Object startServerGroup) {
        this.startServerGroup = startServerGroup;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        StartProtectionGroupRequestBody startProtectionGroupRequestBody = (StartProtectionGroupRequestBody) o;
        return Objects.equals(this.startServerGroup, startProtectionGroupRequestBody.startServerGroup);
    }

    @Override
    public int hashCode() {
        return Objects.hash(startServerGroup);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StartProtectionGroupRequestBody {\n");
        sb.append("    startServerGroup: ").append(toIndentedString(startServerGroup)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
