package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.time.OffsetDateTime;
import java.util.Objects;

/**
 * **参数解释**：profiling诊断作业信息。
 */
public class ProfilingDiagnosisJobInfo {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "create_time")

    private OffsetDateTime createTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "creator")

    private String creator;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "description")

    private String description;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_conclusion")

    private ResultStatus diagnosisConclusion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "diagnosis_time")

    private Long diagnosisTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "estimated_time")

    private Integer estimatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "job_status")

    private JobStatus jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "result_status")

    private ResultStatus resultStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    public ProfilingDiagnosisJobInfo withCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
        return this;
    }

    /**
     * **参数解释**：作业创建时间。 **取值范围**：不涉及。
     * @return createTime
     */
    public OffsetDateTime getCreateTime() {
        return createTime;
    }

    public void setCreateTime(OffsetDateTime createTime) {
        this.createTime = createTime;
    }

    public ProfilingDiagnosisJobInfo withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**：创建者。 **取值范围**：[0,50]。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ProfilingDiagnosisJobInfo withDescription(String description) {
        this.description = description;
        return this;
    }

    /**
     * **参数解释**：添加的对作业的描述。 **约束限制**：不涉及。 **取值范围**：字符串,长度为0到256之间。 **默认取值**： 
     * @return description
     */
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public ProfilingDiagnosisJobInfo withDiagnosisConclusion(ResultStatus diagnosisConclusion) {
        this.diagnosisConclusion = diagnosisConclusion;
        return this;
    }

    /**
     * Get diagnosisConclusion
     * @return diagnosisConclusion
     */
    public ResultStatus getDiagnosisConclusion() {
        return diagnosisConclusion;
    }

    public void setDiagnosisConclusion(ResultStatus diagnosisConclusion) {
        this.diagnosisConclusion = diagnosisConclusion;
    }

    public ProfilingDiagnosisJobInfo withDiagnosisTime(Long diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
        return this;
    }

    /**
     * **参数解释**：诊断耗时。  **取值范围**：[0,100000]。
     * minimum: 0
     * maximum: 100000
     * @return diagnosisTime
     */
    public Long getDiagnosisTime() {
        return diagnosisTime;
    }

    public void setDiagnosisTime(Long diagnosisTime) {
        this.diagnosisTime = diagnosisTime;
    }

    public ProfilingDiagnosisJobInfo withEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
        return this;
    }

    /**
     * 预估时间（分钟）
     * @return estimatedTime
     */
    public Integer getEstimatedTime() {
        return estimatedTime;
    }

    public void setEstimatedTime(Integer estimatedTime) {
        this.estimatedTime = estimatedTime;
    }

    public ProfilingDiagnosisJobInfo withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * **参数解释**：作业ID。  **取值范围**：长度为[1,36]的英文字符、数字和中划线(-)的组合。
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public ProfilingDiagnosisJobInfo withJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get jobStatus
     * @return jobStatus
     */
    public JobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(JobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public ProfilingDiagnosisJobInfo withMessage(String message) {
        this.message = message;
        return this;
    }

    /**
     * **参数解释**：报错信息。  **取值范围**：[0,500]。
     * @return message
     */
    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    public ProfilingDiagnosisJobInfo withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：profiling诊断作业名称。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ProfilingDiagnosisJobInfo withResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
        return this;
    }

    /**
     * Get resultStatus
     * @return resultStatus
     */
    public ResultStatus getResultStatus() {
        return resultStatus;
    }

    public void setResultStatus(ResultStatus resultStatus) {
        this.resultStatus = resultStatus;
    }

    public ProfilingDiagnosisJobInfo withUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
        return this;
    }

    /**
     * **参数解释**：作业更新时间。 **取值范围**：不涉及。
     * @return updateTime
     */
    public OffsetDateTime getUpdateTime() {
        return updateTime;
    }

    public void setUpdateTime(OffsetDateTime updateTime) {
        this.updateTime = updateTime;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ProfilingDiagnosisJobInfo that = (ProfilingDiagnosisJobInfo) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.diagnosisConclusion, that.diagnosisConclusion)
            && Objects.equals(this.diagnosisTime, that.diagnosisTime)
            && Objects.equals(this.estimatedTime, that.estimatedTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.message, that.message)
            && Objects.equals(this.name, that.name) && Objects.equals(this.resultStatus, that.resultStatus)
            && Objects.equals(this.updateTime, that.updateTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(createTime,
            creator,
            description,
            diagnosisConclusion,
            diagnosisTime,
            estimatedTime,
            id,
            jobStatus,
            message,
            name,
            resultStatus,
            updateTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ProfilingDiagnosisJobInfo {\n");
        sb.append("    createTime: ").append(toIndentedString(createTime)).append("\n");
        sb.append("    creator: ").append(toIndentedString(creator)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    diagnosisConclusion: ").append(toIndentedString(diagnosisConclusion)).append("\n");
        sb.append("    diagnosisTime: ").append(toIndentedString(diagnosisTime)).append("\n");
        sb.append("    estimatedTime: ").append(toIndentedString(estimatedTime)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    jobStatus: ").append(toIndentedString(jobStatus)).append("\n");
        sb.append("    message: ").append(toIndentedString(message)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    resultStatus: ").append(toIndentedString(resultStatus)).append("\n");
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
