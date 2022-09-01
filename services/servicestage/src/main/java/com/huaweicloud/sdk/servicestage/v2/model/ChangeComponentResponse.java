package com.huaweicloud.sdk.servicestage.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ChangeComponentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    @JacksonXmlProperty(localName = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    @JacksonXmlProperty(localName = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    @JacksonXmlProperty(localName = "status")

    private Integer status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "runtime")

    @JacksonXmlProperty(localName = "runtime")

    private RuntimeType runtime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "category")

    @JacksonXmlProperty(localName = "category")

    private ComponentCategory category;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sub_category")

    @JacksonXmlProperty(localName = "sub_category")

    private ComponentSubCategory subCategory;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    @JacksonXmlProperty(localName = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    @JacksonXmlProperty(localName = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "application_id")

    @JacksonXmlProperty(localName = "application_id")

    private String applicationId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source")

    @JacksonXmlProperty(localName = "source")

    private SourceObject source;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "build")

    @JacksonXmlProperty(localName = "build")

    private BuildInfo build;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_ids")

    @JacksonXmlProperty(localName = "pipeline_ids")

    private List<String> pipelineIds = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    @JacksonXmlProperty(localName = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    @JacksonXmlProperty(localName = "update_time")

    private Long updateTime;

    public ChangeComponentResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 应用组件ID。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ChangeComponentResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 应用组件名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ChangeComponentResponse withStatus(Integer status) {
        this.status = status;
        return this;
    }

    /**
     * 取值0或1。  0：表示正常状态。  1：表示正在删除。 
     * @return status
     */
    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public ChangeComponentResponse withRuntime(RuntimeType runtime) {
        this.runtime = runtime;
        return this;
    }

    /**
     * Get runtime
     * @return runtime
     */
    public RuntimeType getRuntime() {
        return runtime;
    }

    public void setRuntime(RuntimeType runtime) {
        this.runtime = runtime;
    }

    public ChangeComponentResponse withCategory(ComponentCategory category) {
        this.category = category;
        return this;
    }

    /**
     * Get category
     * @return category
     */
    public ComponentCategory getCategory() {
        return category;
    }

    public void setCategory(ComponentCategory category) {
        this.category = category;
    }

    public ChangeComponentResponse withSubCategory(ComponentSubCategory subCategory) {
        this.subCategory = subCategory;
        return this;
    }

    /**
     * Get subCategory
     * @return subCategory
     */
    public ComponentSubCategory getSubCategory() {
        return subCategory;
    }

    public void setSubCategory(ComponentSubCategory subCategory) {
        this.subCategory = subCategory;
    }

    public ChangeComponentResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 描述。
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ChangeComponentResponse withProjectId(String projectId) {
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

    public ChangeComponentResponse withApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }

    /**
     * 应用ID。
     * @return applicationId
     */
    public String getApplicationId() {
        return applicationId;
    }

    public void setApplicationId(String applicationId) {
        this.applicationId = applicationId;
    }

    public ChangeComponentResponse withSource(SourceObject source) {
        this.source = source;
        return this;
    }

    public ChangeComponentResponse withSource(Consumer<SourceObject> sourceSetter) {
        if (this.source == null) {
            this.source = new SourceObject();
            sourceSetter.accept(this.source);
        }

        return this;
    }

    /**
     * Get source
     * @return source
     */
    public SourceObject getSource() {
        return source;
    }

    public void setSource(SourceObject source) {
        this.source = source;
    }

    public ChangeComponentResponse withBuild(BuildInfo build) {
        this.build = build;
        return this;
    }

    public ChangeComponentResponse withBuild(Consumer<BuildInfo> buildSetter) {
        if (this.build == null) {
            this.build = new BuildInfo();
            buildSetter.accept(this.build);
        }

        return this;
    }

    /**
     * Get build
     * @return build
     */
    public BuildInfo getBuild() {
        return build;
    }

    public void setBuild(BuildInfo build) {
        this.build = build;
    }

    public ChangeComponentResponse withPipelineIds(List<String> pipelineIds) {
        this.pipelineIds = pipelineIds;
        return this;
    }

    public ChangeComponentResponse addPipelineIdsItem(String pipelineIdsItem) {
        if (this.pipelineIds == null) {
            this.pipelineIds = new ArrayList<>();
        }
        this.pipelineIds.add(pipelineIdsItem);
        return this;
    }

    public ChangeComponentResponse withPipelineIds(Consumer<List<String>> pipelineIdsSetter) {
        if (this.pipelineIds == null) {
            this.pipelineIds = new ArrayList<>();
        }
        pipelineIdsSetter.accept(this.pipelineIds);
        return this;
    }

    /**
     * 流水线Id列表，最多10个。
     * @return pipelineIds
     */
    public List<String> getPipelineIds() {
        return pipelineIds;
    }

    public void setPipelineIds(List<String> pipelineIds) {
        this.pipelineIds = pipelineIds;
    }

    public ChangeComponentResponse withCreateTime(Long createTime) {
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

    public ChangeComponentResponse withUpdateTime(Long updateTime) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ChangeComponentResponse changeComponentResponse = (ChangeComponentResponse) o;
        return Objects.equals(this.id, changeComponentResponse.id)
            && Objects.equals(this.name, changeComponentResponse.name)
            && Objects.equals(this.status, changeComponentResponse.status)
            && Objects.equals(this.runtime, changeComponentResponse.runtime)
            && Objects.equals(this.category, changeComponentResponse.category)
            && Objects.equals(this.subCategory, changeComponentResponse.subCategory)
            && Objects.equals(this.description, changeComponentResponse.description)
            && Objects.equals(this.projectId, changeComponentResponse.projectId)
            && Objects.equals(this.applicationId, changeComponentResponse.applicationId)
            && Objects.equals(this.source, changeComponentResponse.source)
            && Objects.equals(this.build, changeComponentResponse.build)
            && Objects.equals(this.pipelineIds, changeComponentResponse.pipelineIds)
            && Objects.equals(this.createTime, changeComponentResponse.createTime)
            && Objects.equals(this.updateTime, changeComponentResponse.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            name,
            status,
            runtime,
            category,
            subCategory,
            description,
            projectId,
            applicationId,
            source,
            build,
            pipelineIds,
            createTime,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeComponentResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    runtime: ").append(toIndentedString(runtime)).append("\n");
        sb.append("    category: ").append(toIndentedString(category)).append("\n");
        sb.append("    subCategory: ").append(toIndentedString(subCategory)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    applicationId: ").append(toIndentedString(applicationId)).append("\n");
        sb.append("    source: ").append(toIndentedString(source)).append("\n");
        sb.append("    build: ").append(toIndentedString(build)).append("\n");
        sb.append("    pipelineIds: ").append(toIndentedString(pipelineIds)).append("\n");
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
