package com.huaweicloud.sdk.swr.v2.model;

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
public class ShowInstanceReplicationPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private Integer id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "src_registry")

    private ReplicationRegistry srcRegistry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_registry")

    private ReplicationRegistry destRegistry;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dest_namespace")

    private String destNamespace;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filters")

    private List<Filter> filters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "repo_scope_mode")

    private String repoScopeMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger")

    private TriggerConfig trigger;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "override")

    private Boolean override;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enabled")

    private Boolean enabled;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    public ShowInstanceReplicationPolicyResponse withId(Integer id) {
        this.id = id;
        return this;
    }

    /**
     * 策略ID
     * @return id
     */
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public ShowInstanceReplicationPolicyResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 策略名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowInstanceReplicationPolicyResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 策略描述描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowInstanceReplicationPolicyResponse withSrcRegistry(ReplicationRegistry srcRegistry) {
        this.srcRegistry = srcRegistry;
        return this;
    }

    public ShowInstanceReplicationPolicyResponse withSrcRegistry(Consumer<ReplicationRegistry> srcRegistrySetter) {
        if (this.srcRegistry == null) {
            this.srcRegistry = new ReplicationRegistry();
            srcRegistrySetter.accept(this.srcRegistry);
        }

        return this;
    }

    /**
     * Get srcRegistry
     * @return srcRegistry
     */
    public ReplicationRegistry getSrcRegistry() {
        return srcRegistry;
    }

    public void setSrcRegistry(ReplicationRegistry srcRegistry) {
        this.srcRegistry = srcRegistry;
    }

    public ShowInstanceReplicationPolicyResponse withDestRegistry(ReplicationRegistry destRegistry) {
        this.destRegistry = destRegistry;
        return this;
    }

    public ShowInstanceReplicationPolicyResponse withDestRegistry(Consumer<ReplicationRegistry> destRegistrySetter) {
        if (this.destRegistry == null) {
            this.destRegistry = new ReplicationRegistry();
            destRegistrySetter.accept(this.destRegistry);
        }

        return this;
    }

    /**
     * Get destRegistry
     * @return destRegistry
     */
    public ReplicationRegistry getDestRegistry() {
        return destRegistry;
    }

    public void setDestRegistry(ReplicationRegistry destRegistry) {
        this.destRegistry = destRegistry;
    }

    public ShowInstanceReplicationPolicyResponse withDestNamespace(String destNamespace) {
        this.destNamespace = destNamespace;
        return this;
    }

    /**
     * 目标命名空间名，默认为空值
     * @return destNamespace
     */
    public String getDestNamespace() {
        return destNamespace;
    }

    public void setDestNamespace(String destNamespace) {
        this.destNamespace = destNamespace;
    }

    public ShowInstanceReplicationPolicyResponse withFilters(List<Filter> filters) {
        this.filters = filters;
        return this;
    }

    public ShowInstanceReplicationPolicyResponse addFiltersItem(Filter filtersItem) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        this.filters.add(filtersItem);
        return this;
    }

    public ShowInstanceReplicationPolicyResponse withFilters(Consumer<List<Filter>> filtersSetter) {
        if (this.filters == null) {
            this.filters = new ArrayList<>();
        }
        filtersSetter.accept(this.filters);
        return this;
    }

    /**
     * 源资源过滤器
     * @return filters
     */
    public List<Filter> getFilters() {
        return filters;
    }

    public void setFilters(List<Filter> filters) {
        this.filters = filters;
    }

    public ShowInstanceReplicationPolicyResponse withRepoScopeMode(String repoScopeMode) {
        this.repoScopeMode = repoScopeMode;
        return this;
    }

    /**
     * repo的范围模式
     * @return repoScopeMode
     */
    public String getRepoScopeMode() {
        return repoScopeMode;
    }

    public void setRepoScopeMode(String repoScopeMode) {
        this.repoScopeMode = repoScopeMode;
    }

    public ShowInstanceReplicationPolicyResponse withTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
        return this;
    }

    public ShowInstanceReplicationPolicyResponse withTrigger(Consumer<TriggerConfig> triggerSetter) {
        if (this.trigger == null) {
            this.trigger = new TriggerConfig();
            triggerSetter.accept(this.trigger);
        }

        return this;
    }

    /**
     * Get trigger
     * @return trigger
     */
    public TriggerConfig getTrigger() {
        return trigger;
    }

    public void setTrigger(TriggerConfig trigger) {
        this.trigger = trigger;
    }

    public ShowInstanceReplicationPolicyResponse withOverride(Boolean override) {
        this.override = override;
        return this;
    }

    /**
     * 是否覆盖
     * @return override
     */
    public Boolean getOverride() {
        return override;
    }

    public void setOverride(Boolean override) {
        this.override = override;
    }

    public ShowInstanceReplicationPolicyResponse withEnabled(Boolean enabled) {
        this.enabled = enabled;
        return this;
    }

    /**
     * 是否使用
     * @return enabled
     */
    public Boolean getEnabled() {
        return enabled;
    }

    public void setEnabled(Boolean enabled) {
        this.enabled = enabled;
    }

    public ShowInstanceReplicationPolicyResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /**
     * 创建时间
     * @return createdAt
     */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public ShowInstanceReplicationPolicyResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /**
     * 更新时间
     * @return updatedAt
     */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstanceReplicationPolicyResponse that = (ShowInstanceReplicationPolicyResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.srcRegistry, that.srcRegistry)
            && Objects.equals(this.destRegistry, that.destRegistry)
            && Objects.equals(this.destNamespace, that.destNamespace) && Objects.equals(this.filters, that.filters)
            && Objects.equals(this.repoScopeMode, that.repoScopeMode) && Objects.equals(this.trigger, that.trigger)
            && Objects.equals(this.override, that.override) && Objects.equals(this.enabled, that.enabled)
            && Objects.equals(this.createdAt, that.createdAt) && Objects.equals(this.updatedAt, that.updatedAt);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            srcRegistry,
            destRegistry,
            destNamespace,
            filters,
            repoScopeMode,
            trigger,
            override,
            enabled,
            createdAt,
            updatedAt);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstanceReplicationPolicyResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    srcRegistry: ").append(toIndentedString(srcRegistry)).append("\n");
        sb.append("    destRegistry: ").append(toIndentedString(destRegistry)).append("\n");
        sb.append("    destNamespace: ").append(toIndentedString(destNamespace)).append("\n");
        sb.append("    filters: ").append(toIndentedString(filters)).append("\n");
        sb.append("    repoScopeMode: ").append(toIndentedString(repoScopeMode)).append("\n");
        sb.append("    trigger: ").append(toIndentedString(trigger)).append("\n");
        sb.append("    override: ").append(toIndentedString(override)).append("\n");
        sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
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
