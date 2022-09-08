package com.huaweicloud.sdk.meeting.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 部分与会者信息
 */
public class PartAttendee {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone")

    private String phone;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone2")

    private String phone2;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "phone3")

    private String phone3;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "role")

    private Integer role;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isMute")

    private Integer isMute;

    public PartAttendee withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 与会者名称或昵称。长度限制为96个字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public PartAttendee withPhone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * 电话号码(可支持SIP、TEL号码格式)。最大不超过127个字符。 当type为telepresence时，且设备为三屏智真，则该字段填写中屏号码。
     * @return phone
     */
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public PartAttendee withPhone2(String phone2) {
        this.phone2 = phone2;
        return this;
    }

    /**
     * 取值类型同参数phone。（预留字段） 当type为telepresence时，且设备为三屏智真，则该字段填写左屏号码。
     * @return phone2
     */
    public String getPhone2() {
        return phone2;
    }

    public void setPhone2(String phone2) {
        this.phone2 = phone2;
    }

    public PartAttendee withPhone3(String phone3) {
        this.phone3 = phone3;
        return this;
    }

    /**
     * 取值类型同参数phone。（预留字段） 当type为telepresence时，且设备为三屏智真，则该字段填写右屏号码。
     * @return phone3
     */
    public String getPhone3() {
        return phone3;
    }

    public void setPhone3(String phone3) {
        this.phone3 = phone3;
    }

    public PartAttendee withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 默认值由会议AS定义，号码类型枚举如下： - normal: 软终端。 - telepresence: 智真。单屏、三屏智真均属此类。（预留字段） - terminal: 会议室或硬终端。 - outside: 外部与会人。 - mobile: 用户手机号码。 - telephone: 用户固定电话。（预留字段） - ideahub: ideahub。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public PartAttendee withRole(Integer role) {
        this.role = role;
        return this;
    }

    /**
     * 会议中的角色。默认为普通与会者。 - 0：普通与会者。 - 1：会议主持人。
     * @return role
     */
    public Integer getRole() {
        return role;
    }

    public void setRole(Integer role) {
        this.role = role;
    }

    public PartAttendee withIsMute(Integer isMute) {
        this.isMute = isMute;
        return this;
    }

    /**
     * 用户入会时是否需要自动静音。默认不静音。 - 0: 不需要静音。 - 1: 需要静音。
     * @return isMute
     */
    public Integer getIsMute() {
        return isMute;
    }

    public void setIsMute(Integer isMute) {
        this.isMute = isMute;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        PartAttendee partAttendee = (PartAttendee) o;
        return Objects.equals(this.name, partAttendee.name) && Objects.equals(this.phone, partAttendee.phone)
            && Objects.equals(this.phone2, partAttendee.phone2) && Objects.equals(this.phone3, partAttendee.phone3)
            && Objects.equals(this.type, partAttendee.type) && Objects.equals(this.role, partAttendee.role)
            && Objects.equals(this.isMute, partAttendee.isMute);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, phone, phone2, phone3, type, role, isMute);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PartAttendee {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    phone2: ").append(toIndentedString(phone2)).append("\n");
        sb.append("    phone3: ").append(toIndentedString(phone3)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    role: ").append(toIndentedString(role)).append("\n");
        sb.append("    isMute: ").append(toIndentedString(isMute)).append("\n");
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
