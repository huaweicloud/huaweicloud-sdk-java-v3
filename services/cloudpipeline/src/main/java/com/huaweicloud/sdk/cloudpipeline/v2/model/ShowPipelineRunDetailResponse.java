package com.huaweicloud.sdk.cloudpipeline.v2.model;

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
public class ShowPipelineRunDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "manifest_version")

    private String manifestVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_publish")

    private Boolean isPublish;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "trigger_type")

    private String triggerType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "run_number")

    private Integer runNumber;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private Long startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "end_time")

    private Long endTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "stages")

    private List<StageRun> stages = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "domain_id")

    private String domainId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "region")

    private String region;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "component_id")

    private String componentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "language")

    private String language;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "sources")

    private List<RunPipelineSource> sources = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "artifacts")

    private List<PackageInfo> artifacts = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "subject_id")

    private String subjectId;

    public ShowPipelineRunDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 流水线运行实例ID
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ShowPipelineRunDetailResponse withPipelineId(String pipelineId) {
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

    public ShowPipelineRunDetailResponse withManifestVersion(String manifestVersion) {
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

    public ShowPipelineRunDetailResponse withName(String name) {
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

    public ShowPipelineRunDetailResponse withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * 运行描述
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ShowPipelineRunDetailResponse withIsPublish(Boolean isPublish) {
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

    public ShowPipelineRunDetailResponse withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * 运行人ID
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public ShowPipelineRunDetailResponse withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * 运行人名称
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public ShowPipelineRunDetailResponse withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * 状态
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public ShowPipelineRunDetailResponse withTriggerType(String triggerType) {
        this.triggerType = triggerType;
        return this;
    }

    /**
     * 触发类型
     * @return triggerType
     */
    public String getTriggerType() {
        return triggerType;
    }

    public void setTriggerType(String triggerType) {
        this.triggerType = triggerType;
    }

    public ShowPipelineRunDetailResponse withRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
        return this;
    }

    /**
     * 运行序号
     * @return runNumber
     */
    public Integer getRunNumber() {
        return runNumber;
    }

    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }

    public ShowPipelineRunDetailResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * 开始时间
     * @return startTime
     */
    public Long getStartTime() {
        return startTime;
    }

    public void setStartTime(Long startTime) {
        this.startTime = startTime;
    }

    public ShowPipelineRunDetailResponse withEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }

    /**
     * 结束时间
     * @return endTime
     */
    public Long getEndTime() {
        return endTime;
    }

    public void setEndTime(Long endTime) {
        this.endTime = endTime;
    }

    public ShowPipelineRunDetailResponse withStages(List<StageRun> stages) {
        this.stages = stages;
        return this;
    }

    public ShowPipelineRunDetailResponse addStagesItem(StageRun stagesItem) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        this.stages.add(stagesItem);
        return this;
    }

    public ShowPipelineRunDetailResponse withStages(Consumer<List<StageRun>> stagesSetter) {
        if (this.stages == null) {
            this.stages = new ArrayList<>();
        }
        stagesSetter.accept(this.stages);
        return this;
    }

    /**
     * 阶段信息
     * @return stages
     */
    public List<StageRun> getStages() {
        return stages;
    }

    public void setStages(List<StageRun> stages) {
        this.stages = stages;
    }

    public ShowPipelineRunDetailResponse withDomainId(String domainId) {
        this.domainId = domainId;
        return this;
    }

    /**
     * 租户ID
     * @return domainId
     */
    public String getDomainId() {
        return domainId;
    }

    public void setDomainId(String domainId) {
        this.domainId = domainId;
    }

    public ShowPipelineRunDetailResponse withProjectId(String projectId) {
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

    public ShowPipelineRunDetailResponse withRegion(String region) {
        this.region = region;
        return this;
    }

    /**
     * 局点
     * @return region
     */
    public String getRegion() {
        return region;
    }

    public void setRegion(String region) {
        this.region = region;
    }

    public ShowPipelineRunDetailResponse withComponentId(String componentId) {
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

    public ShowPipelineRunDetailResponse withLanguage(String language) {
        this.language = language;
        return this;
    }

    /**
     * 语言
     * @return language
     */
    public String getLanguage() {
        return language;
    }

    public void setLanguage(String language) {
        this.language = language;
    }

    public ShowPipelineRunDetailResponse withSources(List<RunPipelineSource> sources) {
        this.sources = sources;
        return this;
    }

    public ShowPipelineRunDetailResponse addSourcesItem(RunPipelineSource sourcesItem) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        this.sources.add(sourcesItem);
        return this;
    }

    public ShowPipelineRunDetailResponse withSources(Consumer<List<RunPipelineSource>> sourcesSetter) {
        if (this.sources == null) {
            this.sources = new ArrayList<>();
        }
        sourcesSetter.accept(this.sources);
        return this;
    }

    /**
     * 运行源信息
     * @return sources
     */
    public List<RunPipelineSource> getSources() {
        return sources;
    }

    public void setSources(List<RunPipelineSource> sources) {
        this.sources = sources;
    }

    public ShowPipelineRunDetailResponse withArtifacts(List<PackageInfo> artifacts) {
        this.artifacts = artifacts;
        return this;
    }

    public ShowPipelineRunDetailResponse addArtifactsItem(PackageInfo artifactsItem) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        this.artifacts.add(artifactsItem);
        return this;
    }

    public ShowPipelineRunDetailResponse withArtifacts(Consumer<List<PackageInfo>> artifactsSetter) {
        if (this.artifacts == null) {
            this.artifacts = new ArrayList<>();
        }
        artifactsSetter.accept(this.artifacts);
        return this;
    }

    /**
     * 流水线运行产物
     * @return artifacts
     */
    public List<PackageInfo> getArtifacts() {
        return artifacts;
    }

    public void setArtifacts(List<PackageInfo> artifacts) {
        this.artifacts = artifacts;
    }

    public ShowPipelineRunDetailResponse withSubjectId(String subjectId) {
        this.subjectId = subjectId;
        return this;
    }

    /**
     * 流水线运行实例ID
     * @return subjectId
     */
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowPipelineRunDetailResponse showPipelineRunDetailResponse = (ShowPipelineRunDetailResponse) o;
        return Objects.equals(this.id, showPipelineRunDetailResponse.id)
            && Objects.equals(this.pipelineId, showPipelineRunDetailResponse.pipelineId)
            && Objects.equals(this.manifestVersion, showPipelineRunDetailResponse.manifestVersion)
            && Objects.equals(this.name, showPipelineRunDetailResponse.name)
            && Objects.equals(this.description, showPipelineRunDetailResponse.description)
            && Objects.equals(this.isPublish, showPipelineRunDetailResponse.isPublish)
            && Objects.equals(this.executorId, showPipelineRunDetailResponse.executorId)
            && Objects.equals(this.executorName, showPipelineRunDetailResponse.executorName)
            && Objects.equals(this.status, showPipelineRunDetailResponse.status)
            && Objects.equals(this.triggerType, showPipelineRunDetailResponse.triggerType)
            && Objects.equals(this.runNumber, showPipelineRunDetailResponse.runNumber)
            && Objects.equals(this.startTime, showPipelineRunDetailResponse.startTime)
            && Objects.equals(this.endTime, showPipelineRunDetailResponse.endTime)
            && Objects.equals(this.stages, showPipelineRunDetailResponse.stages)
            && Objects.equals(this.domainId, showPipelineRunDetailResponse.domainId)
            && Objects.equals(this.projectId, showPipelineRunDetailResponse.projectId)
            && Objects.equals(this.region, showPipelineRunDetailResponse.region)
            && Objects.equals(this.componentId, showPipelineRunDetailResponse.componentId)
            && Objects.equals(this.language, showPipelineRunDetailResponse.language)
            && Objects.equals(this.sources, showPipelineRunDetailResponse.sources)
            && Objects.equals(this.artifacts, showPipelineRunDetailResponse.artifacts)
            && Objects.equals(this.subjectId, showPipelineRunDetailResponse.subjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id,
            pipelineId,
            manifestVersion,
            name,
            description,
            isPublish,
            executorId,
            executorName,
            status,
            triggerType,
            runNumber,
            startTime,
            endTime,
            stages,
            domainId,
            projectId,
            region,
            componentId,
            language,
            sources,
            artifacts,
            subjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowPipelineRunDetailResponse {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    manifestVersion: ").append(toIndentedString(manifestVersion)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    isPublish: ").append(toIndentedString(isPublish)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    triggerType: ").append(toIndentedString(triggerType)).append("\n");
        sb.append("    runNumber: ").append(toIndentedString(runNumber)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    endTime: ").append(toIndentedString(endTime)).append("\n");
        sb.append("    stages: ").append(toIndentedString(stages)).append("\n");
        sb.append("    domainId: ").append(toIndentedString(domainId)).append("\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    region: ").append(toIndentedString(region)).append("\n");
        sb.append("    componentId: ").append(toIndentedString(componentId)).append("\n");
        sb.append("    language: ").append(toIndentedString(language)).append("\n");
        sb.append("    sources: ").append(toIndentedString(sources)).append("\n");
        sb.append("    artifacts: ").append(toIndentedString(artifacts)).append("\n");
        sb.append("    subjectId: ").append(toIndentedString(subjectId)).append("\n");
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
