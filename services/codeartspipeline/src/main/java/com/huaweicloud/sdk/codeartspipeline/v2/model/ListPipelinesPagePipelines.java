package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListPipelinesPagePipelines
 */
public class ListPipelinesPagePipelines {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_collect")

    private Boolean isCollect;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private Long createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "latest_run")

    private ListPipelinesPageLatestRun latestRun;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "convert_sign")

    private Integer convertSign;

    public ListPipelinesPagePipelines withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * 流水线ID
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public ListPipelinesPagePipelines withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * 流水线名称
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ListPipelinesPagePipelines withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * 项目ID
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public ListPipelinesPagePipelines withComponentId(String componentId) {
        this.componentId = componentId;
        return this;
    }

    /**
     * 组件ID
     * @return componentId
     */
    public String getComponentId() {
        return componentId;
    }

    public void setComponentId(String componentId) {
        this.componentId = componentId;
    }

    public ListPipelinesPagePipelines withIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
        return this;
    }

    /**
     * 是否为变更流水线
     * @return isPublish
     */
    public Boolean getIsPublish() {
        return isPublish;
    }

    public void setIsPublish(Boolean isPublish) {
        this.isPublish = isPublish;
    }

    public ListPipelinesPagePipelines withIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
        return this;
    }

    /**
     * 是否收藏此流水线
     * @return isCollect
     */
    public Boolean getIsCollect() {
        return isCollect;
    }

    public void setIsCollect(Boolean isCollect) {
        this.isCollect = isCollect;
    }

    public ListPipelinesPagePipelines withManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
        return this;
    }

    /**
     * 流水线版本
     * @return manifestVersion
     */
    public String getManifestVersion() {
        return manifestVersion;
    }

    public void setManifestVersion(String manifestVersion) {
        this.manifestVersion = manifestVersion;
    }

    public ListPipelinesPagePipelines withCreateTime(Long createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * 创建时间
     * @return createTime
     */
    public Long getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Long createTime) {
        this.createTime = createTime;
    }

    public ListPipelinesPagePipelines withLatestRun(ListPipelinesPageLatestRun latestRun) {
        this.latestRun = latestRun;
        return this;
    }

    public ListPipelinesPagePipelines withLatestRun(Consumer<ListPipelinesPageLatestRun> latestRunSetter) {
        if (this.latestRun == null) {
            this.latestRun = new ListPipelinesPageLatestRun();
            latestRunSetter.accept(this.latestRun);
        }

        return this;
    }

    /**
     * Get latestRun
     * @return latestRun
     */
    public ListPipelinesPageLatestRun getLatestRun() {
        return latestRun;
    }

    public void setLatestRun(ListPipelinesPageLatestRun latestRun) {
        this.latestRun = latestRun;
    }

    public ListPipelinesPagePipelines withConvertSign(Integer convertSign) {
        this.convertSign = convertSign;
        return this;
    }

    /**
     * 旧版转新版标识
     * @return convertSign
     */
    public Integer getConvertSign() {
        return convertSign;
    }

    public void setConvertSign(Integer convertSign) {
        this.convertSign = convertSign;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListPipelinesPagePipelines that = (ListPipelinesPagePipelines) obj;
        return Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.name, that.name)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.componentId, that.componentId)
            && Objects.equals(this.isPublish, that.isPublish) && Objects.equals(this.isCollect, that.isCollect)
            && Objects.equals(this.manifestVersion, that.manifestVersion)
            && Objects.equals(this.createTime, that.createTime) && Objects.equals(this.latestRun, that.latestRun)
            && Objects.equals(this.convertSign, that.convertSign);
    }

    @Override
    public int hashCode() {
        return Objects.hash(pipelineId,
            name,
            projectId,
            componentId,
            isPublish,
            isCollect,
            manifestVersion,
            createTime,
            latestRun,
            convertSign);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListPipelinesPagePipelines {\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    isCollect: ").append(toIndentedString(isCollect)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    latestRun: ").append(toIndentedString(latestRun)).append("\n");
        sb.append("    convertSign: ").append(toIndentedString(convertSign)).append("\n");
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
