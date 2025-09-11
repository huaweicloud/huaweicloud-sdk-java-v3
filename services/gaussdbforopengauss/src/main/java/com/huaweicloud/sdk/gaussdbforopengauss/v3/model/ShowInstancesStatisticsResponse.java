package com.huaweicloud.sdk.gaussdbforopengauss.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowInstancesStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "instances_statistics")

    private List<InstancesStatisticsResponseBodyInstancesStatistics> instancesStatistics = null;

    public ShowInstancesStatisticsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * **参数解释**: 实例总数。 **取值范围**: 不涉及。
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ShowInstancesStatisticsResponse withInstancesStatistics(
        List<InstancesStatisticsResponseBodyInstancesStatistics> instancesStatistics) {
        this.instancesStatistics = instancesStatistics;
        return this;
    }

    public ShowInstancesStatisticsResponse addInstancesStatisticsItem(
        InstancesStatisticsResponseBodyInstancesStatistics instancesStatisticsItem) {
        if (this.instancesStatistics == null) {
            this.instancesStatistics = new ArrayList<>();
        }
        this.instancesStatistics.add(instancesStatisticsItem);
        return this;
    }

    public ShowInstancesStatisticsResponse withInstancesStatistics(
        Consumer<List<InstancesStatisticsResponseBodyInstancesStatistics>> instancesStatisticsSetter) {
        if (this.instancesStatistics == null) {
            this.instancesStatistics = new ArrayList<>();
        }
        instancesStatisticsSetter.accept(this.instancesStatistics);
        return this;
    }

    /**
     * **参数解释**: 实例统计信息。 **取值范围**: 不涉及。
     * @return instancesStatistics
     */
    public List<InstancesStatisticsResponseBodyInstancesStatistics> getInstancesStatistics() {
        return instancesStatistics;
    }

    public void setInstancesStatistics(List<InstancesStatisticsResponseBodyInstancesStatistics> instancesStatistics) {
        this.instancesStatistics = instancesStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowInstancesStatisticsResponse that = (ShowInstancesStatisticsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.instancesStatistics, that.instancesStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, instancesStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowInstancesStatisticsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    instancesStatistics: ").append(toIndentedString(instancesStatistics)).append("\n");
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
