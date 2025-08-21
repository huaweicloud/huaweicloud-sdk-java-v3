package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.time.OffsetDateTime;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowLogDiagnosisJobResponse extends SdkResponse {

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

    private LogJobStatus jobStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "message")

    private String message;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "name")

    private String name;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "obs_info")

    private ResObsInfo obsInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "update_time")

    private OffsetDateTime updateTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")

    private String xRequestId;

    public ShowLogDiagnosisJobResponse withCreateTime(OffsetDateTime createTime) {
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

    public ShowLogDiagnosisJobResponse withCreator(String creator) {
        this.creator = creator;
        return this;
    }

    /**
     * **参数解释**：创建者。  **取值范围**：[0,50]。
     * @return creator
     */
    public String getCreator() {
        return creator;
    }

    public void setCreator(String creator) {
        this.creator = creator;
    }

    public ShowLogDiagnosisJobResponse withDescription(String description) {
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

    public ShowLogDiagnosisJobResponse withDiagnosisConclusion(ResultStatus diagnosisConclusion) {
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

    public ShowLogDiagnosisJobResponse withDiagnosisTime(Long diagnosisTime) {
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

    public ShowLogDiagnosisJobResponse withEstimatedTime(Integer estimatedTime) {
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

    public ShowLogDiagnosisJobResponse withId(String id) {
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

    public ShowLogDiagnosisJobResponse withJobStatus(LogJobStatus jobStatus) {
        this.jobStatus = jobStatus;
        return this;
    }

    /**
     * Get jobStatus
     * @return jobStatus
     */
    public LogJobStatus getJobStatus() {
        return jobStatus;
    }

    public void setJobStatus(LogJobStatus jobStatus) {
        this.jobStatus = jobStatus;
    }

    public ShowLogDiagnosisJobResponse withMessage(String message) {
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

    public ShowLogDiagnosisJobResponse withName(String name) {
        this.name = name;
        return this;
    }

    /**
     * **参数解释**：日志诊断作业名称。 **取值范围**：只允许输入长度为 1 到 64 位由数字、中文、英文、下划线（_）或中划线（-）组成的字符。
     * @return name
     */
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public ShowLogDiagnosisJobResponse withObsInfo(ResObsInfo obsInfo) {
        this.obsInfo = obsInfo;
        return this;
    }

    public ShowLogDiagnosisJobResponse withObsInfo(Consumer<ResObsInfo> obsInfoSetter) {
        if (this.obsInfo == null) {
            this.obsInfo = new ResObsInfo();
            obsInfoSetter.accept(this.obsInfo);
        }

        return this;
    }

    /**
     * Get obsInfo
     * @return obsInfo
     */
    public ResObsInfo getObsInfo() {
        return obsInfo;
    }

    public void setObsInfo(ResObsInfo obsInfo) {
        this.obsInfo = obsInfo;
    }

    public ShowLogDiagnosisJobResponse withUpdateTime(OffsetDateTime updateTime) {
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

    public ShowLogDiagnosisJobResponse withXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
        return this;
    }

    /**
     * Get xRequestId
     * @return xRequestId
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "X-request-id")
    public String getXRequestId() {
        return xRequestId;
    }

    public void setXRequestId(String xRequestId) {
        this.xRequestId = xRequestId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowLogDiagnosisJobResponse that = (ShowLogDiagnosisJobResponse) obj;
        return Objects.equals(this.createTime, that.createTime) && Objects.equals(this.creator, that.creator)
            && Objects.equals(this.description, that.description)
            && Objects.equals(this.diagnosisConclusion, that.diagnosisConclusion)
            && Objects.equals(this.diagnosisTime, that.diagnosisTime)
            && Objects.equals(this.estimatedTime, that.estimatedTime) && Objects.equals(this.id, that.id)
            && Objects.equals(this.jobStatus, that.jobStatus) && Objects.equals(this.message, that.message)
            && Objects.equals(this.name, that.name) && Objects.equals(this.obsInfo, that.obsInfo)
            && Objects.equals(this.updateTime, that.updateTime) && Objects.equals(this.xRequestId, that.xRequestId);
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
            obsInfo,
            updateTime,
            xRequestId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowLogDiagnosisJobResponse {\n");
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
        sb.append("    obsInfo: ").append(toIndentedString(obsInfo)).append("\n");
        sb.append("    updateTime: ").append(toIndentedString(updateTime)).append("\n");
        sb.append("    xRequestId: ").append(toIndentedString(xRequestId)).append("\n");
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
