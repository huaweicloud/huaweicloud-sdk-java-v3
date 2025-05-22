package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * **参数解释**： 逻辑集群磁盘信息。 **取值范围**： 不涉及。
 */
public class LogicalClusterVolume {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_cluster_name")

    private String logicalClusterName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "usage")

    private String usage;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private String total;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "percent")

    private String percent;

    public LogicalClusterVolume withLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
        return this;
    }

    /**
     * **参数解释**： 逻辑集群名称。 **取值范围**： 不涉及。
     * @return logicalClusterName
     */
    public String getLogicalClusterName() {
        return logicalClusterName;
    }

    public void setLogicalClusterName(String logicalClusterName) {
        this.logicalClusterName = logicalClusterName;
    }

    public LogicalClusterVolume withUsage(String usage) {
        this.usage = usage;
        return this;
    }

    /**
     * **参数解释**： 磁盘使用量。 **取值范围**： 不涉及。
     * @return usage
     */
    public String getUsage() {
        return usage;
    }

    public void setUsage(String usage) {
        this.usage = usage;
    }

    public LogicalClusterVolume withTotal(String total) {
        this.total = total;
        return this;
    }

    /**
     * **参数解释**： 磁盘总量。 **取值范围**： 不涉及。
     * @return total
     */
    public String getTotal() {
        return total;
    }

    public void setTotal(String total) {
        this.total = total;
    }

    public LogicalClusterVolume withPercent(String percent) {
        this.percent = percent;
        return this;
    }

    /**
     * **参数解释**： 磁盘使用比例。 **取值范围**： 不涉及。
     * @return percent
     */
    public String getPercent() {
        return percent;
    }

    public void setPercent(String percent) {
        this.percent = percent;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        LogicalClusterVolume that = (LogicalClusterVolume) obj;
        return Objects.equals(this.logicalClusterName, that.logicalClusterName)
            && Objects.equals(this.usage, that.usage) && Objects.equals(this.total, that.total)
            && Objects.equals(this.percent, that.percent);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalClusterName, usage, total, percent);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LogicalClusterVolume {\n");
        sb.append("    logicalClusterName: ").append(toIndentedString(logicalClusterName)).append("\n");
        sb.append("    usage: ").append(toIndentedString(usage)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
        sb.append("    percent: ").append(toIndentedString(percent)).append("\n");
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
