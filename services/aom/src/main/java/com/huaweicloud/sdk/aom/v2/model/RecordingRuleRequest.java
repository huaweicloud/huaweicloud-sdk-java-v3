package com.huaweicloud.sdk.aom.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * RecordingRuleRequest
 */
public class RecordingRuleRequest {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "recording_rule")

    private String recordingRule;

    public RecordingRuleRequest withRecordingRule(String recordingRule) {
        this.recordingRule = recordingRule;
        return this;
    }

    /**
     * recordingRule
     * @return recordingRule
     */
    public String getRecordingRule() {
        return recordingRule;
    }

    public void setRecordingRule(String recordingRule) {
        this.recordingRule = recordingRule;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordingRuleRequest that = (RecordingRuleRequest) obj;
        return Objects.equals(this.recordingRule, that.recordingRule);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordingRule);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordingRuleRequest {\n");
        sb.append("    recordingRule: ").append(toIndentedString(recordingRule)).append("\n");
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
