package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class CreateTrainingExperimentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metadata")

    private TrainingExperimentResponseMetadata metadata;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "statistic")

    private TrainingExperimentStatistic statistic;

    public CreateTrainingExperimentResponse withMetadata(TrainingExperimentResponseMetadata metadata) {
        this.metadata = metadata;
        return this;
    }

    public CreateTrainingExperimentResponse withMetadata(Consumer<TrainingExperimentResponseMetadata> metadataSetter) {
        if (this.metadata == null) {
            this.metadata = new TrainingExperimentResponseMetadata();
            metadataSetter.accept(this.metadata);
        }

        return this;
    }

    /**
     * Get metadata
     * @return metadata
     */
    public TrainingExperimentResponseMetadata getMetadata() {
        return metadata;
    }

    public void setMetadata(TrainingExperimentResponseMetadata metadata) {
        this.metadata = metadata;
    }

    public CreateTrainingExperimentResponse withStatistic(TrainingExperimentStatistic statistic) {
        this.statistic = statistic;
        return this;
    }

    public CreateTrainingExperimentResponse withStatistic(Consumer<TrainingExperimentStatistic> statisticSetter) {
        if (this.statistic == null) {
            this.statistic = new TrainingExperimentStatistic();
            statisticSetter.accept(this.statistic);
        }

        return this;
    }

    /**
     * Get statistic
     * @return statistic
     */
    public TrainingExperimentStatistic getStatistic() {
        return statistic;
    }

    public void setStatistic(TrainingExperimentStatistic statistic) {
        this.statistic = statistic;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CreateTrainingExperimentResponse that = (CreateTrainingExperimentResponse) obj;
        return Objects.equals(this.metadata, that.metadata) && Objects.equals(this.statistic, that.statistic);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metadata, statistic);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateTrainingExperimentResponse {\n");
        sb.append("    metadata: ").append(toIndentedString(metadata)).append("\n");
        sb.append("    statistic: ").append(toIndentedString(statistic)).append("\n");
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
