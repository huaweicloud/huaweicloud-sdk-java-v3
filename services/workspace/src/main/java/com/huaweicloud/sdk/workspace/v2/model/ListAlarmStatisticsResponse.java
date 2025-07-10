package com.huaweicloud.sdk.workspace.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;

/**
 * Response Object
 */
public class ListAlarmStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "critical_count")

    private Integer criticalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "major_count")

    private Integer majorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "minor_count")

    private Integer minorCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "info_count")

    private Integer infoCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total")

    private Integer total;

    public ListAlarmStatisticsResponse withCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
        return this;
    }

    /**
     * 紧急告警记录列表总数。
     * @return criticalCount
     */
    public Integer getCriticalCount() {
        return criticalCount;
    }

    public void setCriticalCount(Integer criticalCount) {
        this.criticalCount = criticalCount;
    }

    public ListAlarmStatisticsResponse withMajorCount(Integer majorCount) {
        this.majorCount = majorCount;
        return this;
    }

    /**
     * 重要告警记录列表总数。
     * @return majorCount
     */
    public Integer getMajorCount() {
        return majorCount;
    }

    public void setMajorCount(Integer majorCount) {
        this.majorCount = majorCount;
    }

    public ListAlarmStatisticsResponse withMinorCount(Integer minorCount) {
        this.minorCount = minorCount;
        return this;
    }

    /**
     * 次要告警记录列表总数。
     * @return minorCount
     */
    public Integer getMinorCount() {
        return minorCount;
    }

    public void setMinorCount(Integer minorCount) {
        this.minorCount = minorCount;
    }

    public ListAlarmStatisticsResponse withInfoCount(Integer infoCount) {
        this.infoCount = infoCount;
        return this;
    }

    /**
     * 提示告警记录列表总数。
     * @return infoCount
     */
    public Integer getInfoCount() {
        return infoCount;
    }

    public void setInfoCount(Integer infoCount) {
        this.infoCount = infoCount;
    }

    public ListAlarmStatisticsResponse withTotal(Integer total) {
        this.total = total;
        return this;
    }

    /**
     * 告警记录列表总数。
     * @return total
     */
    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListAlarmStatisticsResponse that = (ListAlarmStatisticsResponse) obj;
        return Objects.equals(this.criticalCount, that.criticalCount)
            && Objects.equals(this.majorCount, that.majorCount) && Objects.equals(this.minorCount, that.minorCount)
            && Objects.equals(this.infoCount, that.infoCount) && Objects.equals(this.total, that.total);
    }

    @Override
    public int hashCode() {
        return Objects.hash(criticalCount, majorCount, minorCount, infoCount, total);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListAlarmStatisticsResponse {\n");
        sb.append("    criticalCount: ").append(toIndentedString(criticalCount)).append("\n");
        sb.append("    majorCount: ").append(toIndentedString(majorCount)).append("\n");
        sb.append("    minorCount: ").append(toIndentedString(minorCount)).append("\n");
        sb.append("    infoCount: ").append(toIndentedString(infoCount)).append("\n");
        sb.append("    total: ").append(toIndentedString(total)).append("\n");
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
