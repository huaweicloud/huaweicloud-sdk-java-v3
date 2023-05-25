package com.huaweicloud.sdk.servicestage.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowApplicationInfoResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_count")

    private Integer componentCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "enterprise_project_id")

    private String enterpriseProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private Long updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "labels")

    private List<ApplicationLabels> labels = null;

    public ShowApplicationInfoResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowApplicationInfoResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用名称。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowApplicationInfoResponse withComponentCount(Integer componentCount) {
        this.componentCount = componentCount;
        return this;
    }

    /**
     * 组件个数。
     * @return componentCount
     */
    public Integer getComponentCount() {
        return componentCount;
    }

    public void setComponentCount(Integer componentCount) {
        this.componentCount = componentCount;
    }

    public ShowApplicationInfoResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * 创建人。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowApplicationInfoResponse withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID。
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ShowApplicationInfoResponse withEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
        return this;
    }

    /**
     * 企业项目ID。
     * @return enterpriseProjectId
     */
    public String getEnterpriseProjectId() {
        return enterpriseProjectId;
    }

    public void setEnterpriseProjectId(String enterpriseProjectId) {
        this.enterpriseProjectId = enterpriseProjectId;
    }

    public ShowApplicationInfoResponse withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ShowApplicationInfoResponse withUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * 修改时间。
     * @return updateTime
     */
    public Long getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(Long updateTime) {
        this.updateTime = updateTime;
    }

    public ShowApplicationInfoResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 应用描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowApplicationInfoResponse withLabels(List<ApplicationLabels> labels) {
        this.labels = labels;
        return this;
    }

    public ShowApplicationInfoResponse addLabelsItem(ApplicationLabels labelsItem) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        this.labels.add(labelsItem);
        return this;
    }

    public ShowApplicationInfoResponse withLabels(Consumer<List<ApplicationLabels>> labelsSetter) {
        if (this.labels == null) {
            this.labels = new ArrayList<>();
        }
        labelsSetter.accept(this.labels);
        return this;
    }

    /**
     * 应用标签。
     * @return labels
     */
    public List<ApplicationLabels> getLabels() {
        return labels;
    }

    public void setLabels(List<ApplicationLabels> labels) {
        this.labels = labels;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowApplicationInfoResponse showApplicationInfoResponse = (ShowApplicationInfoResponse) o;
        return Objects.equals(this.id, showApplicationInfoResponse.id)
            && Objects.equals(this.name, showApplicationInfoResponse.name)
            && Objects.equals(this.componentCount, showApplicationInfoResponse.componentCount)
            && Objects.equals(this.creator, showApplicationInfoResponse.creator)
            && Objects.equals(this.projectId, showApplicationInfoResponse.projectId)
            && Objects.equals(this.enterpriseProjectId, showApplicationInfoResponse.enterpriseProjectId)
            && Objects.equals(this.createTime, showApplicationInfoResponse.createTime)
            && Objects.equals(this.updateTime, showApplicationInfoResponse.updateTime)
            && Objects.equals(this.description, showApplicationInfoResponse.description)
            && Objects.equals(this.labels, showApplicationInfoResponse.labels);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            componentCount,
            creator,
            projectId,
            enterpriseProjectId,
            createTime,
            updateTime,
            description,
            labels);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowApplicationInfoResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    componentCount: ").append(toIndentedString(componentCount)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    enterpriseProjectId: ").append(toIndentedString(enterpriseProjectId)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    labels: ").append(toIndentedString(labels)).append("\n");
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
