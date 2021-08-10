package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** CreateApplicationEndpointRequestBody */
public class CreateApplicationEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    public CreateApplicationEndpointRequestBody withToken(String token) {
        this.token = token;
        return this;
    }

    /** 移动应用设备token，最大长度512个字节。
     * 
     * @return token */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public CreateApplicationEndpointRequestBody withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** 用户自定义数据，最大长度支持UTF-8编码后2048字节。
     * 
     * @return userData */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateApplicationEndpointRequestBody createApplicationEndpointRequestBody =
            (CreateApplicationEndpointRequestBody) o;
        return Objects.equals(this.token, createApplicationEndpointRequestBody.token)
            && Objects.equals(this.userData, createApplicationEndpointRequestBody.userData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(token, userData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateApplicationEndpointRequestBody {\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
