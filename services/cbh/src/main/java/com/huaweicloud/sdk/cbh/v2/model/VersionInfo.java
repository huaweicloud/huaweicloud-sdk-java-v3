package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 服务实例支持功能版本信息。
 */
public class VersionInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "require_eip")

    private String requireEip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "iam_login")

    private String iamLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_login")

    private String adminLogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "float_ipv6")

    private String floatIpv6;

    public VersionInfo withRequireEip(String requireEip) {
        this.requireEip = requireEip;
        return this;
    }

    /**
     * 支持EIP的实例版本。
     * @return requireEip
     */
    public String getRequireEip() {
        return requireEip;
    }

    public void setRequireEip(String requireEip) {
        this.requireEip = requireEip;
    }

    public VersionInfo withIamLogin(String iamLogin) {
        this.iamLogin = iamLogin;
        return this;
    }

    /**
     * 支持IAM登录的实例版本。
     * @return iamLogin
     */
    public String getIamLogin() {
        return iamLogin;
    }

    public void setIamLogin(String iamLogin) {
        this.iamLogin = iamLogin;
    }

    public VersionInfo withAdminLogin(String adminLogin) {
        this.adminLogin = adminLogin;
        return this;
    }

    /**
     * 支持管理员登录的实例版本。
     * @return adminLogin
     */
    public String getAdminLogin() {
        return adminLogin;
    }

    public void setAdminLogin(String adminLogin) {
        this.adminLogin = adminLogin;
    }

    public VersionInfo withFloatIpv6(String floatIpv6) {
        this.floatIpv6 = floatIpv6;
        return this;
    }

    /**
     * 支持浮动IPv6的实例版本。
     * @return floatIpv6
     */
    public String getFloatIpv6() {
        return floatIpv6;
    }

    public void setFloatIpv6(String floatIpv6) {
        this.floatIpv6 = floatIpv6;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        VersionInfo that = (VersionInfo) obj;
        return Objects.equals(this.requireEip, that.requireEip) && Objects.equals(this.iamLogin, that.iamLogin)
            && Objects.equals(this.adminLogin, that.adminLogin) && Objects.equals(this.floatIpv6, that.floatIpv6);
    }

    @Override
    public int hashCode() {
        return Objects.hash(requireEip, iamLogin, adminLogin, floatIpv6);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class VersionInfo {\n");
        sb.append("    requireEip: ").append(toIndentedString(requireEip)).append("\n");
        sb.append("    iamLogin: ").append(toIndentedString(iamLogin)).append("\n");
        sb.append("    adminLogin: ").append(toIndentedString(adminLogin)).append("\n");
        sb.append("    floatIpv6: ").append(toIndentedString(floatIpv6)).append("\n");
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
