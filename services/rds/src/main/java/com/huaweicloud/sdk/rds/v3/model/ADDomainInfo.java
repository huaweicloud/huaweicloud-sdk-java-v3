package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 域信息，加域实例单转主备时必填，非加域实例不需要填写
 */
public class ADDomainInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_admin_account_name")

    private String domainAdminAccountName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_admin_pwd")

    private String domainAdminPwd;

    public ADDomainInfo withDomainAdminAccountName(String domainAdminAccountName) {
        this.domainAdminAccountName = domainAdminAccountName;
        return this;
    }

    /**
     * 域管理员账号名
     * @return domainAdminAccountName
     */
    public String getDomainAdminAccountName() {
        return domainAdminAccountName;
    }

    public void setDomainAdminAccountName(String domainAdminAccountName) {
        this.domainAdminAccountName = domainAdminAccountName;
    }

    public ADDomainInfo withDomainAdminPwd(String domainAdminPwd) {
        this.domainAdminPwd = domainAdminPwd;
        return this;
    }

    /**
     * 域管理员密码
     * @return domainAdminPwd
     */
    public String getDomainAdminPwd() {
        return domainAdminPwd;
    }

    public void setDomainAdminPwd(String domainAdminPwd) {
        this.domainAdminPwd = domainAdminPwd;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ADDomainInfo adDomainInfo = (ADDomainInfo) o;
        return Objects.equals(this.domainAdminAccountName, adDomainInfo.domainAdminAccountName)
            && Objects.equals(this.domainAdminPwd, adDomainInfo.domainAdminPwd);
    }

    @Override
    public int hashCode() {
        return Objects.hash(domainAdminAccountName, domainAdminPwd);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ADDomainInfo {\n");
        sb.append("    domainAdminAccountName: ").append(toIndentedString(domainAdminAccountName)).append("\n");
        sb.append("    domainAdminPwd: ").append(toIndentedString(domainAdminPwd)).append("\n");
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
