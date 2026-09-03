package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * AdvancedConfig
 */
public class AdvancedConfig {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "blockEnable")

    private String blockEnable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "caseTimeout")

    private Long caseTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enableCookie")

    private String enableCookie;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "headerDefault")

    private String headerDefault;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "httpTimeout")

    private Long httpTimeout;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "octopusImage")

    private String octopusImage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parallelNumber")

    private Integer parallelNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyAuthName")

    private String proxyAuthName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyAuthPassword")

    private String proxyAuthPassword;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyHostName")

    private String proxyHostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "proxyPort")

    private String proxyPort;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "serialRun")

    private String serialRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskStopTime")

    private OffsetDateTime taskStopTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "taskTimeout")

    private Long taskTimeout;

    public AdvancedConfig withBlockEnable(String blockEnable) {
        this.blockEnable = blockEnable;
        return this;
    }

    /**
     * 分块开关 1:打开 0：关闭，默认：打开
     * @return blockEnable
     */
    public String getBlockEnable() {
        return blockEnable;
    }

    public void setBlockEnable(String blockEnable) {
        this.blockEnable = blockEnable;
    }

    public AdvancedConfig withCaseTimeout(Long caseTimeout) {
        this.caseTimeout = caseTimeout;
        return this;
    }

    /**
     * 用例超时时间
     * @return caseTimeout
     */
    public Long getCaseTimeout() {
        return caseTimeout;
    }

    public void setCaseTimeout(Long caseTimeout) {
        this.caseTimeout = caseTimeout;
    }

    public AdvancedConfig withEnableCookie(String enableCookie) {
        this.enableCookie = enableCookie;
        return this;
    }

    /**
     * httpClient报存cookie配置：1 保存 0 不保存
     * @return enableCookie
     */
    public String getEnableCookie() {
        return enableCookie;
    }

    public void setEnableCookie(String enableCookie) {
        this.enableCookie = enableCookie;
    }

    public AdvancedConfig withHeaderDefault(String headerDefault) {
        this.headerDefault = headerDefault;
        return this;
    }

    /**
     * 关闭默认添加content-type和accept请求头配置：1 打开 0 关闭
     * @return headerDefault
     */
    public String getHeaderDefault() {
        return headerDefault;
    }

    public void setHeaderDefault(String headerDefault) {
        this.headerDefault = headerDefault;
    }

    public AdvancedConfig withHttpTimeout(Long httpTimeout) {
        this.httpTimeout = httpTimeout;
        return this;
    }

    /**
     * http请求超时时间
     * @return httpTimeout
     */
    public Long getHttpTimeout() {
        return httpTimeout;
    }

    public void setHttpTimeout(Long httpTimeout) {
        this.httpTimeout = httpTimeout;
    }

    public AdvancedConfig withOctopusImage(String octopusImage) {
        this.octopusImage = octopusImage;
        return this;
    }

    /**
     * 八爪鱼镜像地址
     * @return octopusImage
     */
    public String getOctopusImage() {
        return octopusImage;
    }

    public void setOctopusImage(String octopusImage) {
        this.octopusImage = octopusImage;
    }

    public AdvancedConfig withParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
        return this;
    }

    /**
     * 并行用例个数
     * @return parallelNumber
     */
    public Integer getParallelNumber() {
        return parallelNumber;
    }

    public void setParallelNumber(Integer parallelNumber) {
        this.parallelNumber = parallelNumber;
    }

    public AdvancedConfig withProxyAuthName(String proxyAuthName) {
        this.proxyAuthName = proxyAuthName;
        return this;
    }

    /**
     * 代理用户名
     * @return proxyAuthName
     */
    public String getProxyAuthName() {
        return proxyAuthName;
    }

    public void setProxyAuthName(String proxyAuthName) {
        this.proxyAuthName = proxyAuthName;
    }

    public AdvancedConfig withProxyAuthPassword(String proxyAuthPassword) {
        this.proxyAuthPassword = proxyAuthPassword;
        return this;
    }

    /**
     * 代理密码
     * @return proxyAuthPassword
     */
    public String getProxyAuthPassword() {
        return proxyAuthPassword;
    }

    public void setProxyAuthPassword(String proxyAuthPassword) {
        this.proxyAuthPassword = proxyAuthPassword;
    }

    public AdvancedConfig withProxyHostName(String proxyHostName) {
        this.proxyHostName = proxyHostName;
        return this;
    }

    /**
     * 代理服务配置
     * @return proxyHostName
     */
    public String getProxyHostName() {
        return proxyHostName;
    }

    public void setProxyHostName(String proxyHostName) {
        this.proxyHostName = proxyHostName;
    }

    public AdvancedConfig withProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
        return this;
    }

    /**
     * 代理服务配置
     * @return proxyPort
     */
    public String getProxyPort() {
        return proxyPort;
    }

    public void setProxyPort(String proxyPort) {
        this.proxyPort = proxyPort;
    }

    public AdvancedConfig withSerialRun(String serialRun) {
        this.serialRun = serialRun;
        return this;
    }

    /**
     * 串行配置
     * @return serialRun
     */
    public String getSerialRun() {
        return serialRun;
    }

    public void setSerialRun(String serialRun) {
        this.serialRun = serialRun;
    }

    public AdvancedConfig withTaskStopTime(OffsetDateTime taskStopTime) {
        this.taskStopTime = taskStopTime;
        return this;
    }

    /**
     * 任务停止时间
     * @return taskStopTime
     */
    public OffsetDateTime getTaskStopTime() {
        return taskStopTime;
    }

    public void setTaskStopTime(OffsetDateTime taskStopTime) {
        this.taskStopTime = taskStopTime;
    }

    public AdvancedConfig withTaskTimeout(Long taskTimeout) {
        this.taskTimeout = taskTimeout;
        return this;
    }

    /**
     * 任务超时时间
     * @return taskTimeout
     */
    public Long getTaskTimeout() {
        return taskTimeout;
    }

    public void setTaskTimeout(Long taskTimeout) {
        this.taskTimeout = taskTimeout;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AdvancedConfig that = (AdvancedConfig) obj;
        return Objects.equals(this.blockEnable, that.blockEnable) && Objects.equals(this.caseTimeout, that.caseTimeout)
            && Objects.equals(this.enableCookie, that.enableCookie)
            && Objects.equals(this.headerDefault, that.headerDefault)
            && Objects.equals(this.httpTimeout, that.httpTimeout)
            && Objects.equals(this.octopusImage, that.octopusImage)
            && Objects.equals(this.parallelNumber, that.parallelNumber)
            && Objects.equals(this.proxyAuthName, that.proxyAuthName)
            && Objects.equals(this.proxyAuthPassword, that.proxyAuthPassword)
            && Objects.equals(this.proxyHostName, that.proxyHostName) && Objects.equals(this.proxyPort, that.proxyPort)
            && Objects.equals(this.serialRun, that.serialRun) && Objects.equals(this.taskStopTime, that.taskStopTime)
            && Objects.equals(this.taskTimeout, that.taskTimeout);
    }

    @Override
    public int hashCode() {
        return Objects.hash(blockEnable,
            caseTimeout,
            enableCookie,
            headerDefault,
            httpTimeout,
            octopusImage,
            parallelNumber,
            proxyAuthName,
            proxyAuthPassword,
            proxyHostName,
            proxyPort,
            serialRun,
            taskStopTime,
            taskTimeout);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AdvancedConfig {\n");
        sb.append("    blockEnable: ").append(toIndentedString(blockEnable)).append("\n");
        sb.append("    caseTimeout: ").append(toIndentedString(caseTimeout)).append("\n");
        sb.append("    enableCookie: ").append(toIndentedString(enableCookie)).append("\n");
        sb.append("    headerDefault: ").append(toIndentedString(headerDefault)).append("\n");
        sb.append("    httpTimeout: ").append(toIndentedString(httpTimeout)).append("\n");
        sb.append("    octopusImage: ").append(toIndentedString(octopusImage)).append("\n");
        sb.append("    parallelNumber: ").append(toIndentedString(parallelNumber)).append("\n");
        sb.append("    proxyAuthName: ").append(toIndentedString(proxyAuthName)).append("\n");
        sb.append("    proxyAuthPassword: ").append(toIndentedString(proxyAuthPassword)).append("\n");
        sb.append("    proxyHostName: ").append(toIndentedString(proxyHostName)).append("\n");
        sb.append("    proxyPort: ").append(toIndentedString(proxyPort)).append("\n");
        sb.append("    serialRun: ").append(toIndentedString(serialRun)).append("\n");
        sb.append("    taskStopTime: ").append(toIndentedString(taskStopTime)).append("\n");
        sb.append("    taskTimeout: ").append(toIndentedString(taskTimeout)).append("\n");
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
