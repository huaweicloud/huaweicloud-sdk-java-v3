package com.huaweicloud.sdk.eihealth.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstanceResponse extends SdkResponse {

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
    @JsonProperty(value = "template")

    private TemplateRsp template;

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

    public ShowInstanceResponse withId(String id) {
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

    public ShowInstanceResponse withName(String name) {
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

    public ShowInstanceResponse withDescription(String description) {
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

    public ShowInstanceResponse withTemplate(TemplateRsp template) {
        this.template = template;
        return this;
    }

    public ShowInstanceResponse withTemplate(Consumer<TemplateRsp> templateSetter) {
        if (this.template == null) {
            this.template = new TemplateRsp();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /**
     * Get template
     * @return template
     */
    public TemplateRsp getTemplate() {
        return template;
    }

    public void setTemplate(TemplateRsp template) {
        this.template = template;
    }

    public ShowInstanceResponse withCreator(String creator) {
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

    public ShowInstanceResponse withCreateTime(String createTime) {
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

    public ShowInstanceResponse withUpdateTime(String updateTime) {
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

    public ShowInstanceResponse withDataCount(Long dataCount) {
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

    public ShowInstanceResponse withSourceProjectName(String sourceProjectName) {
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

    public ShowInstanceResponse withSourceProjectId(String sourceProjectId) {
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

    public ShowInstanceResponse withSourceId(String sourceId) {
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

    public ShowInstanceResponse withIsPrefab(Boolean isPrefab) {
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
        ShowInstanceResponse showInstanceResponse = (ShowInstanceResponse) o;
        return Objects.equals(this.id, showInstanceResponse.id) && Objects.equals(this.name, showInstanceResponse.name)
            && Objects.equals(this.description, showInstanceResponse.description)
            && Objects.equals(this.template, showInstanceResponse.template)
            && Objects.equals(this.creator, showInstanceResponse.creator)
            && Objects.equals(this.createTime, showInstanceResponse.createTime)
            && Objects.equals(this.updateTime, showInstanceResponse.updateTime)
            && Objects.equals(this.dataCount, showInstanceResponse.dataCount)
            && Objects.equals(this.sourceProjectName, showInstanceResponse.sourceProjectName)
            && Objects.equals(this.sourceProjectId, showInstanceResponse.sourceProjectId)
            && Objects.equals(this.sourceId, showInstanceResponse.sourceId)
            && Objects.equals(this.isPrefab, showInstanceResponse.isPrefab);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            description,
            template,
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
        sb.append("class ShowInstanceResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
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
