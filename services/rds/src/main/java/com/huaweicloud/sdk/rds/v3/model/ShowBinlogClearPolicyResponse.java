package com.huaweicloud.sdk.rds.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ShowBinlogClearPolicyResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_retention_hours")

    private Integer binlogRetentionHours;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "binlog_clear_type")

    private String binlogClearType;

    public ShowBinlogClearPolicyResponse withBinlogRetentionHours(Integer binlogRetentionHours) {
        this.binlogRetentionHours = binlogRetentionHours;
        return this;
    }

    /**
     * binlog保留时长
     * @return binlogRetentionHours
     */
    public Integer getBinlogRetentionHours() {
        return binlogRetentionHours;
    }

    public void setBinlogRetentionHours(Integer binlogRetentionHours) {
        this.binlogRetentionHours = binlogRetentionHours;
    }

    public ShowBinlogClearPolicyResponse withBinlogClearType(String binlogClearType) {
        this.binlogClearType = binlogClearType;
        return this;
    }

    /**
     * 二进制日志保留策略,取值：time、fast - time:表示按时长保留二进制文件 - fast:表示快速清理,不保留二进制文件
     * @return binlogClearType
     */
    public String getBinlogClearType() {
        return binlogClearType;
    }

    public void setBinlogClearType(String binlogClearType) {
        this.binlogClearType = binlogClearType;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowBinlogClearPolicyResponse that = (ShowBinlogClearPolicyResponse) obj;
        return Objects.equals(this.binlogRetentionHours, that.binlogRetentionHours)
            && Objects.equals(this.binlogClearType, that.binlogClearType);
    }

    @Override
    public int hashCode() {
        return Objects.hash(binlogRetentionHours, binlogClearType);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowBinlogClearPolicyResponse {\n");
        sb.append("    binlogRetentionHours: ").append(toIndentedString(binlogRetentionHours)).append("\n");
        sb.append("    binlogClearType: ").append(toIndentedString(binlogClearType)).append("\n");
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
