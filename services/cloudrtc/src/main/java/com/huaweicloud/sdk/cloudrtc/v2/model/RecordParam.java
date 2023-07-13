package com.huaweicloud.sdk.cloudrtc.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * 录制参数
 */
public class RecordParam {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "record_rule_id")

    private String recordRuleId;

    public RecordParam withRecordRuleId(String recordRuleId) {
        this.recordRuleId = recordRuleId;
        return this;
    }

    /**
     * 录制规则id。
     * @return recordRuleId
     */
    public String getRecordRuleId() {
        return recordRuleId;
    }

    public void setRecordRuleId(String recordRuleId) {
        this.recordRuleId = recordRuleId;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        RecordParam that = (RecordParam) obj;
        return Objects.equals(this.recordRuleId, that.recordRuleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(recordRuleId);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RecordParam {\n");
        sb.append("    recordRuleId: ").append(toIndentedString(recordRuleId)).append("\n");
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
