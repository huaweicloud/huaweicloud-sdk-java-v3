package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowEvaluationProjectStatusRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private String evaluationProjectId;

    public ShowEvaluationProjectStatusRequest withEvaluationProjectId(String evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
        return this;
    }

    /**
     * 评估项目ID。
     * @return evaluationProjectId
     */
    public String getEvaluationProjectId() {
        return evaluationProjectId;
    }

    public void setEvaluationProjectId(String evaluationProjectId) {
        this.evaluationProjectId = evaluationProjectId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowEvaluationProjectStatusRequest that = (ShowEvaluationProjectStatusRequest) obj;
        return Objects.equals(this.evaluationProjectId, that.evaluationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowEvaluationProjectStatusRequest {\n");
        sb.append("    evaluationProjectId: ").append(toIndentedString(evaluationProjectId)).append("\n");
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
