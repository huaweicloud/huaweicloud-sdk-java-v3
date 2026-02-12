package com.huaweicloud.sdk.codeartspipeline.v2.model;

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
    @JsonProperty(value = "pause_time")

    private Long pauseTime;

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

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_id")

    private String groupId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "group_name")

    private String groupName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "detail_url")

    private String detailUrl;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "current_system_time")

    private Long currentSystemTime;

    public ShowPipelineRunDetailResponse withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**： 流水线运行实例ID，[启动流水线](RunPipeline.xml)接口的返回值即为流水线运行实例ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 流水线ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 流水线版本。 **取值范围**： 默认3.0。 
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
     * **参数解释**： 流水线名称。 **取值范围**： 仅包含中文、大小写英文字母、数字、'-'和'_'，且长度为[1,128]个字符。 
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
     * **参数解释**： 流水线运行描述。 **取值范围**： 最长1024字符。 
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
     * **参数解释**： 是否为变更流水线。 **取值范围**： - true：是变更流水线。 - false：不是变更流水线。 
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
     * **参数解释**： 运行人ID，用户的userId。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 运行人名称。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行实例状态。 **取值范围**： - COMPLETED：已完成。 - RUNNING：运行中。 - FAILED：失败。 - CANCELED：取消。 - PAUSED：暂停。 - SUSPEND：挂起。 - IGNORED：忽略。 
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
     * **参数解释**： 流水线触发类型。 - Manual：手动触发。 - Scheduler：定时任务。 - MR：MR触发。 - Push：Push事件触发。 - CreateTag：Tag事件触发。 - Issue：Issue触发。 - Note：评论触发。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行序号。 **取值范围**： 大于等于 1。 
     * @return runNumber
     */
    public Integer getRunNumber() {
        return runNumber;
    }

    public void setRunNumber(Integer runNumber) {
        this.runNumber = runNumber;
    }

    public ShowPipelineRunDetailResponse withPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
        return this;
    }

    /**
     * **参数解释**： 流水线中断时间，单位毫秒。 **取值范围**： 大于等于 0。 
     * @return pauseTime
     */
    public Long getPauseTime() {
        return pauseTime;
    }

    public void setPauseTime(Long pauseTime) {
        this.pauseTime = pauseTime;
    }

    public ShowPipelineRunDetailResponse withStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 流水线开始时间。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线结束时间。 **取值范围**： 不涉及。 
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
     * **参数解释**： 阶段运行信息列表，包含各个阶段的详细运行信息。 **约束限制**： 不涉及。 
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
     * **参数解释**： 租户ID，用户账号的domainId。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 项目ID。 **取值范围**： 32位字符，仅由数字和字母组成。 
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
     * **参数解释**： 局点。 **取值范围**： 不涉及。 
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
     * **参数解释**： 微服务ID。可以通过[查询微服务列表](ListMicroservice.xml)接口获取，其中data.id即为微服务ID。 **取值范围**： 不涉及。 
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
     * **参数解释**： 语言，暂时仅包含中英文。 **取值范围**： zh-cn, en-us。 
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
     * **参数解释**： 流水线执行源信息。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行产物。 **取值范围**： 不涉及。 
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
     * **参数解释**： 流水线运行实例ID，[启动流水线](RunPipeline.xml)接口的返回值即为流水线运行实例ID。 **取值范围**： 不涉及。 
     * @return subjectId
     */
    public String getSubjectId() {
        return subjectId;
    }

    public void setSubjectId(String subjectId) {
        this.subjectId = subjectId;
    }

    public ShowPipelineRunDetailResponse withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    /**
     * **参数解释**： 分组ID。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    public ShowPipelineRunDetailResponse withGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }

    /**
     * **参数解释**： 分组名称。 **取值范围**： 不涉及。 
     * @return groupName
     */
    public String getGroupName() {
        return groupName;
    }

    public void setGroupName(String groupName) {
        this.groupName = groupName;
    }

    public ShowPipelineRunDetailResponse withDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
        return this;
    }

    /**
     * **参数解释**： 详情页地址。 **取值范围**： 不涉及。 
     * @return detailUrl
     */
    public String getDetailUrl() {
        return detailUrl;
    }

    public void setDetailUrl(String detailUrl) {
        this.detailUrl = detailUrl;
    }

    public ShowPipelineRunDetailResponse withCurrentSystemTime(Long currentSystemTime) {
        this.currentSystemTime = currentSystemTime;
        return this;
    }

    /**
     * **参数解释**： 当前系统时间。 **取值范围**： 不涉及。 
     * @return currentSystemTime
     */
    public Long getCurrentSystemTime() {
        return currentSystemTime;
    }

    public void setCurrentSystemTime(Long currentSystemTime) {
        this.currentSystemTime = currentSystemTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowPipelineRunDetailResponse that = (ShowPipelineRunDetailResponse) obj;
        return Objects.equals(this.id, that.id) && Objects.equals(this.pipelineId, that.pipelineId)
            && Objects.equals(this.manifestVersion, that.manifestVersion) && Objects.equals(this.name, that.name)
            && Objects.equals(this.description, that.description) && Objects.equals(this.isPublish, that.isPublish)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.status, that.status) && Objects.equals(this.triggerType, that.triggerType)
            && Objects.equals(this.runNumber, that.runNumber) && Objects.equals(this.pauseTime, that.pauseTime)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.endTime, that.endTime)
            && Objects.equals(this.stages, that.stages) && Objects.equals(this.domainId, that.domainId)
            && Objects.equals(this.projectId, that.projectId) && Objects.equals(this.region, that.region)
            && Objects.equals(this.componentId, that.componentId) && Objects.equals(this.language, that.language)
            && Objects.equals(this.sources, that.sources) && Objects.equals(this.artifacts, that.artifacts)
            && Objects.equals(this.subjectId, that.subjectId) && Objects.equals(this.groupId, that.groupId)
            && Objects.equals(this.groupName, that.groupName) && Objects.equals(this.detailUrl, that.detailUrl)
            && Objects.equals(this.currentSystemTime, that.currentSystemTime);
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
            pauseTime,
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
            subjectId,
            groupId,
            groupName,
            detailUrl,
            currentSystemTime);
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
        sb.append("    pauseTime: ").append(toIndentedString(pauseTime)).append("\n");
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
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
        sb.append("    groupName: ").append(toIndentedString(groupName)).append("\n");
        sb.append("    detailUrl: ").append(toIndentedString(detailUrl)).append("\n");
        sb.append("    currentSystemTime: ").append(toIndentedString(currentSystemTime)).append("\n");
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
