package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 实际的数据类型：单个对象，集合 或 NULL
 */
public class ProjectFieldConfigVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updator")

    private NameAndIdVo updator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "customName")

    private String customName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "table_field_name")

    private String tableFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type")

    private String valueType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "value_type_name")

    private String valueTypeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_system")

    private Integer isSystem;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_display")

    private Integer isDisplay;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_required")

    private Integer isRequired;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sort_numb")

    private Integer sortNumb;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "default_value")

    private String defaultValue;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_uri")

    private String customFieldUri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_type")

    private String resourceType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private NameAndIdVo creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_stamp")

    private Long createTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_stamp")

    private Long updateTimeStamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "option_vos")

    private List<ProjectFieldConfigOptionVo> optionVos = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_id")

    private Integer customFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_name")

    private String customFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_param")

    private String customFieldParam;

    public ProjectFieldConfigVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 字段配置URI标识
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProjectFieldConfigVo withUpdator(NameAndIdVo updator) {
        this.updator = updator;
        return this;
    }

    public ProjectFieldConfigVo withUpdator(Consumer<NameAndIdVo> updatorSetter) {
        if (this.updator == null) {
            this.updator = new NameAndIdVo();
            updatorSetter.accept(this.updator);
        }

        return this;
    }

    /**
     * Get updator
     * @return updator
     */
    public NameAndIdVo getUpdator() {
        return updator;
    }

    public void setUpdator(NameAndIdVo updator) {
        this.updator = updator;
    }

    public ProjectFieldConfigVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectFieldConfigVo withCustomName(String customName) {
        this.customName = customName;
        return this;
    }

    /**
     * 项目用例自定义字段名称
     * @return customName
     */
    public String getCustomName() {
        return customName;
    }

    public void setCustomName(String customName) {
        this.customName = customName;
    }

    public ProjectFieldConfigVo withTableFieldName(String tableFieldName) {
        this.tableFieldName = tableFieldName;
        return this;
    }

    /**
     * 字段名（对应后端参数名）
     * @return tableFieldName
     */
    public String getTableFieldName() {
        return tableFieldName;
    }

    public void setTableFieldName(String tableFieldName) {
        this.tableFieldName = tableFieldName;
    }

    public ProjectFieldConfigVo withValueType(String valueType) {
        this.valueType = valueType;
        return this;
    }

    /**
     * 字段类型(单行文本text、多行文本textArea、单选框radio、多选框checkbox、日期date、数字number、用户user)。
     * @return valueType
     */
    public String getValueType() {
        return valueType;
    }

    public void setValueType(String valueType) {
        this.valueType = valueType;
    }

    public ProjectFieldConfigVo withValueTypeName(String valueTypeName) {
        this.valueTypeName = valueTypeName;
        return this;
    }

    /**
     * 字段类型国际化名称
     * @return valueTypeName
     */
    public String getValueTypeName() {
        return valueTypeName;
    }

    public void setValueTypeName(String valueTypeName) {
        this.valueTypeName = valueTypeName;
    }

    public ProjectFieldConfigVo withIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
        return this;
    }

    /**
     * 是否系统字段
     * @return isSystem
     */
    public Integer getIsSystem() {
        return isSystem;
    }

    public void setIsSystem(Integer isSystem) {
        this.isSystem = isSystem;
    }

    public ProjectFieldConfigVo withIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
        return this;
    }

    /**
     * 是否显示
     * @return isDisplay
     */
    public Integer getIsDisplay() {
        return isDisplay;
    }

    public void setIsDisplay(Integer isDisplay) {
        this.isDisplay = isDisplay;
    }

    public ProjectFieldConfigVo withIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
        return this;
    }

    /**
     * 是否必填
     * @return isRequired
     */
    public Integer getIsRequired() {
        return isRequired;
    }

    public void setIsRequired(Integer isRequired) {
        this.isRequired = isRequired;
    }

    public ProjectFieldConfigVo withSortNumb(Integer sortNumb) {
        this.sortNumb = sortNumb;
        return this;
    }

    /**
     * 顺序数值
     * @return sortNumb
     */
    public Integer getSortNumb() {
        return sortNumb;
    }

    public void setSortNumb(Integer sortNumb) {
        this.sortNumb = sortNumb;
    }

    public ProjectFieldConfigVo withDefaultValue(String defaultValue) {
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

    public ProjectFieldConfigVo withCustomFieldUri(String customFieldUri) {
        this.customFieldUri = customFieldUri;
        return this;
    }

    /**
     * 扩展字段uri(用于连表查扩展字段)
     * @return customFieldUri
     */
    public String getCustomFieldUri() {
        return customFieldUri;
    }

    public void setCustomFieldUri(String customFieldUri) {
        this.customFieldUri = customFieldUri;
    }

    public ProjectFieldConfigVo withResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }

    /**
     * 资源类型
     * @return resourceType
     */
    public String getResourceType() {
        return resourceType;
    }

    public void setResourceType(String resourceType) {
        this.resourceType = resourceType;
    }

    public ProjectFieldConfigVo withCreator(NameAndIdVo creator) {
        this.creator = creator;
        return this;
    }

    public ProjectFieldConfigVo withCreator(Consumer<NameAndIdVo> creatorSetter) {
        if (this.creator == null) {
            this.creator = new NameAndIdVo();
            creatorSetter.accept(this.creator);
        }

        return this;
    }

    /**
     * Get creator
     * @return creator
     */
    public NameAndIdVo getCreator() {
        return creator;
    }

    public void setCreator(NameAndIdVo creator) {
        this.creator = creator;
    }

    public ProjectFieldConfigVo withCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
        return this;
    }

    /**
     * 创建时间时间戳
     * @return createTimeStamp
     */
    public Long getCreateTimeStamp() {
        return createTimeStamp;
    }

    public void setCreateTimeStamp(Long createTimeStamp) {
        this.createTimeStamp = createTimeStamp;
    }

    public ProjectFieldConfigVo withUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
        return this;
    }

    /**
     * 更新时间时间戳
     * @return updateTimeStamp
     */
    public Long getUpdateTimeStamp() {
        return updateTimeStamp;
    }

    public void setUpdateTimeStamp(Long updateTimeStamp) {
        this.updateTimeStamp = updateTimeStamp;
    }

    public ProjectFieldConfigVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目ID
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    public ProjectFieldConfigVo withOptionVos(List<ProjectFieldConfigOptionVo> optionVos) {
        this.optionVos = optionVos;
        return this;
    }

    public ProjectFieldConfigVo addOptionVosItem(ProjectFieldConfigOptionVo optionVosItem) {
        if (this.optionVos == null) {
            this.optionVos = new ArrayList<>();
        }
        this.optionVos.add(optionVosItem);
        return this;
    }

    public ProjectFieldConfigVo withOptionVos(Consumer<List<ProjectFieldConfigOptionVo>> optionVosSetter) {
        if (this.optionVos == null) {
            this.optionVos = new ArrayList<>();
        }
        optionVosSetter.accept(this.optionVos);
        return this;
    }

    /**
     * 可选项
     * @return optionVos
     */
    public List<ProjectFieldConfigOptionVo> getOptionVos() {
        return optionVos;
    }

    public void setOptionVos(List<ProjectFieldConfigOptionVo> optionVos) {
        this.optionVos = optionVos;
    }

    public ProjectFieldConfigVo withCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
        return this;
    }

    /**
     * 项目用例自定义字段id（1-25数字）
     * @return customFieldId
     */
    public Integer getCustomFieldId() {
        return customFieldId;
    }

    public void setCustomFieldId(Integer customFieldId) {
        this.customFieldId = customFieldId;
    }

    public ProjectFieldConfigVo withCustomFieldName(String customFieldName) {
        this.customFieldName = customFieldName;
        return this;
    }

    /**
     * 项目用例自定义字段名称
     * @return customFieldName
     */
    public String getCustomFieldName() {
        return customFieldName;
    }

    public void setCustomFieldName(String customFieldName) {
        this.customFieldName = customFieldName;
    }

    public ProjectFieldConfigVo withCustomFieldParam(String customFieldParam) {
        this.customFieldParam = customFieldParam;
        return this;
    }

    /**
     * 项目用例自定义字段入参或者返回参数名称
     * @return customFieldParam
     */
    public String getCustomFieldParam() {
        return customFieldParam;
    }

    public void setCustomFieldParam(String customFieldParam) {
        this.customFieldParam = customFieldParam;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectFieldConfigVo that = (ProjectFieldConfigVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.updator, that.updator)
            && Objects.equals(this.description, that.description) && Objects.equals(this.customName, that.customName)
            && Objects.equals(this.tableFieldName, that.tableFieldName)
            && Objects.equals(this.valueType, that.valueType) && Objects.equals(this.valueTypeName, that.valueTypeName)
            && Objects.equals(this.isSystem, that.isSystem) && Objects.equals(this.isDisplay, that.isDisplay)
            && Objects.equals(this.isRequired, that.isRequired) && Objects.equals(this.sortNumb, that.sortNumb)
            && Objects.equals(this.defaultValue, that.defaultValue)
            && Objects.equals(this.customFieldUri, that.customFieldUri)
            && Objects.equals(this.resourceType, that.resourceType) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.createTimeStamp, that.createTimeStamp)
            && Objects.equals(this.updateTimeStamp, that.updateTimeStamp)
            && Objects.equals(this.projectUuid, that.projectUuid) && Objects.equals(this.optionVos, that.optionVos)
            && Objects.equals(this.customFieldId, that.customFieldId)
            && Objects.equals(this.customFieldName, that.customFieldName)
            && Objects.equals(this.customFieldParam, that.customFieldParam);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            updator,
            description,
            customName,
            tableFieldName,
            valueType,
            valueTypeName,
            isSystem,
            isDisplay,
            isRequired,
            sortNumb,
            defaultValue,
            customFieldUri,
            resourceType,
            creator,
            createTimeStamp,
            updateTimeStamp,
            projectUuid,
            optionVos,
            customFieldId,
            customFieldName,
            customFieldParam);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectFieldConfigVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    updator: ").append(toIndentedString(updator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    customName: ").append(toIndentedString(customName)).append("\n");
        sb.append("    tableFieldName: ").append(toIndentedString(tableFieldName)).append("\n");
        sb.append("    valueType: ").append(toIndentedString(valueType)).append("\n");
        sb.append("    valueTypeName: ").append(toIndentedString(valueTypeName)).append("\n");
        sb.append("    isSystem: ").append(toIndentedString(isSystem)).append("\n");
        sb.append("    isDisplay: ").append(toIndentedString(isDisplay)).append("\n");
        sb.append("    isRequired: ").append(toIndentedString(isRequired)).append("\n");
        sb.append("    sortNumb: ").append(toIndentedString(sortNumb)).append("\n");
        sb.append("    defaultValue: ").append(toIndentedString(defaultValue)).append("\n");
        sb.append("    customFieldUri: ").append(toIndentedString(customFieldUri)).append("\n");
        sb.append("    resourceType: ").append(toIndentedString(resourceType)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTimeStamp: ").append(toIndentedString(createTimeStamp)).append("\n");
        sb.append("    updateTimeStamp: ").append(toIndentedString(updateTimeStamp)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
        sb.append("    optionVos: ").append(toIndentedString(optionVos)).append("\n");
        sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
        sb.append("    customFieldName: ").append(toIndentedString(customFieldName)).append("\n");
        sb.append("    customFieldParam: ").append(toIndentedString(customFieldParam)).append("\n");
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
