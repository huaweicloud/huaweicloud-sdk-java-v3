package com.huaweicloud.sdk.mas.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * DataSyncStatistics
 */
public class DataSyncStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "abnormal_count")

    private Integer abnormalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "running_count")

    private Integer runningCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_two_way_count")

    private Integer typeTwoWayCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "type_unidirectional_count")

    private Integer typeUnidirectionalCount;

    public DataSyncStatistics withAbnormalCount(Integer abnormalCount) {
        this.abnormalCount = abnormalCount;
        return this;
    }

    /**
     * Get abnormalCount
     * @return abnormalCount
     */
    public Integer getAbnormalCount() {
        return abnormalCount;
    }

    public void setAbnormalCount(Integer abnormalCount) {
        this.abnormalCount = abnormalCount;
    }

    public DataSyncStatistics withRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
        return this;
    }

    /**
     * Get runningCount
     * @return runningCount
     */
    public Integer getRunningCount() {
        return runningCount;
    }

    public void setRunningCount(Integer runningCount) {
        this.runningCount = runningCount;
    }

    public DataSyncStatistics withTypeTwoWayCount(Integer typeTwoWayCount) {
        this.typeTwoWayCount = typeTwoWayCount;
        return this;
    }

    /**
     * Get typeTwoWayCount
     * @return typeTwoWayCount
     */
    public Integer getTypeTwoWayCount() {
        return typeTwoWayCount;
    }

    public void setTypeTwoWayCount(Integer typeTwoWayCount) {
        this.typeTwoWayCount = typeTwoWayCount;
    }

    public DataSyncStatistics withTypeUnidirectionalCount(Integer typeUnidirectionalCount) {
        this.typeUnidirectionalCount = typeUnidirectionalCount;
        return this;
    }

    /**
     * Get typeUnidirectionalCount
     * @return typeUnidirectionalCount
     */
    public Integer getTypeUnidirectionalCount() {
        return typeUnidirectionalCount;
    }

    public void setTypeUnidirectionalCount(Integer typeUnidirectionalCount) {
        this.typeUnidirectionalCount = typeUnidirectionalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        DataSyncStatistics that = (DataSyncStatistics) obj;
        return Objects.equals(this.abnormalCount, that.abnormalCount)
            && Objects.equals(this.runningCount, that.runningCount)
            && Objects.equals(this.typeTwoWayCount, that.typeTwoWayCount)
            && Objects.equals(this.typeUnidirectionalCount, that.typeUnidirectionalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(abnormalCount, runningCount, typeTwoWayCount, typeUnidirectionalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DataSyncStatistics {\n");
        sb.append("    abnormalCount: ").append(toIndentedString(abnormalCount)).append("\n");
        sb.append("    runningCount: ").append(toIndentedString(runningCount)).append("\n");
        sb.append("    typeTwoWayCount: ").append(toIndentedString(typeTwoWayCount)).append("\n");
        sb.append("    typeUnidirectionalCount: ").append(toIndentedString(typeUnidirectionalCount)).append("\n");
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
