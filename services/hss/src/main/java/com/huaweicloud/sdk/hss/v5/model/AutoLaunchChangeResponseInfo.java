package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 自启动项变动历史信息
 */
public class AutoLaunchChangeResponseInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "variation_type")

    private String variationType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private Integer type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "path")

    private String path;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hash")

    private String hash;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_user")

    private String runUser;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recent_scan_time")

    private Long recentScanTime;

    public AutoLaunchChangeResponseInfo withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: Agent ID **取值范围**: 字符长度1-64位 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AutoLaunchChangeResponseInfo withVariationType(String variationType) {
        this.variationType = variationType;
        return this;
    }

    /**
     * **参数解释**: 变更类型 **取值范围**: - add：新建 - delete：删除 - modify：修改 
     * @return variationType
     */
    public String getVariationType() {
        return variationType;
    }

    public void setVariationType(String variationType) {
        this.variationType = variationType;
    }

    public AutoLaunchChangeResponseInfo withType(Integer type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**: 自启动项类型 **取值范围**: - 0：自启动服务 - 1：定时任务 - 2：预加载动态库 - 3：Run注册表键 - 4：开机启动文件夹 
     * minimum: 0
     * maximum: 11
     * @return type
     */
    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public AutoLaunchChangeResponseInfo withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 主机ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public AutoLaunchChangeResponseInfo withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * **参数解释**: 服务器名称 **取值范围**: 字符长度1-256位 
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public AutoLaunchChangeResponseInfo withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * **参数解释**: 主机IP **取值范围**: 字符长度1-128位 
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public AutoLaunchChangeResponseInfo withPath(String path) {
        this.path = path;
        return this;
    }

    /**
     * **参数解释**: 自启动项的路径 **取值范围**: 字符长度1-256位 
     * @return path
     */
    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public AutoLaunchChangeResponseInfo withHash(String hash) {
        this.hash = hash;
        return this;
    }

    /**
     * **参数解释**: 采用sha256算法生成的文件hash值 **取值范围**: 字符长度1-128位 
     * @return hash
     */
    public String getHash() {
        return hash;
    }

    public void setHash(String hash) {
        this.hash = hash;
    }

    public AutoLaunchChangeResponseInfo withRunUser(String runUser) {
        this.runUser = runUser;
        return this;
    }

    /**
     * **参数解释**: 运行用户 **取值范围**: 字符长度1-64位 
     * @return runUser
     */
    public String getRunUser() {
        return runUser;
    }

    public void setRunUser(String runUser) {
        this.runUser = runUser;
    }

    public AutoLaunchChangeResponseInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 自启动项名称 **取值范围**: 字符长度1-256位 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public AutoLaunchChangeResponseInfo withRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
        return this;
    }

    /**
     * **参数解释**: 最近更新时间，13位时间戳 **取值范围**: 最小值0，最大值9223372036854775807 
     * minimum: 0
     * maximum: 9223372036854775807
     * @return recentScanTime
     */
    public Long getRecentScanTime() {
        return recentScanTime;
    }

    public void setRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AutoLaunchChangeResponseInfo that = (AutoLaunchChangeResponseInfo) obj;
        return Objects.equals(this.agentId, that.agentId) && Objects.equals(this.variationType, that.variationType)
            && Objects.equals(this.type, that.type) && Objects.equals(this.hostId, that.hostId)
            && Objects.equals(this.hostName, that.hostName) && Objects.equals(this.hostIp, that.hostIp)
            && Objects.equals(this.path, that.path) && Objects.equals(this.hash, that.hash)
            && Objects.equals(this.runUser, that.runUser) && Objects.equals(this.name, that.name)
            && Objects.equals(this.recentScanTime, that.recentScanTime);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(agentId, variationType, type, hostId, hostName, hostIp, path, hash, runUser, name, recentScanTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AutoLaunchChangeResponseInfo {\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    variationType: ").append(toIndentedString(variationType)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    path: ").append(toIndentedString(path)).append("\n");
        sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
        sb.append("    runUser: ").append(toIndentedString(runUser)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    recentScanTime: ").append(toIndentedString(recentScanTime)).append("\n");
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
