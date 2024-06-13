package com.huaweicloud.sdk.cloudtest.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * ProjectTestCaseFieldVo
 */
public class ProjectTestCaseFieldVo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "uri")

    private String uri;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "options")

    private String options;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updater")

    private String updater;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_id")

    private Integer customFieldId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_name")

    private String customFieldName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "custom_field_param")

    private String customFieldParam;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_name")

    private String typeName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time_timestamp")

    private Long createTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time_timestamp")

    private Long updateTimeTimestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_uuid")

    private String projectUuid;

    public ProjectTestCaseFieldVo withUri(String uri) {
        this.uri = uri;
        return this;
    }

    /**
     * 项目用例自定义字段主键
     * @return uri
     */
    public String getUri() {
        return uri;
    }

    public void setUri(String uri) {
        this.uri = uri;
    }

    public ProjectTestCaseFieldVo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 项目用例自定义字段名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProjectTestCaseFieldVo withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 项目用例自定义字段类型（单行文本text、多行文本textArea、单选框radio、多选框checkBox、日期date、数字number、单选用户user）
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ProjectTestCaseFieldVo withOptions(String options) {
        this.options = options;
        return this;
    }

    /**
     * 项目用例自定义字段选项（数字类型时，数组两个值，第一个是最小值，第二个是最大值）
     * @return options
     */
    public String getOptions() {
        return options;
    }

    public void setOptions(String options) {
        this.options = options;
    }

    public ProjectTestCaseFieldVo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 项目用例自定义字段描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProjectTestCaseFieldVo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 项目用例自定义字段创建人
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ProjectTestCaseFieldVo withUpdater(String updater) {
        this.updater = updater;
        return this;
    }

    /**
     * 项目用例自定义字段更新人
     * @return updater
     */
    public String getUpdater() {
        return updater;
    }

    public void setUpdater(String updater) {
        this.updater = updater;
    }

    public ProjectTestCaseFieldVo withCustomFieldId(Integer customFieldId) {
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

    public ProjectTestCaseFieldVo withCustomFieldName(String customFieldName) {
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

    public ProjectTestCaseFieldVo withCustomFieldParam(String customFieldParam) {
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

    public ProjectTestCaseFieldVo withTypeName(String typeName) {
        this.typeName = typeName;
        return this;
    }

    /**
     * 项目用例自定义字段类型国际化名称
     * @return typeName
     */
    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public ProjectTestCaseFieldVo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 项目用例自定义字段创建时间
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ProjectTestCaseFieldVo withCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
        return this;
    }

    /**
     * 项目用例自定义字段创建时间时间戳
     * @return createTimeTimestamp
     */
    public Long getCreateTimeTimestamp() {
        return createTimeTimestamp;
    }

    public void setCreateTimeTimestamp(Long createTimeTimestamp) {
        this.createTimeTimestamp = createTimeTimestamp;
    }

    public ProjectTestCaseFieldVo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 项目用例自定义字段更新时间
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    public ProjectTestCaseFieldVo withUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
        return this;
    }

    /**
     * 项目用例自定义字段更新时间时间戳
     * @return updateTimeTimestamp
     */
    public Long getUpdateTimeTimestamp() {
        return updateTimeTimestamp;
    }

    public void setUpdateTimeTimestamp(Long updateTimeTimestamp) {
        this.updateTimeTimestamp = updateTimeTimestamp;
    }

    public ProjectTestCaseFieldVo withProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
        return this;
    }

    /**
     * 项目id
     * @return projectUuid
     */
    public String getProjectUuid() {
        return projectUuid;
    }

    public void setProjectUuid(String projectUuid) {
        this.projectUuid = projectUuid;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProjectTestCaseFieldVo that = (ProjectTestCaseFieldVo) obj;
        return Objects.equals(this.uri, that.uri) && Objects.equals(this.name, that.name)
            && Objects.equals(this.type, that.type) && Objects.equals(this.options, that.options)
            && Objects.equals(this.description, that.description) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.updater, that.updater) && Objects.equals(this.customFieldId, that.customFieldId)
            && Objects.equals(this.customFieldName, that.customFieldName)
            && Objects.equals(this.customFieldParam, that.customFieldParam)
            && Objects.equals(this.typeName, that.typeName) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.createTimeTimestamp, that.createTimeTimestamp)
            && Objects.equals(this.updateTime, that.updateTime)
            && Objects.equals(this.updateTimeTimestamp, that.updateTimeTimestamp)
            && Objects.equals(this.projectUuid, that.projectUuid);
    }

    @Override
    public int hashCode() {
        return Objects.hash(uri,
            name,
            type,
            options,
            description,
            creator,
            updater,
            customFieldId,
            customFieldName,
            customFieldParam,
            typeName,
            createTime,
            createTimeTimestamp,
            updateTime,
            updateTimeTimestamp,
            projectUuid);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProjectTestCaseFieldVo {\n");
        sb.append("    uri: ").append(toIndentedString(uri)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    options: ").append(toIndentedString(options)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    updater: ").append(toIndentedString(updater)).append("\n");
        sb.append("    customFieldId: ").append(toIndentedString(customFieldId)).append("\n");
        sb.append("    customFieldName: ").append(toIndentedString(customFieldName)).append("\n");
        sb.append("    customFieldParam: ").append(toIndentedString(customFieldParam)).append("\n");
        sb.append("    typeName: ").append(toIndentedString(typeName)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    createTimeTimestamp: ").append(toIndentedString(createTimeTimestamp)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    updateTimeTimestamp: ").append(toIndentedString(updateTimeTimestamp)).append("\n");
        sb.append("    projectUuid: ").append(toIndentedString(projectUuid)).append("\n");
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
