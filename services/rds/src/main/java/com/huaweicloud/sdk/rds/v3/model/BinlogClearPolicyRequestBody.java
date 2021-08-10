package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/** BinlogClearPolicyRequestBody */
public class BinlogClearPolicyRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_retention_hours")

    private Long binlogRetentionHours;

    public BinlogClearPolicyRequestBody withBinlogRetentionHours(Long binlogRetentionHours) {
        this.binlogRetentionHours = binlogRetentionHours;
        return this;
    }

    /** 取值范围0-7*24
     * 
     * @return binlogRetentionHours */
    public Long getBinlogRetentionHours() {
        return binlogRetentionHours;
    }

    public void setBinlogRetentionHours(Long binlogRetentionHours) {
        this.binlogRetentionHours = binlogRetentionHours;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        BinlogClearPolicyRequestBody binlogClearPolicyRequestBody = (BinlogClearPolicyRequestBody) o;
        return Objects.equals(this.binlogRetentionHours, binlogClearPolicyRequestBody.binlogRetentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binlogRetentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BinlogClearPolicyRequestBody {\n");
        sb.append("    binlogRetentionHours: ").append(toIndentedString(binlogRetentionHours)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
