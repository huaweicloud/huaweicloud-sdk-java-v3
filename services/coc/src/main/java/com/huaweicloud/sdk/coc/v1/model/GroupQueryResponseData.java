package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * GroupQueryResponseData
 */
public class GroupQueryResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

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
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ep_id")

    private String epId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "rule_tags")

    private String ruleTags;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_configurations")

    private List<GroupRelationConfiguration> relationConfigurations = null;

    public GroupQueryResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * CloudCMDB分配的uuid。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public GroupQueryResponseData withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public GroupQueryResponseData withVendor(String vendor) {
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

    public GroupQueryResponseData withCode(String code) {
        this.code = code;
        return this;
    }

    /**
     * code。
     * @return code
     */
    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public GroupQueryResponseData withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户id。
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public GroupQueryResponseData withRegionId(String regionId) {
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

    public GroupQueryResponseData withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * component id。
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public GroupQueryResponseData withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * application id。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public GroupQueryResponseData withEpId(String epId) {
        this.epId = epId;
        return this;
    }

    /**
     * 企业项目id。
     * @return epId
     */
    public String getEpId() {
        return epId;
    }

    public void setEpId(String epId) {
        this.epId = epId;
    }

    public GroupQueryResponseData withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 资源关联模式，MANUAL表示手动关联，AUTO表示智能关联。
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public GroupQueryResponseData withRuleTags(String ruleTags) {
        this.ruleTags = ruleTags;
        return this;
    }

    /**
     * 关联标签。
     * @return ruleTags
     */
    public String getRuleTags() {
        return ruleTags;
    }

    public void setRuleTags(String ruleTags) {
        this.ruleTags = ruleTags;
    }

    public GroupQueryResponseData withRelationConfigurations(List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
        return this;
    }

    public GroupQueryResponseData addRelationConfigurationsItem(GroupRelationConfiguration relationConfigurationsItem) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        this.relationConfigurations.add(relationConfigurationsItem);
        return this;
    }

    public GroupQueryResponseData withRelationConfigurations(
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
        GroupQueryResponseData that = (GroupQueryResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.name, that.name)
            && Objects.equals(this.vendor, that.vendor) && Objects.equals(this.code, that.code)
            && Objects.equals(this.domainId, that.domainId) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.applicationId, that.applicationId) && Objects.equals(this.epId, that.epId)
            && Objects.equals(this.syncMode, that.syncMode) && Objects.equals(this.ruleTags, that.ruleTags)
            && Objects.equals(this.relationConfigurations, that.relationConfigurations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            vendor,
            code,
            domainId,
            regionId,
            componentId,
            applicationId,
            epId,
            syncMode,
            ruleTags,
            relationConfigurations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GroupQueryResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    code: ").append(toIndentedString(code)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    epId: ").append(toIndentedString(epId)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    ruleTags: ").append(toIndentedString(ruleTags)).append("\n");
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
