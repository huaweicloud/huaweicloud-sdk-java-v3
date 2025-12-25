package com.huaweicloud.sdk.secmaster.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 字段详情
 */
public class FieldResponseBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cloud_pack_version")

    private String cloudPackVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_id")

    private String businessId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_type")

    private String businessType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dataclass_name")

    private String dataclassName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "business_code")

    private String businessCode;

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
    @JsonProperty(value = "iu_type")

    private String iuType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "used_by")

    private String usedBy;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "json_schema")

    private String jsonSchema;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_built_in")

    private Boolean isBuiltIn;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "case_sensitive")

    private Boolean caseSensitive;

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
    @JsonProperty(value = "mapping")

    private Boolean mapping;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_api")

    private String targetApi;

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

    public FieldResponseBody withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 字段Id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public FieldResponseBody withCloudPackVersion(String cloudPackVersion) {
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

    public FieldResponseBody withBusinessId(String businessId) {
        this.businessId = businessId;
        return this;
    }

    /**
     * 关联业务id
     * @return businessId
     */
    public String getBusinessId() {
        return businessId;
    }

    public void setBusinessId(String businessId) {
        this.businessId = businessId;
    }

    public FieldResponseBody withBusinessType(String businessType) {
        this.businessType = businessType;
        return this;
    }

    /**
     * 关联业务
     * @return businessType
     */
    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public FieldResponseBody withDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
        return this;
    }

    /**
     * 数据类名称
     * @return dataclassName
     */
    public String getDataclassName() {
        return dataclassName;
    }

    public void setDataclassName(String dataclassName) {
        this.dataclassName = dataclassName;
    }

    public FieldResponseBody withBusinessCode(String businessCode) {
        this.businessCode = businessCode;
        return this;
    }

    /**
     * 字段业务编码
     * @return businessCode
     */
    public String getBusinessCode() {
        return businessCode;
    }

    public void setBusinessCode(String businessCode) {
        this.businessCode = businessCode;
    }

    public FieldResponseBody withFieldKey(String fieldKey) {
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

    public FieldResponseBody withName(String name) {
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

    public FieldResponseBody withDescription(String description) {
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

    public FieldResponseBody withDefaultValue(String defaultValue) {
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

    public FieldResponseBody withDisplayType(String displayType) {
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

    public FieldResponseBody withFieldType(String fieldType) {
        this.fieldType = fieldType;
        return this;
    }

    /**
     * **参数解释：** 字段类型  **约束限制：** 不涉及  **取值范围：** - String: 字符串   Object: 对象   Timestamp: 时间   Integer: 整型   List<String>: 字符串数组   Numeric: 数字   Boolean: 布尔值   List<Object>: 对象数组   Long: 长整型   Enum: 枚举   Double: 双精度浮点数   Float: 浮点数   Password: 密码  **默认取值：** 不涉及
     * @return fieldType
     */
    public String getFieldType() {
        return fieldType;
    }

    public void setFieldType(String fieldType) {
        this.fieldType = fieldType;
    }

    public FieldResponseBody withExtraJson(String extraJson) {
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

    public FieldResponseBody withFieldTooltip(String fieldTooltip) {
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

    public FieldResponseBody withIuType(String iuType) {
        this.iuType = iuType;
        return this;
    }

    /**
     * 输入输出类型
     * @return iuType
     */
    public String getIuType() {
        return iuType;
    }

    public void setIuType(String iuType) {
        this.iuType = iuType;
    }

    public FieldResponseBody withUsedBy(String usedBy) {
        this.usedBy = usedBy;
        return this;
    }

    /**
     * 使用业务
     * @return usedBy
     */
    public String getUsedBy() {
        return usedBy;
    }

    public void setUsedBy(String usedBy) {
        this.usedBy = usedBy;
    }

    public FieldResponseBody withJsonSchema(String jsonSchema) {
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

    public FieldResponseBody withIsBuiltIn(Boolean isBuiltIn) {
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

    public FieldResponseBody withCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
        return this;
    }

    /**
     * 大小写敏感，true敏感，false不敏感
     * @return caseSensitive
     */
    public Boolean getCaseSensitive() {
        return caseSensitive;
    }

    public void setCaseSensitive(Boolean caseSensitive) {
        this.caseSensitive = caseSensitive;
    }

    public FieldResponseBody withReadOnly(Boolean readOnly) {
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

    public FieldResponseBody withRequired(Boolean required) {
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

    public FieldResponseBody withSearchable(Boolean searchable) {
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

    public FieldResponseBody withVisible(Boolean visible) {
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

    public FieldResponseBody withMaintainable(Boolean maintainable) {
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

    public FieldResponseBody withEditable(Boolean editable) {
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

    public FieldResponseBody withCreatable(Boolean creatable) {
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

    public FieldResponseBody withMapping(Boolean mapping) {
        this.mapping = mapping;
        return this;
    }

    /**
     * 是否展示在分类映射外的其他地方
     * @return mapping
     */
    public Boolean getMapping() {
        return mapping;
    }

    public void setMapping(Boolean mapping) {
        this.mapping = mapping;
    }

    public FieldResponseBody withTargetApi(String targetApi) {
        this.targetApi = targetApi;
        return this;
    }

    /**
     * 目标api
     * @return targetApi
     */
    public String getTargetApi() {
        return targetApi;
    }

    public void setTargetApi(String targetApi) {
        this.targetApi = targetApi;
    }

    public FieldResponseBody withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * 创建人id
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public FieldResponseBody withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * 创建人名称
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public FieldResponseBody withModifierId(String modifierId) {
        this.modifierId = modifierId;
        return this;
    }

    /**
     * 修改人id
     * @return modifierId
     */
    public String getModifierId() {
        return modifierId;
    }

    public void setModifierId(String modifierId) {
        this.modifierId = modifierId;
    }

    public FieldResponseBody withModifierName(String modifierName) {
        this.modifierName = modifierName;
        return this;
    }

    /**
     * 修改人名称
     * @return modifierName
     */
    public String getModifierName() {
        return modifierName;
    }

    public void setModifierName(String modifierName) {
        this.modifierName = modifierName;
    }

    public FieldResponseBody withCreateTime(String createTime) {
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

    public FieldResponseBody withUpdateTime(String updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间
     * @return updateTime
     */
    public String getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(String updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        FieldResponseBody that = (FieldResponseBody) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.cloudPackVersion, that.cloudPackVersion)
            && Objects.equals(this.businessId, that.businessId) && Objects.equals(this.businessType, that.businessType)
            && Objects.equals(this.dataclassName, that.dataclassName)
            && Objects.equals(this.businessCode, that.businessCode) && Objects.equals(this.fieldKey, that.fieldKey)
            && Objects.equals(this.name, that.name) && Objects.equals(this.description, that.description)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.displayType, that.displayType) && Objects.equals(this.fieldType, that.fieldType)
            && Objects.equals(this.extraJson, that.extraJson) && Objects.equals(this.fieldTooltip, that.fieldTooltip)
            && Objects.equals(this.iuType, that.iuType) && Objects.equals(this.usedBy, that.usedBy)
            && Objects.equals(this.jsonSchema, that.jsonSchema) && Objects.equals(this.isBuiltIn, that.isBuiltIn)
            && Objects.equals(this.caseSensitive, that.caseSensitive) && Objects.equals(this.readOnly, that.readOnly)
            && Objects.equals(this.required, that.required) && Objects.equals(this.searchable, that.searchable)
            && Objects.equals(this.visible, that.visible) && Objects.equals(this.maintainable, that.maintainable)
            && Objects.equals(this.editable, that.editable) && Objects.equals(this.creatable, that.creatable)
            && Objects.equals(this.mapping, that.mapping) && Objects.equals(this.targetApi, that.targetApi)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.modifierId, that.modifierId) && Objects.equals(this.modifierName, that.modifierName)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            cloudPackVersion,
            businessId,
            businessType,
            dataclassName,
            businessCode,
            fieldKey,
            name,
            description,
            defaultValue,
            displayType,
            fieldType,
            extraJson,
            fieldTooltip,
            iuType,
            usedBy,
            jsonSchema,
            isBuiltIn,
            caseSensitive,
            readOnly,
            required,
            searchable,
            visible,
            maintainable,
            editable,
            creatable,
            mapping,
            targetApi,
            creatorId,
            creatorName,
            modifierId,
            modifierName,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class FieldResponseBody {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    cloudPackVersion: ").append(toIndentedString(cloudPackVersion)).append("\n");
        sb.append("    businessId: ").append(toIndentedString(businessId)).append("\n");
        sb.append("    businessType: ").append(toIndentedString(businessType)).append("\n");
        sb.append("    dataclassName: ").append(toIndentedString(dataclassName)).append("\n");
        sb.append("    businessCode: ").append(toIndentedString(businessCode)).append("\n");
        sb.append("    fieldKey: ").append(toIndentedString(fieldKey)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    displayType: ").append(toIndentedString(displayType)).append("\n");
        sb.append("    fieldType: ").append(toIndentedString(fieldType)).append("\n");
        sb.append("    extraJson: ").append(toIndentedString(extraJson)).append("\n");
        sb.append("    fieldTooltip: ").append(toIndentedString(fieldTooltip)).append("\n");
        sb.append("    iuType: ").append(toIndentedString(iuType)).append("\n");
        sb.append("    usedBy: ").append(toIndentedString(usedBy)).append("\n");
        sb.append("    jsonSchema: ").append(toIndentedString(jsonSchema)).append("\n");
        sb.append("    isBuiltIn: ").append(toIndentedString(isBuiltIn)).append("\n");
        sb.append("    caseSensitive: ").append(toIndentedString(caseSensitive)).append("\n");
        sb.append("    readOnly: ").append(toIndentedString(readOnly)).append("\n");
        sb.append("    required: ").append(toIndentedString(required)).append("\n");
        sb.append("    searchable: ").append(toIndentedString(searchable)).append("\n");
        sb.append("    visible: ").append(toIndentedString(visible)).append("\n");
        sb.append("    maintainable: ").append(toIndentedString(maintainable)).append("\n");
        sb.append("    editable: ").append(toIndentedString(editable)).append("\n");
        sb.append("    creatable: ").append(toIndentedString(creatable)).append("\n");
        sb.append("    mapping: ").append(toIndentedString(mapping)).append("\n");
        sb.append("    targetApi: ").append(toIndentedString(targetApi)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    modifierId: ").append(toIndentedString(modifierId)).append("\n");
        sb.append("    modifierName: ").append(toIndentedString(modifierName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
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
