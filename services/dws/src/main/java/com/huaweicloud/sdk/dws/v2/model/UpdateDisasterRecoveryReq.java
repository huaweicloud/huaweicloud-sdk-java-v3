package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 更新容灾配置请求体。 **取值范围**： 不涉及。
 */
public class UpdateDisasterRecoveryReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_sync_period")

    private String drSyncPeriod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_request")

    private Integer sendRequest;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "primary_to_role")

    private String primaryToRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "reset_action")

    private String resetAction;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "standby_to_role")

    private String standbyToRole;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dr_status")

    private String drStatus;

    public UpdateDisasterRecoveryReq withDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
        return this;
    }

    /**
     * **参数解释**： 容灾同步周期。 **取值范围**： 不涉及。
     * @return drSyncPeriod
     */
    public String getDrSyncPeriod() {
        return drSyncPeriod;
    }

    public void setDrSyncPeriod(String drSyncPeriod) {
        this.drSyncPeriod = drSyncPeriod;
    }

    public UpdateDisasterRecoveryReq withSendRequest(Integer sendRequest) {
        this.sendRequest = sendRequest;
        return this;
    }

    /**
     * **参数解释**： 是否发送请求。 **取值范围**： 不涉及。
     * minimum: 0
     * maximum: 1
     * @return sendRequest
     */
    public Integer getSendRequest() {
        return sendRequest;
    }

    public void setSendRequest(Integer sendRequest) {
        this.sendRequest = sendRequest;
    }

    public UpdateDisasterRecoveryReq withPrimaryToRole(String primaryToRole) {
        this.primaryToRole = primaryToRole;
        return this;
    }

    /**
     * **参数解释**： 主集群角色。 **取值范围**： 不涉及。
     * @return primaryToRole
     */
    public String getPrimaryToRole() {
        return primaryToRole;
    }

    public void setPrimaryToRole(String primaryToRole) {
        this.primaryToRole = primaryToRole;
    }

    public UpdateDisasterRecoveryReq withResetAction(String resetAction) {
        this.resetAction = resetAction;
        return this;
    }

    /**
     * **参数解释**： 设置容灾动作。 **取值范围**： 不涉及。
     * @return resetAction
     */
    public String getResetAction() {
        return resetAction;
    }

    public void setResetAction(String resetAction) {
        this.resetAction = resetAction;
    }

    public UpdateDisasterRecoveryReq withStandbyToRole(String standbyToRole) {
        this.standbyToRole = standbyToRole;
        return this;
    }

    /**
     * **参数解释**： 备集群角色。 **取值范围**： 不涉及。
     * @return standbyToRole
     */
    public String getStandbyToRole() {
        return standbyToRole;
    }

    public void setStandbyToRole(String standbyToRole) {
        this.standbyToRole = standbyToRole;
    }

    public UpdateDisasterRecoveryReq withDrStatus(String drStatus) {
        this.drStatus = drStatus;
        return this;
    }

    /**
     * **参数解释**： 容灾状态。 **取值范围**： 不涉及。
     * @return drStatus
     */
    public String getDrStatus() {
        return drStatus;
    }

    public void setDrStatus(String drStatus) {
        this.drStatus = drStatus;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateDisasterRecoveryReq that = (UpdateDisasterRecoveryReq) obj;
        return Objects.equals(this.drSyncPeriod, that.drSyncPeriod)
            && Objects.equals(this.sendRequest, that.sendRequest)
            && Objects.equals(this.primaryToRole, that.primaryToRole)
            && Objects.equals(this.resetAction, that.resetAction)
            && Objects.equals(this.standbyToRole, that.standbyToRole) && Objects.equals(this.drStatus, that.drStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(drSyncPeriod, sendRequest, primaryToRole, resetAction, standbyToRole, drStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDisasterRecoveryReq {\n");
        sb.append("    drSyncPeriod: ").append(toIndentedString(drSyncPeriod)).append("\n");
        sb.append("    sendRequest: ").append(toIndentedString(sendRequest)).append("\n");
        sb.append("    primaryToRole: ").append(toIndentedString(primaryToRole)).append("\n");
        sb.append("    resetAction: ").append(toIndentedString(resetAction)).append("\n");
        sb.append("    standbyToRole: ").append(toIndentedString(standbyToRole)).append("\n");
        sb.append("    drStatus: ").append(toIndentedString(drStatus)).append("\n");
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
