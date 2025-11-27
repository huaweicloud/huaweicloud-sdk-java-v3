package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupCreateRequest
 */
public class GroupCreateRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_rules")

    private List<GroupUpdateRequestSyncRules> syncRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_configurations")

    private List<GroupRelationConfiguration> relationConfigurations = null;

    public GroupCreateRequest withName(String name) {
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

    public GroupCreateRequest withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件id。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public GroupCreateRequest withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * 厂商（默认RMS，可填RMS/ALI/OTHER）。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public GroupCreateRequest withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region id。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GroupCreateRequest withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用id。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public GroupCreateRequest withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 资源同步方式，MANUAL表示手动，AUTO表示智能关联。
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public GroupCreateRequest withSyncRules(List<GroupUpdateRequestSyncRules> syncRules) {
        this.syncRules = syncRules;
        return this;
    }

    public GroupCreateRequest addSyncRulesItem(GroupUpdateRequestSyncRules syncRulesItem) {
        if (this.syncRules == null) {
            this.syncRules = new ArrayList<>();
        }
        this.syncRules.add(syncRulesItem);
        return this;
    }

    public GroupCreateRequest withSyncRules(Consumer<List<GroupUpdateRequestSyncRules>> syncRulesSetter) {
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

    public GroupCreateRequest withRelationConfigurations(List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
        return this;
    }

    public GroupCreateRequest addRelationConfigurationsItem(GroupRelationConfiguration relationConfigurationsItem) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        this.relationConfigurations.add(relationConfigurationsItem);
        return this;
    }

    public GroupCreateRequest withRelationConfigurations(
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
        GroupCreateRequest that = (GroupCreateRequest) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.vendor, that.vendor) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.syncRules, that.syncRules)
            && Objects.equals(this.relationConfigurations, that.relationConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects
            .hash(name, componentId, vendor, regionId, applicationId, syncMode, syncRules, relationConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupCreateRequest {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
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
