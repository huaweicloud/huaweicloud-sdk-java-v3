package com.huaweicloud.sdk.cbh.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class LoginInstanceAdminResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "admin_url")

    private String adminUrl;

    public LoginInstanceAdminResponse withAdminUrl(String adminUrl) {
        this.adminUrl = adminUrl;
        return this;
    }

    /**
     * 云堡垒机登录admin链接。
     * @return adminUrl
     */
    public String getAdminUrl() {
        return adminUrl;
    }

    public void setAdminUrl(String adminUrl) {
        this.adminUrl = adminUrl;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LoginInstanceAdminResponse that = (LoginInstanceAdminResponse) obj;
        return Objects.equals(this.adminUrl, that.adminUrl);
    }

    @Override
    public int hashCode() {
        return Objects.hash(adminUrl);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoginInstanceAdminResponse {\n");
        sb.append("    adminUrl: ").append(toIndentedString(adminUrl)).append("\n");
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
