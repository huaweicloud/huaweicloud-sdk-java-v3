package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 确认目标数据库版本的请求体。
 */
public class ConfirmTargetDBReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private String evaluationProjectId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_type")

    private String targetDbType;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "target_db_version")

    private String targetDbVersion;

    public ConfirmTargetDBReq withEvaluationProjectId(String evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
        return this;
    }

    /**
     * 项目ID。
     * @return evaluationProjectId
     */
    public String getEvaluationProjectId() {
        return evaluationProjectId;
    }

    public void setEvaluationProjectId(String evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
    }

    public ConfirmTargetDBReq withTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
        return this;
    }

    /**
     * 目标库类型。
     * @return targetDbType
     */
    public String getTargetDbType() {
        return targetDbType;
    }

    public void setTargetDbType(String targetDbType) {
        this.targetDbType = targetDbType;
    }

    public ConfirmTargetDBReq withTargetDbVersion(String targetDbVersion) {
        this.targetDbVersion = targetDbVersion;
        return this;
    }

    /**
     * 目标库版本。
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
        ConfirmTargetDBReq confirmTargetDBReq = (ConfirmTargetDBReq) o;
        return Objects.equals(this.evaluationProjectId, confirmTargetDBReq.evaluationProjectId)
            && Objects.equals(this.targetDbType, confirmTargetDBReq.targetDbType)
            && Objects.equals(this.targetDbVersion, confirmTargetDBReq.targetDbVersion);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectId, targetDbType, targetDbVersion);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ConfirmTargetDBReq {\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
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
