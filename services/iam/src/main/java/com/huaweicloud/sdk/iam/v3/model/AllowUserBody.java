package com.huaweicloud.sdk.iam.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;

import java.util.Objects;

/**
 * 用户可以自主修改的属性。
 */
public class AllowUserBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_accesskey")

    @JacksonXmlProperty(localName = "manage_accesskey")

    private Boolean manageAccesskey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_email")

    @JacksonXmlProperty(localName = "manage_email")

    private Boolean manageEmail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_mobile")

    @JacksonXmlProperty(localName = "manage_mobile")

    private Boolean manageMobile;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manage_password")

    @JacksonXmlProperty(localName = "manage_password")

    private Boolean managePassword;

    public AllowUserBody withManageAccesskey(Boolean manageAccesskey) {
        this.manageAccesskey = manageAccesskey;
        return this;
    }

    /**
     * 是否允许子用户自行管理AK，取值范围true或false。
     * @return manageAccesskey
     */
    public Boolean getManageAccesskey() {
        return manageAccesskey;
    }

    public void setManageAccesskey(Boolean manageAccesskey) {
        this.manageAccesskey = manageAccesskey;
    }

    public AllowUserBody withManageEmail(Boolean manageEmail) {
        this.manageEmail = manageEmail;
        return this;
    }

    /**
     * 是否允许子用户自己修改邮箱，取值范围true或false。
     * @return manageEmail
     */
    public Boolean getManageEmail() {
        return manageEmail;
    }

    public void setManageEmail(Boolean manageEmail) {
        this.manageEmail = manageEmail;
    }

    public AllowUserBody withManageMobile(Boolean manageMobile) {
        this.manageMobile = manageMobile;
        return this;
    }

    /**
     * 是否允许子用户自己修改电话，取值范围true或false。
     * @return manageMobile
     */
    public Boolean getManageMobile() {
        return manageMobile;
    }

    public void setManageMobile(Boolean manageMobile) {
        this.manageMobile = manageMobile;
    }

    public AllowUserBody withManagePassword(Boolean managePassword) {
        this.managePassword = managePassword;
        return this;
    }

    /**
     * 是否允许子用户自己修改密码，取值范围true或false。
     * @return managePassword
     */
    public Boolean getManagePassword() {
        return managePassword;
    }

    public void setManagePassword(Boolean managePassword) {
        this.managePassword = managePassword;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AllowUserBody allowUserBody = (AllowUserBody) o;
        return Objects.equals(this.manageAccesskey, allowUserBody.manageAccesskey)
            && Objects.equals(this.manageEmail, allowUserBody.manageEmail)
            && Objects.equals(this.manageMobile, allowUserBody.manageMobile)
            && Objects.equals(this.managePassword, allowUserBody.managePassword);
    }

    @Override
    public int hashCode() {
        return Objects.hash(manageAccesskey, manageEmail, manageMobile, managePassword);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AllowUserBody {\n");
        sb.append("    manageAccesskey: ").append(toIndentedString(manageAccesskey)).append("\n");
        sb.append("    manageEmail: ").append(toIndentedString(manageEmail)).append("\n");
        sb.append("    manageMobile: ").append(toIndentedString(manageMobile)).append("\n");
        sb.append("    managePassword: ").append(toIndentedString(managePassword)).append("\n");
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
