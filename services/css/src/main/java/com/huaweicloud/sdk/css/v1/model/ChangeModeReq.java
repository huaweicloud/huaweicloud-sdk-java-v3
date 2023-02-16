package com.huaweicloud.sdk.css.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ChangeModeReq
 */
public class ChangeModeReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "authorityEnable")

    private Boolean authorityEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "adminPwd")

    private String adminPwd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpsEnable")

    private Boolean httpsEnable;

    public ChangeModeReq withAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
        return this;
    }

    /**
     * 是否开启安全模式。 - true: 开启安全模式。 - false: 关闭安全模式。 默认为：true。
     * @return authorityEnable
     */
    public Boolean getAuthorityEnable() {
        return authorityEnable;
    }

    public void setAuthorityEnable(Boolean authorityEnable) {
        this.authorityEnable = authorityEnable;
    }

    public ChangeModeReq withAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
        return this;
    }

    /**
     * 安全模式下集群密码。
     * @return adminPwd
     */
    public String getAdminPwd() {
        return adminPwd;
    }

    public void setAdminPwd(String adminPwd) {
        this.adminPwd = adminPwd;
    }

    public ChangeModeReq withHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
        return this;
    }

    /**
     * 是否开启HTTPS。 - true: 开启HTTPS。 - false: 关闭HTTPS。 默认为：true。
     * @return httpsEnable
     */
    public Boolean getHttpsEnable() {
        return httpsEnable;
    }

    public void setHttpsEnable(Boolean httpsEnable) {
        this.httpsEnable = httpsEnable;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeModeReq changeModeReq = (ChangeModeReq) o;
        return Objects.equals(this.authorityEnable, changeModeReq.authorityEnable)
            && Objects.equals(this.adminPwd, changeModeReq.adminPwd)
            && Objects.equals(this.httpsEnable, changeModeReq.httpsEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authorityEnable, adminPwd, httpsEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeModeReq {\n");
        sb.append("    authorityEnable: ").append(toIndentedString(authorityEnable)).append("\n");
        sb.append("    adminPwd: ").append(toIndentedString(adminPwd)).append("\n");
        sb.append("    httpsEnable: ").append(toIndentedString(httpsEnable)).append("\n");
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
