package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class ChangeTrainingExperimentRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "experiment_id")

    private String experimentId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private ChangeTrainingExperimentRequestBody body;

    public ChangeTrainingExperimentRequest withExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * 训练实验ID。在训练作业创建时获取实验ID。
     * @return experimentId
     */
    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    public ChangeTrainingExperimentRequest withBody(ChangeTrainingExperimentRequestBody body) {
        this.body = body;
        return this;
    }

    public ChangeTrainingExperimentRequest withBody(Consumer<ChangeTrainingExperimentRequestBody> bodySetter) {
        if (this.body == null) {
            this.body = new ChangeTrainingExperimentRequestBody();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public ChangeTrainingExperimentRequestBody getBody() {
        return body;
    }

    public void setBody(ChangeTrainingExperimentRequestBody body) {
        this.body = body;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ChangeTrainingExperimentRequest that = (ChangeTrainingExperimentRequest) obj;
        return Objects.equals(this.experimentId, that.experimentId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experimentId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ChangeTrainingExperimentRequest {\n");
        sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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
