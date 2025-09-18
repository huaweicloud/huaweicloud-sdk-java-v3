package com.huaweicloud.sdk.codeartspipeline.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * PipelineBasicInfo
 */
public class PipelineBasicInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_id")

    private String projectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_name")

    private String projectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_id")

    private String pipelineId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "pipeline_name")

    private String pipelineName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_id")

    private String creatorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator_name")

    private String creatorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_id")

    private String executorId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "executor_name")

    private String executorName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "start_time")

    private String startTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private String createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "watched")

    private String watched;

    public PipelineBasicInfo withProjectId(String projectId) {
        this.projectId = projectId;
        return this;
    }

    /**
     * **参数解释**： 项目id。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return projectId
     */
    public String getProjectId() {
        return projectId;
    }

    public void setProjectId(String projectId) {
        this.projectId = projectId;
    }

    public PipelineBasicInfo withProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }

    /**
     * **参数解释**： 项目名称。 **取值范围**： 不涉及。 
     * @return projectName
     */
    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public PipelineBasicInfo withPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }

    /**
     * **参数解释**： 流水线id。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return pipelineId
     */
    public String getPipelineId() {
        return pipelineId;
    }

    public void setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
    }

    public PipelineBasicInfo withPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
        return this;
    }

    /**
     * **参数解释**： 流水线名称。 **取值范围**： 不涉及。 
     * @return pipelineName
     */
    public String getPipelineName() {
        return pipelineName;
    }

    public void setPipelineName(String pipelineName) {
        this.pipelineName = pipelineName;
    }

    public PipelineBasicInfo withCreatorId(String creatorId) {
        this.creatorId = creatorId;
        return this;
    }

    /**
     * **参数解释**： 流水线创建人id。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return creatorId
     */
    public String getCreatorId() {
        return creatorId;
    }

    public void setCreatorId(String creatorId) {
        this.creatorId = creatorId;
    }

    public PipelineBasicInfo withCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }

    /**
     * **参数解释**： 流水线创建人名字。 **取值范围**： 不涉及。 
     * @return creatorName
     */
    public String getCreatorName() {
        return creatorName;
    }

    public void setCreatorName(String creatorName) {
        this.creatorName = creatorName;
    }

    public PipelineBasicInfo withExecutorId(String executorId) {
        this.executorId = executorId;
        return this;
    }

    /**
     * **参数解释**： 流水线执行人id。 **取值范围**： 32位字符，由数字和字母组成。 
     * @return executorId
     */
    public String getExecutorId() {
        return executorId;
    }

    public void setExecutorId(String executorId) {
        this.executorId = executorId;
    }

    public PipelineBasicInfo withExecutorName(String executorName) {
        this.executorName = executorName;
        return this;
    }

    /**
     * **参数解释**： 流水线执行人名字。 **取值范围**： 不涉及。 
     * @return executorName
     */
    public String getExecutorName() {
        return executorName;
    }

    public void setExecutorName(String executorName) {
        this.executorName = executorName;
    }

    public PipelineBasicInfo withStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }

    /**
     * **参数解释**： 启动时间。 **取值范围**： 不涉及。 
     * @return startTime
     */
    public String getStartTime() {
        return startTime;
    }

    public void setStartTime(String startTime) {
        this.startTime = startTime;
    }

    public PipelineBasicInfo withCreateTime(String createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**： 创建时间。 **取值范围**： 不涉及。 
     * @return createTime
     */
    public String getCreateTime() {
        return createTime;
    }

    public void setCreateTime(String createTime) {
        this.createTime = createTime;
    }

    public PipelineBasicInfo withWatched(String watched) {
        this.watched = watched;
        return this;
    }

    /**
     * **参数解释**： 用户是否关注流水线。 **取值范围**： - true：关注流水线。 - false：未关注流水线。 
     * @return watched
     */
    public String getWatched() {
        return watched;
    }

    public void setWatched(String watched) {
        this.watched = watched;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        PipelineBasicInfo that = (PipelineBasicInfo) obj;
        return Objects.equals(this.projectId, that.projectId) && Objects.equals(this.projectName, that.projectName)
            && Objects.equals(this.pipelineId, that.pipelineId) && Objects.equals(this.pipelineName, that.pipelineName)
            && Objects.equals(this.creatorId, that.creatorId) && Objects.equals(this.creatorName, that.creatorName)
            && Objects.equals(this.executorId, that.executorId) && Objects.equals(this.executorName, that.executorName)
            && Objects.equals(this.startTime, that.startTime) && Objects.equals(this.createTime, that.createTime)
            && Objects.equals(this.watched, that.watched);
    }

    @Override
    public int hashCode() {
        return Objects.hash(projectId,
            projectName,
            pipelineId,
            pipelineName,
            creatorId,
            creatorName,
            executorId,
            executorName,
            startTime,
            createTime,
            watched);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PipelineBasicInfo {\n");
        sb.append("    projectId: ").append(toIndentedString(projectId)).append("\n");
        sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
        sb.append("    pipelineId: ").append(toIndentedString(pipelineId)).append("\n");
        sb.append("    pipelineName: ").append(toIndentedString(pipelineName)).append("\n");
        sb.append("    creatorId: ").append(toIndentedString(creatorId)).append("\n");
        sb.append("    creatorName: ").append(toIndentedString(creatorName)).append("\n");
        sb.append("    executorId: ").append(toIndentedString(executorId)).append("\n");
        sb.append("    executorName: ").append(toIndentedString(executorName)).append("\n");
        sb.append("    startTime: ").append(toIndentedString(startTime)).append("\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    watched: ").append(toIndentedString(watched)).append("\n");
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
