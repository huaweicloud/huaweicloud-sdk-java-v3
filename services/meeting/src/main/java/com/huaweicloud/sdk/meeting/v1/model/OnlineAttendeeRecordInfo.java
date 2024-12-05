package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 在线与会者信息
 */
public class OnlineAttendeeRecordInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "participant_id")

    private String participantId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "call_number")

    private String callNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "third_account")

    private String thirdAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "account")

    private String account;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_id")

    private String userId;

    public OnlineAttendeeRecordInfo withParticipantId(String participantId) {
        this.participantId = participantId;
        return this;
    }

    /**
     * 与会者标识
     * @return participantId
     */
    public String getParticipantId() {
        return participantId;
    }

    public void setParticipantId(String participantId) {
        this.participantId = participantId;
    }

    public OnlineAttendeeRecordInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 与会者名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public OnlineAttendeeRecordInfo withCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }

    /**
     * 呼叫号码
     * @return callNumber
     */
    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public OnlineAttendeeRecordInfo withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * 会议中的角色，枚举值如下： 1：会议主席 0：普通与会者
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public OnlineAttendeeRecordInfo withThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
        return this;
    }

    /**
     * 开放性场景标识第三方账号信息
     * @return thirdAccount
     */
    public String getThirdAccount() {
        return thirdAccount;
    }

    public void setThirdAccount(String thirdAccount) {
        this.thirdAccount = thirdAccount;
    }

    public OnlineAttendeeRecordInfo withAccount(String account) {
        this.account = account;
        return this;
    }

    /**
     * 用户账号
     * @return account
     */
    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public OnlineAttendeeRecordInfo withUserId(String userId) {
        this.userId = userId;
        return this;
    }

    /**
     * 用户UUID
     * @return userId
     */
    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        OnlineAttendeeRecordInfo that = (OnlineAttendeeRecordInfo) obj;
        return Objects.equals(this.participantId, that.participantId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.callNumber, that.callNumber) && Objects.equals(this.role, that.role)
            && Objects.equals(this.thirdAccount, that.thirdAccount) && Objects.equals(this.account, that.account)
            && Objects.equals(this.userId, that.userId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(participantId, name, callNumber, role, thirdAccount, account, userId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class OnlineAttendeeRecordInfo {\n");
        sb.append("    participantId: ").append(toIndentedString(participantId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    thirdAccount: ").append(toIndentedString(thirdAccount)).append("\n");
        sb.append("    account: ").append(toIndentedString(account)).append("\n");
        sb.append("    userId: ").append(toIndentedString(userId)).append("\n");
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
