package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Request Object
 */
public class StopTrainingJobRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "training_job_id")

    private String trainingJobId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "body")

    private JobActionType body;

    public StopTrainingJobRequest withTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
        return this;
    }

    /**
     * 训练作业ID。获取方法请参见[查询训练作业列表](ListTrainingJobs.xml)。
     * @return trainingJobId
     */
    public String getTrainingJobId() {
        return trainingJobId;
    }

    public void setTrainingJobId(String trainingJobId) {
        this.trainingJobId = trainingJobId;
    }

    public StopTrainingJobRequest withBody(JobActionType body) {
        this.body = body;
        return this;
    }

    public StopTrainingJobRequest withBody(Consumer<JobActionType> bodySetter) {
        if (this.body == null) {
            this.body = new JobActionType();
            bodySetter.accept(this.body);
        }

        return this;
    }

    /**
     * Get body
     * @return body
     */
    public JobActionType getBody() {
        return body;
    }

    public void setBody(JobActionType body) {
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
        StopTrainingJobRequest that = (StopTrainingJobRequest) obj;
        return Objects.equals(this.trainingJobId, that.trainingJobId) && Objects.equals(this.body, that.body);
    }

    @Override
    public int hashCode() {
        return Objects.hash(trainingJobId, body);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class StopTrainingJobRequest {\n");
        sb.append("    trainingJobId: ").append(toIndentedString(trainingJobId)).append("\n");
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
