package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteJobAuthInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info_name")

    private String authInfoName;

    public DeleteJobAuthInfoRequest withAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
        return this;
    }

    /**
     * 即将删除的认证信息名
     * @return authInfoName
     */
    public String getAuthInfoName() {
        return authInfoName;
    }

    public void setAuthInfoName(String authInfoName) {
        this.authInfoName = authInfoName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeleteJobAuthInfoRequest that = (DeleteJobAuthInfoRequest) obj;
        return Objects.equals(this.authInfoName, that.authInfoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfoName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteJobAuthInfoRequest {\n");
        sb.append("    authInfoName: ").append(toIndentedString(authInfoName)).append("\n");
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
