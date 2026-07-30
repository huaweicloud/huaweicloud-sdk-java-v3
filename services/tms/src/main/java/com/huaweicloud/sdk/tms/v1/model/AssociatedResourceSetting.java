package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 规则的配置信息
 */
public class AssociatedResourceSetting {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_name")

    private String settingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_service")

    private String masterService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "master_resource_type")

    private String masterResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_service")

    private String associatedService;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "associated_resource_type")

    private String associatedResourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_existing_resource")

    private Boolean supportExistingResource;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "support_auto_delete")

    private Boolean supportAutoDelete;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_ids")

    private List<String> regionIds = null;

    public AssociatedResourceSetting withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * 规则的配置名称
     * @return settingName
     */
    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public AssociatedResourceSetting withMasterService(String masterService) {
        this.masterService = masterService;
        return this;
    }

    /**
     * 主资源
     * @return masterService
     */
    public String getMasterService() {
        return masterService;
    }

    public void setMasterService(String masterService) {
        this.masterService = masterService;
    }

    public AssociatedResourceSetting withMasterResourceType(String masterResourceType) {
        this.masterResourceType = masterResourceType;
        return this;
    }

    /**
     * 主资源类型
     * @return masterResourceType
     */
    public String getMasterResourceType() {
        return masterResourceType;
    }

    public void setMasterResourceType(String masterResourceType) {
        this.masterResourceType = masterResourceType;
    }

    public AssociatedResourceSetting withAssociatedService(String associatedService) {
        this.associatedService = associatedService;
        return this;
    }

    /**
     * 关联资源
     * @return associatedService
     */
    public String getAssociatedService() {
        return associatedService;
    }

    public void setAssociatedService(String associatedService) {
        this.associatedService = associatedService;
    }

    public AssociatedResourceSetting withAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
        return this;
    }

    /**
     * 关联资源类型
     * @return associatedResourceType
     */
    public String getAssociatedResourceType() {
        return associatedResourceType;
    }

    public void setAssociatedResourceType(String associatedResourceType) {
        this.associatedResourceType = associatedResourceType;
    }

    public AssociatedResourceSetting withSupportExistingResource(Boolean supportExistingResource) {
        this.supportExistingResource = supportExistingResource;
        return this;
    }

    /**
     * 是否规则是对存量资源生效。
     * @return supportExistingResource
     */
    public Boolean getSupportExistingResource() {
        return supportExistingResource;
    }

    public void setSupportExistingResource(Boolean supportExistingResource) {
        this.supportExistingResource = supportExistingResource;
    }

    public AssociatedResourceSetting withSupportAutoDelete(Boolean supportAutoDelete) {
        this.supportAutoDelete = supportAutoDelete;
        return this;
    }

    /**
     * 是否支持关系解除后自动删除标签。
     * @return supportAutoDelete
     */
    public Boolean getSupportAutoDelete() {
        return supportAutoDelete;
    }

    public void setSupportAutoDelete(Boolean supportAutoDelete) {
        this.supportAutoDelete = supportAutoDelete;
    }

    public AssociatedResourceSetting withRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
        return this;
    }

    public AssociatedResourceSetting addRegionIdsItem(String regionIdsItem) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        this.regionIds.add(regionIdsItem);
        return this;
    }

    public AssociatedResourceSetting withRegionIds(Consumer<List<String>> regionIdsSetter) {
        if (this.regionIds == null) {
            this.regionIds = new ArrayList<>();
        }
        regionIdsSetter.accept(this.regionIds);
        return this;
    }

    /**
     * 规则配置支持的区域Id。
     * @return regionIds
     */
    public List<String> getRegionIds() {
        return regionIds;
    }

    public void setRegionIds(List<String> regionIds) {
        this.regionIds = regionIds;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        AssociatedResourceSetting that = (AssociatedResourceSetting) obj;
        return Objects.equals(this.settingName, that.settingName)
            && Objects.equals(this.masterService, that.masterService)
            && Objects.equals(this.masterResourceType, that.masterResourceType)
            && Objects.equals(this.associatedService, that.associatedService)
            && Objects.equals(this.associatedResourceType, that.associatedResourceType)
            && Objects.equals(this.supportExistingResource, that.supportExistingResource)
            && Objects.equals(this.supportAutoDelete, that.supportAutoDelete)
            && Objects.equals(this.regionIds, that.regionIds);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingName,
            masterService,
            masterResourceType,
            associatedService,
            associatedResourceType,
            supportExistingResource,
            supportAutoDelete,
            regionIds);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class AssociatedResourceSetting {\n");
        sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
        sb.append("    masterService: ").append(toIndentedString(masterService)).append("\n");
        sb.append("    masterResourceType: ").append(toIndentedString(masterResourceType)).append("\n");
        sb.append("    associatedService: ").append(toIndentedString(associatedService)).append("\n");
        sb.append("    associatedResourceType: ").append(toIndentedString(associatedResourceType)).append("\n");
        sb.append("    supportExistingResource: ").append(toIndentedString(supportExistingResource)).append("\n");
        sb.append("    supportAutoDelete: ").append(toIndentedString(supportAutoDelete)).append("\n");
        sb.append("    regionIds: ").append(toIndentedString(regionIds)).append("\n");
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
