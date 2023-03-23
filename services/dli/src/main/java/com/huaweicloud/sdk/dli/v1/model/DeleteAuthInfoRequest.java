package com.huaweicloud.sdk.dli.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class DeleteAuthInfoRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auth_info_name")

    private String authInfoName;

    public DeleteAuthInfoRequest withAuthInfoName(String authInfoName) {
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
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteAuthInfoRequest deleteAuthInfoRequest = (DeleteAuthInfoRequest) o;
        return Objects.equals(this.authInfoName, deleteAuthInfoRequest.authInfoName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(authInfoName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteAuthInfoRequest {\n");
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
