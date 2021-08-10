package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/** Response Object */
public class ShowBinlogClearPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_retention_hours")

    private Integer binlogRetentionHours;

    public ShowBinlogClearPolicyResponse withBinlogRetentionHours(Integer binlogRetentionHours) {
        this.binlogRetentionHours = binlogRetentionHours;
        return this;
    }

    /** binlog保留时长
     * 
     * @return binlogRetentionHours */
    public Integer getBinlogRetentionHours() {
        return binlogRetentionHours;
    }

    public void setBinlogRetentionHours(Integer binlogRetentionHours) {
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
        ShowBinlogClearPolicyResponse showBinlogClearPolicyResponse = (ShowBinlogClearPolicyResponse) o;
        return Objects.equals(this.binlogRetentionHours, showBinlogClearPolicyResponse.binlogRetentionHours);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binlogRetentionHours);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBinlogClearPolicyResponse {\n");
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
