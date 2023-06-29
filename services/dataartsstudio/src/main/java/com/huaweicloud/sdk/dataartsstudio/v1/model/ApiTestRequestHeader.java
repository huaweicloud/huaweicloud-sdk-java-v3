package com.huaweicloud.sdk.dataartsstudio.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * ApiTestRequestHeader
 */
public class ApiTestRequestHeader {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_agent")

    private String userAgent;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_apig_mode")

    private String xApigMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_app_identity")

    private Integer xAppIdentity;

    public ApiTestRequestHeader withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * 请求路径
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public ApiTestRequestHeader withUserAgent(String userAgent) {
        this.userAgent = userAgent;
        return this;
    }

    /**
     * 代理（固定值）
     * @return userAgent
     */
    public String getUserAgent() {
        return userAgent;
    }

    public void setUserAgent(String userAgent) {
        this.userAgent = userAgent;
    }

    public ApiTestRequestHeader withXApigMode(String xApigMode) {
        this.xApigMode = xApigMode;
        return this;
    }

    /**
     * 请求方式（固定值）
     * @return xApigMode
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_apig_mode")
    public String getXApigMode() {
        return xApigMode;
    }

    public void setXApigMode(String xApigMode) {
        this.xApigMode = xApigMode;
    }

    public ApiTestRequestHeader withXAppIdentity(Integer xAppIdentity) {
        this.xAppIdentity = xAppIdentity;
        return this;
    }

    /**
     * 识别编号（固定值）
     * @return xAppIdentity
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "x_app_identity")
    public Integer getXAppIdentity() {
        return xAppIdentity;
    }

    public void setXAppIdentity(Integer xAppIdentity) {
        this.xAppIdentity = xAppIdentity;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ApiTestRequestHeader that = (ApiTestRequestHeader) obj;
        return Objects.equals(this.path, that.path) && Objects.equals(this.userAgent, that.userAgent)
            && Objects.equals(this.xApigMode, that.xApigMode) && Objects.equals(this.xAppIdentity, that.xAppIdentity);
    }

    @Override
    public int hashCode() {
        return Objects.hash(path, userAgent, xApigMode, xAppIdentity);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApiTestRequestHeader {\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
        sb.append("    xApigMode: ").append(toIndentedString(xApigMode)).append("\n");
        sb.append("    xAppIdentity: ").append(toIndentedString(xAppIdentity)).append("\n");
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
