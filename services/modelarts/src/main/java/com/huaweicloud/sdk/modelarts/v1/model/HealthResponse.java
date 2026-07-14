package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释：** 健康检查配置。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
 */
public class HealthResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "check_method")

    private String checkMethod;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd")

    private String cmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "url")

    private String url;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "protocol")

    private String protocol;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_delay_seconds")

    private Integer initialDelaySeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_seconds")

    private Integer timeoutSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "period_seconds")

    private Integer periodSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failure_threshold")

    private Integer failureThreshold;

    public HealthResponse withCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod;
        return this;
    }

    /**
     * **参数解释：** 健康检查方式：HTTP 或者 EXEC（命令行）。 **约束限制：** 不涉及。 **取值范围：** - HTTP：超文本传输协议。 - EXEC：命令行。 **默认取值：** 不涉及。
     * @return checkMethod
     */
    public String getCheckMethod() {
        return checkMethod;
    }

    public void setCheckMethod(String checkMethod) {
        this.checkMethod = checkMethod;
    }

    public HealthResponse withCmd(String cmd) {
        this.cmd = cmd;
        return this;
    }

    /**
     * **参数解释：** 当健康检查方式为EXEC时，配置的命令行。 **约束限制：** 字符长度限制[0, 1024]，不能包含字符：#~^$|%&*<>()'\"[]{} **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return cmd
     */
    public String getCmd() {
        return cmd;
    }

    public void setCmd(String cmd) {
        this.cmd = cmd;
    }

    public HealthResponse withUrl(String url) {
        this.url = url;
        return this;
    }

    /**
     * **参数解释：** 当健康检查方式为HTTP 时，配置的请求地址。 **约束限制：** 字符长度限制[0, 1024]，首字符为/，后续字符可以是：字母 数字 中划线 下划线 / : **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return url
     */
    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public HealthResponse withProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }

    /**
     * **参数解释：** 连接协议。默认HTTP。 **约束限制：** 不涉及。 **取值范围：** - HTTPS：超文本传输协议安全版。 - HTTP：超文本传输协议。 - WSS：网络通信协议安全版。 - WS：网络通信协议。 **默认取值：** 不涉及。
     * @return protocol
     */
    public String getProtocol() {
        return protocol;
    }

    public void setProtocol(String protocol) {
        this.protocol = protocol;
    }

    public HealthResponse withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * **参数解释：** 执行首次探测时，应该等待的时间，默认30秒，最小1秒。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 默认值为30。
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public HealthResponse withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * **参数解释：** 执行探测的超时时间，默认30秒，最小1秒。 **约束限制：** 不涉及。 **取值范围：** 最小值为1秒。 **默认取值：** 默认值为30秒。
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public HealthResponse withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * **参数解释：** 执行健康检查的周期时间，执行探测的频率。默认是10秒，最小1秒。 **约束限制：** 不涉及。 **取值范围：** 最小值为1秒。 **默认取值：** 默认值为10秒。
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public HealthResponse withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * **参数解释：** 探测成功后，至少连续探测失败多少次才被认定为失败。默认是3。最小值是1。 **约束限制：** 不涉及。 **取值范围：** 最小值为1。 **默认取值：** 默认值为3。
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthResponse that = (HealthResponse) obj;
        return Objects.equals(this.checkMethod, that.checkMethod) && Objects.equals(this.cmd, that.cmd)
            && Objects.equals(this.url, that.url) && Objects.equals(this.protocol, that.protocol)
            && Objects.equals(this.initialDelaySeconds, that.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, that.timeoutSeconds)
            && Objects.equals(this.periodSeconds, that.periodSeconds)
            && Objects.equals(this.failureThreshold, that.failureThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(checkMethod,
            cmd,
            url,
            protocol,
            initialDelaySeconds,
            timeoutSeconds,
            periodSeconds,
            failureThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthResponse {\n");
        sb.append("    checkMethod: ").append(toIndentedString(checkMethod)).append("\n");
        sb.append("    cmd: ").append(toIndentedString(cmd)).append("\n");
        sb.append("    url: ").append(toIndentedString(url)).append("\n");
        sb.append("    protocol: ").append(toIndentedString(protocol)).append("\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
        sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
        sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
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
