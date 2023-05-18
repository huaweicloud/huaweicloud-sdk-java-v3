package com.huaweicloud.sdk.cbr.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 
 */
public class Agent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_version")

    private String agentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_type")

    private String agentType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_nickname")

    private String hostNickname;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_ip")

    private String hostIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_os")

    private String hostOs;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "last_active_time")

    private OffsetDateTime lastActiveTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "paths")

    private List<Path> paths = null;

    public Agent withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 客户端创建时间
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public Agent withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 客户端更新时间
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public Agent withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * 客户端ID
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public Agent withAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
        return this;
    }

    /**
     * 客户端版本号
     * @return agentVersion
     */
    public String getAgentVersion() {
        return agentVersion;
    }

    public void setAgentVersion(String agentVersion) {
        this.agentVersion = agentVersion;
    }

    public Agent withAgentType(String agentType) {
        this.agentType = agentType;
        return this;
    }

    /**
     * 客户端类型
     * @return agentType
     */
    public String getAgentType() {
        return agentType;
    }

    public void setAgentType(String agentType) {
        this.agentType = agentType;
    }

    public Agent withHostName(String hostName) {
        this.hostName = hostName;
        return this;
    }

    /**
     * 客户端所在的主机名
     * @return hostName
     */
    public String getHostName() {
        return hostName;
    }

    public void setHostName(String hostName) {
        this.hostName = hostName;
    }

    public Agent withHostNickname(String hostNickname) {
        this.hostNickname = hostNickname;
        return this;
    }

    /**
     * 客户端所在的主机昵称
     * @return hostNickname
     */
    public String getHostNickname() {
        return hostNickname;
    }

    public void setHostNickname(String hostNickname) {
        this.hostNickname = hostNickname;
    }

    public Agent withHostIp(String hostIp) {
        this.hostIp = hostIp;
        return this;
    }

    /**
     * 客户端所在主机的IP
     * @return hostIp
     */
    public String getHostIp() {
        return hostIp;
    }

    public void setHostIp(String hostIp) {
        this.hostIp = hostIp;
    }

    public Agent withHostOs(String hostOs) {
        this.hostOs = hostOs;
        return this;
    }

    /**
     * 客户端主机所在的操作系统
     * @return hostOs
     */
    public String getHostOs() {
        return hostOs;
    }

    public void setHostOs(String hostOs) {
        this.hostOs = hostOs;
    }

    public Agent withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 客户端状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Agent withLastActiveTime(OffsetDateTime lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
        return this;
    }

    /**
     * 客户端上次激活时间
     * @return lastActiveTime
     */
    public OffsetDateTime getLastActiveTime() {
        return lastActiveTime;
    }

    public void setLastActiveTime(OffsetDateTime lastActiveTime) {
        this.lastActiveTime = lastActiveTime;
    }

    public Agent withPaths(List<Path> paths) {
        this.paths = paths;
        return this;
    }

    public Agent addPathsItem(Path pathsItem) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        this.paths.add(pathsItem);
        return this;
    }

    public Agent withPaths(Consumer<List<Path>> pathsSetter) {
        if (this.paths == null) {
            this.paths = new ArrayList<>();
        }
        pathsSetter.accept(this.paths);
        return this;
    }

    /**
     * 客户端的备份路径
     * @return paths
     */
    public List<Path> getPaths() {
        return paths;
    }

    public void setPaths(List<Path> paths) {
        this.paths = paths;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Agent agent = (Agent) o;
        return Objects.equals(this.createdAt, agent.createdAt) && Objects.equals(this.updatedAt, agent.updatedAt)
            && Objects.equals(this.agentId, agent.agentId) && Objects.equals(this.agentVersion, agent.agentVersion)
            && Objects.equals(this.agentType, agent.agentType) && Objects.equals(this.hostName, agent.hostName)
            && Objects.equals(this.hostNickname, agent.hostNickname) && Objects.equals(this.hostIp, agent.hostIp)
            && Objects.equals(this.hostOs, agent.hostOs) && Objects.equals(this.status, agent.status)
            && Objects.equals(this.lastActiveTime, agent.lastActiveTime) && Objects.equals(this.paths, agent.paths);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createdAt,
            updatedAt,
            agentId,
            agentVersion,
            agentType,
            hostName,
            hostNickname,
            hostIp,
            hostOs,
            status,
            lastActiveTime,
            paths);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Agent {\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    agentVersion: ").append(toIndentedString(agentVersion)).append("\n");
        sb.append("    agentType: ").append(toIndentedString(agentType)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    hostNickname: ").append(toIndentedString(hostNickname)).append("\n");
        sb.append("    hostIp: ").append(toIndentedString(hostIp)).append("\n");
        sb.append("    hostOs: ").append(toIndentedString(hostOs)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    lastActiveTime: ").append(toIndentedString(lastActiveTime)).append("\n");
        sb.append("    paths: ").append(toIndentedString(paths)).append("\n");
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
