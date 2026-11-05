package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**：事件关联节点信息列表详情。 **取值范围**：不涉及。
 */
public class NodeEvent {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "eventId")

    private String eventId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "isFaultNode")

    private Boolean isFaultNode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodeName")

    private String nodeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceId")

    private String instanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instanceType")

    private String instanceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "underLyingInstanceId")

    private String underLyingInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavorSupportRedeploy")

    private Boolean flavorSupportRedeploy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolName")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "poolDisplayName")

    private String poolDisplayName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "publishTime")

    private String publishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "startTime")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "finishTime")

    private String finishTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "jobProgress")

    private String jobProgress;

    public NodeEvent withEventId(String eventId) {
        this.eventId = eventId;
        return this;
    }

    /**
     * **参数解释**：Iaas计划事件Id。 **取值范围**：不涉及。
     * @return eventId
     */
    public String getEventId() {
        return eventId;
    }

    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    public NodeEvent withIsFaultNode(Boolean isFaultNode) {
        this.isFaultNode = isFaultNode;
        return this;
    }

    /**
     * **参数解释**：是否故障节点。 **取值范围**：不涉及。
     * @return isFaultNode
     */
    public Boolean getIsFaultNode() {
        return isFaultNode;
    }

    public void setIsFaultNode(Boolean isFaultNode) {
        this.isFaultNode = isFaultNode;
    }

    public NodeEvent withNodeName(String nodeName) {
        this.nodeName = nodeName;
        return this;
    }

    /**
     * **参数解释**：节点名称。 **取值范围**：不涉及。
     * @return nodeName
     */
    public String getNodeName() {
        return nodeName;
    }

    public void setNodeName(String nodeName) {
        this.nodeName = nodeName;
    }

    public NodeEvent withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    /**
     * **参数解释**：节点ID。 **取值范围**：不涉及。
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    public NodeEvent withInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }

    /**
     * **参数解释**：实例类型。 **取值范围**：不涉及。
     * @return instanceType
     */
    public String getInstanceType() {
        return instanceType;
    }

    public void setInstanceType(String instanceType) {
        this.instanceType = instanceType;
    }

    public NodeEvent withUnderLyingInstanceId(String underLyingInstanceId) {
        this.underLyingInstanceId = underLyingInstanceId;
        return this;
    }

    /**
     * **参数解释**：底层实例Id。 **取值范围**：不涉及。
     * @return underLyingInstanceId
     */
    public String getUnderLyingInstanceId() {
        return underLyingInstanceId;
    }

    public void setUnderLyingInstanceId(String underLyingInstanceId) {
        this.underLyingInstanceId = underLyingInstanceId;
    }

    public NodeEvent withFlavorSupportRedeploy(Boolean flavorSupportRedeploy) {
        this.flavorSupportRedeploy = flavorSupportRedeploy;
        return this;
    }

    /**
     * **参数解释**：节点规格是否支持重部署。 **取值范围**：不涉及。
     * @return flavorSupportRedeploy
     */
    public Boolean getFlavorSupportRedeploy() {
        return flavorSupportRedeploy;
    }

    public void setFlavorSupportRedeploy(Boolean flavorSupportRedeploy) {
        this.flavorSupportRedeploy = flavorSupportRedeploy;
    }

    public NodeEvent withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：资源池名称。 **取值范围**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public NodeEvent withPoolDisplayName(String poolDisplayName) {
        this.poolDisplayName = poolDisplayName;
        return this;
    }

    /**
     * **参数解释**：资源池显示名称。 **取值范围**：不涉及。
     * @return poolDisplayName
     */
    public String getPoolDisplayName() {
        return poolDisplayName;
    }

    public void setPoolDisplayName(String poolDisplayName) {
        this.poolDisplayName = poolDisplayName;
    }

    public NodeEvent withState(String state) {
        this.state = state;
        return this;
    }

    /**
     * **参数解释**：Iaas计划事件状态。 **取值范围**：不涉及。
     * @return state
     */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public NodeEvent withPublishTime(String publishTime) {
        this.publishTime = publishTime;
        return this;
    }

    /**
     * **参数解释**：Iaas事件发布时间。 **取值范围**：不涉及。
     * @return publishTime
     */
    public String getPublishTime() {
        return publishTime;
    }

    public void setPublishTime(String publishTime) {
        this.publishTime = publishTime;
    }

    public NodeEvent withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：Iaas事件开始时间。 **取值范围**：不涉及。
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public NodeEvent withFinishTime(String finishTime) {
        this.finishTime = finishTime;
        return this;
    }

    /**
     * **参数解释**：Iaas事件完成时间。 **取值范围**：不涉及。
     * @return finishTime
     */
    public String getFinishTime() {
        return finishTime;
    }

    public void setFinishTime(String finishTime) {
        this.finishTime = finishTime;
    }

    public NodeEvent withJobProgress(String jobProgress) {
        this.jobProgress = jobProgress;
        return this;
    }

    /**
     * **参数解释**：重部署进度。 **取值范围**：不涉及。
     * @return jobProgress
     */
    public String getJobProgress() {
        return jobProgress;
    }

    public void setJobProgress(String jobProgress) {
        this.jobProgress = jobProgress;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        NodeEvent that = (NodeEvent) obj;
        return Objects.equals(this.eventId, that.eventId) && Objects.equals(this.isFaultNode, that.isFaultNode)
            && Objects.equals(this.nodeName, that.nodeName) && Objects.equals(this.instanceId, that.instanceId)
            && Objects.equals(this.instanceType, that.instanceType)
            && Objects.equals(this.underLyingInstanceId, that.underLyingInstanceId)
            && Objects.equals(this.flavorSupportRedeploy, that.flavorSupportRedeploy)
            && Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.poolDisplayName, that.poolDisplayName) && Objects.equals(this.state, that.state)
            && Objects.equals(this.publishTime, that.publishTime) && Objects.equals(this.startTime, that.startTime)
            && Objects.equals(this.finishTime, that.finishTime) && Objects.equals(this.jobProgress, that.jobProgress);
    }

    @Override
    public int hashCode() {
        return Objects.hash(eventId,
            isFaultNode,
            nodeName,
            instanceId,
            instanceType,
            underLyingInstanceId,
            flavorSupportRedeploy,
            poolName,
            poolDisplayName,
            state,
            publishTime,
            startTime,
            finishTime,
            jobProgress);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class NodeEvent {\n");
        sb.append("    eventId: ").append(toIndentedString(eventId)).append("\n");
        sb.append("    isFaultNode: ").append(toIndentedString(isFaultNode)).append("\n");
        sb.append("    nodeName: ").append(toIndentedString(nodeName)).append("\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    instanceType: ").append(toIndentedString(instanceType)).append("\n");
        sb.append("    underLyingInstanceId: ").append(toIndentedString(underLyingInstanceId)).append("\n");
        sb.append("    flavorSupportRedeploy: ").append(toIndentedString(flavorSupportRedeploy)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    poolDisplayName: ").append(toIndentedString(poolDisplayName)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    publishTime: ").append(toIndentedString(publishTime)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    finishTime: ").append(toIndentedString(finishTime)).append("\n");
        sb.append("    jobProgress: ").append(toIndentedString(jobProgress)).append("\n");
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
