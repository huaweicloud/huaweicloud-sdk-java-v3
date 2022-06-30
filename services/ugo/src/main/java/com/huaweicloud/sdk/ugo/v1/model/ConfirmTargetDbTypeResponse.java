package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Collections;
import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ConfirmTargetDbTypeResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private Integer evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_name")

    private String evaluationProjectName;

    /**
     * 评估项目状态。
     */
    public static final class EvaluationProjectStatusEnum {

        /**
         * Enum COMPLETED for value: "COMPLETED"
         */
        public static final EvaluationProjectStatusEnum COMPLETED = new EvaluationProjectStatusEnum("COMPLETED");

        /**
         * Enum WAITING for value: "WAITING"
         */
        public static final EvaluationProjectStatusEnum WAITING = new EvaluationProjectStatusEnum("WAITING");

        /**
         * Enum PENDING for value: "PENDING"
         */
        public static final EvaluationProjectStatusEnum PENDING = new EvaluationProjectStatusEnum("PENDING");

        /**
         * Enum FAILED for value: "FAILED"
         */
        public static final EvaluationProjectStatusEnum FAILED = new EvaluationProjectStatusEnum("FAILED");

        /**
         * Enum STOPPED for value: "STOPPED"
         */
        public static final EvaluationProjectStatusEnum STOPPED = new EvaluationProjectStatusEnum("STOPPED");

        private static final Map<String, EvaluationProjectStatusEnum> STATIC_FIELDS = createStaticFields();

        private static Map<String, EvaluationProjectStatusEnum> createStaticFields() {
            Map<String, EvaluationProjectStatusEnum> map = new HashMap<>();
            map.put("COMPLETED", COMPLETED);
            map.put("WAITING", WAITING);
            map.put("PENDING", PENDING);
            map.put("FAILED", FAILED);
            map.put("STOPPED", STOPPED);
            return Collections.unmodifiableMap(map);
        }

        private String value;

        EvaluationProjectStatusEnum(String value) {
            this.value = value;
        }

        @JsonValue
        public String getValue() {
            return value;
        }

        @Override
        public String toString() {
            return String.valueOf(value);
        }

        @JsonCreator
        public static EvaluationProjectStatusEnum fromValue(String value) {
            if (value == null) {
                return null;
            }
            EvaluationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result == null) {
                result = new EvaluationProjectStatusEnum(value);
            }
            return result;
        }

        public static EvaluationProjectStatusEnum valueOf(String value) {
            if (value == null) {
                return null;
            }
            EvaluationProjectStatusEnum result = STATIC_FIELDS.get(value);
            if (result != null) {
                return result;
            }
            throw new IllegalArgumentException("Unexpected value '" + value + "'");
        }

        @Override
        public boolean equals(Object obj) {
            if (obj instanceof EvaluationProjectStatusEnum) {
                return this.value.equals(((EvaluationProjectStatusEnum) obj).value);
            }
            return false;
        }

        @Override
        public int hashCode() {
            return this.value.hashCode();
        }
    }

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_status")

    private EvaluationProjectStatusEnum evaluationProjectStatus;

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

    public ConfirmTargetDbTypeResponse withEvaluationProjectId(Integer evaluationProjectId) {
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

    public ConfirmTargetDbTypeResponse withEvaluationProjectName(String evaluationProjectName) {
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

    public ConfirmTargetDbTypeResponse withEvaluationProjectStatus(
        EvaluationProjectStatusEnum evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
        return this;
    }

    /**
     * 评估项目状态。
     * @return evaluationProjectStatus
     */
    public EvaluationProjectStatusEnum getEvaluationProjectStatus() {
        return evaluationProjectStatus;
    }

    public void setEvaluationProjectStatus(EvaluationProjectStatusEnum evaluationProjectStatus) {
        this.evaluationProjectStatus = evaluationProjectStatus;
    }

    public ConfirmTargetDbTypeResponse withProjectStatusDetail(ProjectStatusDetail projectStatusDetail) {
        this.projectStatusDetail = projectStatusDetail;
        return this;
    }

    public ConfirmTargetDbTypeResponse withProjectStatusDetail(
        Consumer<ProjectStatusDetail> projectStatusDetailSetter) {
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

    public ConfirmTargetDbTypeResponse withSourceDbType(String sourceDbType) {
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

    public ConfirmTargetDbTypeResponse withSourceDbVersion(String sourceDbVersion) {
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

    public ConfirmTargetDbTypeResponse withTargetDbType(String targetDbType) {
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

    public ConfirmTargetDbTypeResponse withTargetDbVersion(String targetDbVersion) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ConfirmTargetDbTypeResponse confirmTargetDbTypeResponse = (ConfirmTargetDbTypeResponse) o;
        return Objects.equals(this.evaluationProjectId, confirmTargetDbTypeResponse.evaluationProjectId)
            && Objects.equals(this.evaluationProjectName, confirmTargetDbTypeResponse.evaluationProjectName)
            && Objects.equals(this.evaluationProjectStatus, confirmTargetDbTypeResponse.evaluationProjectStatus)
            && Objects.equals(this.projectStatusDetail, confirmTargetDbTypeResponse.projectStatusDetail)
            && Objects.equals(this.sourceDbType, confirmTargetDbTypeResponse.sourceDbType)
            && Objects.equals(this.sourceDbVersion, confirmTargetDbTypeResponse.sourceDbVersion)
            && Objects.equals(this.targetDbType, confirmTargetDbTypeResponse.targetDbType)
            && Objects.equals(this.targetDbVersion, confirmTargetDbTypeResponse.targetDbVersion);
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
            targetDbVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmTargetDbTypeResponse {\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
        sb.append("    evaluationProjectName: ").append(toIndentedString(evaluationProjectName)).append("\n");
        sb.append("    evaluationProjectStatus: ").append(toIndentedString(evaluationProjectStatus)).append("\n");
        sb.append("    projectStatusDetail: ").append(toIndentedString(projectStatusDetail)).append("\n");
        sb.append("    sourceDbType: ").append(toIndentedString(sourceDbType)).append("\n");
        sb.append("    sourceDbVersion: ").append(toIndentedString(sourceDbVersion)).append("\n");
        sb.append("    targetDbType: ").append(toIndentedString(targetDbType)).append("\n");
        sb.append("    targetDbVersion: ").append(toIndentedString(targetDbVersion)).append("\n");
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
