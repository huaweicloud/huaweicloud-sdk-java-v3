package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowDeadLockTopologyRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connection_id")

    private String connectionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dead_lock_id")

    private String deadLockId;

    public ShowDeadLockTopologyRequest withConnectionId(String connectionId) {
        this.connectionId = connectionId;
        return this;
    }

    /**
     * 数据库用户ID。用户使用数据库账号与数据库建立的连接ID。
     * @return connectionId
     */
    public String getConnectionId() {
        return connectionId;
    }

    public void setConnectionId(String connectionId) {
        this.connectionId = connectionId;
    }

    public ShowDeadLockTopologyRequest withDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
        return this;
    }

    /**
     * 死锁的ID值
     * @return deadLockId
     */
    public String getDeadLockId() {
        return deadLockId;
    }

    public void setDeadLockId(String deadLockId) {
        this.deadLockId = deadLockId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyRequest that = (ShowDeadLockTopologyRequest) obj;
        return Objects.equals(this.connectionId, that.connectionId) && Objects.equals(this.deadLockId, that.deadLockId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectionId, deadLockId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyRequest {\n");
        sb.append("    connectionId: ").append(toIndentedString(connectionId)).append("\n");
        sb.append("    deadLockId: ").append(toIndentedString(deadLockId)).append("\n");
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
