package com.huaweicloud.sdk.ief.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/** Response Object */
public class CreateDeploymentsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "replicas")

    private Integer replicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "ready_replicas")

    private Integer readyReplicas;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_ids")

    private List<String> nodeIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "tags")

    private List<Attributes> tags = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "api_version")

    private String apiVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    private String source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_at")

    private String createdAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_at")

    private String updatedAt;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "template")

    private PodRequest template;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "state")

    private String state;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_id")

    private String sourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "annotations")

    private Annotations annotations;

    public CreateDeploymentsResponse withId(String id) {
        this.id = id;
        return this;
    }

    /** 应用部署uuid
     * 
     * @return id */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public CreateDeploymentsResponse withName(String name) {
        this.name = name;
        return this;
    }

    /** 应用部署名称，只允许英文小写字母、数字、中划线，最大长度32, 英文小写字母或数字开头和结尾
     * 
     * @return name */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public CreateDeploymentsResponse withReplicas(Integer replicas) {
        this.replicas = replicas;
        return this;
    }

    /** 应用部署总副本数
     * 
     * @return replicas */
    public Integer getReplicas() {
        return replicas;
    }

    public void setReplicas(Integer replicas) {
        this.replicas = replicas;
    }

    public CreateDeploymentsResponse withReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
        return this;
    }

    /** 应用部署正常副本数
     * 
     * @return readyReplicas */
    public Integer getReadyReplicas() {
        return readyReplicas;
    }

    public void setReadyReplicas(Integer readyReplicas) {
        this.readyReplicas = readyReplicas;
    }

    public CreateDeploymentsResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /** 应用部署描述，最大长度255，不允许^ ~ # $ % & * < > ( ) [ ] { } ' \" \\
     * 
     * @return description */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public CreateDeploymentsResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /** 应用部署到指定节点组，与node_ids二选一
     * 
     * @return groupId */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public CreateDeploymentsResponse withNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
        return this;
    }

    public CreateDeploymentsResponse addNodeIdsItem(String nodeIdsItem) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        this.nodeIds.add(nodeIdsItem);
        return this;
    }

    public CreateDeploymentsResponse withNodeIds(Consumer<List<String>> nodeIdsSetter) {
        if (this.nodeIds == null) {
            this.nodeIds = new ArrayList<>();
        }
        nodeIdsSetter.accept(this.nodeIds);
        return this;
    }

    /** 应用部署到指定节点，当前只支持一个边缘节点
     * 
     * @return nodeIds */
    public List<String> getNodeIds() {
        return nodeIds;
    }

    public void setNodeIds(List<String> nodeIds) {
        this.nodeIds = nodeIds;
    }

    public CreateDeploymentsResponse withTags(List<Attributes> tags) {
        this.tags = tags;
        return this;
    }

    public CreateDeploymentsResponse addTagsItem(Attributes tagsItem) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        this.tags.add(tagsItem);
        return this;
    }

    public CreateDeploymentsResponse withTags(Consumer<List<Attributes>> tagsSetter) {
        if (this.tags == null) {
            this.tags = new ArrayList<>();
        }
        tagsSetter.accept(this.tags);
        return this;
    }

    /** 节点属性
     * 
     * @return tags */
    public List<Attributes> getTags() {
        return tags;
    }

    public void setTags(List<Attributes> tags) {
        this.tags = tags;
    }

    public CreateDeploymentsResponse withApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
        return this;
    }

    /** 应用部署版本
     * 
     * @return apiVersion */
    public String getApiVersion() {
        return apiVersion;
    }

    public void setApiVersion(String apiVersion) {
        this.apiVersion = apiVersion;
    }

    public CreateDeploymentsResponse withSource(String source) {
        this.source = source;
        return this;
    }

    /** 应用部署来源: 边缘市场(iem) or 自定义(userdefined)
     * 
     * @return source */
    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }

    public CreateDeploymentsResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /** 项目ID
     * 
     * @return projectId */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public CreateDeploymentsResponse withCreatedAt(String createdAt) {
        this.createdAt = createdAt;
        return this;
    }

    /** 应用部署创建时间
     * 
     * @return createdAt */
    public String getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(String createdAt) {
        this.createdAt = createdAt;
    }

    public CreateDeploymentsResponse withUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
        return this;
    }

    /** 应用部署更新时间
     * 
     * @return updatedAt */
    public String getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(String updatedAt) {
        this.updatedAt = updatedAt;
    }

    public CreateDeploymentsResponse withTemplate(PodRequest template) {
        this.template = template;
        return this;
    }

    public CreateDeploymentsResponse withTemplate(Consumer<PodRequest> templateSetter) {
        if (this.template == null) {
            this.template = new PodRequest();
            templateSetter.accept(this.template);
        }

        return this;
    }

    /** Get template
     * 
     * @return template */
    public PodRequest getTemplate() {
        return template;
    }

    public void setTemplate(PodRequest template) {
        this.template = template;
    }

    public CreateDeploymentsResponse withState(String state) {
        this.state = state;
        return this;
    }

    /** 应用状态，仅包括冻结（FREEZE）、删除中（PENDING_DELETE）、删除失败（DELETE_FAILED），保留字段
     * 
     * @return state */
    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public CreateDeploymentsResponse withSourceId(String sourceId) {
        this.sourceId = sourceId;
        return this;
    }

    /** 预留字段
     * 
     * @return sourceId */
    public String getSourceId() {
        return sourceId;
    }

    public void setSourceId(String sourceId) {
        this.sourceId = sourceId;
    }

    public CreateDeploymentsResponse withAnnotations(Annotations annotations) {
        this.annotations = annotations;
        return this;
    }

    public CreateDeploymentsResponse withAnnotations(Consumer<Annotations> annotationsSetter) {
        if (this.annotations == null) {
            this.annotations = new Annotations();
            annotationsSetter.accept(this.annotations);
        }

        return this;
    }

    /** Get annotations
     * 
     * @return annotations */
    public Annotations getAnnotations() {
        return annotations;
    }

    public void setAnnotations(Annotations annotations) {
        this.annotations = annotations;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateDeploymentsResponse createDeploymentsResponse = (CreateDeploymentsResponse) o;
        return Objects.equals(this.id, createDeploymentsResponse.id)
            && Objects.equals(this.name, createDeploymentsResponse.name)
            && Objects.equals(this.replicas, createDeploymentsResponse.replicas)
            && Objects.equals(this.readyReplicas, createDeploymentsResponse.readyReplicas)
            && Objects.equals(this.description, createDeploymentsResponse.description)
            && Objects.equals(this.groupId, createDeploymentsResponse.groupId)
            && Objects.equals(this.nodeIds, createDeploymentsResponse.nodeIds)
            && Objects.equals(this.tags, createDeploymentsResponse.tags)
            && Objects.equals(this.apiVersion, createDeploymentsResponse.apiVersion)
            && Objects.equals(this.source, createDeploymentsResponse.source)
            && Objects.equals(this.projectId, createDeploymentsResponse.projectId)
            && Objects.equals(this.createdAt, createDeploymentsResponse.createdAt)
            && Objects.equals(this.updatedAt, createDeploymentsResponse.updatedAt)
            && Objects.equals(this.template, createDeploymentsResponse.template)
            && Objects.equals(this.state, createDeploymentsResponse.state)
            && Objects.equals(this.sourceId, createDeploymentsResponse.sourceId)
            && Objects.equals(this.annotations, createDeploymentsResponse.annotations);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            replicas,
            readyReplicas,
            description,
            groupId,
            nodeIds,
            tags,
            apiVersion,
            source,
            projectId,
            createdAt,
            updatedAt,
            template,
            state,
            sourceId,
            annotations);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateDeploymentsResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    replicas: ").append(toIndentedString(replicas)).append("\n");
        sb.append("    readyReplicas: ").append(toIndentedString(readyReplicas)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    nodeIds: ").append(toIndentedString(nodeIds)).append("\n");
        sb.append("    tags: ").append(toIndentedString(tags)).append("\n");
        sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    createdAt: ").append(toIndentedString(createdAt)).append("\n");
        sb.append("    updatedAt: ").append(toIndentedString(updatedAt)).append("\n");
        sb.append("    template: ").append(toIndentedString(template)).append("\n");
        sb.append("    state: ").append(toIndentedString(state)).append("\n");
        sb.append("    sourceId: ").append(toIndentedString(sourceId)).append("\n");
        sb.append("    annotations: ").append(toIndentedString(annotations)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
