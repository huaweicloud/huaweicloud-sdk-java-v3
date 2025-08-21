package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**：创建网络诊断作业请求体。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。 
 */
public class CreateNetworkParameterDiagnosisJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private OffsetDateTime endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<String> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "offering")

    private ModelArtsOffering offering;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private OffsetDateTime startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "train_job_id")

    private String trainJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    public CreateNetworkParameterDiagnosisJobRequestBody withEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * **参数解释**：网络诊断作业诊断结束时间。 **约束限制**：使用UTC时间格式。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return endTime
     */
    public OffsetDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(OffsetDateTime endTime) {
        this.endTime = endTime;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：作业名称。  **约束限制**：不涉及。  **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody addNodesItem(String nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withNodes(Consumer<List<String>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：作业对象，AI专属资源池/弹性集群中节点名称。 **约束限制**：不涉及。
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withOffering(ModelArtsOffering offering) {
        this.offering = offering;
        return this;
    }

    /**
     * Get offering
     * @return offering
     */
    public ModelArtsOffering getOffering() {
        return offering;
    }

    public void setOffering(ModelArtsOffering offering) {
        this.offering = offering;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：作业对象，AI专属资源池/弹性集群名称。 **约束限制**：offering取值为STANDARD，LITE-CLUSTER时生效。 **取值范围**：长度为[4,255]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。 
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * **参数解释**：服务器id。 **约束限制**：offering取值为LITE-CLUSTER，LITE-DEVSERVER时生效。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**：网络诊断作业诊断开始时间。 **约束限制**：使用UTC时间格式。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return startTime
     */
    public OffsetDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(OffsetDateTime startTime) {
        this.startTime = startTime;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withTrainJobId(String trainJobId) {
        this.trainJobId = trainJobId;
        return this;
    }

    /**
     * **参数解释**：作业对象，训练作业ID。  **约束限制**：offering取值为STANDARD时生效。  **取值范围**：仅允许输入合法的UUID字符串，且开头和结尾不能有空格。  **默认取值**：不涉及。
     * @return trainJobId
     */
    public String getTrainJobId() {
        return trainJobId;
    }

    public void setTrainJobId(String trainJobId) {
        this.trainJobId = trainJobId;
    }

    public CreateNetworkParameterDiagnosisJobRequestBody withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。 **约束限制**：不涉及。 **取值范围**：0或长度为32的字符串。 **默认取值**：0。 
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateNetworkParameterDiagnosisJobRequestBody that = (CreateNetworkParameterDiagnosisJobRequestBody) obj;
        return Objects.equals(this.endTime, that.endTime) && Objects.equals(this.name, that.name)
            && Objects.equals(this.nodes, that.nodes) && Objects.equals(this.offering, that.offering)
            && Objects.equals(this.poolName, that.poolName) && Objects.equals(this.serverIds, that.serverIds)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.trainJobId, that.trainJobId)
            && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(endTime, name, nodes, offering, poolName, serverIds, startTime, trainJobId, workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateNetworkParameterDiagnosisJobRequestBody {\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    offering: ").append(toIndentedString(offering)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    trainJobId: ").append(toIndentedString(trainJobId)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
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
