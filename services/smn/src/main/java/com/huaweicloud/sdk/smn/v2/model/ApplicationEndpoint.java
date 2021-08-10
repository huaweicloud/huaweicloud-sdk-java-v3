package com.huaweicloud.sdk.smn.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** ApplicationEndpoint */
public class ApplicationEndpoint {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "endpoint_urn")

    private String endpointUrn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user_data")

    private String userData;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private String enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "token")

    private String token;

    public ApplicationEndpoint withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /** 创建application的时间 时间格式为UTC时间，YYYY-MM-DDTHH:MM:SSZ。
     * 
     * @return createTime */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ApplicationEndpoint withEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
        return this;
    }

    /** Application endpoint的唯一资源标识。
     * 
     * @return endpointUrn */
    public String getEndpointUrn() {
        return endpointUrn;
    }

    public void setEndpointUrn(String endpointUrn) {
        this.endpointUrn = endpointUrn;
    }

    public ApplicationEndpoint withUserData(String userData) {
        this.userData = userData;
        return this;
    }

    /** 用户自定义数据 最大长度支持UTF-8编码后2048字节。
     * 
     * @return userData */
    public String getUserData() {
        return userData;
    }

    public void setUserData(String userData) {
        this.userData = userData;
    }

    public ApplicationEndpoint withEnabled(String enabled) {
        this.enabled = enabled;
        return this;
    }

    /** endpoint启用开关 true或false字符串。
     * 
     * @return enabled */
    public String getEnabled() {
        return enabled;
    }

    public void setEnabled(String enabled) {
        this.enabled = enabled;
    }

    public ApplicationEndpoint withToken(String token) {
        this.token = token;
        return this;
    }

    /** 设备token 最大长度512个字节。
     * 
     * @return token */
    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ApplicationEndpoint applicationEndpoint = (ApplicationEndpoint) o;
        return Objects.equals(this.createTime, applicationEndpoint.createTime)
            && Objects.equals(this.endpointUrn, applicationEndpoint.endpointUrn)
            && Objects.equals(this.userData, applicationEndpoint.userData)
            && Objects.equals(this.enabled, applicationEndpoint.enabled)
            && Objects.equals(this.token, applicationEndpoint.token);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime, endpointUrn, userData, enabled, token);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ApplicationEndpoint {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    endpointUrn: ").append(toIndentedString(endpointUrn)).append("\n");
        sb.append("    userData: ").append(toIndentedString(userData)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    token: ").append(toIndentedString(token)).append("\n");
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
