package com.huaweicloud.sdk.cc.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 连接点的实例的父资源ID。
 */
public class ConnectionPointParentInstanceId {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_instance_id")

    private String parentInstanceId;

    public ConnectionPointParentInstanceId withParentInstanceId(String parentInstanceId) {
        this.parentInstanceId = parentInstanceId;
        return this;
    }

    /**
     * 连接点的实例的父资源ID。
     * @return parentInstanceId
     */
    public String getParentInstanceId() {
        return parentInstanceId;
    }

    public void setParentInstanceId(String parentInstanceId) {
        this.parentInstanceId = parentInstanceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ConnectionPointParentInstanceId that = (ConnectionPointParentInstanceId) obj;
        return Objects.equals(this.parentInstanceId, that.parentInstanceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(parentInstanceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConnectionPointParentInstanceId {\n");
        sb.append("    parentInstanceId: ").append(toIndentedString(parentInstanceId)).append("\n");
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
