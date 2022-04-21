package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 工作负载存活探针
 */
public class AppVersionDetailLivenessProbe {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exec_command")

    private String execCommand;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "http_get")

    private InstancesLivenessProbeHttpGet httpGet;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "initial_delay_seconds")

    private Integer initialDelaySeconds;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timeout_seconds")

    private Integer timeoutSeconds;

    public AppVersionDetailLivenessProbe withExecCommand(String execCommand) {
        this.execCommand = execCommand;
        return this;
    }

    /**
     * 执行探测的命令行命令，长度1-10240内的字符串
     * @return execCommand
     */
    public String getExecCommand() {
        return execCommand;
    }

    public void setExecCommand(String execCommand) {
        this.execCommand = execCommand;
    }

    public AppVersionDetailLivenessProbe withHttpGet(InstancesLivenessProbeHttpGet httpGet) {
        this.httpGet = httpGet;
        return this;
    }

    public AppVersionDetailLivenessProbe withHttpGet(Consumer<InstancesLivenessProbeHttpGet> httpGetSetter) {
        if (this.httpGet == null) {
            this.httpGet = new InstancesLivenessProbeHttpGet();
            httpGetSetter.accept(this.httpGet);
        }

        return this;
    }

    /**
     * Get httpGet
     * @return httpGet
     */
    public InstancesLivenessProbeHttpGet getHttpGet() {
        return httpGet;
    }

    public void setHttpGet(InstancesLivenessProbeHttpGet httpGet) {
        this.httpGet = httpGet;
    }

    public AppVersionDetailLivenessProbe withInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
        return this;
    }

    /**
     * 表示从工作负载启动后从多久开始探测，大于0且不大于3600的整数，默认为10
     * @return initialDelaySeconds
     */
    public Integer getInitialDelaySeconds() {
        return initialDelaySeconds;
    }

    public void setInitialDelaySeconds(Integer initialDelaySeconds) {
        this.initialDelaySeconds = initialDelaySeconds;
    }

    public AppVersionDetailLivenessProbe withTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
        return this;
    }

    /**
     * 表示探测超时时间，大于0且不大于3600的整数，默认为1
     * @return timeoutSeconds
     */
    public Integer getTimeoutSeconds() {
        return timeoutSeconds;
    }

    public void setTimeoutSeconds(Integer timeoutSeconds) {
        this.timeoutSeconds = timeoutSeconds;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AppVersionDetailLivenessProbe appVersionDetailLivenessProbe = (AppVersionDetailLivenessProbe) o;
        return Objects.equals(this.execCommand, appVersionDetailLivenessProbe.execCommand)
            && Objects.equals(this.httpGet, appVersionDetailLivenessProbe.httpGet)
            && Objects.equals(this.initialDelaySeconds, appVersionDetailLivenessProbe.initialDelaySeconds)
            && Objects.equals(this.timeoutSeconds, appVersionDetailLivenessProbe.timeoutSeconds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(execCommand, httpGet, initialDelaySeconds, timeoutSeconds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppVersionDetailLivenessProbe {\n");
        sb.append("    execCommand: ").append(toIndentedString(execCommand)).append("\n");
        sb.append("    httpGet: ").append(toIndentedString(httpGet)).append("\n");
        sb.append("    initialDelaySeconds: ").append(toIndentedString(initialDelaySeconds)).append("\n");
        sb.append("    timeoutSeconds: ").append(toIndentedString(timeoutSeconds)).append("\n");
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
