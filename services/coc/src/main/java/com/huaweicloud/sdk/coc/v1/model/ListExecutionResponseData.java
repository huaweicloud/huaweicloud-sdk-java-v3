package com.huaweicloud.sdk.coc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListExecutionResponseData
 */
public class ListExecutionResponseData {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "execution_id")

    private String executionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_name")

    private String documentName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_id")

    private String documentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_version_id")

    private String documentVersionId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "document_version")

    private String documentVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "parameters")

    private List<ListExecutionResponseParameters> parameters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sys_tags")

    private List<CreateDocumentRequestBodyTags> sysTags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<CreateDocumentRequestBodyTags> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type")

    private String type;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_parameter_name")

    private String targetParameterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "targets")

    private List<Target> targets = null;

    public ListExecutionResponseData withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ListExecutionResponseData withExecutionId(String executionId) {
        this.executionId = executionId;
        return this;
    }

    /**
     * 工单唯一id
     * @return executionId
     */
    public String getExecutionId() {
        return executionId;
    }

    public void setExecutionId(String executionId) {
        this.executionId = executionId;
    }

    public ListExecutionResponseData withDocumentName(String documentName) {
        this.documentName = documentName;
        return this;
    }

    /**
     * 作业名称
     * @return documentName
     */
    public String getDocumentName() {
        return documentName;
    }

    public void setDocumentName(String documentName) {
        this.documentName = documentName;
    }

    public ListExecutionResponseData withDocumentId(String documentId) {
        this.documentId = documentId;
        return this;
    }

    /**
     * 作业id
     * @return documentId
     */
    public String getDocumentId() {
        return documentId;
    }

    public void setDocumentId(String documentId) {
        this.documentId = documentId;
    }

    public ListExecutionResponseData withDocumentVersionId(String documentVersionId) {
        this.documentVersionId = documentVersionId;
        return this;
    }

    /**
     * 作业版本id
     * @return documentVersionId
     */
    public String getDocumentVersionId() {
        return documentVersionId;
    }

    public void setDocumentVersionId(String documentVersionId) {
        this.documentVersionId = documentVersionId;
    }

    public ListExecutionResponseData withDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
        return this;
    }

    /**
     * 作业版本号
     * @return documentVersion
     */
    public String getDocumentVersion() {
        return documentVersion;
    }

    public void setDocumentVersion(String documentVersion) {
        this.documentVersion = documentVersion;
    }

    public ListExecutionResponseData withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 工单执行开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ListExecutionResponseData withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 工单执行结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ListExecutionResponseData withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 工单更新时间
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ListExecutionResponseData withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 工单创建时间
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ListExecutionResponseData withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 工单状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ListExecutionResponseData withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 工单执行描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ListExecutionResponseData withParameters(List<ListExecutionResponseParameters> parameters) {
        this.parameters = parameters;
        return this;
    }

    public ListExecutionResponseData addParametersItem(ListExecutionResponseParameters parametersItem) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        this.parameters.add(parametersItem);
        return this;
    }

    public ListExecutionResponseData withParameters(Consumer<List<ListExecutionResponseParameters>> parametersSetter) {
        if (this.parameters == null) {
            this.parameters = new ArrayList<>();
        }
        parametersSetter.accept(this.parameters);
        return this;
    }

    /**
     * 工单执行全局参数
     * @return parameters
     */
    public List<ListExecutionResponseParameters> getParameters() {
        return parameters;
    }

    public void setParameters(List<ListExecutionResponseParameters> parameters) {
        this.parameters = parameters;
    }

    public ListExecutionResponseData withSysTags(List<CreateDocumentRequestBodyTags> sysTags) {
        this.sysTags = sysTags;
        return this;
    }

    public ListExecutionResponseData addSysTagsItem(CreateDocumentRequestBodyTags sysTagsItem) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        this.sysTags.add(sysTagsItem);
        return this;
    }

    public ListExecutionResponseData withSysTags(Consumer<List<CreateDocumentRequestBodyTags>> sysTagsSetter) {
        if (this.sysTags == null) {
            this.sysTags = new ArrayList<>();
        }
        sysTagsSetter.accept(this.sysTags);
        return this;
    }

    /**
     * 系统标签列表
     * @return sysTags
     */
    public List<CreateDocumentRequestBodyTags> getSysTags() {
        return sysTags;
    }

    public void setSysTags(List<CreateDocumentRequestBodyTags> sysTags) {
        this.sysTags = sysTags;
    }

    public ListExecutionResponseData withTags(List<CreateDocumentRequestBodyTags> tags) {
        this.tags = tags;
        return this;
    }

    public ListExecutionResponseData addTagsItem(CreateDocumentRequestBodyTags tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public ListExecutionResponseData withTags(Consumer<List<CreateDocumentRequestBodyTags>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /**
     * 自定义标签列表
     * @return tags
     */
    public List<CreateDocumentRequestBodyTags> getTags() {
        return tags;
    }

    public void setTags(List<CreateDocumentRequestBodyTags> tags) {
        this.tags = tags;
    }

    public ListExecutionResponseData withType(String type) {
        this.type = type;
        return this;
    }

    /**
     * 工单类型：BATCH、RATE_CONTROL、NORMAL
     * @return type
     */
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public ListExecutionResponseData withTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
        return this;
    }

    /**
     * 速率模式执行指定参数
     * @return targetParameterName
     */
    public String getTargetParameterName() {
        return targetParameterName;
    }

    public void setTargetParameterName(String targetParameterName) {
        this.targetParameterName = targetParameterName;
    }

    public ListExecutionResponseData withTargets(List<Target> targets) {
        this.targets = targets;
        return this;
    }

    public ListExecutionResponseData addTargetsItem(Target targetsItem) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        this.targets.add(targetsItem);
        return this;
    }

    public ListExecutionResponseData withTargets(Consumer<List<Target>> targetsSetter) {
        if (this.targets == null) {
            this.targets = new ArrayList<>();
        }
        targetsSetter.accept(this.targets);
        return this;
    }

    /**
     * 速率模式执行指定元素
     * @return targets
     */
    public List<Target> getTargets() {
        return targets;
    }

    public void setTargets(List<Target> targets) {
        this.targets = targets;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListExecutionResponseData that = (ListExecutionResponseData) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.executionId, that.executionId)
            && Objects.equals(this.documentName, that.documentName) && Objects.equals(this.documentId, that.documentId)
            && Objects.equals(this.documentVersionId, that.documentVersionId)
            && Objects.equals(this.documentVersion, that.documentVersion)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.status, that.status) && Objects.equals(this.description, that.description)
            && Objects.equals(this.parameters, that.parameters) && Objects.equals(this.sysTags, that.sysTags)
            && Objects.equals(this.tags, that.tags) && Objects.equals(this.type, that.type)
            && Objects.equals(this.targetParameterName, that.targetParameterName)
            && Objects.equals(this.targets, that.targets);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            executionId,
            documentName,
            documentId,
            documentVersionId,
            documentVersion,
            startTime,
            endTime,
            updateTime,
            creator,
            status,
            description,
            parameters,
            sysTags,
            tags,
            type,
            targetParameterName,
            targets);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListExecutionResponseData {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    executionId: ").append(toIndentedString(executionId)).append("\n");
        sb.append("    documentName: ").append(toIndentedString(documentName)).append("\n");
        sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
        sb.append("    documentVersionId: ").append(toIndentedString(documentVersionId)).append("\n");
        sb.append("    documentVersion: ").append(toIndentedString(documentVersion)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    parameters: ").append(toIndentedString(parameters)).append("\n");
        sb.append("    sysTags: ").append(toIndentedString(sysTags)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    targetParameterName: ").append(toIndentedString(targetParameterName)).append("\n");
        sb.append("    targets: ").append(toIndentedString(targets)).append("\n");
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
