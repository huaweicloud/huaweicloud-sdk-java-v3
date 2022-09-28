package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 实例详情
 */
public class DatabaseDto {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_id")

    private String templateId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template_name")

    private String templateName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private String updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_count")

    private Long dataCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_name")

    private String sourceProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_project_id")

    private String sourceProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_prefab")

    private Boolean isPrefab;

    public DatabaseDto withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 实例id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public DatabaseDto withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 实例名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DatabaseDto withDescription(String description) {
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

    public DatabaseDto withTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }

    /**
     * 模板id
     * @return templateId
     */
    public String getTemplateId() {
        return templateId;
    }

    public void setTemplateId(String templateId) {
        this.templateId = templateId;
    }

    public DatabaseDto withTemplateName(String templateName) {
        this.templateName = templateName;
        return this;
    }

    /**
     * 模板名称
     * @return templateName
     */
    public String getTemplateName() {
        return templateName;
    }

    public void setTemplateName(String templateName) {
        this.templateName = templateName;
    }

    public DatabaseDto withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建者
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public DatabaseDto withCreateTime(String createTime) {
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

    public DatabaseDto withUpdateTime(String updateTime) {
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

    public DatabaseDto withDataCount(Long dataCount) {
        this.dataCount = dataCount;
        return this;
    }

    /**
     * 数据条目
     * @return dataCount
     */
    public Long getDataCount() {
        return dataCount;
    }

    public void setDataCount(Long dataCount) {
        this.dataCount = dataCount;
    }

    public DatabaseDto withSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
        return this;
    }

    /**
     * 源项目名
     * @return sourceProjectName
     */
    public String getSourceProjectName() {
        return sourceProjectName;
    }

    public void setSourceProjectName(String sourceProjectName) {
        this.sourceProjectName = sourceProjectName;
    }

    public DatabaseDto withSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
        return this;
    }

    /**
     * 源项目id
     * @return sourceProjectId
     */
    public String getSourceProjectId() {
        return sourceProjectId;
    }

    public void setSourceProjectId(String sourceProjectId) {
        this.sourceProjectId = sourceProjectId;
    }

    public DatabaseDto withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /**
     * 源实例id
     * @return sourceId
     */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public DatabaseDto withIsPrefab(Boolean isPrefab) {
        this.isPrefab = isPrefab;
        return this;
    }

    /**
     * 是否为预置实例
     * @return isPrefab
     */
    public Boolean getIsPrefab() {
        return isPrefab;
    }

    public void setIsPrefab(Boolean isPrefab) {
        this.isPrefab = isPrefab;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DatabaseDto databaseDto = (DatabaseDto) o;
        return Objects.equals(this.id, databaseDto.id) && Objects.equals(this.name, databaseDto.name)
            && Objects.equals(this.description, databaseDto.description)
            && Objects.equals(this.templateId, databaseDto.templateId)
            && Objects.equals(this.templateName, databaseDto.templateName)
            && Objects.equals(this.creator, databaseDto.creator)
            && Objects.equals(this.createTime, databaseDto.createTime)
            && Objects.equals(this.updateTime, databaseDto.updateTime)
            && Objects.equals(this.dataCount, databaseDto.dataCount)
            && Objects.equals(this.sourceProjectName, databaseDto.sourceProjectName)
            && Objects.equals(this.sourceProjectId, databaseDto.sourceProjectId)
            && Objects.equals(this.sourceId, databaseDto.sourceId)
            && Objects.equals(this.isPrefab, databaseDto.isPrefab);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            templateId,
            templateName,
            creator,
            createTime,
            updateTime,
            dataCount,
            sourceProjectName,
            sourceProjectId,
            sourceId,
            isPrefab);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DatabaseDto {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
        sb.append("    templateName: ").append(toIndentedString(templateName)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    dataCount: ").append(toIndentedString(dataCount)).append("\n");
        sb.append("    sourceProjectName: ").append(toIndentedString(sourceProjectName)).append("\n");
        sb.append("    sourceProjectId: ").append(toIndentedString(sourceProjectId)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    isPrefab: ").append(toIndentedString(isPrefab)).append("\n");
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
