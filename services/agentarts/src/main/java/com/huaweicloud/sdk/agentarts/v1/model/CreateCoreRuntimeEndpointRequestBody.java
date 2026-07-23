package com.huaweicloud.sdk.agentarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**: 运行时访问方式创建请求Body体。 
 */
public class CreateCoreRuntimeEndpointRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_version_name")

    private String targetVersionName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "routing_config")

    private CoreRunRoutingConfiguration routingConfig;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CoreRunTagItem> tags = null;

    public CreateCoreRuntimeEndpointRequestBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**: 访问方式名称。 
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateCoreRuntimeEndpointRequestBody withTargetVersionName(String targetVersionName) {
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

    public CreateCoreRuntimeEndpointRequestBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**: 描述信息。 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateCoreRuntimeEndpointRequestBody withRoutingConfig(CoreRunRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
        return this;
    }

    public CreateCoreRuntimeEndpointRequestBody withRoutingConfig(
        Consumer<CoreRunRoutingConfiguration> routingConfigSetter) {
        if (this.routingConfig == null) {
            this.routingConfig = new CoreRunRoutingConfiguration();
            routingConfigSetter.accept(this.routingConfig);
        }

        return this;
    }

    /**
     * Get routingConfig
     * @return routingConfig
     */
    public CoreRunRoutingConfiguration getRoutingConfig() {
        return routingConfig;
    }

    public void setRoutingConfig(CoreRunRoutingConfiguration routingConfig) {
        this.routingConfig = routingConfig;
    }

    public CreateCoreRuntimeEndpointRequestBody withTags(List<CoreRunTagItem> tags) {
        this.tags = tags;
        return this;
    }

    public CreateCoreRuntimeEndpointRequestBody addTagsItem(CoreRunTagItem tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateCoreRuntimeEndpointRequestBody withTags(Consumer<List<CoreRunTagItem>> tagsSetter) {
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
    public List<CoreRunTagItem> getTags() {
        return tags;
    }

    public void setTags(List<CoreRunTagItem> tags) {
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
        CreateCoreRuntimeEndpointRequestBody that = (CreateCoreRuntimeEndpointRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.targetVersionName, that.targetVersionName)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.routingConfig, that.routingConfig) && Objects.equals(this.tags, that.tags);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, targetVersionName, description, routingConfig, tags);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateCoreRuntimeEndpointRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    targetVersionName: ").append(toIndentedString(targetVersionName)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
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
