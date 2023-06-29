package com.huaweicloud.sdk.iotedge.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ProbeDTO
 */
public class ProbeDTO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_command")

    private String execCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tcp_socket")

    private TcpSocketDTO tcpSocket;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_get")

    private HttpGetDTO httpGet;

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

    public ProbeDTO withExecCommand(String execCommand) {
        this.execCommand = execCommand;
        return this;
    }

    /**
     * 执行探测的命令行命令
     * @return execCommand
     */
    public String getExecCommand() {
        return execCommand;
    }

    public void setExecCommand(String execCommand) {
        this.execCommand = execCommand;
    }

    public ProbeDTO withTcpSocket(TcpSocketDTO tcpSocket) {
        this.tcpSocket = tcpSocket;
        return this;
    }

    public ProbeDTO withTcpSocket(Consumer<TcpSocketDTO> tcpSocketSetter) {
        if (this.tcpSocket == null) {
            this.tcpSocket = new TcpSocketDTO();
            tcpSocketSetter.accept(this.tcpSocket);
        }

        return this;
    }

    /**
     * Get tcpSocket
     * @return tcpSocket
     */
    public TcpSocketDTO getTcpSocket() {
        return tcpSocket;
    }

    public void setTcpSocket(TcpSocketDTO tcpSocket) {
        this.tcpSocket = tcpSocket;
    }

    public ProbeDTO withHttpGet(HttpGetDTO httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public ProbeDTO withHttpGet(Consumer<HttpGetDTO> httpGetSetter) {
        if (this.httpGet == null) {
            this.httpGet = new HttpGetDTO();
            httpGetSetter.accept(this.httpGet);
        }

        return this;
    }

    /**
     * Get httpGet
     * @return httpGet
     */
    public HttpGetDTO getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(HttpGetDTO httpGet) {
        this.httpGet = httpGet;
    }

    public ProbeDTO withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * 表示从工作负载启动后从多久开始探测
     * minimum: 0
     * maximum: 3600
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public ProbeDTO withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * 表示探测超时时间
     * minimum: 1
     * maximum: 3600
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    public ProbeDTO withPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
        return this;
    }

    /**
     * 检查周期
     * minimum: 5
     * maximum: 3600
     * @return periodSeconds
     */
    public Integer getPeriodSeconds() {
        return periodSeconds;
    }

    public void setPeriodSeconds(Integer periodSeconds) {
        this.periodSeconds = periodSeconds;
    }

    public ProbeDTO withFailureThreshold(Integer failureThreshold) {
        this.failureThreshold = failureThreshold;
        return this;
    }

    /**
     * 失败多少次算不健康
     * minimum: 1
     * maximum: 3600
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
        ProbeDTO that = (ProbeDTO) obj;
        return Objects.equals(this.execCommand, that.execCommand) && Objects.equals(this.tcpSocket, that.tcpSocket)
            && Objects.equals(this.httpGet, that.httpGet)
            && Objects.equals(this.initialDelaySeconds, that.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, that.timeoutSeconds)
            && Objects.equals(this.periodSeconds, that.periodSeconds)
            && Objects.equals(this.failureThreshold, that.failureThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(execCommand,
            tcpSocket,
            httpGet,
            initialDelaySeconds,
            timeoutSeconds,
            periodSeconds,
            failureThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProbeDTO {\n");
        sb.append("    execCommand: ").append(toIndentedString(execCommand)).append("\n");
        sb.append("    tcpSocket: ").append(toIndentedString(tcpSocket)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
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
