package com.huaweicloud.sdk.sdrs.v1.model;

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
public class ListRpoStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_rpo_statistics")

    private List<RpoStattisticsParams> resourceRpoStatistics = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListRpoStatisticsResponse withResourceRpoStatistics(List<RpoStattisticsParams> resourceRpoStatistics) {
        this.resourceRpoStatistics = resourceRpoStatistics;
        return this;
    }

    public ListRpoStatisticsResponse addResourceRpoStatisticsItem(RpoStattisticsParams resourceRpoStatisticsItem) {
        if (this.resourceRpoStatistics == null) {
            this.resourceRpoStatistics = new ArrayList<>();
        }
        this.resourceRpoStatistics.add(resourceRpoStatisticsItem);
        return this;
    }

    public ListRpoStatisticsResponse withResourceRpoStatistics(
        Consumer<List<RpoStattisticsParams>> resourceRpoStatisticsSetter) {
        if (this.resourceRpoStatistics == null) {
            this.resourceRpoStatistics = new ArrayList<>();
        }
        resourceRpoStatisticsSetter.accept(this.resourceRpoStatistics);
        return this;
    }

    /**
     * 资源的RPO超标趋势记录列表。
     * @return resourceRpoStatistics
     */
    public List<RpoStattisticsParams> getResourceRpoStatistics() {
        return resourceRpoStatistics;
    }

    public void setResourceRpoStatistics(List<RpoStattisticsParams> resourceRpoStatistics) {
        this.resourceRpoStatistics = resourceRpoStatistics;
    }

    public ListRpoStatisticsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 列表中包含的资源的RPO超标趋势记录个数。
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
        ListRpoStatisticsResponse that = (ListRpoStatisticsResponse) obj;
        return Objects.equals(this.resourceRpoStatistics, that.resourceRpoStatistics)
            && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(resourceRpoStatistics, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListRpoStatisticsResponse {\n");
        sb.append("    resourceRpoStatistics: ").append(toIndentedString(resourceRpoStatistics)).append("\n");
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
