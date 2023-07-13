package com.huaweicloud.sdk.waf.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 超时配置，开启后不支持关闭
 */
public class TimeoutConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "connect_timeout")

    private Integer connectTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "send_timeout")

    private Integer sendTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_timeout")

    private Integer readTimeout;

    public TimeoutConfig withConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
        return this;
    }

    /**
     * WAF连接源站超时配置
     * @return connectTimeout
     */
    public Integer getConnectTimeout() {
        return connectTimeout;
    }

    public void setConnectTimeout(Integer connectTimeout) {
        this.connectTimeout = connectTimeout;
    }

    public TimeoutConfig withSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
        return this;
    }

    /**
     * WAF发送请求到源站超时配置
     * @return sendTimeout
     */
    public Integer getSendTimeout() {
        return sendTimeout;
    }

    public void setSendTimeout(Integer sendTimeout) {
        this.sendTimeout = sendTimeout;
    }

    public TimeoutConfig withReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
        return this;
    }

    /**
     * WAF接收源站响应超时配置
     * @return readTimeout
     */
    public Integer getReadTimeout() {
        return readTimeout;
    }

    public void setReadTimeout(Integer readTimeout) {
        this.readTimeout = readTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        TimeoutConfig that = (TimeoutConfig) obj;
        return Objects.equals(this.connectTimeout, that.connectTimeout)
            && Objects.equals(this.sendTimeout, that.sendTimeout) && Objects.equals(this.readTimeout, that.readTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(connectTimeout, sendTimeout, readTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class TimeoutConfig {\n");
        sb.append("    connectTimeout: ").append(toIndentedString(connectTimeout)).append("\n");
        sb.append("    sendTimeout: ").append(toIndentedString(sendTimeout)).append("\n");
        sb.append("    readTimeout: ").append(toIndentedString(readTimeout)).append("\n");
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
