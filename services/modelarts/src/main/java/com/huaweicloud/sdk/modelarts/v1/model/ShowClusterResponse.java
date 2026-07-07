package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logic_cluster_id")

    private String logicClusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pool_id")

    private String poolId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_categories")

    private String resourceCategories;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workspace_id")

    private String workspaceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_at")

    private String createAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_at")

    private String updateAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "flavors")

    private List<Flavor> flavors = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_allow_root")

    private Boolean isAllowRoot;

    public ShowClusterResponse withLogicClusterId(String logicClusterId) {
        this.logicClusterId = logicClusterId;
        return this;
    }

    /**
     * **参数解释**： 逻辑资源池ID。 **取值范围**： 不涉及。
     * @return logicClusterId
     */
    public String getLogicClusterId() {
        return logicClusterId;
    }

    public void setLogicClusterId(String logicClusterId) {
        this.logicClusterId = logicClusterId;
    }

    public ShowClusterResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**：资源池状态。 **取值范围**：枚举类型，取值如下： - PENDING：等待中。 - INITIALIZING：初始化中。 - INITIALIZE_FAILED：初始化失败。 - ACTIVE：可用。 - DELETING：删除中。 - DELETED：已删除。 - DELETE_FAILED：删除失败。 - MIGRATING：迁移中。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowClusterResponse withPoolId(String poolId) {
        this.poolId = poolId;
        return this;
    }

    /**
     * **参数解释**：资源池ID。 **取值范围**：不涉及。
     * @return poolId
     */
    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public ShowClusterResponse withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * **参数解释**：资源池类型。  **取值范围**：枚举类型，取值如下： - MANAGED：公共池。 - DEDICATED：专属池。
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ShowClusterResponse withResourceCategories(String resourceCategories) {
        this.resourceCategories = resourceCategories;
        return this;
    }

    /**
     * **参数解释**：资源类别。 **取值范围**：枚举类型，取值如下： - GPU - CPU - ASCEND
     * @return resourceCategories
     */
    public String getResourceCategories() {
        return resourceCategories;
    }

    public void setResourceCategories(String resourceCategories) {
        this.resourceCategories = resourceCategories;
    }

    public ShowClusterResponse withWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }

    /**
     * **参数解释**：工作空间ID。获取方法请参见[[查询工作空间列表](ListWorkspace.xml)](tag:hc,hk)。未创建工作空间时默认值为“0”，存在创建并使用的工作空间，以实际取值为准。 **取值范围**：不涉及。
     * @return workspaceId
     */
    public String getWorkspaceId() {
        return workspaceId;
    }

    public void setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
    }

    public ShowClusterResponse withCreateAt(String createAt) {
        this.createAt = createAt;
        return this;
    }

    /**
     * **参数解释**：实例创建的时间，UTC毫秒。 **取值范围**：不涉及。
     * @return createAt
     */
    public String getCreateAt() {
        return createAt;
    }

    public void setCreateAt(String createAt) {
        this.createAt = createAt;
    }

    public ShowClusterResponse withUpdateAt(String updateAt) {
        this.updateAt = updateAt;
        return this;
    }

    /**
     * **参数解释**：实例最后更新的时间，UTC毫秒。 **取值范围**：不涉及。
     * @return updateAt
     */
    public String getUpdateAt() {
        return updateAt;
    }

    public void setUpdateAt(String updateAt) {
        this.updateAt = updateAt;
    }

    public ShowClusterResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**：用户项目ID，获取方法请参见[获取项目ID和名称](modelarts_03_0147.xml)。 **取值范围**：不涉及。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowClusterResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * **参数解释**：账号ID。 **取值范围**：不涉及。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowClusterResponse withFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
        return this;
    }

    public ShowClusterResponse addFlavorsItem(Flavor flavorsItem) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        this.flavors.add(flavorsItem);
        return this;
    }

    public ShowClusterResponse withFlavors(Consumer<List<Flavor>> flavorsSetter) {
        if (this.flavors == null) {
            this.flavors = new ArrayList<>();
        }
        flavorsSetter.accept(this.flavors);
        return this;
    }

    /**
     * **参数解释**：资源池规格。
     * @return flavors
     */
    public List<Flavor> getFlavors() {
        return flavors;
    }

    public void setFlavors(List<Flavor> flavors) {
        this.flavors = flavors;
    }

    public ShowClusterResponse withIsAllowRoot(Boolean isAllowRoot) {
        this.isAllowRoot = isAllowRoot;
        return this;
    }

    /**
     * **参数解释**：资源池是否允许实例以root启动。
     * @return isAllowRoot
     */
    public Boolean getIsAllowRoot() {
        return isAllowRoot;
    }

    public void setIsAllowRoot(Boolean isAllowRoot) {
        this.isAllowRoot = isAllowRoot;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterResponse that = (ShowClusterResponse) obj;
        return Objects.equals(this.logicClusterId, that.logicClusterId) && Objects.equals(this.status, that.status)
            && Objects.equals(this.poolId, that.poolId) && Objects.equals(this.type, that.type)
            && Objects.equals(this.resourceCategories, that.resourceCategories)
            && Objects.equals(this.workspaceId, that.workspaceId) && Objects.equals(this.createAt, that.createAt)
            && Objects.equals(this.updateAt, that.updateAt) && Objects.equals(this.projectId, that.projectId)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.flavors, that.flavors)
            && Objects.equals(this.isAllowRoot, that.isAllowRoot);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicClusterId,
            status,
            poolId,
            type,
            resourceCategories,
            workspaceId,
            createAt,
            updateAt,
            projectId,
            domainId,
            flavors,
            isAllowRoot);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterResponse {\n");
        sb.append("    logicClusterId: ").append(toIndentedString(logicClusterId)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    poolId: ").append(toIndentedString(poolId)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    resourceCategories: ").append(toIndentedString(resourceCategories)).append("\n");
        sb.append("    workspaceId: ").append(toIndentedString(workspaceId)).append("\n");
        sb.append("    createAt: ").append(toIndentedString(createAt)).append("\n");
        sb.append("    updateAt: ").append(toIndentedString(updateAt)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    flavors: ").append(toIndentedString(flavors)).append("\n");
        sb.append("    isAllowRoot: ").append(toIndentedString(isAllowRoot)).append("\n");
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
