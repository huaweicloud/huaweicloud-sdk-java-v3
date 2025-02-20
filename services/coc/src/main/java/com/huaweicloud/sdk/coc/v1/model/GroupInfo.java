package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupInfo
 */
public class GroupInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "code")

    private String code;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_rules")

    private String syncRules;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_configurations")

    private List<String> relationConfigurations = null;

    public GroupInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * Get id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * Get name
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupInfo withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * Get code
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GroupInfo withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * Get domainId
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupInfo withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * Get regionId
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public GroupInfo withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * Get applicationId
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public GroupInfo withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * Get componentId
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public GroupInfo withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * Get syncMode
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public GroupInfo withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * Get vendor
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public GroupInfo withSyncRules(String syncRules) {
        this.syncRules = syncRules;
        return this;
    }

    /**
     * Get syncRules
     * @return syncRules
     */
    public String getSyncRules() {
        return syncRules;
    }

    public void setSyncRules(String syncRules) {
        this.syncRules = syncRules;
    }

    public GroupInfo withRelationConfigurations(List<String> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
        return this;
    }

    public GroupInfo addRelationConfigurationsItem(String relationConfigurationsItem) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        this.relationConfigurations.add(relationConfigurationsItem);
        return this;
    }

    public GroupInfo withRelationConfigurations(Consumer<List<String>> relationConfigurationsSetter) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        relationConfigurationsSetter.accept(this.relationConfigurations);
        return this;
    }

    /**
     * Get relationConfigurations
     * @return relationConfigurations
     */
    public List<String> getRelationConfigurations() {
        return relationConfigurations;
    }

    public void setRelationConfigurations(List<String> relationConfigurations) {
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
        GroupInfo that = (GroupInfo) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.code, that.code) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.regionId, that.regionId) && Objects.equals(this.applicationId, that.applicationId)
            && Objects.equals(this.componentId, that.componentId) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.vendor, that.vendor) && Objects.equals(this.syncRules, that.syncRules)
            && Objects.equals(this.relationConfigurations, that.relationConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            code,
            domainId,
            regionId,
            applicationId,
            componentId,
            syncMode,
            vendor,
            syncRules,
            relationConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupInfo {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
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
