package com.huaweicloud.sdk.das.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ShowDeadLockTopologyGraphRespConflictGroups
 */
public class ShowDeadLockTopologyGraphRespConflictGroups {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "waiting_lock_id")

    private String waitingLockId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "granted_lock_id")

    private String grantedLockId;

    public ShowDeadLockTopologyGraphRespConflictGroups withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 冲突组唯一标识
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowDeadLockTopologyGraphRespConflictGroups withWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
        return this;
    }

    /**
     * 等待锁节点唯一标识
     * @return waitingLockId
     */
    public String getWaitingLockId() {
        return waitingLockId;
    }

    public void setWaitingLockId(String waitingLockId) {
        this.waitingLockId = waitingLockId;
    }

    public ShowDeadLockTopologyGraphRespConflictGroups withGrantedLockId(String grantedLockId) {
        this.grantedLockId = grantedLockId;
        return this;
    }

    /**
     * 持有锁节点唯一标识
     * @return grantedLockId
     */
    public String getGrantedLockId() {
        return grantedLockId;
    }

    public void setGrantedLockId(String grantedLockId) {
        this.grantedLockId = grantedLockId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowDeadLockTopologyGraphRespConflictGroups that = (ShowDeadLockTopologyGraphRespConflictGroups) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.waitingLockId, that.waitingLockId)
            && Objects.equals(this.grantedLockId, that.grantedLockId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, waitingLockId, grantedLockId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDeadLockTopologyGraphRespConflictGroups {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    waitingLockId: ").append(toIndentedString(waitingLockId)).append("\n");
        sb.append("    grantedLockId: ").append(toIndentedString(grantedLockId)).append("\n");
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
