package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 网页防篡改事件信息 **取值范围**: 不涉及 
 */
public class WebTamperEventResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "file_path")

    private String filePath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_description")

    private String eventDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_path")

    private String processPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_cmd")

    private String processCmd;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_pid")

    private Integer processPid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process_env")

    private String processEnv;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_app_name")

    private String webAppName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "event_time")

    private Long eventTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_info")

    private WebTamperEventHostInfo hostInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_info")

    private WebTamperEventContainerInfo containerInfo;

    public WebTamperEventResponseInfo withFilePath(String filePath) {
        this.filePath = filePath;
        return this;
    }

    /**
     * **参数解释**: 防护文件 **取值范围**: 字符长度0-256位 
     * @return filePath
     */
    public String getFilePath() {
        return filePath;
    }

    public void setFilePath(String filePath) {
        this.filePath = filePath;
    }

    public WebTamperEventResponseInfo withEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
        return this;
    }

    /**
     * **参数解释**: 事件描述 **取值范围**: 字符长度0-512位 
     * @return eventDescription
     */
    public String getEventDescription() {
        return eventDescription;
    }

    public void setEventDescription(String eventDescription) {
        this.eventDescription = eventDescription;
    }

    public WebTamperEventResponseInfo withProcessPath(String processPath) {
        this.processPath = processPath;
        return this;
    }

    /**
     * **参数解释**: 进程路径 **取值范围**: 字符长度0-256位 
     * @return processPath
     */
    public String getProcessPath() {
        return processPath;
    }

    public void setProcessPath(String processPath) {
        this.processPath = processPath;
    }

    public WebTamperEventResponseInfo withProcessCmd(String processCmd) {
        this.processCmd = processCmd;
        return this;
    }

    /**
     * **参数解释**: 进程命令行 **取值范围**: 字符长度0-256位 
     * @return processCmd
     */
    public String getProcessCmd() {
        return processCmd;
    }

    public void setProcessCmd(String processCmd) {
        this.processCmd = processCmd;
    }

    public WebTamperEventResponseInfo withProcessPid(Integer processPid) {
        this.processPid = processPid;
        return this;
    }

    /**
     * **参数解释**: 进程pid **取值范围**: 最小值0，最大值2147483647 
     * minimum: 0
     * maximum: 2147483547
     * @return processPid
     */
    public Integer getProcessPid() {
        return processPid;
    }

    public void setProcessPid(Integer processPid) {
        this.processPid = processPid;
    }

    public WebTamperEventResponseInfo withProcessEnv(String processEnv) {
        this.processEnv = processEnv;
        return this;
    }

    /**
     * **参数解释**: 进程环境，是指在容器内的进程或者宿主机的进程 **取值范围**: 字符长度0-32位 
     * @return processEnv
     */
    public String getProcessEnv() {
        return processEnv;
    }

    public void setProcessEnv(String processEnv) {
        this.processEnv = processEnv;
    }

    public WebTamperEventResponseInfo withWebAppName(String webAppName) {
        this.webAppName = webAppName;
        return this;
    }

    /**
     * **参数解释**: 网站应用名称 **取值范围**: 字符长度0-128位 
     * @return webAppName
     */
    public String getWebAppName() {
        return webAppName;
    }

    public void setWebAppName(String webAppName) {
        this.webAppName = webAppName;
    }

    public WebTamperEventResponseInfo withEventTime(Long eventTime) {
        this.eventTime = eventTime;
        return this;
    }

    /**
     * **参数解释**: 检测时间(ms) **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return eventTime
     */
    public Long getEventTime() {
        return eventTime;
    }

    public void setEventTime(Long eventTime) {
        this.eventTime = eventTime;
    }

    public WebTamperEventResponseInfo withHostInfo(WebTamperEventHostInfo hostInfo) {
        this.hostInfo = hostInfo;
        return this;
    }

    public WebTamperEventResponseInfo withHostInfo(Consumer<WebTamperEventHostInfo> hostInfoSetter) {
        if (this.hostInfo == null) {
            this.hostInfo = new WebTamperEventHostInfo();
            hostInfoSetter.accept(this.hostInfo);
        }

        return this;
    }

    /**
     * Get hostInfo
     * @return hostInfo
     */
    public WebTamperEventHostInfo getHostInfo() {
        return hostInfo;
    }

    public void setHostInfo(WebTamperEventHostInfo hostInfo) {
        this.hostInfo = hostInfo;
    }

    public WebTamperEventResponseInfo withContainerInfo(WebTamperEventContainerInfo containerInfo) {
        this.containerInfo = containerInfo;
        return this;
    }

    public WebTamperEventResponseInfo withContainerInfo(Consumer<WebTamperEventContainerInfo> containerInfoSetter) {
        if (this.containerInfo == null) {
            this.containerInfo = new WebTamperEventContainerInfo();
            containerInfoSetter.accept(this.containerInfo);
        }

        return this;
    }

    /**
     * Get containerInfo
     * @return containerInfo
     */
    public WebTamperEventContainerInfo getContainerInfo() {
        return containerInfo;
    }

    public void setContainerInfo(WebTamperEventContainerInfo containerInfo) {
        this.containerInfo = containerInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        WebTamperEventResponseInfo that = (WebTamperEventResponseInfo) obj;
        return Objects.equals(this.filePath, that.filePath)
            && Objects.equals(this.eventDescription, that.eventDescription)
            && Objects.equals(this.processPath, that.processPath) && Objects.equals(this.processCmd, that.processCmd)
            && Objects.equals(this.processPid, that.processPid) && Objects.equals(this.processEnv, that.processEnv)
            && Objects.equals(this.webAppName, that.webAppName) && Objects.equals(this.eventTime, that.eventTime)
            && Objects.equals(this.hostInfo, that.hostInfo) && Objects.equals(this.containerInfo, that.containerInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filePath,
            eventDescription,
            processPath,
            processCmd,
            processPid,
            processEnv,
            webAppName,
            eventTime,
            hostInfo,
            containerInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class WebTamperEventResponseInfo {\n");
        sb.append("    filePath: ").append(toIndentedString(filePath)).append("\n");
        sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
        sb.append("    processPath: ").append(toIndentedString(processPath)).append("\n");
        sb.append("    processCmd: ").append(toIndentedString(processCmd)).append("\n");
        sb.append("    processPid: ").append(toIndentedString(processPid)).append("\n");
        sb.append("    processEnv: ").append(toIndentedString(processEnv)).append("\n");
        sb.append("    webAppName: ").append(toIndentedString(webAppName)).append("\n");
        sb.append("    eventTime: ").append(toIndentedString(eventTime)).append("\n");
        sb.append("    hostInfo: ").append(toIndentedString(hostInfo)).append("\n");
        sb.append("    containerInfo: ").append(toIndentedString(containerInfo)).append("\n");
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
