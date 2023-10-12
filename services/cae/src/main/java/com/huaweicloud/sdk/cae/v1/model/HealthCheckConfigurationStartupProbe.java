package com.huaweicloud.sdk.cae.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 组件健康检查配置的启动探针配置。
 */
public class HealthCheckConfigurationStartupProbe {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "periodSeconds")

    private Integer periodSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initialDelaySeconds")

    private Integer initialDelaySeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeoutSeconds")

    private Integer timeoutSeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "successThreshold")

    private Integer successThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "failureThreshold")

    private Integer failureThreshold;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpGet")

    private HealthCheckConfigurationHttpGet httpGet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcpSocket")

    private HealthCheckConfigurationTcpSocket tcpSocket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec")

    private HealthCheckConfigurationExec exec;

    public HealthCheckConfigurationStartupProbe withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * 检测周期，单位为s。
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public HealthCheckConfigurationStartupProbe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * 延迟时间，单位为s。
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public HealthCheckConfigurationStartupProbe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * 超时时间，单位为s。
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public HealthCheckConfigurationStartupProbe withSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
        return this;
    }

    /**
     * 成功阈值。
     * @return successThreshold
     */
    public Integer getSuccessThreshold() {
        return successThreshold;
    }

    public void setSuccessThreshold(Integer successThreshold) {
        this.successThreshold = successThreshold;
    }

    public HealthCheckConfigurationStartupProbe withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * 最大失败次数。
     * @return failureThreshold
     */
    public Integer getFailureThreshold() {
        return failureThreshold;
    }

    public void setFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
    }

    public HealthCheckConfigurationStartupProbe withHttpGet(HealthCheckConfigurationHttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public HealthCheckConfigurationStartupProbe withHttpGet(Consumer<HealthCheckConfigurationHttpGet> httpGetSetter) {
        if (this.httpGet == null) {
            this.httpGet = new HealthCheckConfigurationHttpGet();
            httpGetSetter.accept(this.httpGet);
        }

        return this;
    }

    /**
     * Get httpGet
     * @return httpGet
     */
    public HealthCheckConfigurationHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HealthCheckConfigurationHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public HealthCheckConfigurationStartupProbe withTcpSocket(HealthCheckConfigurationTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    public HealthCheckConfigurationStartupProbe withTcpSocket(
        Consumer<HealthCheckConfigurationTcpSocket> tcpSocketSetter) {
        if (this.tcpSocket == null) {
            this.tcpSocket = new HealthCheckConfigurationTcpSocket();
            tcpSocketSetter.accept(this.tcpSocket);
        }

        return this;
    }

    /**
     * Get tcpSocket
     * @return tcpSocket
     */
    public HealthCheckConfigurationTcpSocket getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(HealthCheckConfigurationTcpSocket tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public HealthCheckConfigurationStartupProbe withExec(HealthCheckConfigurationExec exec) {
        this.exec = exec;
        return this;
    }

    public HealthCheckConfigurationStartupProbe withExec(Consumer<HealthCheckConfigurationExec> execSetter) {
        if (this.exec == null) {
            this.exec = new HealthCheckConfigurationExec();
            execSetter.accept(this.exec);
        }

        return this;
    }

    /**
     * Get exec
     * @return exec
     */
    public HealthCheckConfigurationExec getExec() {
        return exec;
    }

    public void setExec(HealthCheckConfigurationExec exec) {
        this.exec = exec;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        HealthCheckConfigurationStartupProbe that = (HealthCheckConfigurationStartupProbe) obj;
        return Objects.equals(this.periodSeconds, that.periodSeconds)
            && Objects.equals(this.initialDelaySeconds, that.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, that.timeoutSeconds)
            && Objects.equals(this.successThreshold, that.successThreshold)
            && Objects.equals(this.failureThreshold, that.failureThreshold)
            && Objects.equals(this.httpGet, that.httpGet) && Objects.equals(this.tcpSocket, that.tcpSocket)
            && Objects.equals(this.exec, that.exec);
    }

    @Override
    public int hashCode() {
        return Objects.hash(periodSeconds,
            initialDelaySeconds,
            timeoutSeconds,
            successThreshold,
            failureThreshold,
            httpGet,
            tcpSocket,
            exec);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class HealthCheckConfigurationStartupProbe {\n");
        sb.append("    periodSeconds: ").append(toIndentedString(periodSeconds)).append("\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
        sb.append("    successThreshold: ").append(toIndentedString(successThreshold)).append("\n");
        sb.append("    failureThreshold: ").append(toIndentedString(failureThreshold)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
        sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
        sb.append("    exec: ").append(toIndentedString(exec)).append("\n");
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
