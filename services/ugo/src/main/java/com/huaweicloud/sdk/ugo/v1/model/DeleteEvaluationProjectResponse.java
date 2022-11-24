package com.huaweicloud.sdk.ugo.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class DeleteEvaluationProjectResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "evaluation_project_id")

    private Integer evaluationProjectId;

    public DeleteEvaluationProjectResponse withEvaluationProjectId(Integer evaluationProjectId) {
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

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteEvaluationProjectResponse deleteEvaluationProjectResponse = (DeleteEvaluationProjectResponse) o;
        return Objects.equals(this.evaluationProjectId, deleteEvaluationProjectResponse.evaluationProjectId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(evaluationProjectId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteEvaluationProjectResponse {\n");
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
