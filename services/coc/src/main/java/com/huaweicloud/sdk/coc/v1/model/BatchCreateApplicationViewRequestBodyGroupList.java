package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
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
    @JsonProperty(value = "cmdb_resource_id_list")

    private List<String> cmdbResourceIdList = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parent_name")

    private String parentName;

    /**
     * **参数解释：** 同步模式。 **约束限制：** 不涉及。 **取值范围：** - MANUAL：表示手动关联：用户在对应分组下，手动将对应资源数据关联至分组内进行管理。 - AUTO：表示智能关联：用户通过企业项目和标签的形式，将企业项目下的相同标签资源创建至同一资源分组。 **默认取值：** 不涉及。
     */
    public static final class SyncModeEnum {

        /**
         * Enum MANUAL for value: "MANUAL"
         */
        public static final SyncModeEnum MANUAL = new SyncModeEnum("MANUAL");

        /**
         * Enum AUTO for value: "AUTO"
         */
        public static final SyncModeEnum AUTO = new SyncModeEnum("AUTO");

        private static final Map<String, SyncModeEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, SyncModeEnum> createStaticFields() {
            Map<String, SyncModeEnum> map = new HashMap<>();
            map.put("MANUAL", MANUAL);
            map.put("AUTO", AUTO);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        SyncModeEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static SyncModeEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value)).orElse(new SyncModeEnum(value));
        }

        public static SyncModeEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            return java.util.Optional.ofNullable(STATIC_FIELDS.get(value))
                .orElseThrow(() -> new IllegalArgumentException("Unexpected value '" + value + "'"));
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof SyncModeEnum) {
                return this.value.equals(((SyncModeEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_mode")

    private SyncModeEnum syncMode;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sync_rules")

    private List<BatchCreateApplicationViewRequestBodySyncRules> syncRules = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_name")

    private String applicationName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_name")

    private String componentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "vendor")

    private String vendor;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "relation_configurations")

    private List<GroupRelationConfiguration> relationConfigurations = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "related_domain_id")

    private String relatedDomainId;

    public BatchCreateApplicationViewRequestBodyGroupList withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释：** 分组名称。 **约束限制：** 不涉及。 **取值范围：** 由中文、英文字母、数字、中划线、下划线组成，长度在3~50个字符之间。 **默认取值：** 不涉及。
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
     * **参数解释：** 区域id。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return regionId
     */
    public String getRegionId() {
        return regionId;
    }

    public void setRegionId(String regionId) {
        this.regionId = regionId;
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
     * **参数解释：** 关联的资源id列表。 **约束限制：** 不涉及。 **取值范围：** 不涉及。 **默认取值：** 不涉及。
     * @return cmdbResourceIdList
     */
    public List<String> getCmdbResourceIdList() {
        return cmdbResourceIdList;
    }

    public void setCmdbResourceIdList(List<String> cmdbResourceIdList) {
        this.cmdbResourceIdList = cmdbResourceIdList;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withParentName(String parentName) {
        this.parentName = parentName;
        return this;
    }

    /**
     * **参数解释：** 父节点名称。 **约束限制：** 不涉及。 **取值范围：** 字符串，长度3到50个字符。 **默认取值：** 不涉及。
     * @return parentName
     */
    public String getParentName() {
        return parentName;
    }

    public void setParentName(String parentName) {
        this.parentName = parentName;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withSyncMode(SyncModeEnum syncMode) {
        this.syncMode = syncMode;
        return this;
    }

    /**
     * **参数解释：** 同步模式。 **约束限制：** 不涉及。 **取值范围：** - MANUAL：表示手动关联：用户在对应分组下，手动将对应资源数据关联至分组内进行管理。 - AUTO：表示智能关联：用户通过企业项目和标签的形式，将企业项目下的相同标签资源创建至同一资源分组。 **默认取值：** 不涉及。
     * @return syncMode
     */
    public SyncModeEnum getSyncMode() {
        return syncMode;
    }

    public void setSyncMode(SyncModeEnum syncMode) {
        this.syncMode = syncMode;
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
     * **参数解释：** 智能关联规则。 **约束限制：** 不涉及。 **取值范围：** 智能关联已选择的企业项目和对应标签的现存及未来创建的资源。 **默认取值：** 不涉及。
     * @return syncRules
     */
    public List<BatchCreateApplicationViewRequestBodySyncRules> getSyncRules() {
        return syncRules;
    }

    public void setSyncRules(List<BatchCreateApplicationViewRequestBodySyncRules> syncRules) {
        this.syncRules = syncRules;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withApplicationName(String applicationName) {
        this.applicationName = applicationName;
        return this;
    }

    /**
     * **参数解释：** 分组关联的应用名称。 **约束限制：** 不涉及。 **取值范围：**  由中文、英文字母、数字、中划线、下划线组成，长度在3~50个字符之间。 **默认取值：** 不涉及。
     * @return applicationName
     */
    public String getApplicationName() {
        return applicationName;
    }

    public void setApplicationName(String applicationName) {
        this.applicationName = applicationName;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withComponentName(String componentName) {
        this.componentName = componentName;
        return this;
    }

    /**
     * **参数解释：** 分组关联的组件名称。 **约束限制：** 不涉及。 **取值范围：**  由中文、英文字母、数字、中划线、下划线组成，长度在3~50个字符之间。 **默认取值：** 不涉及。
     * @return componentName
     */
    public String getComponentName() {
        return componentName;
    }

    public void setComponentName(String componentName) {
        this.componentName = componentName;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withVendor(String vendor) {
        this.vendor = vendor;
        return this;
    }

    /**
     * **参数解释：** 云广商信息。 **约束限制：** 不涉及。 **取值范围：** - RMS： 华为云。 - AWS：亚马逊。 - AZURE：微软。 - ALI：阿里云。 - VMWARE：VMware。 - OPENSTACK：openstack云平台。 - HCS：Huawei Cloud Stack。 - OTHER：其他云广商。 **默认取值：** 不涉及。
     * @return vendor
     */
    public String getVendor() {
        return vendor;
    }

    public void setVendor(String vendor) {
        this.vendor = vendor;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withRelationConfigurations(
        List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList addRelationConfigurationsItem(
        GroupRelationConfiguration relationConfigurationsItem) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        this.relationConfigurations.add(relationConfigurationsItem);
        return this;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withRelationConfigurations(
        Consumer<List<GroupRelationConfiguration>> relationConfigurationsSetter) {
        if (this.relationConfigurations == null) {
            this.relationConfigurations = new ArrayList<>();
        }
        relationConfigurationsSetter.accept(this.relationConfigurations);
        return this;
    }

    /**
     * **参数解释：** 分组配置信息。 **约束限制：** 不涉及。 **取值范围：** 分组的关联配置信息，比如对应的APM的配置信息。 **默认取值：** 不涉及。
     * @return relationConfigurations
     */
    public List<GroupRelationConfiguration> getRelationConfigurations() {
        return relationConfigurations;
    }

    public void setRelationConfigurations(List<GroupRelationConfiguration> relationConfigurations) {
        this.relationConfigurations = relationConfigurations;
    }

    public BatchCreateApplicationViewRequestBodyGroupList withRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
        return this;
    }

    /**
     * **参数解释：** 关联的租户id。 **约束限制：** 不涉及。 **取值范围：** 字符串，长度32个字符。 **默认取值：** 不涉及。
     * @return relatedDomainId
     */
    public String getRelatedDomainId() {
        return relatedDomainId;
    }

    public void setRelatedDomainId(String relatedDomainId) {
        this.relatedDomainId = relatedDomainId;
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
            && Objects.equals(this.cmdbResourceIdList, that.cmdbResourceIdList)
            && Objects.equals(this.parentName, that.parentName) && Objects.equals(this.syncMode, that.syncMode)
            && Objects.equals(this.syncRules, that.syncRules)
            && Objects.equals(this.applicationName, that.applicationName)
            && Objects.equals(this.componentName, that.componentName) && Objects.equals(this.vendor, that.vendor)
            && Objects.equals(this.relationConfigurations, that.relationConfigurations)
            && Objects.equals(this.relatedDomainId, that.relatedDomainId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            regionId,
            cmdbResourceIdList,
            parentName,
            syncMode,
            syncRules,
            applicationName,
            componentName,
            vendor,
            relationConfigurations,
            relatedDomainId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchCreateApplicationViewRequestBodyGroupList {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    regionId: ").append(toIndentedString(regionId)).append("\n");
        sb.append("    cmdbResourceIdList: ").append(toIndentedString(cmdbResourceIdList)).append("\n");
        sb.append("    parentName: ").append(toIndentedString(parentName)).append("\n");
        sb.append("    syncMode: ").append(toIndentedString(syncMode)).append("\n");
        sb.append("    syncRules: ").append(toIndentedString(syncRules)).append("\n");
        sb.append("    applicationName: ").append(toIndentedString(applicationName)).append("\n");
        sb.append("    componentName: ").append(toIndentedString(componentName)).append("\n");
        sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
        sb.append("    relationConfigurations: ").append(toIndentedString(relationConfigurations)).append("\n");
        sb.append("    relatedDomainId: ").append(toIndentedString(relatedDomainId)).append("\n");
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
