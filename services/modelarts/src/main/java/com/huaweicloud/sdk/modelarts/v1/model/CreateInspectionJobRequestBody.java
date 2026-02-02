package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建巡检作业请求体
 */
public class CreateInspectionJobRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<String> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_nodes")

    private List<String> excludeNodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<InspectionType> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_configs")

    private List<ReqInspectionItemConfig> itemConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelarts_offering_type")

    private ModelArtsOffering modelartsOfferingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_object")

    private TenantDiagnosisObject diagnosisObject;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "exclude_node_ids")

    private List<String> excludeNodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    public CreateInspectionJobRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：巡检作业名称。 **约束限制**：不涉及。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。 **默认取值**：不涉及。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateInspectionJobRequestBody withPoolName(String poolName) {
        this.poolName = poolName;
        return this;
    }

    /**
     * **参数解释**：巡检对象，AI专属资源池/弹性集群名称。 **约束限制**：不涉及。 **取值范围**：长度为[4,255]的英文字符、数字、下划线(_)和中划线(-)的组合。 **默认取值**：不涉及。
     * @return poolName
     */
    public String getPoolName() {
        return poolName;
    }

    public void setPoolName(String poolName) {
        this.poolName = poolName;
    }

    public CreateInspectionJobRequestBody withWorkspaceId(String workspaceId) {
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

    public CreateInspectionJobRequestBody withNodes(List<String> nodes) {
        this.nodes = nodes;
        return this;
    }

    public CreateInspectionJobRequestBody addNodesItem(String nodesItem) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        this.nodes.add(nodesItem);
        return this;
    }

    public CreateInspectionJobRequestBody withNodes(Consumer<List<String>> nodesSetter) {
        if (this.nodes == null) {
            this.nodes = new ArrayList<>();
        }
        nodesSetter.accept(this.nodes);
        return this;
    }

    /**
     * **参数解释**：巡检对象，节点名称列表。 **约束限制**：不涉及。
     * @return nodes
     */
    public List<String> getNodes() {
        return nodes;
    }

    public void setNodes(List<String> nodes) {
        this.nodes = nodes;
    }

    public CreateInspectionJobRequestBody withExcludeNodes(List<String> excludeNodes) {
        this.excludeNodes = excludeNodes;
        return this;
    }

    public CreateInspectionJobRequestBody addExcludeNodesItem(String excludeNodesItem) {
        if (this.excludeNodes == null) {
            this.excludeNodes = new ArrayList<>();
        }
        this.excludeNodes.add(excludeNodesItem);
        return this;
    }

    public CreateInspectionJobRequestBody withExcludeNodes(Consumer<List<String>> excludeNodesSetter) {
        if (this.excludeNodes == null) {
            this.excludeNodes = new ArrayList<>();
        }
        excludeNodesSetter.accept(this.excludeNodes);
        return this;
    }

    /**
     * **参数解释**：巡检对象，排除（反选）节点名称列表。 **约束限制**：不涉及。
     * @return excludeNodes
     */
    public List<String> getExcludeNodes() {
        return excludeNodes;
    }

    public void setExcludeNodes(List<String> excludeNodes) {
        this.excludeNodes = excludeNodes;
    }

    public CreateInspectionJobRequestBody withTypes(List<InspectionType> types) {
        this.types = types;
        return this;
    }

    public CreateInspectionJobRequestBody addTypesItem(InspectionType typesItem) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        this.types.add(typesItem);
        return this;
    }

    public CreateInspectionJobRequestBody withTypes(Consumer<List<InspectionType>> typesSetter) {
        if (this.types == null) {
            this.types = new ArrayList<>();
        }
        typesSetter.accept(this.types);
        return this;
    }

    /**
     * **参数解释**：巡检类型列表。 **约束限制**：不涉及。
     * @return types
     */
    public List<InspectionType> getTypes() {
        return types;
    }

    public void setTypes(List<InspectionType> types) {
        this.types = types;
    }

    public CreateInspectionJobRequestBody withItemConfigs(List<ReqInspectionItemConfig> itemConfigs) {
        this.itemConfigs = itemConfigs;
        return this;
    }

    public CreateInspectionJobRequestBody addItemConfigsItem(ReqInspectionItemConfig itemConfigsItem) {
        if (this.itemConfigs == null) {
            this.itemConfigs = new ArrayList<>();
        }
        this.itemConfigs.add(itemConfigsItem);
        return this;
    }

    public CreateInspectionJobRequestBody withItemConfigs(Consumer<List<ReqInspectionItemConfig>> itemConfigsSetter) {
        if (this.itemConfigs == null) {
            this.itemConfigs = new ArrayList<>();
        }
        itemConfigsSetter.accept(this.itemConfigs);
        return this;
    }

    /**
     * 巡检压测用例信息
     * @return itemConfigs
     */
    public List<ReqInspectionItemConfig> getItemConfigs() {
        return itemConfigs;
    }

    public void setItemConfigs(List<ReqInspectionItemConfig> itemConfigs) {
        this.itemConfigs = itemConfigs;
    }

    public CreateInspectionJobRequestBody withModelartsOfferingType(ModelArtsOffering modelartsOfferingType) {
        this.modelartsOfferingType = modelartsOfferingType;
        return this;
    }

    /**
     * Get modelartsOfferingType
     * @return modelartsOfferingType
     */
    public ModelArtsOffering getModelartsOfferingType() {
        return modelartsOfferingType;
    }

    public void setModelartsOfferingType(ModelArtsOffering modelartsOfferingType) {
        this.modelartsOfferingType = modelartsOfferingType;
    }

    public CreateInspectionJobRequestBody withDiagnosisObject(TenantDiagnosisObject diagnosisObject) {
        this.diagnosisObject = diagnosisObject;
        return this;
    }

    /**
     * Get diagnosisObject
     * @return diagnosisObject
     */
    public TenantDiagnosisObject getDiagnosisObject() {
        return diagnosisObject;
    }

    public void setDiagnosisObject(TenantDiagnosisObject diagnosisObject) {
        this.diagnosisObject = diagnosisObject;
    }

    public CreateInspectionJobRequestBody withServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
        return this;
    }

    public CreateInspectionJobRequestBody addServerIdsItem(String serverIdsItem) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        this.serverIds.add(serverIdsItem);
        return this;
    }

    public CreateInspectionJobRequestBody withServerIds(Consumer<List<String>> serverIdsSetter) {
        if (this.serverIds == null) {
            this.serverIds = new ArrayList<>();
        }
        serverIdsSetter.accept(this.serverIds);
        return this;
    }

    /**
     * **参数解释**：巡检对象，节点id列表（已废弃，请用node_ids）。 **约束限制**：modelarts_offering_type取值为LITE-DEVSERVER时生效。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
    }

    public CreateInspectionJobRequestBody withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public CreateInspectionJobRequestBody addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public CreateInspectionJobRequestBody withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /**
     * **参数解释**：巡检对象，节点id列表。 **约束限制**：modelarts_offering_type取值为LITE-SERVER时生效。
     * @return nodeIds
     */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public CreateInspectionJobRequestBody withExcludeNodeIds(List<String> excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
        return this;
    }

    public CreateInspectionJobRequestBody addExcludeNodeIdsItem(String excludeNodeIdsItem) {
        if (this.excludeNodeIds == null) {
            this.excludeNodeIds = new ArrayList<>();
        }
        this.excludeNodeIds.add(excludeNodeIdsItem);
        return this;
    }

    public CreateInspectionJobRequestBody withExcludeNodeIds(Consumer<List<String>> excludeNodeIdsSetter) {
        if (this.excludeNodeIds == null) {
            this.excludeNodeIds = new ArrayList<>();
        }
        excludeNodeIdsSetter.accept(this.excludeNodeIds);
        return this;
    }

    /**
     * **参数解释**：巡检对象，排除（反选）节点id列表。 **约束限制**：modelarts_offering_type取值为LITE-SERVER时生效。
     * @return excludeNodeIds
     */
    public List<String> getExcludeNodeIds() {
        return excludeNodeIds;
    }

    public void setExcludeNodeIds(List<String> excludeNodeIds) {
        this.excludeNodeIds = excludeNodeIds;
    }

    public CreateInspectionJobRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：添加的对作业的描述。 **约束限制**：不涉及。 **取值范围**：字符串,长度为0到256之间。 **默认取值**： 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInspectionJobRequestBody that = (CreateInspectionJobRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.poolName, that.poolName)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.excludeNodes, that.excludeNodes) && Objects.equals(this.types, that.types)
            && Objects.equals(this.itemConfigs, that.itemConfigs)
            && Objects.equals(this.modelartsOfferingType, that.modelartsOfferingType)
            && Objects.equals(this.diagnosisObject, that.diagnosisObject)
            && Objects.equals(this.serverIds, that.serverIds) && Objects.equals(this.nodeIds, that.nodeIds)
            && Objects.equals(this.excludeNodeIds, that.excludeNodeIds)
            && Objects.equals(this.description, that.description);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            poolName,
            workspaceId,
            nodes,
            excludeNodes,
            types,
            itemConfigs,
            modelartsOfferingType,
            diagnosisObject,
            serverIds,
            nodeIds,
            excludeNodeIds,
            description);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInspectionJobRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    excludeNodes: ").append(toIndentedString(excludeNodes)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
        sb.append("    itemConfigs: ").append(toIndentedString(itemConfigs)).append("\n");
        sb.append("    modelartsOfferingType: ").append(toIndentedString(modelartsOfferingType)).append("\n");
        sb.append("    diagnosisObject: ").append(toIndentedString(diagnosisObject)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    excludeNodeIds: ").append(toIndentedString(excludeNodeIds)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
