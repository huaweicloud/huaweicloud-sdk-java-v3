package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * CoreToolBasic
 */
public class CoreToolBasic {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private UUID id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private OffsetDateTime createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private OffsetDateTime updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_agency_name")

    private String executionAgencyName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "agent_gateway_id")

    private UUID agentGatewayId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "workload_identity")

    private CoreToolsWorkloadIdentity workloadIdentity;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "access_endpoint")

    private String accessEndpoint;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "observability")

    private CoreToolsObservability observability;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreToolsTag> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    public CoreToolBasic withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释：** 工具ID。 **取值范围：** 符合UUID规则^[0-9a-f]{8}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{4}-[0-9a-f]{12}$的36位字符串。
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public CoreToolBasic withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 工具的名称。 **取值范围：** 符合正则^[a-z][a-z0-9-]{0,38}[a-z0-9]$，即必须以小写字母开头，小写字母或数字结尾，中间可包含数字、小写字母、中划线，字符长度必须在2-40个字符之间。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CoreToolBasic withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释：** 工具的描述。 **取值范围：** 任意字符，长度不能超过4096个字符
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CoreToolBasic withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释：** 创建时间。 **取值范围：** ISO 8601格式的时间字符串，例如：2026-04-09T08:29:59.922+00:00。
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public CoreToolBasic withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释：** 更新时间。 **取值范围：** ISO 8601格式的时间字符串，例如：2026-04-09T08:29:59.922+00:00。
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CoreToolBasic withExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
        return this;
    }

    /**
     * **参数解释：** 为工具提供访问云服务的权限的IAM委托名。 **取值范围：** IAM委托名长度必须在1-64个字符之间，字符规则以IAM服务校验规则为准。
     * @return executionAgencyName
     */
    public String getExecutionAgencyName() {
        return executionAgencyName;
    }

    public void setExecutionAgencyName(String executionAgencyName) {
        this.executionAgencyName = executionAgencyName;
    }

    public CoreToolBasic withAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
        return this;
    }

    /**
     * **参数解释：** 工具入口的AgentGateway的ID。 **取值范围：** 符合UUID规则 ^[0-9a-fA-F]{8}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{4}-[0-9a-fA-F]{12}$的36位字符串。
     * @return agentGatewayId
     */
    public UUID getAgentGatewayId() {
        return agentGatewayId;
    }

    public void setAgentGatewayId(UUID agentGatewayId) {
        this.agentGatewayId = agentGatewayId;
    }

    public CoreToolBasic withWorkloadIdentity(CoreToolsWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
        return this;
    }

    public CoreToolBasic withWorkloadIdentity(Consumer<CoreToolsWorkloadIdentity> workloadIdentitySetter) {
        if (this.workloadIdentity == null) {
            this.workloadIdentity = new CoreToolsWorkloadIdentity();
            workloadIdentitySetter.accept(this.workloadIdentity);
        }

        return this;
    }

    /**
     * Get workloadIdentity
     * @return workloadIdentity
     */
    public CoreToolsWorkloadIdentity getWorkloadIdentity() {
        return workloadIdentity;
    }

    public void setWorkloadIdentity(CoreToolsWorkloadIdentity workloadIdentity) {
        this.workloadIdentity = workloadIdentity;
    }

    public CoreToolBasic withAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
        return this;
    }

    /**
     * **参数解释：** 访问域名。 **取值范围：** 不涉及。
     * @return accessEndpoint
     */
    public String getAccessEndpoint() {
        return accessEndpoint;
    }

    public void setAccessEndpoint(String accessEndpoint) {
        this.accessEndpoint = accessEndpoint;
    }

    public CoreToolBasic withObservability(CoreToolsObservability observability) {
        this.observability = observability;
        return this;
    }

    public CoreToolBasic withObservability(Consumer<CoreToolsObservability> observabilitySetter) {
        if (this.observability == null) {
            this.observability = new CoreToolsObservability();
            observabilitySetter.accept(this.observability);
        }

        return this;
    }

    /**
     * Get observability
     * @return observability
     */
    public CoreToolsObservability getObservability() {
        return observability;
    }

    public void setObservability(CoreToolsObservability observability) {
        this.observability = observability;
    }

    public CoreToolBasic withTags(List<CoreToolsTag> tags) {
        this.tags = tags;
        return this;
    }

    public CoreToolBasic addTagsItem(CoreToolsTag tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CoreToolBasic withTags(Consumer<List<CoreToolsTag>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释：** 资源标签。 **取值范围：** 不涉及。
     * @return tags
     */
    public List<CoreToolsTag> getTags() {
        return tags;
    }

    public void setTags(List<CoreToolsTag> tags) {
        this.tags = tags;
    }

    public CoreToolBasic withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释：** 工具状态。 **取值范围：** - RUNNING：运行中。 - DELETING：删除中。 - DELETE_FAILED：删除失败。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CoreToolBasic that = (CoreToolBasic) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.createdAt, that.createdAt)
            && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.executionAgencyName, that.executionAgencyName)
            && Objects.equals(this.agentGatewayId, that.agentGatewayId)
            && Objects.equals(this.workloadIdentity, that.workloadIdentity)
            && Objects.equals(this.accessEndpoint, that.accessEndpoint)
            && Objects.equals(this.observability, that.observability) && Objects.equals(this.tags, that.tags)
            && Objects.equals(this.status, that.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            createdAt,
            updatedAt,
            executionAgencyName,
            agentGatewayId,
            workloadIdentity,
            accessEndpoint,
            observability,
            tags,
            status);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CoreToolBasic {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    executionAgencyName: ").append(toIndentedString(executionAgencyName)).append("\n");
        sb.append("    agentGatewayId: ").append(toIndentedString(agentGatewayId)).append("\n");
        sb.append("    workloadIdentity: ").append(toIndentedString(workloadIdentity)).append("\n");
        sb.append("    accessEndpoint: ").append(toIndentedString(accessEndpoint)).append("\n");
        sb.append("    observability: ").append(toIndentedString(observability)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
