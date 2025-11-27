package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupUpdateRequest
 */
public class GroupUpdateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_rules")

    private List<GroupUpdateRequestSyncRules> syncRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_configurations")

    private List<GroupRelationConfiguration> relationConfigurations = null;

    public GroupUpdateRequest withName(String name) {
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

    public GroupUpdateRequest withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 资源关联方式，MANUAL表示手动，AUTO表示智能。
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public GroupUpdateRequest withSyncRules(List<GroupUpdateRequestSyncRules> syncRules) {
        this.syncRules = syncRules;
        return this;
    }

    public GroupUpdateRequest addSyncRulesItem(GroupUpdateRequestSyncRules syncRulesItem) {
        if (this.syncRules == null) {
            this.syncRules = new ArrayList<>();
        }
        this.syncRules.add(syncRulesItem);
        return this;
    }

    public GroupUpdateRequest withSyncRules(Consumer<List<GroupUpdateRequestSyncRules>> syncRulesSetter) {
        if (this.syncRules == null) {
            this.syncRules = new ArrayList<>();
        }
        syncRulesSetter.accept(this.syncRules);
        return this;
    }

    /**
     * 智能关联规则。
     * @return syncRules
     */
    public List<GroupUpdateRequestSyncRules> getSyncRules() {
        return syncRules;
    }

    public void setSyncRules(List<GroupUpdateRequestSyncRules> syncRules) {
        this.syncRules = syncRules;
    }

    public GroupUpdateRequest withRelationConfigurations(List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
        return this;
    }

    public GroupUpdateRequest addRelationConfigurationsItem(GroupRelationConfiguration relationConfigurationsItem) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        this.relationConfigurations.add(relationConfigurationsItem);
        return this;
    }

    public GroupUpdateRequest withRelationConfigurations(
        Consumer<List<GroupRelationConfiguration>> relationConfigurationsSetter) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        relationConfigurationsSetter.accept(this.relationConfigurations);
        return this;
    }

    /**
     * 分组配置信息。
     * @return relationConfigurations
     */
    public List<GroupRelationConfiguration> getRelationConfigurations() {
        return relationConfigurations;
    }

    public void setRelationConfigurations(List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        GroupUpdateRequest that = (GroupUpdateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.syncRules, that.syncRules)
            && Objects.equals(this.relationConfigurations, that.relationConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, syncMode, syncRules, relationConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupUpdateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    syncRules: ").append(toIndentedString(syncRules)).append("\n");
        sb.append("    relationConfigurations: ").append(toIndentedString(relationConfigurations)).append("\n");
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
