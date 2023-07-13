package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowMigrationProjectDetailResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_id")

    private Integer migrationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_name")

    private String migrationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    private String evaluationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "source_db_info")

    private DataBase sourceDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_info")

    private DataBase targetDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "created_time")

    private String createdTime;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "updated_time")

    private String updatedTime;

    public ShowMigrationProjectDetailResponse withMigrationProjectId(Integer migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
        return this;
    }

    /**
     * 迁移项目ID。
     * @return migrationProjectId
     */
    public Integer getMigrationProjectId() {
        return migrationProjectId;
    }

    public void setMigrationProjectId(Integer migrationProjectId) {
        this.migrationProjectId = migrationProjectId;
    }

    public ShowMigrationProjectDetailResponse withMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
        return this;
    }

    /**
     * 迁移项目状态。
     * @return migrationProjectName
     */
    public String getMigrationProjectName() {
        return migrationProjectName;
    }

    public void setMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
    }

    public ShowMigrationProjectDetailResponse withEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
        return this;
    }

    /**
     * 对应的评估项目名称。
     * @return evaluationProjectName
     */
    public String getEvaluationProjectName() {
        return evaluationProjectName;
    }

    public void setEvaluationProjectName(String evaluationProjectName) {
        this.evaluationProjectName = evaluationProjectName;
    }

    public ShowMigrationProjectDetailResponse withSourceDbInfo(DataBase sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
        return this;
    }

    public ShowMigrationProjectDetailResponse withSourceDbInfo(Consumer<DataBase> sourceDbInfoSetter) {
        if (this.sourceDbInfo == null) {
            this.sourceDbInfo = new DataBase();
            sourceDbInfoSetter.accept(this.sourceDbInfo);
        }

        return this;
    }

    /**
     * Get sourceDbInfo
     * @return sourceDbInfo
     */
    public DataBase getSourceDbInfo() {
        return sourceDbInfo;
    }

    public void setSourceDbInfo(DataBase sourceDbInfo) {
        this.sourceDbInfo = sourceDbInfo;
    }

    public ShowMigrationProjectDetailResponse withTargetDbInfo(DataBase targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
        return this;
    }

    public ShowMigrationProjectDetailResponse withTargetDbInfo(Consumer<DataBase> targetDbInfoSetter) {
        if (this.targetDbInfo == null) {
            this.targetDbInfo = new DataBase();
            targetDbInfoSetter.accept(this.targetDbInfo);
        }

        return this;
    }

    /**
     * Get targetDbInfo
     * @return targetDbInfo
     */
    public DataBase getTargetDbInfo() {
        return targetDbInfo;
    }

    public void setTargetDbInfo(DataBase targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
    }

    public ShowMigrationProjectDetailResponse withCreatedTime(String createdTime) {
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

    public ShowMigrationProjectDetailResponse withUpdatedTime(String updatedTime) {
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

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowMigrationProjectDetailResponse that = (ShowMigrationProjectDetailResponse) obj;
        return Objects.equals(this.migrationProjectId, that.migrationProjectId)
            && Objects.equals(this.migrationProjectName, that.migrationProjectName)
            && Objects.equals(this.evaluationProjectName, that.evaluationProjectName)
            && Objects.equals(this.sourceDbInfo, that.sourceDbInfo)
            && Objects.equals(this.targetDbInfo, that.targetDbInfo)
            && Objects.equals(this.createdTime, that.createdTime) && Objects.equals(this.updatedTime, that.updatedTime);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectId,
            migrationProjectName,
            evaluationProjectName,
            sourceDbInfo,
            targetDbInfo,
            createdTime,
            updatedTime);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowMigrationProjectDetailResponse {\n");
        sb.append("    migrationProjectId: ").append(toIndentedString(migrationProjectId)).append("\n");
        sb.append("    migrationProjectName: ").append(toIndentedString(migrationProjectName)).append("\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    sourceDbInfo: ").append(toIndentedString(sourceDbInfo)).append("\n");
        sb.append("    targetDbInfo: ").append(toIndentedString(targetDbInfo)).append("\n");
        sb.append("    createdTime: ").append(toIndentedString(createdTime)).append("\n");
        sb.append("    updatedTime: ").append(toIndentedString(updatedTime)).append("\n");
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
