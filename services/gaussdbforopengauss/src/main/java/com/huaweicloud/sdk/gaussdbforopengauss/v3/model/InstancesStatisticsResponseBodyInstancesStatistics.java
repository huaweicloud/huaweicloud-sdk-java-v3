package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

/**
 * InstancesStatisticsResponseBodyInstancesStatistics
 */
public class InstancesStatisticsResponseBodyInstancesStatistics {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "status")

    private String status;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public InstancesStatisticsResponseBodyInstancesStatistics withStatus(String status) {
        this.status = status;
        return this;
    }

    /**
     * **参数解释**: 实例状态。 **取值范围**: - normal：实例状态正常。 - abnormal：实例状态异常。 - creating：实例创建中。 - createfail：实例创建失败。 - shutdown：实例已关机。 - deleted：实例已删除。
     * @return status
     */
    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public InstancesStatisticsResponseBodyInstancesStatistics withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**: 实例数量。 **取值范围**: 不涉及。
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        InstancesStatisticsResponseBodyInstancesStatistics that =
            (InstancesStatisticsResponseBodyInstancesStatistics) obj;
        return Objects.equals(this.status, that.status) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(status, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class InstancesStatisticsResponseBodyInstancesStatistics {\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
