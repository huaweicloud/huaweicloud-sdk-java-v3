package com.huaweicloud.sdk.swr.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateSecretResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auths")

    @JacksonXmlProperty(localName = "auths")

    private Map<String, AuthInfo> auths = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-Swr-Dockerlogin")

    @JacksonXmlProperty(localName = "X-Swr-Dockerlogin")

    private String xSwrDockerlogin;

    public CreateSecretResponse withAuths(Map<String, AuthInfo> auths) {
        this.auths = auths;
        return this;
    }

    public CreateSecretResponse putAuthsItem(String key, AuthInfo authsItem) {
        if (this.auths == null) {
            this.auths = new HashMap<>();
        }
        this.auths.put(key, authsItem);
        return this;
    }

    public CreateSecretResponse withAuths(Consumer<Map<String, AuthInfo>> authsSetter) {
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

    public CreateSecretResponse withXSwrDockerlogin(String xSwrDockerlogin) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateSecretResponse createSecretResponse = (CreateSecretResponse) o;
        return Objects.equals(this.auths, createSecretResponse.auths)
            && Objects.equals(this.xSwrDockerlogin, createSecretResponse.xSwrDockerlogin);
    }

    @Override
    public int hashCode() {
        return Objects.hash(auths, xSwrDockerlogin);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateSecretResponse {\n");
        sb.append("    auths: ").append(toIndentedString(auths)).append("\n");
        sb.append("    xSwrDockerlogin: ").append(toIndentedString(xSwrDockerlogin)).append("\n");
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
