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
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "item_configs")

    private List<ReqInspectionItemConfig> itemConfigs = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modelarts_offering_type")

    private ModelArtsOffering modelartsOfferingType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "nodes")

    private List<String> nodes = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_name")

    private String poolName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_ids")

    private List<String> serverIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "types")

    private List<InspectionType> types = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

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
     * Get itemConfigs
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
     * **参数解释**：服务器id。 **约束限制**：modelarts_offering_type取值为LITE-DEVSERVER时生效。
     * @return serverIds
     */
    public List<String> getServerIds() {
        return serverIds;
    }

    public void setServerIds(List<String> serverIds) {
        this.serverIds = serverIds;
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateInspectionJobRequestBody that = (CreateInspectionJobRequestBody) obj;
        return Objects.equals(this.description, that.description) && Objects.equals(this.itemConfigs, that.itemConfigs)
            && Objects.equals(this.modelartsOfferingType, that.modelartsOfferingType)
            && Objects.equals(this.name, that.name) && Objects.equals(this.nodes, that.nodes)
            && Objects.equals(this.poolName, that.poolName) && Objects.equals(this.serverIds, that.serverIds)
            && Objects.equals(this.types, that.types) && Objects.equals(this.workspaceId, that.workspaceId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(description,
            itemConfigs,
            modelartsOfferingType,
            name,
            nodes,
            poolName,
            serverIds,
            types,
            workspaceId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateInspectionJobRequestBody {\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    itemConfigs: ").append(toIndentedString(itemConfigs)).append("\n");
        sb.append("    modelartsOfferingType: ").append(toIndentedString(modelartsOfferingType)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    nodes: ").append(toIndentedString(nodes)).append("\n");
        sb.append("    poolName: ").append(toIndentedString(poolName)).append("\n");
        sb.append("    serverIds: ").append(toIndentedString(serverIds)).append("\n");
        sb.append("    types: ").append(toIndentedString(types)).append("\n");
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
