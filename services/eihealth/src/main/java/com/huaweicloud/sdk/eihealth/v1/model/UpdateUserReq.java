package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 修改用户基本信息
 */
public class UpdateUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areacode")

    private String areacode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ticket")

    private String ticket;

    public UpdateUserReq withMobile(String mobile) {
        this.mobile = mobile;
        return this;
    }

    /**
     * 用户手机号，纯数字，长度小于等于32位。必须与国家码同时存在。
     * @return mobile
     */
    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public UpdateUserReq withAreacode(String areacode) {
        this.areacode = areacode;
        return this;
    }

    /**
     * 国家码。中国大陆为“0086”
     * @return areacode
     */
    public String getAreacode() {
        return areacode;
    }

    public void setAreacode(String areacode) {
        this.areacode = areacode;
    }

    public UpdateUserReq withEmail(String email) {
        this.email = email;
        return this;
    }

    /**
     * 用户邮箱，需符合邮箱格式
     * @return email
     */
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public UpdateUserReq withTicket(String ticket) {
        this.ticket = ticket;
        return this;
    }

    /**
     * 预验证凭证
     * @return ticket
     */
    public String getTicket() {
        return ticket;
    }

    public void setTicket(String ticket) {
        this.ticket = ticket;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserReq updateUserReq = (UpdateUserReq) o;
        return Objects.equals(this.mobile, updateUserReq.mobile)
            && Objects.equals(this.areacode, updateUserReq.areacode) && Objects.equals(this.email, updateUserReq.email)
            && Objects.equals(this.ticket, updateUserReq.ticket);
    }

    @Override
    public int hashCode() {
        return Objects.hash(mobile, areacode, email, ticket);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserReq {\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    ticket: ").append(toIndentedString(ticket)).append("\n");
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
