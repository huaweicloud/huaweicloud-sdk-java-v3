package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateAuthorizationTokenResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auths")

    private Map<String, AuthInfo> auths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Swr-Dockerlogin")

    private String xSwrDockerlogin;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-swr-expireat")

    private String xSwrExpireat;

    public CreateAuthorizationTokenResponse withAuths(Map<String, AuthInfo> auths) {
        this.auths = auths;
        return this;
    }

    public CreateAuthorizationTokenResponse putAuthsItem(String key, AuthInfo authsItem) {
        if (this.auths == null) {
            this.auths = new HashMap<>();
        }
        this.auths.put(key, authsItem);
        return this;
    }

    public CreateAuthorizationTokenResponse withAuths(Consumer<Map<String, AuthInfo>> authsSetter) {
        if (this.auths == null) {
            this.auths = new HashMap<>();
        }
        authsSetter.accept(this.auths);
        return this;
    }

    /**
     * 认证信息
     * @return auths
     */
    public Map<String, AuthInfo> getAuths() {
        return auths;
    }

    public void setAuths(Map<String, AuthInfo> auths) {
        this.auths = auths;
    }

    public CreateAuthorizationTokenResponse withXSwrDockerlogin(String xSwrDockerlogin) {
        this.xSwrDockerlogin = xSwrDockerlogin;
        return this;
    }

    /**
     * Get xSwrDockerlogin
     * @return xSwrDockerlogin
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Swr-Dockerlogin")
    public String getXSwrDockerlogin() {
        return xSwrDockerlogin;
    }

    public void setXSwrDockerlogin(String xSwrDockerlogin) {
        this.xSwrDockerlogin = xSwrDockerlogin;
    }

    public CreateAuthorizationTokenResponse withXSwrExpireat(String xSwrExpireat) {
        this.xSwrExpireat = xSwrExpireat;
        return this;
    }

    /**
     * Get xSwrExpireat
     * @return xSwrExpireat
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x-swr-expireat")
    public String getXSwrExpireat() {
        return xSwrExpireat;
    }

    public void setXSwrExpireat(String xSwrExpireat) {
        this.xSwrExpireat = xSwrExpireat;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateAuthorizationTokenResponse that = (CreateAuthorizationTokenResponse) obj;
        return Objects.equals(this.auths, that.auths) && Objects.equals(this.xSwrDockerlogin, that.xSwrDockerlogin)
            && Objects.equals(this.xSwrExpireat, that.xSwrExpireat);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auths, xSwrDockerlogin, xSwrExpireat);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateAuthorizationTokenResponse {\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
        sb.append("    xSwrDockerlogin: ").append(toIndentedString(xSwrDockerlogin)).append("\n");
        sb.append("    xSwrExpireat: ").append(toIndentedString(xSwrExpireat)).append("\n");
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
