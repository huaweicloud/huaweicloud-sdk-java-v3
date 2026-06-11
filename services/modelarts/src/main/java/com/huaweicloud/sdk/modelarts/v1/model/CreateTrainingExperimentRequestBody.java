package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 训练实验创建请求体。
 */
public class CreateTrainingExperimentRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private TrainingExperimentRequestMetadata metadata;

    public CreateTrainingExperimentRequestBody withMetadata(TrainingExperimentRequestMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateTrainingExperimentRequestBody withMetadata(
        Consumer<TrainingExperimentRequestMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new TrainingExperimentRequestMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public TrainingExperimentRequestMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(TrainingExperimentRequestMetadata metadata) {
        this.metadata = metadata;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrainingExperimentRequestBody that = (CreateTrainingExperimentRequestBody) obj;
        return Objects.equals(this.metadata, that.metadata);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrainingExperimentRequestBody {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
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
