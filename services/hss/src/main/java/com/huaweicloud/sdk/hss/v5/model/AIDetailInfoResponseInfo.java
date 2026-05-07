package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释** AI组件详情信息 
 */
public class AIDetailInfoResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_name")

    private String serverName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ip")

    private String serverIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_application")

    private String aiApplication;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ai_tool")

    private String aiTool;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_path")

    private String startupPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startup_time")

    private Long startupTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "install_path")

    private String installPath;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdline")

    private String cmdline;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "first_scan_time")

    private Long firstScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_scan_time")

    private Long latestScanTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_name")

    private String containerName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "container_id")

    private String containerId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pid")

    private Integer pid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ppid")

    private Integer ppid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "user")

    private String user;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "net_info")

    private List<AIProcessNetInfo> netInfo = null;

    public AIDetailInfoResponseInfo withServerName(String serverName) {
        this.serverName = serverName;
        return this;
    }

    /**
     * **参数解释**： category==host时 表示服务器名称 category==container时 表示节点名称 category==serverless时 表示实例名称 **取值范围**： 字符长度1-256位 
     * @return serverName
     */
    public String getServerName() {
        return serverName;
    }

    public void setServerName(String serverName) {
        this.serverName = serverName;
    }

    public AIDetailInfoResponseInfo withServerIp(String serverIp) {
        this.serverIp = serverIp;
        return this;
    }

    /**
     * **参数解释**： category==host时 表示服务器IP地址 category==container时 表示节点IP地址 category==serverless时 表示实例IP地址        **取值范围**： 字符长度1-128位 
     * @return serverIp
     */
    public String getServerIp() {
        return serverIp;
    }

    public void setServerIp(String serverIp) {
        this.serverIp = serverIp;
    }

    public AIDetailInfoResponseInfo withAiApplication(String aiApplication) {
        this.aiApplication = aiApplication;
        return this;
    }

    /**
     * **参数解释**： AI应用名称 **取值范围**： 字符长度1-256位 
     * @return aiApplication
     */
    public String getAiApplication() {
        return aiApplication;
    }

    public void setAiApplication(String aiApplication) {
        this.aiApplication = aiApplication;
    }

    public AIDetailInfoResponseInfo withAiTool(String aiTool) {
        this.aiTool = aiTool;
        return this;
    }

    /**
     * **参数解释**： AI工具名称 **取值范围**： 字符长度1-256位 
     * @return aiTool
     */
    public String getAiTool() {
        return aiTool;
    }

    public void setAiTool(String aiTool) {
        this.aiTool = aiTool;
    }

    public AIDetailInfoResponseInfo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**： AI应用类型 **取值范围**： 字符长度1-256位 
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public AIDetailInfoResponseInfo withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * **参数解释**： 版本号 **取值范围**： 字符长度1-64位 
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public AIDetailInfoResponseInfo withStartupPath(String startupPath) {
        this.startupPath = startupPath;
        return this;
    }

    /**
     * **参数解释**： 应用启动路径 **取值范围**： 字符长度1-512位 
     * @return startupPath
     */
    public String getStartupPath() {
        return startupPath;
    }

    public void setStartupPath(String startupPath) {
        this.startupPath = startupPath;
    }

    public AIDetailInfoResponseInfo withStartupTime(Long startupTime) {
        this.startupTime = startupTime;
        return this;
    }

    /**
     * **参数解释**： 应用启动时间 **取值范围**： 时间戳，毫秒级 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return startupTime
     */
    public Long getStartupTime() {
        return startupTime;
    }

    public void setStartupTime(Long startupTime) {
        this.startupTime = startupTime;
    }

    public AIDetailInfoResponseInfo withInstallPath(String installPath) {
        this.installPath = installPath;
        return this;
    }

    /**
     * **参数解释**： 安装路径 **取值范围**： 字符长度1-512位 
     * @return installPath
     */
    public String getInstallPath() {
        return installPath;
    }

    public void setInstallPath(String installPath) {
        this.installPath = installPath;
    }

    public AIDetailInfoResponseInfo withCmdline(String cmdline) {
        this.cmdline = cmdline;
        return this;
    }

    /**
     * **参数解释**： 应用启动命令行 **取值范围**： 字符长度1-512位 
     * @return cmdline
     */
    public String getCmdline() {
        return cmdline;
    }

    public void setCmdline(String cmdline) {
        this.cmdline = cmdline;
    }

    public AIDetailInfoResponseInfo withFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
        return this;
    }

    /**
     * **参数解释**： 首次扫描时间 **取值范围**： 时间戳，毫秒级 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return firstScanTime
     */
    public Long getFirstScanTime() {
        return firstScanTime;
    }

    public void setFirstScanTime(Long firstScanTime) {
        this.firstScanTime = firstScanTime;
    }

    public AIDetailInfoResponseInfo withLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
        return this;
    }

    /**
     * **参数解释**： 最近一次扫描时间 **取值范围**： 时间戳，毫秒级 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return latestScanTime
     */
    public Long getLatestScanTime() {
        return latestScanTime;
    }

    public void setLatestScanTime(Long latestScanTime) {
        this.latestScanTime = latestScanTime;
    }

    public AIDetailInfoResponseInfo withContainerName(String containerName) {
        this.containerName = containerName;
        return this;
    }

    /**
     * **参数解释**： 容器名称 **取值范围**： 字符长度1-256位 
     * @return containerName
     */
    public String getContainerName() {
        return containerName;
    }

    public void setContainerName(String containerName) {
        this.containerName = containerName;
    }

    public AIDetailInfoResponseInfo withContainerId(String containerId) {
        this.containerId = containerId;
        return this;
    }

    /**
     * **参数解释**： 容器ID **取值范围**： 字符长度1-128位 
     * @return containerId
     */
    public String getContainerId() {
        return containerId;
    }

    public void setContainerId(String containerId) {
        this.containerId = containerId;
    }

    public AIDetailInfoResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器ID，查看服务器详情使用 **取值范围**： 字符长度1-128位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public AIDetailInfoResponseInfo withPid(Integer pid) {
        this.pid = pid;
        return this;
    }

    /**
     * **参数解释**： 应用进程PID **取值范围**： 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return pid
     */
    public Integer getPid() {
        return pid;
    }

    public void setPid(Integer pid) {
        this.pid = pid;
    }

    public AIDetailInfoResponseInfo withPpid(Integer ppid) {
        this.ppid = ppid;
        return this;
    }

    /**
     * **参数解释**： 应用进程的父进程PID **取值范围**： 取值0-2147483647 
     * minimum: 0
     * maximum: 2147483647
     * @return ppid
     */
    public Integer getPpid() {
        return ppid;
    }

    public void setPpid(Integer ppid) {
        this.ppid = ppid;
    }

    public AIDetailInfoResponseInfo withUser(String user) {
        this.user = user;
        return this;
    }

    /**
     * **参数解释**： 应用运行用户 **取值范围**： 字符长度1-128位 
     * @return user
     */
    public String getUser() {
        return user;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public AIDetailInfoResponseInfo withNetInfo(List<AIProcessNetInfo> netInfo) {
        this.netInfo = netInfo;
        return this;
    }

    public AIDetailInfoResponseInfo addNetInfoItem(AIProcessNetInfo netInfoItem) {
        if (this.netInfo == null) {
            this.netInfo = new ArrayList<>();
        }
        this.netInfo.add(netInfoItem);
        return this;
    }

    public AIDetailInfoResponseInfo withNetInfo(Consumer<List<AIProcessNetInfo>> netInfoSetter) {
        if (this.netInfo == null) {
            this.netInfo = new ArrayList<>();
        }
        netInfoSetter.accept(this.netInfo);
        return this;
    }

    /**
     * **参数解释**： 应用进程监听网络信息 
     * @return netInfo
     */
    public List<AIProcessNetInfo> getNetInfo() {
        return netInfo;
    }

    public void setNetInfo(List<AIProcessNetInfo> netInfo) {
        this.netInfo = netInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AIDetailInfoResponseInfo that = (AIDetailInfoResponseInfo) obj;
        return Objects.equals(this.serverName, that.serverName) && Objects.equals(this.serverIp, that.serverIp)
            && Objects.equals(this.aiApplication, that.aiApplication) && Objects.equals(this.aiTool, that.aiTool)
            && Objects.equals(this.type, that.type) && Objects.equals(this.version, that.version)
            && Objects.equals(this.startupPath, that.startupPath) && Objects.equals(this.startupTime, that.startupTime)
            && Objects.equals(this.installPath, that.installPath) && Objects.equals(this.cmdline, that.cmdline)
            && Objects.equals(this.firstScanTime, that.firstScanTime)
            && Objects.equals(this.latestScanTime, that.latestScanTime)
            && Objects.equals(this.containerName, that.containerName)
            && Objects.equals(this.containerId, that.containerId) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.pid, that.pid) && Objects.equals(this.ppid, that.ppid)
            && Objects.equals(this.user, that.user) && Objects.equals(this.netInfo, that.netInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverName,
            serverIp,
            aiApplication,
            aiTool,
            type,
            version,
            startupPath,
            startupTime,
            installPath,
            cmdline,
            firstScanTime,
            latestScanTime,
            containerName,
            containerId,
            hostId,
            pid,
            ppid,
            user,
            netInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AIDetailInfoResponseInfo {\n");
        sb.append("    serverName: ").append(toIndentedString(serverName)).append("\n");
        sb.append("    serverIp: ").append(toIndentedString(serverIp)).append("\n");
        sb.append("    aiApplication: ").append(toIndentedString(aiApplication)).append("\n");
        sb.append("    aiTool: ").append(toIndentedString(aiTool)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
        sb.append("    startupPath: ").append(toIndentedString(startupPath)).append("\n");
        sb.append("    startupTime: ").append(toIndentedString(startupTime)).append("\n");
        sb.append("    installPath: ").append(toIndentedString(installPath)).append("\n");
        sb.append("    cmdline: ").append(toIndentedString(cmdline)).append("\n");
        sb.append("    firstScanTime: ").append(toIndentedString(firstScanTime)).append("\n");
        sb.append("    latestScanTime: ").append(toIndentedString(latestScanTime)).append("\n");
        sb.append("    containerName: ").append(toIndentedString(containerName)).append("\n");
        sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    pid: ").append(toIndentedString(pid)).append("\n");
        sb.append("    ppid: ").append(toIndentedString(ppid)).append("\n");
        sb.append("    user: ").append(toIndentedString(user)).append("\n");
        sb.append("    netInfo: ").append(toIndentedString(netInfo)).append("\n");
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
