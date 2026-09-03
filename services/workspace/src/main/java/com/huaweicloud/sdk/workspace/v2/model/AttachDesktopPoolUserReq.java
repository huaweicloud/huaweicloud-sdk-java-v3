package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 桌面池绑定用户请求。
 */
public class AttachDesktopPoolUserReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "username")

    private String username;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_name")

    private String domainName;

    public AttachDesktopPoolUserReq withUsername(String username) {
        this.username = username;
        return this;
    }

    /**
     * 用户名。
     * @return username
     */
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public AttachDesktopPoolUserReq withDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }

    /**
     * 域名。
     * @return domainName
     */
    public String getDomainName() {
        return domainName;
    }

    public void setDomainName(String domainName) {
        this.domainName = domainName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AttachDesktopPoolUserReq that = (AttachDesktopPoolUserReq) obj;
        return Objects.equals(this.username, that.username) && Objects.equals(this.domainName, that.domainName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(username, domainName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AttachDesktopPoolUserReq {\n");
        sb.append("    username: ").append(toIndentedString(username)).append("\n");
        sb.append("    domainName: ").append(toIndentedString(domainName)).append("\n");
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
