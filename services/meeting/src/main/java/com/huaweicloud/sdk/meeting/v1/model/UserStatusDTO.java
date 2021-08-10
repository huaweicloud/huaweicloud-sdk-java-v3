package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** 终端状态信息 */
public class UserStatusDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "Number")

    private String number;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "RegStatus")

    private String regStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "CallStatus")

    private String callStatus;

    public UserStatusDTO withNumber(String number) {
        this.number = number;
        return this;
    }

    /** 终端号码
     * 
     * @return number */
    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public UserStatusDTO withRegStatus(String regStatus) {
        this.regStatus = regStatus;
        return this;
    }

    /** 注册状态。 * 1是未注册上 * 0是已注册
     * 
     * @return regStatus */
    public String getRegStatus() {
        return regStatus;
    }

    public void setRegStatus(String regStatus) {
        this.regStatus = regStatus;
    }

    public UserStatusDTO withCallStatus(String callStatus) {
        this.callStatus = callStatus;
        return this;
    }

    /** 呼叫状态。 * 0:未上线 * 1:空闲中 * 2:使用中 * 3:非会议硬终端统一的无效值
     * 
     * @return callStatus */
    public String getCallStatus() {
        return callStatus;
    }

    public void setCallStatus(String callStatus) {
        this.callStatus = callStatus;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserStatusDTO userStatusDTO = (UserStatusDTO) o;
        return Objects.equals(this.number, userStatusDTO.number)
            && Objects.equals(this.regStatus, userStatusDTO.regStatus)
            && Objects.equals(this.callStatus, userStatusDTO.callStatus);
    }

    @Override
    public int hashCode() {
        return Objects.hash(number, regStatus, callStatus);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserStatusDTO {\n");
        sb.append("    number: ").append(toIndentedString(number)).append("\n");
        sb.append("    regStatus: ").append(toIndentedString(regStatus)).append("\n");
        sb.append("    callStatus: ").append(toIndentedString(callStatus)).append("\n");
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
