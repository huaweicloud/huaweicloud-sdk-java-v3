package com.huaweicloud.sdk.modelarts.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class CheckTrainingExperimentResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "is_duplicate")

    private Boolean isDuplicate;

    public CheckTrainingExperimentResponse withIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
        return this;
    }

    /**
     * **参数解释**：是否重复。 **约束限制**：不涉及。 **取值范围**： - true：重复 - false：不重复  **默认取值**：不涉及。
     * @return isDuplicate
     */
    public Boolean getIsDuplicate() {
        return isDuplicate;
    }

    public void setIsDuplicate(Boolean isDuplicate) {
        this.isDuplicate = isDuplicate;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        CheckTrainingExperimentResponse that = (CheckTrainingExperimentResponse) obj;
        return Objects.equals(this.isDuplicate, that.isDuplicate);
    }

    @Override
    public int hashCode() {
        return Objects.hash(isDuplicate);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CheckTrainingExperimentResponse {\n");
        sb.append("    isDuplicate: ").append(toIndentedString(isDuplicate)).append("\n");
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
