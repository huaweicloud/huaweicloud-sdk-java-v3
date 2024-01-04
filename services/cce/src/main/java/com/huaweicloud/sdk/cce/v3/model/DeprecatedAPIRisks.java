package com.huaweicloud.sdk.cce.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 废弃API风险来源
 */
public class DeprecatedAPIRisks {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "userAgent")

    private String userAgent;

    public DeprecatedAPIRisks withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * 请求路径，如/apis/policy/v1beta1/podsecuritypolicies
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public DeprecatedAPIRisks withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * 客户端信息
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DeprecatedAPIRisks that = (DeprecatedAPIRisks) obj;
        return Objects.equals(this.url, that.url) && Objects.equals(this.userAgent, that.userAgent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(url, userAgent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeprecatedAPIRisks {\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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
