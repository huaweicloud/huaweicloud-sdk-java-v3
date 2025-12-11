package com.huaweicloud.sdk.hss.v5.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * AppliedHostListDataList
 */
public class AppliedHostListDataList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_id")

    private String hostId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "host_name")

    private String hostName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "private_ip")

    private String privateIp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_id")

    private String agentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "conflict_port")

    private List<Integer> conflictPort = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "applied_port")

    private List<Integer> appliedPort = null;

    public AppliedHostListDataList withHostId(String hostId) {
        this.hostId = hostId;
        return this;
    }

    /**
     * **参数解释**： 服务器（主机）的唯一标识ID **取值范围**： 字符长度1-64位 
     * @return hostId
     */
    public String getHostId() {
        return hostId;
    }

    public void setHostId(String hostId) {
        this.hostId = hostId;
    }

    public AppliedHostListDataList withHostName(String hostName) {
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

    public AppliedHostListDataList withPrivateIp(String privateIp) {
        this.privateIp = privateIp;
        return this;
    }

    /**
     * **参数解释**： 服务器私有IP **取值范围**： 字符长度1-128位 
     * @return privateIp
     */
    public String getPrivateIp() {
        return privateIp;
    }

    public void setPrivateIp(String privateIp) {
        this.privateIp = privateIp;
    }

    public AppliedHostListDataList withAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }

    /**
     * **参数解释**: 主机上安装的杀毒Agent的唯一标识ID，用于关联主机与杀毒服务 **约束限制**: 不涉及 **取值范围**: 字符长度1-64位 **默认取值**: 不涉及 
     * @return agentId
     */
    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public AppliedHostListDataList withConflictPort(List<Integer> conflictPort) {
        this.conflictPort = conflictPort;
        return this;
    }

    public AppliedHostListDataList addConflictPortItem(Integer conflictPortItem) {
        if (this.conflictPort == null) {
            this.conflictPort = new ArrayList<>();
        }
        this.conflictPort.add(conflictPortItem);
        return this;
    }

    public AppliedHostListDataList withConflictPort(Consumer<List<Integer>> conflictPortSetter) {
        if (this.conflictPort == null) {
            this.conflictPort = new ArrayList<>();
        }
        conflictPortSetter.accept(this.conflictPort);
        return this;
    }

    /**
     * 冲突的端口
     * @return conflictPort
     */
    public List<Integer> getConflictPort() {
        return conflictPort;
    }

    public void setConflictPort(List<Integer> conflictPort) {
        this.conflictPort = conflictPort;
    }

    public AppliedHostListDataList withAppliedPort(List<Integer> appliedPort) {
        this.appliedPort = appliedPort;
        return this;
    }

    public AppliedHostListDataList addAppliedPortItem(Integer appliedPortItem) {
        if (this.appliedPort == null) {
            this.appliedPort = new ArrayList<>();
        }
        this.appliedPort.add(appliedPortItem);
        return this;
    }

    public AppliedHostListDataList withAppliedPort(Consumer<List<Integer>> appliedPortSetter) {
        if (this.appliedPort == null) {
            this.appliedPort = new ArrayList<>();
        }
        appliedPortSetter.accept(this.appliedPort);
        return this;
    }

    /**
     * 应用端口
     * @return appliedPort
     */
    public List<Integer> getAppliedPort() {
        return appliedPort;
    }

    public void setAppliedPort(List<Integer> appliedPort) {
        this.appliedPort = appliedPort;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AppliedHostListDataList that = (AppliedHostListDataList) obj;
        return Objects.equals(this.hostId, that.hostId) && Objects.equals(this.hostName, that.hostName)
            && Objects.equals(this.privateIp, that.privateIp) && Objects.equals(this.agentId, that.agentId)
            && Objects.equals(this.conflictPort, that.conflictPort)
            && Objects.equals(this.appliedPort, that.appliedPort);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hostId, hostName, privateIp, agentId, conflictPort, appliedPort);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AppliedHostListDataList {\n");
        sb.append("    hostId: ").append(toIndentedString(hostId)).append("\n");
        sb.append("    hostName: ").append(toIndentedString(hostName)).append("\n");
        sb.append("    privateIp: ").append(toIndentedString(privateIp)).append("\n");
        sb.append("    agentId: ").append(toIndentedString(agentId)).append("\n");
        sb.append("    conflictPort: ").append(toIndentedString(conflictPort)).append("\n");
        sb.append("    appliedPort: ").append(toIndentedString(appliedPort)).append("\n");
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
