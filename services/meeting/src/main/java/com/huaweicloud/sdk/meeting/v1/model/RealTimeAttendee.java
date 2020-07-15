package com.huaweicloud.sdk.meeting.v1.model;




import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * 与会者信息
 */
public class RealTimeAttendee  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="accountID")
    
    private String accountID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="userUUID")
    
    private String userUUID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="name")
    
    private String name;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phone")
    
    private String phone;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phoneLeft")
    
    private String phoneLeft;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="phoneRight")
    
    private String phoneRight;

    public RealTimeAttendee withAccountID(String accountID) {
        this.accountID = accountID;
        return this;
    }

    


    /**
     * 与会者帐号。
     * @return accountID
     */
    public String getAccountID() {
        return accountID;
    }

    public void setAccountID(String accountID) {
        this.accountID = accountID;
    }

    public RealTimeAttendee withUserUUID(String userUUID) {
        this.userUUID = userUUID;
        return this;
    }

    


    /**
     * 与会者的用户UUID。
     * @return userUUID
     */
    public String getUserUUID() {
        return userUUID;
    }

    public void setUserUUID(String userUUID) {
        this.userUUID = userUUID;
    }

    public RealTimeAttendee withName(String name) {
        this.name = name;
        return this;
    }

    


    /**
     * 与会者名称或昵称，长度限制为96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public RealTimeAttendee withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    


    /**
     * 与会者设备的注册号码（可支持SIP、TEL号码格式）。最大不超过127个字符。 设备为三屏智真时的中屏号码。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public RealTimeAttendee withPhoneLeft(String phoneLeft) {
        this.phoneLeft = phoneLeft;
        return this;
    }

    


    /**
     * 设备为三屏智真时的左屏号码（预留）。
     * @return phoneLeft
     */
    public String getPhoneLeft() {
        return phoneLeft;
    }

    public void setPhoneLeft(String phoneLeft) {
        this.phoneLeft = phoneLeft;
    }

    public RealTimeAttendee withPhoneRight(String phoneRight) {
        this.phoneRight = phoneRight;
        return this;
    }

    


    /**
     * 设备为三屏智真时的右屏号码（预留）。
     * @return phoneRight
     */
    public String getPhoneRight() {
        return phoneRight;
    }

    public void setPhoneRight(String phoneRight) {
        this.phoneRight = phoneRight;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        RealTimeAttendee realTimeAttendee = (RealTimeAttendee) o;
        return Objects.equals(this.accountID, realTimeAttendee.accountID) &&
            Objects.equals(this.userUUID, realTimeAttendee.userUUID) &&
            Objects.equals(this.name, realTimeAttendee.name) &&
            Objects.equals(this.phone, realTimeAttendee.phone) &&
            Objects.equals(this.phoneLeft, realTimeAttendee.phoneLeft) &&
            Objects.equals(this.phoneRight, realTimeAttendee.phoneRight);
    }
    @Override
    public int hashCode() {
        return Objects.hash(accountID, userUUID, name, phone, phoneLeft, phoneRight);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RealTimeAttendee {\n");
        sb.append("    accountID: ").append(toIndentedString(accountID)).append("\n");
        sb.append("    userUUID: ").append(toIndentedString(userUUID)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phoneLeft: ").append(toIndentedString(phoneLeft)).append("\n");
        sb.append("    phoneRight: ").append(toIndentedString(phoneRight)).append("\n");
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

