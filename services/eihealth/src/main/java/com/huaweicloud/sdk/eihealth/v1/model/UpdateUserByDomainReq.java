package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 最终租户修改子用户安全信息
 */
public class UpdateUserByDomainReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "password")

    private String password;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "mobile")

    private String mobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "areacode")

    private String areacode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "email")

    private String email;

    public UpdateUserByDomainReq withPassword(String password) {
        this.password = password;
        return this;
    }

    /**
     * 新密码，在8-32位之间支持用户自定义密码长度，至少包含以下四种字符中的三种： 大写字母、小写字母、数字和特殊字符。
     * @return password
     */
    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UpdateUserByDomainReq withMobile(String mobile) {
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

    public UpdateUserByDomainReq withAreacode(String areacode) {
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

    public UpdateUserByDomainReq withEmail(String email) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateUserByDomainReq updateUserByDomainReq = (UpdateUserByDomainReq) o;
        return Objects.equals(this.password, updateUserByDomainReq.password)
            && Objects.equals(this.mobile, updateUserByDomainReq.mobile)
            && Objects.equals(this.areacode, updateUserByDomainReq.areacode)
            && Objects.equals(this.email, updateUserByDomainReq.email);
    }

    @Override
    public int hashCode() {
        return Objects.hash(password, mobile, areacode, email);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateUserByDomainReq {\n");
        sb.append("    password: ").append(toIndentedString(password)).append("\n");
        sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
        sb.append("    areacode: ").append(toIndentedString(areacode)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
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
