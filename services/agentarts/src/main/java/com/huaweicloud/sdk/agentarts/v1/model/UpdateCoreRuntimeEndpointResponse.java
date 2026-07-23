package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.UUID;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class UpdateCoreRuntimeEndpointResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime_id")

    private UUID runtimeId;

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
    @JsonProperty(value = "target_version_name")

    private String targetVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_config")

    private CoreRunRoutingConfigurationResp routingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreRunTagItemResp> tags = null;

    public UpdateCoreRuntimeEndpointResponse withRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
        return this;
    }

    /**
     * **参数解释**: 运行时ID。 
     * @return runtimeId
     */
    public UUID getRuntimeId() {
        return runtimeId;
    }

    public void setRuntimeId(UUID runtimeId) {
        this.runtimeId = runtimeId;
    }

    public UpdateCoreRuntimeEndpointResponse withId(UUID id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**: 运行时访问方式ID。 
     * @return id
     */
    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UpdateCoreRuntimeEndpointResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 运行时访问方式名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public UpdateCoreRuntimeEndpointResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 运行时访问方式描述。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public UpdateCoreRuntimeEndpointResponse withCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * **参数解释**: 创建时间。 
     * @return createdAt
     */
    public OffsetDateTime getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(OffsetDateTime createdAt) {
        this.createdAt = createdAt;
    }

    public UpdateCoreRuntimeEndpointResponse withUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * **参数解释**: 最后更新时间。 
     * @return updatedAt
     */
    public OffsetDateTime getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(OffsetDateTime updatedAt) {
        this.updatedAt = updatedAt;
    }

    public UpdateCoreRuntimeEndpointResponse withTargetVersionName(String targetVersionName) {
        this.targetVersionName = targetVersionName;
        return this;
    }

    /**
     * **参数解释**: 目标版本名称。 
     * @return targetVersionName
     */
    public String getTargetVersionName() {
        return targetVersionName;
    }

    public void setTargetVersionName(String targetVersionName) {
        this.targetVersionName = targetVersionName;
    }

    public UpdateCoreRuntimeEndpointResponse withRoutingConfig(CoreRunRoutingConfigurationResp routingConfig) {
        this.routingConfig = routingConfig;
        return this;
    }

    public UpdateCoreRuntimeEndpointResponse withRoutingConfig(
        Consumer<CoreRunRoutingConfigurationResp> routingConfigSetter) {
        if (this.routingConfig == null) {
            this.routingConfig = new CoreRunRoutingConfigurationResp();
            routingConfigSetter.accept(this.routingConfig);
        }

        return this;
    }

    /**
     * Get routingConfig
     * @return routingConfig
     */
    public CoreRunRoutingConfigurationResp getRoutingConfig() {
        return routingConfig;
    }

    public void setRoutingConfig(CoreRunRoutingConfigurationResp routingConfig) {
        this.routingConfig = routingConfig;
    }

    public UpdateCoreRuntimeEndpointResponse withTags(List<CoreRunTagItemResp> tags) {
        this.tags = tags;
        return this;
    }

    public UpdateCoreRuntimeEndpointResponse addTagsItem(CoreRunTagItemResp tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public UpdateCoreRuntimeEndpointResponse withTags(Consumer<List<CoreRunTagItemResp>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * **参数解释**: 标签配置列表。 
     * @return tags
     */
    public List<CoreRunTagItemResp> getTags() {
        return tags;
    }

    public void setTags(List<CoreRunTagItemResp> tags) {
        this.tags = tags;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateCoreRuntimeEndpointResponse that = (UpdateCoreRuntimeEndpointResponse) obj;
        return Objects.equals(this.runtimeId, that.runtimeId) && Objects.equals(this.id, that.id)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt)
            && Objects.equals(this.targetVersionName, that.targetVersionName)
            && Objects.equals(this.routingConfig, that.routingConfig) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(runtimeId, id, name, description, createdAt, updatedAt, targetVersionName, routingConfig, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateCoreRuntimeEndpointResponse {\n");
        sb.append("    runtimeId: ").append(toIndentedString(runtimeId)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    targetVersionName: ").append(toIndentedString(targetVersionName)).append("\n");
        sb.append("    routingConfig: ").append(toIndentedString(routingConfig)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
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
