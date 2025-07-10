package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 桌面agent安装情况。
 */
public class AgentsCondition {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_id")

    private String desktopId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_name")

    private String desktopName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "desktop_pool_id")

    private String desktopPoolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "task_status")

    private String taskStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ip_address")

    private String ipAddress;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "process")

    private Integer process;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_info")

    private List<AgentInfo> agentInfo = null;

    public AgentsCondition withDesktopId(String desktopId) {
        this.desktopId = desktopId;
        return this;
    }

    /**
     * 桌面的desktopId。
     * @return desktopId
     */
    public String getDesktopId() {
        return desktopId;
    }

    public void setDesktopId(String desktopId) {
        this.desktopId = desktopId;
    }

    public AgentsCondition withDesktopName(String desktopName) {
        this.desktopName = desktopName;
        return this;
    }

    /**
     * 桌面名称。
     * @return desktopName
     */
    public String getDesktopName() {
        return desktopName;
    }

    public void setDesktopName(String desktopName) {
        this.desktopName = desktopName;
    }

    public AgentsCondition withDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
        return this;
    }

    /**
     * 桌面池id。
     * @return desktopPoolId
     */
    public String getDesktopPoolId() {
        return desktopPoolId;
    }

    public void setDesktopPoolId(String desktopPoolId) {
        this.desktopPoolId = desktopPoolId;
    }

    public AgentsCondition withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 桌面运行状态。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public AgentsCondition withTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
        return this;
    }

    /**
     * 桌面的任务状态。
     * @return taskStatus
     */
    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }

    public AgentsCondition withIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
        return this;
    }

    /**
     * ip地址。
     * @return ipAddress
     */
    public String getIpAddress() {
        return ipAddress;
    }

    public void setIpAddress(String ipAddress) {
        this.ipAddress = ipAddress;
    }

    public AgentsCondition withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public AgentsCondition withProcess(Integer process) {
        this.process = process;
        return this;
    }

    /**
     * 桌面任务进度， 取值范围0-100以及null，null表示该桌面无任务，0-100表明该任务进度的百分比。
     * @return process
     */
    public Integer getProcess() {
        return process;
    }

    public void setProcess(Integer process) {
        this.process = process;
    }

    public AgentsCondition withAgentInfo(List<AgentInfo> agentInfo) {
        this.agentInfo = agentInfo;
        return this;
    }

    public AgentsCondition addAgentInfoItem(AgentInfo agentInfoItem) {
        if (this.agentInfo == null) {
            this.agentInfo = new ArrayList<>();
        }
        this.agentInfo.add(agentInfoItem);
        return this;
    }

    public AgentsCondition withAgentInfo(Consumer<List<AgentInfo>> agentInfoSetter) {
        if (this.agentInfo == null) {
            this.agentInfo = new ArrayList<>();
        }
        agentInfoSetter.accept(this.agentInfo);
        return this;
    }

    /**
     * 单个桌面内的agent安装情况。
     * @return agentInfo
     */
    public List<AgentInfo> getAgentInfo() {
        return agentInfo;
    }

    public void setAgentInfo(List<AgentInfo> agentInfo) {
        this.agentInfo = agentInfo;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AgentsCondition that = (AgentsCondition) obj;
        return Objects.equals(this.desktopId, that.desktopId) && Objects.equals(this.desktopName, that.desktopName)
            && Objects.equals(this.desktopPoolId, that.desktopPoolId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.taskStatus, that.taskStatus) && Objects.equals(this.ipAddress, that.ipAddress)
            && Objects.equals(this.enterpriseProjectId, that.enterpriseProjectId)
            && Objects.equals(this.process, that.process) && Objects.equals(this.agentInfo, that.agentInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(desktopId,
            desktopName,
            desktopPoolId,
            status,
            taskStatus,
            ipAddress,
            enterpriseProjectId,
            process,
            agentInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AgentsCondition {\n");
        sb.append("    desktopId: ").append(toIndentedString(desktopId)).append("\n");
        sb.append("    desktopName: ").append(toIndentedString(desktopName)).append("\n");
        sb.append("    desktopPoolId: ").append(toIndentedString(desktopPoolId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    taskStatus: ").append(toIndentedString(taskStatus)).append("\n");
        sb.append("    ipAddress: ").append(toIndentedString(ipAddress)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    process: ").append(toIndentedString(process)).append("\n");
        sb.append("    agentInfo: ").append(toIndentedString(agentInfo)).append("\n");
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
