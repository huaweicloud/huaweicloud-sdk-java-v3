package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * BatchCreateApplicationViewRequestBodyGroupList
 */
public class BatchCreateApplicationViewRequestBodyGroupList {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region_id")

    private String regionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private String syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cmdb_resource_id_list")

    private List<String> cmdbResourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_rules")

    private List<BatchCreateApplicationViewRequestBodySyncRules> syncRules = null;

    public BatchCreateApplicationViewRequestBodyGroupList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }

    /**
     * region id
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * 父节点code
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withSyncMode(String syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * 同步模式
     * @return syncMode
     */
    public String getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(String syncMode) {
        this.syncMode = syncMode;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withCmdbResourceIdList(List<String> cmdbResourceIdList) {
        this.cmdbResourceIdList = cmdbResourceIdList;
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList addCmdbResourceIdListItem(String cmdbResourceIdListItem) {
        if (this.cmdbResourceIdList == null) {
            this.cmdbResourceIdList = new ArrayList<>();
        }
        this.cmdbResourceIdList.add(cmdbResourceIdListItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withCmdbResourceIdList(
        Consumer<List<String>> cmdbResourceIdListSetter) {
        if (this.cmdbResourceIdList == null) {
            this.cmdbResourceIdList = new ArrayList<>();
        }
        cmdbResourceIdListSetter.accept(this.cmdbResourceIdList);
        return this;
    }

    /**
     * 关联的资源id列表
     * @return cmdbResourceIdList
     */
    public List<String> getCmdbResourceIdList() {
        return cmdbResourceIdList;
    }

    public void setCmdbResourceIdList(List<String> cmdbResourceIdList) {
        this.cmdbResourceIdList = cmdbResourceIdList;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withSyncRules(
        List<BatchCreateApplicationViewRequestBodySyncRules> syncRules) {
        this.syncRules = syncRules;
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList addSyncRulesItem(
        BatchCreateApplicationViewRequestBodySyncRules syncRulesItem) {
        if (this.syncRules == null) {
            this.syncRules = new ArrayList<>();
        }
        this.syncRules.add(syncRulesItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withSyncRules(
        Consumer<List<BatchCreateApplicationViewRequestBodySyncRules>> syncRulesSetter) {
        if (this.syncRules == null) {
            this.syncRules = new ArrayList<>();
        }
        syncRulesSetter.accept(this.syncRules);
        return this;
    }

    /**
     * 智能关联规则
     * @return syncRules
     */
    public List<BatchCreateApplicationViewRequestBodySyncRules> getSyncRules() {
        return syncRules;
    }

    public void setSyncRules(List<BatchCreateApplicationViewRequestBodySyncRules> syncRules) {
        this.syncRules = syncRules;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchCreateApplicationViewRequestBodyGroupList that = (BatchCreateApplicationViewRequestBodyGroupList) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.regionId, that.regionId)
            && Objects.equals(this.parentName, that.parentName) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.cmdbResourceIdList, that.cmdbResourceIdList)
            && Objects.equals(this.syncRules, that.syncRules);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, regionId, parentName, syncMode, cmdbResourceIdList, syncRules);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateApplicationViewRequestBodyGroupList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    cmdbResourceIdList: ").append(toIndentedString(cmdbResourceIdList)).append("\n");
        sb.append("    syncRules: ").append(toIndentedString(syncRules)).append("\n");
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
