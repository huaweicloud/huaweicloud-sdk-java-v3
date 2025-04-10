package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ServerAppStatusResponseInfo
 */
public class ServerAppStatusResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "web_midware")

    private String webMidware;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jdk_version")

    private String jdkVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "port_list")

    private List<Integer> portList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmd_line")

    private String cmdLine;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_info")

    private String errorInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "app_protect_status")

    private Integer appProtectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "chk_feature_name")

    private String chkFeatureName;

    public ServerAppStatusResponseInfo withWebMidware(String webMidware) {
        this.webMidware = webMidware;
        return this;
    }

    /**
     * web中间件名称
     * @return webMidware
     */
    public String getWebMidware() {
        return webMidware;
    }

    public void setWebMidware(String webMidware) {
        this.webMidware = webMidware;
    }

    public ServerAppStatusResponseInfo withJdkVersion(String jdkVersion) {
        this.jdkVersion = jdkVersion;
        return this;
    }

    /**
     * jdk版本
     * @return jdkVersion
     */
    public String getJdkVersion() {
        return jdkVersion;
    }

    public void setJdkVersion(String jdkVersion) {
        this.jdkVersion = jdkVersion;
    }

    public ServerAppStatusResponseInfo withPortList(List<Integer> portList) {
        this.portList = portList;
        return this;
    }

    public ServerAppStatusResponseInfo addPortListItem(Integer portListItem) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        this.portList.add(portListItem);
        return this;
    }

    public ServerAppStatusResponseInfo withPortList(Consumer<List<Integer>> portListSetter) {
        if (this.portList == null) {
            this.portList = new ArrayList<>();
        }
        portListSetter.accept(this.portList);
        return this;
    }

    /**
     * java应用监听的端口列表
     * @return portList
     */
    public List<Integer> getPortList() {
        return portList;
    }

    public void setPortList(List<Integer> portList) {
        this.portList = portList;
    }

    public ServerAppStatusResponseInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * process id
     * minimum: 0
     * maximum: 2097152
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public ServerAppStatusResponseInfo withCmdLine(String cmdLine) {
        this.cmdLine = cmdLine;
        return this;
    }

    /**
     * 启动命令
     * @return cmdLine
     */
    public String getCmdLine() {
        return cmdLine;
    }

    public void setCmdLine(String cmdLine) {
        this.cmdLine = cmdLine;
    }

    public ServerAppStatusResponseInfo withErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
        return this;
    }

    /**
     * 动态接入报错信息
     * @return errorInfo
     */
    public String getErrorInfo() {
        return errorInfo;
    }

    public void setErrorInfo(String errorInfo) {
        this.errorInfo = errorInfo;
    }

    public ServerAppStatusResponseInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 应用启动时间，毫秒级时间戳(ms)
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public ServerAppStatusResponseInfo withAppProtectStatus(Integer appProtectStatus) {
        this.appProtectStatus = appProtectStatus;
        return this;
    }

    /**
     * java应用防护状态，包含如下4种。 - 0 ：未防护。 - 1 ：防护失败。 - 2 ：手动防护成功。 - 3 ：自动防护成功
     * minimum: 0
     * maximum: 4
     * @return appProtectStatus
     */
    public Integer getAppProtectStatus() {
        return appProtectStatus;
    }

    public void setAppProtectStatus(Integer appProtectStatus) {
        this.appProtectStatus = appProtectStatus;
    }

    public ServerAppStatusResponseInfo withChkFeatureName(String chkFeatureName) {
        this.chkFeatureName = chkFeatureName;
        return this;
    }

    /**
     * 检测规则标识
     * @return chkFeatureName
     */
    public String getChkFeatureName() {
        return chkFeatureName;
    }

    public void setChkFeatureName(String chkFeatureName) {
        this.chkFeatureName = chkFeatureName;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerAppStatusResponseInfo that = (ServerAppStatusResponseInfo) obj;
        return Objects.equals(this.webMidware, that.webMidware) && Objects.equals(this.jdkVersion, that.jdkVersion)
            && Objects.equals(this.portList, that.portList) && Objects.equals(this.pid, that.pid)
            && Objects.equals(this.cmdLine, that.cmdLine) && Objects.equals(this.errorInfo, that.errorInfo)
            && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.appProtectStatus, that.appProtectStatus)
            && Objects.equals(this.chkFeatureName, that.chkFeatureName);
    }

    @Override
    public int hashCode() {
        return Objects.hash(webMidware,
            jdkVersion,
            portList,
            pid,
            cmdLine,
            errorInfo,
            startTime,
            appProtectStatus,
            chkFeatureName);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerAppStatusResponseInfo {\n");
        sb.append("    webMidware: ").append(toIndentedString(webMidware)).append("\n");
        sb.append("    jdkVersion: ").append(toIndentedString(jdkVersion)).append("\n");
        sb.append("    portList: ").append(toIndentedString(portList)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    cmdLine: ").append(toIndentedString(cmdLine)).append("\n");
        sb.append("    errorInfo: ").append(toIndentedString(errorInfo)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    appProtectStatus: ").append(toIndentedString(appProtectStatus)).append("\n");
        sb.append("    chkFeatureName: ").append(toIndentedString(chkFeatureName)).append("\n");
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
