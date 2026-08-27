package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 模型组列表项响应（不包含providers）。
 */
public class ModelGroupItemVO {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_model_id")

    private String defaultModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "provider_count")

    private Integer providerCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_count")

    private Integer resourceCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    public ModelGroupItemVO withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 模型组id。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ModelGroupItemVO withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 分组名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ModelGroupItemVO withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 分组描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ModelGroupItemVO withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 分组优先级。
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public ModelGroupItemVO withDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
        return this;
    }

    /**
     * 默认模型ID。
     * @return defaultModelId
     */
    public String getDefaultModelId() {
        return defaultModelId;
    }

    public void setDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
    }

    public ModelGroupItemVO withProviderCount(Integer providerCount) {
        this.providerCount = providerCount;
        return this;
    }

    /**
     * 关联的供应商数量。
     * @return providerCount
     */
    public Integer getProviderCount() {
        return providerCount;
    }

    public void setProviderCount(Integer providerCount) {
        this.providerCount = providerCount;
    }

    public ModelGroupItemVO withResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
        return this;
    }

    /**
     * 关联的应用对象数量（Agent实例+桌面标签）。
     * @return resourceCount
     */
    public Integer getResourceCount() {
        return resourceCount;
    }

    public void setResourceCount(Integer resourceCount) {
        this.resourceCount = resourceCount;
    }

    public ModelGroupItemVO withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间（ISO8601格式，UTC时区）。
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public ModelGroupItemVO withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间（ISO8601格式，UTC时区）。
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ModelGroupItemVO that = (ModelGroupItemVO) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.defaultModelId, that.defaultModelId)
            && Objects.equals(this.providerCount, that.providerCount)
            && Objects.equals(this.resourceCount, that.resourceCount)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            priority,
            defaultModelId,
            providerCount,
            resourceCount,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ModelGroupItemVO {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    defaultModelId: ").append(toIndentedString(defaultModelId)).append("\n");
        sb.append("    providerCount: ").append(toIndentedString(providerCount)).append("\n");
        sb.append("    resourceCount: ").append(toIndentedString(resourceCount)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
