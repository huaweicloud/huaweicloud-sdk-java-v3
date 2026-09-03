package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 死锁对象信息
 */
public class DeadLockObject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_id")

    private String processId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "spid")

    private String spid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "lock_mode")

    private String lockMode;

    public DeadLockObject withProcessId(String processId) {
        this.processId = processId;
        return this;
    }

    /**
     * 会话ID
     * @return processId
     */
    public String getProcessId() {
        return processId;
    }

    public void setProcessId(String processId) {
        this.processId = processId;
    }

    public DeadLockObject withSpid(String spid) {
        this.spid = spid;
        return this;
    }

    /**
     * 服务进程ID
     * @return spid
     */
    public String getSpid() {
        return spid;
    }

    public void setSpid(String spid) {
        this.spid = spid;
    }

    public DeadLockObject withLockMode(String lockMode) {
        this.lockMode = lockMode;
        return this;
    }

    /**
     * 锁模式
     * @return lockMode
     */
    public String getLockMode() {
        return lockMode;
    }

    public void setLockMode(String lockMode) {
        this.lockMode = lockMode;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeadLockObject that = (DeadLockObject) obj;
        return Objects.equals(this.processId, that.processId) && Objects.equals(this.spid, that.spid)
            && Objects.equals(this.lockMode, that.lockMode);
    }

    @Override
    public int hashCode() {
        return Objects.hash(processId, spid, lockMode);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeadLockObject {\n");
        sb.append("    processId: ").append(toIndentedString(processId)).append("\n");
        sb.append("    spid: ").append(toIndentedString(spid)).append("\n");
        sb.append("    lockMode: ").append(toIndentedString(lockMode)).append("\n");
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
