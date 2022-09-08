package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * AccessToken
 */
public class AccessToken {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host")

    private String host;

    public AccessToken withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 授权名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AccessToken withToken(String token) {
        this.token = token;
        return this;
    }

    /**
     * git仓库设置中创建的私有token。
     * @return token
     */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public AccessToken withHost(String host) {
        this.host = host;
        return this;
    }

    /**
     * git仓库的主机地址，如https://192.168.1.1:8080/gitlab，默认为官方主机。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AccessToken accessToken = (AccessToken) o;
        return Objects.equals(this.name, accessToken.name) && Objects.equals(this.token, accessToken.token)
            && Objects.equals(this.host, accessToken.host);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, token, host);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AccessToken {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
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
