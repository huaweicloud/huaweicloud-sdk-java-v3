package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * Request Object
 */
public class ShowTrainingExperimentDetailsRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "experiment_id")

    private String experimentId;

    public ShowTrainingExperimentDetailsRequest withExperimentId(String experimentId) {
        this.experimentId = experimentId;
        return this;
    }

    /**
     * **参数解释**：实验ID。创建训练实验时自动生成返回。 **约束限制**：不涉及。 **取值范围**：不涉及。 **默认取值**：不涉及。
     * @return experimentId
     */
    public String getExperimentId() {
        return experimentId;
    }

    public void setExperimentId(String experimentId) {
        this.experimentId = experimentId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTrainingExperimentDetailsRequest that = (ShowTrainingExperimentDetailsRequest) obj;
        return Objects.equals(this.experimentId, that.experimentId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(experimentId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTrainingExperimentDetailsRequest {\n");
        sb.append("    experimentId: ").append(toIndentedString(experimentId)).append("\n");
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
