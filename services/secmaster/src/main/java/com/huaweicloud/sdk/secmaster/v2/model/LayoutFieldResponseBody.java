package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 字段详情
 */
public class LayoutFieldResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_id")

    private String cloudPackId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_name")

    private String cloudPackName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_id")

    private String dataclassId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_version")

    private String cloudPackVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_key")

    private String fieldKey;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_description")

    private String enDescription;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_default_value")

    private String enDefaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_type")

    private String fieldType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "extra_json")

    private String extraJson;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "field_tooltip")

    private String fieldTooltip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "en_field_tooltip")

    private String enFieldTooltip;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "read_only")

    private Boolean readOnly;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "required")

    private Boolean required;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "searchable")

    private Boolean searchable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "visible")

    private Boolean visible;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "maintainable")

    private Boolean maintainable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "editable")

    private Boolean editable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creatable")

    private Boolean creatable;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_id")

    private String modifierId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "modifier_name")

    private String modifierName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "wizard_id")

    private String wizardId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aopworkflow_id")

    private String aopworkflowId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aopworkflow_version_id")

    private String aopworkflowVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_id")

    private String playbookId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "playbook_version_id")

    private String playbookVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "version")

    private String version;

    public LayoutFieldResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 字段ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public LayoutFieldResponseBody withCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
        return this;
    }

    /**
     * 订阅包id
     * @return cloudPackId
     */
    public String getCloudPackId() {
        return cloudPackId;
    }

    public void setCloudPackId(String cloudPackId) {
        this.cloudPackId = cloudPackId;
    }

    public LayoutFieldResponseBody withCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
        return this;
    }

    /**
     * 订阅包名称
     * @return cloudPackName
     */
    public String getCloudPackName() {
        return cloudPackName;
    }

    public void setCloudPackName(String cloudPackName) {
        this.cloudPackName = cloudPackName;
    }

    public LayoutFieldResponseBody withDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
        return this;
    }

    /**
     * 数据类ID
     * @return dataclassId
     */
    public String getDataclassId() {
        return dataclassId;
    }

    public void setDataclassId(String dataclassId) {
        this.dataclassId = dataclassId;
    }

    public LayoutFieldResponseBody withCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
        return this;
    }

    /**
     * 订阅包版本
     * @return cloudPackVersion
     */
    public String getCloudPackVersion() {
        return cloudPackVersion;
    }

    public void setCloudPackVersion(String cloudPackVersion) {
        this.cloudPackVersion = cloudPackVersion;
    }

    public LayoutFieldResponseBody withFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
        return this;
    }

    /**
     * 字段key
     * @return fieldKey
     */
    public String getFieldKey() {
        return fieldKey;
    }

    public void setFieldKey(String fieldKey) {
        this.fieldKey = fieldKey;
    }

    public LayoutFieldResponseBody withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LayoutFieldResponseBody withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 字段描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public LayoutFieldResponseBody withEnDescription(String enDescription) {
        this.enDescription = enDescription;
        return this;
    }

    /**
     * 字段英文描述
     * @return enDescription
     */
    public String getEnDescription() {
        return enDescription;
    }

    public void setEnDescription(String enDescription) {
        this.enDescription = enDescription;
    }

    public LayoutFieldResponseBody withDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
        return this;
    }

    /**
     * 默认值
     * @return defaultValue
     */
    public String getDefaultValue() {
        return defaultValue;
    }

    public void setDefaultValue(String defaultValue) {
        this.defaultValue = defaultValue;
    }

    public LayoutFieldResponseBody withEnDefaultValue(String enDefaultValue) {
        this.enDefaultValue = enDefaultValue;
        return this;
    }

    /**
     * 字段英文默认值
     * @return enDefaultValue
     */
    public String getEnDefaultValue() {
        return enDefaultValue;
    }

    public void setEnDefaultValue(String enDefaultValue) {
        this.enDefaultValue = enDefaultValue;
    }

    public LayoutFieldResponseBody withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * 字段类型，如shorttext,radio,grid等
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public LayoutFieldResponseBody withExtraJson(String extraJson) {
        this.extraJson = extraJson;
        return this;
    }

    /**
     * 附加json
     * @return extraJson
     */
    public String getExtraJson() {
        return extraJson;
    }

    public void setExtraJson(String extraJson) {
        this.extraJson = extraJson;
    }

    public LayoutFieldResponseBody withFieldTooltip(String fieldTooltip) {
        this.fieldTooltip = fieldTooltip;
        return this;
    }

    /**
     * 工具提示
     * @return fieldTooltip
     */
    public String getFieldTooltip() {
        return fieldTooltip;
    }

    public void setFieldTooltip(String fieldTooltip) {
        this.fieldTooltip = fieldTooltip;
    }

    public LayoutFieldResponseBody withEnFieldTooltip(String enFieldTooltip) {
        this.enFieldTooltip = enFieldTooltip;
        return this;
    }

    /**
     * 英文工具提示
     * @return enFieldTooltip
     */
    public String getEnFieldTooltip() {
        return enFieldTooltip;
    }

    public void setEnFieldTooltip(String enFieldTooltip) {
        this.enFieldTooltip = enFieldTooltip;
    }

    public LayoutFieldResponseBody withJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
        return this;
    }

    /**
     * json模式
     * @return jsonSchema
     */
    public String getJsonSchema() {
        return jsonSchema;
    }

    public void setJsonSchema(String jsonSchema) {
        this.jsonSchema = jsonSchema;
    }

    public LayoutFieldResponseBody withIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
        return this;
    }

    /**
     * 是否内置，true内置，false非内置
     * @return isBuiltIn
     */
    public Boolean getIsBuiltIn() {
        return isBuiltIn;
    }

    public void setIsBuiltIn(Boolean isBuiltIn) {
        this.isBuiltIn = isBuiltIn;
    }

    public LayoutFieldResponseBody withReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
        return this;
    }

    /**
     * 只读模式，true只读，false非只读
     * @return readOnly
     */
    public Boolean getReadOnly() {
        return readOnly;
    }

    public void setReadOnly(Boolean readOnly) {
        this.readOnly = readOnly;
    }

    public LayoutFieldResponseBody withRequired(Boolean required) {
        this.required = required;
        return this;
    }

    /**
     * 是否必填，true必填，false非必填
     * @return required
     */
    public Boolean getRequired() {
        return required;
    }

    public void setRequired(Boolean required) {
        this.required = required;
    }

    public LayoutFieldResponseBody withSearchable(Boolean searchable) {
        this.searchable = searchable;
        return this;
    }

    /**
     * 可搜索，true可搜索，false非可搜索
     * @return searchable
     */
    public Boolean getSearchable() {
        return searchable;
    }

    public void setSearchable(Boolean searchable) {
        this.searchable = searchable;
    }

    public LayoutFieldResponseBody withVisible(Boolean visible) {
        this.visible = visible;
        return this;
    }

    /**
     * 可见，true可见，false非可见
     * @return visible
     */
    public Boolean getVisible() {
        return visible;
    }

    public void setVisible(Boolean visible) {
        this.visible = visible;
    }

    public LayoutFieldResponseBody withMaintainable(Boolean maintainable) {
        this.maintainable = maintainable;
        return this;
    }

    /**
     * 可维护，true可维护，false非可维护
     * @return maintainable
     */
    public Boolean getMaintainable() {
        return maintainable;
    }

    public void setMaintainable(Boolean maintainable) {
        this.maintainable = maintainable;
    }

    public LayoutFieldResponseBody withEditable(Boolean editable) {
        this.editable = editable;
        return this;
    }

    /**
     * 可编辑，true可编辑，false非可编辑
     * @return editable
     */
    public Boolean getEditable() {
        return editable;
    }

    public void setEditable(Boolean editable) {
        this.editable = editable;
    }

    public LayoutFieldResponseBody withCreatable(Boolean creatable) {
        this.creatable = creatable;
        return this;
    }

    /**
     * 可创建，true可创建，false非可创建
     * @return creatable
     */
    public Boolean getCreatable() {
        return creatable;
    }

    public void setCreatable(Boolean creatable) {
        this.creatable = creatable;
    }

    public LayoutFieldResponseBody withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建者ID
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public LayoutFieldResponseBody withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建者名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public LayoutFieldResponseBody withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改者ID
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public LayoutFieldResponseBody withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改者名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public LayoutFieldResponseBody withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public LayoutFieldResponseBody withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 更新时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    public LayoutFieldResponseBody withWizardId(String wizardId) {
        this.wizardId = wizardId;
        return this;
    }

    /**
     * 字段绑定的页面id
     * @return wizardId
     */
    public String getWizardId() {
        return wizardId;
    }

    public void setWizardId(String wizardId) {
        this.wizardId = wizardId;
    }

    public LayoutFieldResponseBody withAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
        return this;
    }

    /**
     * 字段绑定的流程id
     * @return aopworkflowId
     */
    public String getAopworkflowId() {
        return aopworkflowId;
    }

    public void setAopworkflowId(String aopworkflowId) {
        this.aopworkflowId = aopworkflowId;
    }

    public LayoutFieldResponseBody withAopworkflowVersionId(String aopworkflowVersionId) {
        this.aopworkflowVersionId = aopworkflowVersionId;
        return this;
    }

    /**
     * 字段绑定的流程版本id
     * @return aopworkflowVersionId
     */
    public String getAopworkflowVersionId() {
        return aopworkflowVersionId;
    }

    public void setAopworkflowVersionId(String aopworkflowVersionId) {
        this.aopworkflowVersionId = aopworkflowVersionId;
    }

    public LayoutFieldResponseBody withPlaybookId(String playbookId) {
        this.playbookId = playbookId;
        return this;
    }

    /**
     * 字段绑定的剧本id
     * @return playbookId
     */
    public String getPlaybookId() {
        return playbookId;
    }

    public void setPlaybookId(String playbookId) {
        this.playbookId = playbookId;
    }

    public LayoutFieldResponseBody withPlaybookVersionId(String playbookVersionId) {
        this.playbookVersionId = playbookVersionId;
        return this;
    }

    /**
     * 字段绑定的剧本版本id
     * @return playbookVersionId
     */
    public String getPlaybookVersionId() {
        return playbookVersionId;
    }

    public void setPlaybookVersionId(String playbookVersionId) {
        this.playbookVersionId = playbookVersionId;
    }

    public LayoutFieldResponseBody withBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
        return this;
    }

    /**
     * BOA底座版本
     * @return boaVersion
     */
    public String getBoaVersion() {
        return boaVersion;
    }

    public void setBoaVersion(String boaVersion) {
        this.boaVersion = boaVersion;
    }

    public LayoutFieldResponseBody withVersion(String version) {
        this.version = version;
        return this;
    }

    /**
     * 安全云脑版本
     * @return version
     */
    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LayoutFieldResponseBody that = (LayoutFieldResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cloudPackId, that.cloudPackId)
            && Objects.equals(this.cloudPackName, that.cloudPackName)
            && Objects.equals(this.dataclassId, that.dataclassId)
            && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.fieldKey, that.fieldKey) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.enDescription, that.enDescription)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.enDefaultValue, that.enDefaultValue)
            && Objects.equals(this.fieldType, that.fieldType) && Objects.equals(this.extraJson, that.extraJson)
            && Objects.equals(this.fieldTooltip, that.fieldTooltip)
            && Objects.equals(this.enFieldTooltip, that.enFieldTooltip)
            && Objects.equals(this.jsonSchema, that.jsonSchema) && Objects.equals(this.isBuiltIn, that.isBuiltIn)
            && Objects.equals(this.readOnly, that.readOnly) && Objects.equals(this.required, that.required)
            && Objects.equals(this.searchable, that.searchable) && Objects.equals(this.visible, that.visible)
            && Objects.equals(this.maintainable, that.maintainable) && Objects.equals(this.editable, that.editable)
            && Objects.equals(this.creatable, that.creatable) && Objects.equals(this.creatorId, that.creatorId)
            && Objects.equals(this.creatorName, that.creatorName) && Objects.equals(this.modifierId, that.modifierId)
            && Objects.equals(this.modifierName, that.modifierName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.wizardId, that.wizardId)
            && Objects.equals(this.aopworkflowId, that.aopworkflowId)
            && Objects.equals(this.aopworkflowVersionId, that.aopworkflowVersionId)
            && Objects.equals(this.playbookId, that.playbookId)
            && Objects.equals(this.playbookVersionId, that.playbookVersionId)
            && Objects.equals(this.boaVersion, that.boaVersion) && Objects.equals(this.version, that.version);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cloudPackId,
            cloudPackName,
            dataclassId,
            cloudPackVersion,
            fieldKey,
            name,
            description,
            enDescription,
            defaultValue,
            enDefaultValue,
            fieldType,
            extraJson,
            fieldTooltip,
            enFieldTooltip,
            jsonSchema,
            isBuiltIn,
            readOnly,
            required,
            searchable,
            visible,
            maintainable,
            editable,
            creatable,
            creatorId,
            creatorName,
            modifierId,
            modifierName,
            createTime,
            updateTime,
            wizardId,
            aopworkflowId,
            aopworkflowVersionId,
            playbookId,
            playbookVersionId,
            boaVersion,
            version);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LayoutFieldResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudPackId: ").append(toIndentedString(cloudPackId)).append("\n");
        sb.append("    cloudPackName: ").append(toIndentedString(cloudPackName)).append("\n");
        sb.append("    dataclassId: ").append(toIndentedString(dataclassId)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    enDescription: ").append(toIndentedString(enDescription)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    enDefaultValue: ").append(toIndentedString(enDefaultValue)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    extraJson: ").append(toIndentedString(extraJson)).append("\n");
        sb.append("    fieldTooltip: ").append(toIndentedString(fieldTooltip)).append("\n");
        sb.append("    enFieldTooltip: ").append(toIndentedString(enFieldTooltip)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    maintainable: ").append(toIndentedString(maintainable)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    creatable: ").append(toIndentedString(creatable)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    wizardId: ").append(toIndentedString(wizardId)).append("\n");
        sb.append("    aopworkflowId: ").append(toIndentedString(aopworkflowId)).append("\n");
        sb.append("    aopworkflowVersionId: ").append(toIndentedString(aopworkflowVersionId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    playbookVersionId: ").append(toIndentedString(playbookVersionId)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
        sb.append("    version: ").append(toIndentedString(version)).append("\n");
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
