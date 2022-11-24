package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 单个评估项目。
 */
public class EvaluationProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private Integer evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    private String evaluationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_status")

    private String evaluationProjectStatus;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "project_status_detail")

    private ProjectStatusDetail projectStatusDetail;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_type")

    private String sourceDbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_version")

    private String sourceDbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_type")

    private String targetDbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_version")

    private String targetDbVersion;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "collect_size")

    private Long collectSize;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_id")

    private String resourceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "error_reason")

    private String errorReason;

    public EvaluationProject withEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
        return this;
    }

    /**
     * 评估项目ID。
     * @return evaluationProjectId
     */
    public Integer getEvaluationProjectId() {
        return evaluationProjectId;
    }

    public void setEvaluationProjectId(Integer evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
    }

    public EvaluationProject withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 评估项目名称。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    public EvaluationProject withEvaluationProjectStatus(String evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
        return this;
    }

    /**
     * 评估项目状态。
     * @return evaluationProjectStatus
     */
    public String getEvaluationProjectStatus() {
        return evaluationProjectStatus;
    }

    public void setEvaluationProjectStatus(String evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
    }

    public EvaluationProject withProjectStatusDetail(ProjectStatusDetail projectStatusDetail) {
        this.projectStatusDetail = projectStatusDetail;
        return this;
    }

    public EvaluationProject withProjectStatusDetail(Consumer<ProjectStatusDetail> projectStatusDetailSetter) {
        if (this.projectStatusDetail == null) {
            this.projectStatusDetail = new ProjectStatusDetail();
            projectStatusDetailSetter.accept(this.projectStatusDetail);
        }

        return this;
    }

    /**
     * Get projectStatusDetail
     * @return projectStatusDetail
     */
    public ProjectStatusDetail getProjectStatusDetail() {
        return projectStatusDetail;
    }

    public void setProjectStatusDetail(ProjectStatusDetail projectStatusDetail) {
        this.projectStatusDetail = projectStatusDetail;
    }

    public EvaluationProject withSourceDbType(String sourceDbType) {
        this.sourceDbType = sourceDbType;
        return this;
    }

    /**
     * 源数据库类型。
     * @return sourceDbType
     */
    public String getSourceDbType() {
        return sourceDbType;
    }

    public void setSourceDbType(String sourceDbType) {
        this.sourceDbType = sourceDbType;
    }

    public EvaluationProject withSourceDbVersion(String sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
        return this;
    }

    /**
     * 源数据库版本。
     * @return sourceDbVersion
     */
    public String getSourceDbVersion() {
        return sourceDbVersion;
    }

    public void setSourceDbVersion(String sourceDbVersion) {
        this.sourceDbVersion = sourceDbVersion;
    }

    public EvaluationProject withTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
        return this;
    }

    /**
     * 目标数据库类型。
     * @return targetDbType
     */
    public String getTargetDbType() {
        return targetDbType;
    }

    public void setTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
    }

    public EvaluationProject withTargetDbVersion(String targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
        return this;
    }

    /**
     * 目标数据库版本。
     * @return targetDbVersion
     */
    public String getTargetDbVersion() {
        return targetDbVersion;
    }

    public void setTargetDbVersion(String targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
    }

    public EvaluationProject withCollectSize(Long collectSize) {
        this.collectSize = collectSize;
        return this;
    }

    /**
     * 已收集的SQL大小，单位：B。
     * @return collectSize
     */
    public Long getCollectSize() {
        return collectSize;
    }

    public void setCollectSize(Long collectSize) {
        this.collectSize = collectSize;
    }

    public EvaluationProject withResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }

    /**
     * 资源ID。
     * @return resourceId
     */
    public String getResourceId() {
        return resourceId;
    }

    public void setResourceId(String resourceId) {
        this.resourceId = resourceId;
    }

    public EvaluationProject withCreatedTime(String createdTime) {
        this.createdTime = createdTime;
        return this;
    }

    /**
     * 创建时间。
     * @return createdTime
     */
    public String getCreatedTime() {
        return createdTime;
    }

    public void setCreatedTime(String createdTime) {
        this.createdTime = createdTime;
    }

    public EvaluationProject withUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
        return this;
    }

    /**
     * 更新时间。
     * @return updatedTime
     */
    public String getUpdatedTime() {
        return updatedTime;
    }

    public void setUpdatedTime(String updatedTime) {
        this.updatedTime = updatedTime;
    }

    public EvaluationProject withErrorReason(String errorReason) {
        this.errorReason = errorReason;
        return this;
    }

    /**
     * 失败原因。
     * @return errorReason
     */
    public String getErrorReason() {
        return errorReason;
    }

    public void setErrorReason(String errorReason) {
        this.errorReason = errorReason;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        EvaluationProject evaluationProject = (EvaluationProject) o;
        return Objects.equals(this.evaluationProjectId, evaluationProject.evaluationProjectId)
            && Objects.equals(this.evaluationProjectName, evaluationProject.evaluationProjectName)
            && Objects.equals(this.evaluationProjectStatus, evaluationProject.evaluationProjectStatus)
            && Objects.equals(this.projectStatusDetail, evaluationProject.projectStatusDetail)
            && Objects.equals(this.sourceDbType, evaluationProject.sourceDbType)
            && Objects.equals(this.sourceDbVersion, evaluationProject.sourceDbVersion)
            && Objects.equals(this.targetDbType, evaluationProject.targetDbType)
            && Objects.equals(this.targetDbVersion, evaluationProject.targetDbVersion)
            && Objects.equals(this.collectSize, evaluationProject.collectSize)
            && Objects.equals(this.resourceId, evaluationProject.resourceId)
            && Objects.equals(this.createdTime, evaluationProject.createdTime)
            && Objects.equals(this.updatedTime, evaluationProject.updatedTime)
            && Objects.equals(this.errorReason, evaluationProject.errorReason);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectId,
            evaluationProjectName,
            evaluationProjectStatus,
            projectStatusDetail,
            sourceDbType,
            sourceDbVersion,
            targetDbType,
            targetDbVersion,
            collectSize,
            resourceId,
            createdTime,
            updatedTime,
            errorReason);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class EvaluationProject {\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    evaluationProjectStatus: ").append(toIndentedString(evaluationProjectStatus)).append("\n");
        sb.append("    projectStatusDetail: ").append(toIndentedString(projectStatusDetail)).append("\n");
        sb.append("    sourceDbType: ").append(toIndentedString(sourceDbType)).append("\n");
        sb.append("    sourceDbVersion: ").append(toIndentedString(sourceDbVersion)).append("\n");
        sb.append("    targetDbType: ").append(toIndentedString(targetDbType)).append("\n");
        sb.append("    targetDbVersion: ").append(toIndentedString(targetDbVersion)).append("\n");
        sb.append("    collectSize: ").append(toIndentedString(collectSize)).append("\n");
        sb.append("    resourceId: ").append(toIndentedString(resourceId)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
        sb.append("    errorReason: ").append(toIndentedString(errorReason)).append("\n");
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
