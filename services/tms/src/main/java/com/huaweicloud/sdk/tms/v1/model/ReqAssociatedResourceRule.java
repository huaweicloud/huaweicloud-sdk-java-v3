package com.huaweicloud.sdk.tms.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ReqAssociatedResourceRule
 */
public class ReqAssociatedResourceRule {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "setting_name")

    private String settingName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tag_keys")

    private List<String> tagKeys = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "existing_resource_status")

    private String existingResourceStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "auto_delete_status")

    private String autoDeleteStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    public ReqAssociatedResourceRule withSettingName(String settingName) {
        this.settingName = settingName;
        return this;
    }

    /**
     * 规则配置名称
     * @return settingName
     */
    public String getSettingName() {
        return settingName;
    }

    public void setSettingName(String settingName) {
        this.settingName = settingName;
    }

    public ReqAssociatedResourceRule withTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
        return this;
    }

    public ReqAssociatedResourceRule addTagKeysItem(String tagKeysItem) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        this.tagKeys.add(tagKeysItem);
        return this;
    }

    public ReqAssociatedResourceRule withTagKeys(Consumer<List<String>> tagKeysSetter) {
        if (this.tagKeys == null) {
            this.tagKeys = new ArrayList<>();
        }
        tagKeysSetter.accept(this.tagKeys);
        return this;
    }

    /**
     * 标签键列表
     * @return tagKeys
     */
    public List<String> getTagKeys() {
        return tagKeys;
    }

    public void setTagKeys(List<String> tagKeys) {
        this.tagKeys = tagKeys;
    }

    public ReqAssociatedResourceRule withExistingResourceStatus(String existingResourceStatus) {
        this.existingResourceStatus = existingResourceStatus;
        return this;
    }

    /**
     * 存量资源生效状态：enable、disable
     * @return existingResourceStatus
     */
    public String getExistingResourceStatus() {
        return existingResourceStatus;
    }

    public void setExistingResourceStatus(String existingResourceStatus) {
        this.existingResourceStatus = existingResourceStatus;
    }

    public ReqAssociatedResourceRule withAutoDeleteStatus(String autoDeleteStatus) {
        this.autoDeleteStatus = autoDeleteStatus;
        return this;
    }

    /**
     * 关系解除后自动删除能力状态：enable、disable
     * @return autoDeleteStatus
     */
    public String getAutoDeleteStatus() {
        return autoDeleteStatus;
    }

    public void setAutoDeleteStatus(String autoDeleteStatus) {
        this.autoDeleteStatus = autoDeleteStatus;
    }

    public ReqAssociatedResourceRule withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * 规则生效的regionId
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ReqAssociatedResourceRule that = (ReqAssociatedResourceRule) obj;
        return Objects.equals(this.settingName, that.settingName) && Objects.equals(this.tagKeys, that.tagKeys)
            && Objects.equals(this.existingResourceStatus, that.existingResourceStatus)
            && Objects.equals(this.autoDeleteStatus, that.autoDeleteStatus)
            && Objects.equals(this.regionId, that.regionId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(settingName, tagKeys, existingResourceStatus, autoDeleteStatus, regionId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ReqAssociatedResourceRule {\n");
        sb.append("    settingName: ").append(toIndentedString(settingName)).append("\n");
        sb.append("    tagKeys: ").append(toIndentedString(tagKeys)).append("\n");
        sb.append("    existingResourceStatus: ").append(toIndentedString(existingResourceStatus)).append("\n");
        sb.append("    autoDeleteStatus: ").append(toIndentedString(autoDeleteStatus)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
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
