package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 集群容灾进度详情。 **取值范围**： 不涉及。
 */
public class ClusterRecoveryProgress {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "key")

    private String key;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_type")

    private String actionType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "unrestore_keys")

    private String unrestoreKeys;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_start_time")

    private String actionStartTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "action_end_time")

    private String actionEndTime;

    public ClusterRecoveryProgress withKey(String key) {
        this.key = key;
        return this;
    }

    /**
     * **参数解释**： 本次备份恢复ID。 **取值范围**： 不涉及。
     * @return key
     */
    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public ClusterRecoveryProgress withActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }

    /**
     * **参数解释**： - Backup，备份。 - Restore，恢复。 **取值范围**： 不涉及。
     * @return actionType
     */
    public String getActionType() {
        return actionType;
    }

    public void setActionType(String actionType) {
        this.actionType = actionType;
    }

    public ClusterRecoveryProgress withUnrestoreKeys(String unrestoreKeys) {
        this.unrestoreKeys = unrestoreKeys;
        return this;
    }

    /**
     * **参数解释**： 待恢复的备份集ID。 **取值范围**： 不涉及。
     * @return unrestoreKeys
     */
    public String getUnrestoreKeys() {
        return unrestoreKeys;
    }

    public void setUnrestoreKeys(String unrestoreKeys) {
        this.unrestoreKeys = unrestoreKeys;
    }

    public ClusterRecoveryProgress withActionStartTime(String actionStartTime) {
        this.actionStartTime = actionStartTime;
        return this;
    }

    /**
     * **参数解释**： 当前动作开始时间。 **取值范围**： 不涉及。
     * @return actionStartTime
     */
    public String getActionStartTime() {
        return actionStartTime;
    }

    public void setActionStartTime(String actionStartTime) {
        this.actionStartTime = actionStartTime;
    }

    public ClusterRecoveryProgress withActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
        return this;
    }

    /**
     * **参数解释**： 当前动作结束时间。 **取值范围**： 不涉及。
     * @return actionEndTime
     */
    public String getActionEndTime() {
        return actionEndTime;
    }

    public void setActionEndTime(String actionEndTime) {
        this.actionEndTime = actionEndTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ClusterRecoveryProgress that = (ClusterRecoveryProgress) obj;
        return Objects.equals(this.key, that.key) && Objects.equals(this.actionType, that.actionType)
            && Objects.equals(this.unrestoreKeys, that.unrestoreKeys)
            && Objects.equals(this.actionStartTime, that.actionStartTime)
            && Objects.equals(this.actionEndTime, that.actionEndTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(key, actionType, unrestoreKeys, actionStartTime, actionEndTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ClusterRecoveryProgress {\n");
        sb.append("    key: ").append(toIndentedString(key)).append("\n");
        sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
        sb.append("    unrestoreKeys: ").append(toIndentedString(unrestoreKeys)).append("\n");
        sb.append("    actionStartTime: ").append(toIndentedString(actionStartTime)).append("\n");
        sb.append("    actionEndTime: ").append(toIndentedString(actionEndTime)).append("\n");
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
