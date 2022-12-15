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
     * agent_id
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
     * the type of change   - add ：新建   - delete ：删除   - modify ：修改
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
     * 自启动项类型
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
     * host_id
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
     * 弹性服务器名称
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
     * 主机IP
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
     * 路径
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
     * 文件hash
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
     * 运行用户
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
     * 自启动项名称
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
     * 最近更新时间
     * minimum: 0
     * maximum: 4824430336000
     * @return recentScanTime
     */
    public Long getRecentScanTime() {
        return recentScanTime;
    }

    public void setRecentScanTime(Long recentScanTime) {
        this.recentScanTime = recentScanTime;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        AutoLaunchChangeResponseInfo autoLaunchChangeResponseInfo = (AutoLaunchChangeResponseInfo) o;
        return Objects.equals(this.agentId, autoLaunchChangeResponseInfo.agentId)
            && Objects.equals(this.variationType, autoLaunchChangeResponseInfo.variationType)
            && Objects.equals(this.type, autoLaunchChangeResponseInfo.type)
            && Objects.equals(this.hostId, autoLaunchChangeResponseInfo.hostId)
            && Objects.equals(this.hostName, autoLaunchChangeResponseInfo.hostName)
            && Objects.equals(this.hostIp, autoLaunchChangeResponseInfo.hostIp)
            && Objects.equals(this.path, autoLaunchChangeResponseInfo.path)
            && Objects.equals(this.hash, autoLaunchChangeResponseInfo.hash)
            && Objects.equals(this.runUser, autoLaunchChangeResponseInfo.runUser)
            && Objects.equals(this.name, autoLaunchChangeResponseInfo.name)
            && Objects.equals(this.recentScanTime, autoLaunchChangeResponseInfo.recentScanTime);
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
