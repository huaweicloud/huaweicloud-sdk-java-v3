package com.huaweicloud.sdk.secmaster.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 更新布局字段请求体
 */
public class UpdateLayoutFieldRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "layout_id")

    private String layoutId;

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
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "display_type")

    private String displayType;

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
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "readonly")

    private Boolean readonly;

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
    @JsonProperty(value = "boa_version")

    private String boaVersion;

    public UpdateLayoutFieldRequestBody withName(String name) {
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

    public UpdateLayoutFieldRequestBody withDescription(String description) {
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

    public UpdateLayoutFieldRequestBody withLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }

    /**
     * 布局ID
     * @return layoutId
     */
    public String getLayoutId() {
        return layoutId;
    }

    public void setLayoutId(String layoutId) {
        this.layoutId = layoutId;
    }

    public UpdateLayoutFieldRequestBody withWizardId(String wizardId) {
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

    public UpdateLayoutFieldRequestBody withAopworkflowId(String aopworkflowId) {
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

    public UpdateLayoutFieldRequestBody withAopworkflowVersionId(String aopworkflowVersionId) {
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

    public UpdateLayoutFieldRequestBody withPlaybookId(String playbookId) {
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

    public UpdateLayoutFieldRequestBody withPlaybookVersionId(String playbookVersionId) {
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

    public UpdateLayoutFieldRequestBody withDefaultValue(String defaultValue) {
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

    public UpdateLayoutFieldRequestBody withDisplayType(String displayType) {
        this.displayType = displayType;
        return this;
    }

    /**
     * 显示类型
     * @return displayType
     */
    public String getDisplayType() {
        return displayType;
    }

    public void setDisplayType(String displayType) {
        this.displayType = displayType;
    }

    public UpdateLayoutFieldRequestBody withFieldType(String fieldType) {
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

    public UpdateLayoutFieldRequestBody withExtraJson(String extraJson) {
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

    public UpdateLayoutFieldRequestBody withFieldTooltip(String fieldTooltip) {
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

    public UpdateLayoutFieldRequestBody withJsonSchema(String jsonSchema) {
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

    public UpdateLayoutFieldRequestBody withReadonly(Boolean readonly) {
        this.readonly = readonly;
        return this;
    }

    /**
     * 只读模式，true只读，false非只读
     * @return readonly
     */
    public Boolean getReadonly() {
        return readonly;
    }

    public void setReadonly(Boolean readonly) {
        this.readonly = readonly;
    }

    public UpdateLayoutFieldRequestBody withRequired(Boolean required) {
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

    public UpdateLayoutFieldRequestBody withSearchable(Boolean searchable) {
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

    public UpdateLayoutFieldRequestBody withVisible(Boolean visible) {
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

    public UpdateLayoutFieldRequestBody withMaintainable(Boolean maintainable) {
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

    public UpdateLayoutFieldRequestBody withEditable(Boolean editable) {
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

    public UpdateLayoutFieldRequestBody withCreatable(Boolean creatable) {
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

    public UpdateLayoutFieldRequestBody withBoaVersion(String boaVersion) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        UpdateLayoutFieldRequestBody that = (UpdateLayoutFieldRequestBody) obj;
        return Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.layoutId, that.layoutId) && Objects.equals(this.wizardId, that.wizardId)
            && Objects.equals(this.aopworkflowId, that.aopworkflowId)
            && Objects.equals(this.aopworkflowVersionId, that.aopworkflowVersionId)
            && Objects.equals(this.playbookId, that.playbookId)
            && Objects.equals(this.playbookVersionId, that.playbookVersionId)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.displayType, that.displayType) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.extraJson, that.extraJson) && Objects.equals(this.fieldTooltip, that.fieldTooltip)
            && Objects.equals(this.jsonSchema, that.jsonSchema) && Objects.equals(this.readonly, that.readonly)
            && Objects.equals(this.required, that.required) && Objects.equals(this.searchable, that.searchable)
            && Objects.equals(this.visible, that.visible) && Objects.equals(this.maintainable, that.maintainable)
            && Objects.equals(this.editable, that.editable) && Objects.equals(this.creatable, that.creatable)
            && Objects.equals(this.boaVersion, that.boaVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name,
            description,
            layoutId,
            wizardId,
            aopworkflowId,
            aopworkflowVersionId,
            playbookId,
            playbookVersionId,
            defaultValue,
            displayType,
            fieldType,
            extraJson,
            fieldTooltip,
            jsonSchema,
            readonly,
            required,
            searchable,
            visible,
            maintainable,
            editable,
            creatable,
            boaVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateLayoutFieldRequestBody {\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    layoutId: ").append(toIndentedString(layoutId)).append("\n");
        sb.append("    wizardId: ").append(toIndentedString(wizardId)).append("\n");
        sb.append("    aopworkflowId: ").append(toIndentedString(aopworkflowId)).append("\n");
        sb.append("    aopworkflowVersionId: ").append(toIndentedString(aopworkflowVersionId)).append("\n");
        sb.append("    playbookId: ").append(toIndentedString(playbookId)).append("\n");
        sb.append("    playbookVersionId: ").append(toIndentedString(playbookVersionId)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    extraJson: ").append(toIndentedString(extraJson)).append("\n");
        sb.append("    fieldTooltip: ").append(toIndentedString(fieldTooltip)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    readonly: ").append(toIndentedString(readonly)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    maintainable: ").append(toIndentedString(maintainable)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    creatable: ").append(toIndentedString(creatable)).append("\n");
        sb.append("    boaVersion: ").append(toIndentedString(boaVersion)).append("\n");
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
