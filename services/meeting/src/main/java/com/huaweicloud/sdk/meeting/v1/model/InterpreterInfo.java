package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 传译员信息
 */
public class InterpreterInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "loginAccount")

    private String loginAccount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userID")

    private String userID;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "callNumber")

    private String callNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interpreterId")

    private String interpreterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "interpreterType")

    private String interpreterType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aiDigitalInfo")

    private InterpreterAiDigitalInfo aiDigitalInfo;

    public InterpreterInfo withLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
        return this;
    }

    /**
     * 用户登录账号，可以是账号、手机、邮箱其中一个,loginAccount和userID必须二选一。
     * @return loginAccount
     */
    public String getLoginAccount() {
        return loginAccount;
    }

    public void setLoginAccount(String loginAccount) {
        this.loginAccount = loginAccount;
    }

    public InterpreterInfo withUserID(String userID) {
        this.userID = userID;
        return this;
    }

    /**
     * 用户的userUUID。
     * @return userID
     */
    public String getUserID() {
        return userID;
    }

    public void setUserID(String userID) {
        this.userID = userID;
    }

    public InterpreterInfo withCallNumber(String callNumber) {
        this.callNumber = callNumber;
        return this;
    }

    /**
     * 呼叫号码。
     * @return callNumber
     */
    public String getCallNumber() {
        return callNumber;
    }

    public void setCallNumber(String callNumber) {
        this.callNumber = callNumber;
    }

    public InterpreterInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 用户名。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public InterpreterInfo withInterpreterId(String interpreterId) {
        this.interpreterId = interpreterId;
        return this;
    }

    /**
     * 传译员序号，AI传译组下传译员唯一标识。
     * @return interpreterId
     */
    public String getInterpreterId() {
        return interpreterId;
    }

    public void setInterpreterId(String interpreterId) {
        this.interpreterId = interpreterId;
    }

    public InterpreterInfo withInterpreterType(String interpreterType) {
        this.interpreterType = interpreterType;
        return this;
    }

    /**
     * 传译员类型，MANUAL：人工传译，AI：AI传译。默认MANUAL。
     * @return interpreterType
     */
    public String getInterpreterType() {
        return interpreterType;
    }

    public void setInterpreterType(String interpreterType) {
        this.interpreterType = interpreterType;
    }

    public InterpreterInfo withAiDigitalInfo(InterpreterAiDigitalInfo aiDigitalInfo) {
        this.aiDigitalInfo = aiDigitalInfo;
        return this;
    }

    public InterpreterInfo withAiDigitalInfo(Consumer<InterpreterAiDigitalInfo> aiDigitalInfoSetter) {
        if (this.aiDigitalInfo == null) {
            this.aiDigitalInfo = new InterpreterAiDigitalInfo();
            aiDigitalInfoSetter.accept(this.aiDigitalInfo);
        }

        return this;
    }

    /**
     * Get aiDigitalInfo
     * @return aiDigitalInfo
     */
    public InterpreterAiDigitalInfo getAiDigitalInfo() {
        return aiDigitalInfo;
    }

    public void setAiDigitalInfo(InterpreterAiDigitalInfo aiDigitalInfo) {
        this.aiDigitalInfo = aiDigitalInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InterpreterInfo that = (InterpreterInfo) obj;
        return Objects.equals(this.loginAccount, that.loginAccount) && Objects.equals(this.userID, that.userID)
            && Objects.equals(this.callNumber, that.callNumber) && Objects.equals(this.name, that.name)
            && Objects.equals(this.interpreterId, that.interpreterId)
            && Objects.equals(this.interpreterType, that.interpreterType)
            && Objects.equals(this.aiDigitalInfo, that.aiDigitalInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loginAccount, userID, callNumber, name, interpreterId, interpreterType, aiDigitalInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InterpreterInfo {\n");
        sb.append("    loginAccount: ").append(toIndentedString(loginAccount)).append("\n");
        sb.append("    userID: ").append(toIndentedString(userID)).append("\n");
        sb.append("    callNumber: ").append(toIndentedString(callNumber)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    interpreterId: ").append(toIndentedString(interpreterId)).append("\n");
        sb.append("    interpreterType: ").append(toIndentedString(interpreterType)).append("\n");
        sb.append("    aiDigitalInfo: ").append(toIndentedString(aiDigitalInfo)).append("\n");
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
