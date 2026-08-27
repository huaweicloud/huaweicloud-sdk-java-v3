package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Agent 实例关联的模型分组信息
 */
public class InstanceModelGroupItem {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_model_id")

    private String defaultModelId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "priority")

    private Integer priority;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "providers")

    private List<InstanceModelProviderConfig> providers = null;

    public InstanceModelGroupItem withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * 模型分组 ID
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public InstanceModelGroupItem withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * 模型分组名称
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public InstanceModelGroupItem withDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
        return this;
    }

    /**
     * 分组内默认模型 ID，未设置时为空
     * @return defaultModelId
     */
    public String getDefaultModelId() {
        return defaultModelId;
    }

    public void setDefaultModelId(String defaultModelId) {
        this.defaultModelId = defaultModelId;
    }

    public InstanceModelGroupItem withPriority(Integer priority) {
        this.priority = priority;
        return this;
    }

    /**
     * 分组优先级（数值越小优先级越高）
     * minimum: 1
     * maximum: 2147483647
     * @return priority
     */
    public Integer getPriority() {
        return priority;
    }

    public void setPriority(Integer priority) {
        this.priority = priority;
    }

    public InstanceModelGroupItem withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 模型分组更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public InstanceModelGroupItem withProviders(List<InstanceModelProviderConfig> providers) {
        this.providers = providers;
        return this;
    }

    public InstanceModelGroupItem addProvidersItem(InstanceModelProviderConfig providersItem) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        this.providers.add(providersItem);
        return this;
    }

    public InstanceModelGroupItem withProviders(Consumer<List<InstanceModelProviderConfig>> providersSetter) {
        if (this.providers == null) {
            this.providers = new ArrayList<>();
        }
        providersSetter.accept(this.providers);
        return this;
    }

    /**
     * 供应商配置列表（不含 API Key）
     * @return providers
     */
    public List<InstanceModelProviderConfig> getProviders() {
        return providers;
    }

    public void setProviders(List<InstanceModelProviderConfig> providers) {
        this.providers = providers;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstanceModelGroupItem that = (InstanceModelGroupItem) obj;
        return Objects.equals(this.groupId, that.groupId) && Objects.equals(this.groupName, that.groupName)
            && Objects.equals(this.defaultModelId, that.defaultModelId) && Objects.equals(this.priority, that.priority)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.providers, that.providers);
    }

    @Override
    public int hashCode() {
        return Objects.hash(groupId, groupName, defaultModelId, priority, updateTime, providers);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstanceModelGroupItem {\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    defaultModelId: ").append(toIndentedString(defaultModelId)).append("\n");
        sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    providers: ").append(toIndentedString(providers)).append("\n");
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
