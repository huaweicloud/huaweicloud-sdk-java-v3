package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 创建迁移项目请求体。
 */
public class CreateMigrationProject {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "migration_project_name")

    private String migrationProjectName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private Integer evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_info")

    private TargetDBInfo targetDbInfo;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "open_gauss_config")

    private OpenGaussConfig openGaussConfig;

    public CreateMigrationProject withMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
        return this;
    }

    /**
     * 迁移项目名称。长度为5-50个字符，以英文字母开头，英文字母或数字结束，允许包含下划线和中划线。不允许重复。
     * @return migrationProjectName
     */
    public String getMigrationProjectName() {
        return migrationProjectName;
    }

    public void setMigrationProjectName(String migrationProjectName) {
        this.migrationProjectName = migrationProjectName;
    }

    public CreateMigrationProject withEvaluationProjectId(Integer evaluationProjectId) {
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

    public CreateMigrationProject withTargetDbInfo(TargetDBInfo targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
        return this;
    }

    public CreateMigrationProject withTargetDbInfo(Consumer<TargetDBInfo> targetDbInfoSetter) {
        if (this.targetDbInfo == null) {
            this.targetDbInfo = new TargetDBInfo();
            targetDbInfoSetter.accept(this.targetDbInfo);
        }

        return this;
    }

    /**
     * Get targetDbInfo
     * @return targetDbInfo
     */
    public TargetDBInfo getTargetDbInfo() {
        return targetDbInfo;
    }

    public void setTargetDbInfo(TargetDBInfo targetDbInfo) {
        this.targetDbInfo = targetDbInfo;
    }

    public CreateMigrationProject withOpenGaussConfig(OpenGaussConfig openGaussConfig) {
        this.openGaussConfig = openGaussConfig;
        return this;
    }

    public CreateMigrationProject withOpenGaussConfig(Consumer<OpenGaussConfig> openGaussConfigSetter) {
        if (this.openGaussConfig == null) {
            this.openGaussConfig = new OpenGaussConfig();
            openGaussConfigSetter.accept(this.openGaussConfig);
        }

        return this;
    }

    /**
     * Get openGaussConfig
     * @return openGaussConfig
     */
    public OpenGaussConfig getOpenGaussConfig() {
        return openGaussConfig;
    }

    public void setOpenGaussConfig(OpenGaussConfig openGaussConfig) {
        this.openGaussConfig = openGaussConfig;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateMigrationProject createMigrationProject = (CreateMigrationProject) o;
        return Objects.equals(this.migrationProjectName, createMigrationProject.migrationProjectName)
            && Objects.equals(this.evaluationProjectId, createMigrationProject.evaluationProjectId)
            && Objects.equals(this.targetDbInfo, createMigrationProject.targetDbInfo)
            && Objects.equals(this.openGaussConfig, createMigrationProject.openGaussConfig);
    }

    @Override
    public int hashCode() {
        return Objects.hash(migrationProjectName, evaluationProjectId, targetDbInfo, openGaussConfig);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateMigrationProject {\n");
        sb.append("    migrationProjectName: ").append(toIndentedString(migrationProjectName)).append("\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
        sb.append("    targetDbInfo: ").append(toIndentedString(targetDbInfo)).append("\n");
        sb.append("    openGaussConfig: ").append(toIndentedString(openGaussConfig)).append("\n");
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
