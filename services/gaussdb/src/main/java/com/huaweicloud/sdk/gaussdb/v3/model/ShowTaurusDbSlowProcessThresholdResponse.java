package com.huaweicloud.sdk.gaussdb.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowTaurusDbSlowProcessThresholdResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "slow_process_threshold")

    private Integer slowProcessThreshold;

    public ShowTaurusDbSlowProcessThresholdResponse withSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
        return this;
    }

    /**
     * **参数解释**:  慢会话阈值，单位为秒。  **取值范围**：  1-86400。 
     * @return slowProcessThreshold
     */
    public Integer getSlowProcessThreshold() {
        return slowProcessThreshold;
    }

    public void setSlowProcessThreshold(Integer slowProcessThreshold) {
        this.slowProcessThreshold = slowProcessThreshold;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaurusDbSlowProcessThresholdResponse that = (ShowTaurusDbSlowProcessThresholdResponse) obj;
        return Objects.equals(this.slowProcessThreshold, that.slowProcessThreshold);
    }

    @Override
    public int hashCode() {
        return Objects.hash(slowProcessThreshold);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaurusDbSlowProcessThresholdResponse {\n");
        sb.append("    slowProcessThreshold: ").append(toIndentedString(slowProcessThreshold)).append("\n");
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
