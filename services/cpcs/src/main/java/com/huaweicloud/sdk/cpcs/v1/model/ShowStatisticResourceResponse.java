package com.huaweicloud.sdk.cpcs.v1.model;

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
public class ShowStatisticResourceResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_name")

    private String metricName;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<ShowStatisticResourceResponseBodyDatapoints> datapoints = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Long totalCount;

    public ShowStatisticResourceResponse withMetricName(String metricName) {
        this.metricName = metricName;
        return this;
    }

    /**
     * 资源名称
     * @return metricName
     */
    public String getMetricName() {
        return metricName;
    }

    public void setMetricName(String metricName) {
        this.metricName = metricName;
    }

    public ShowStatisticResourceResponse withDatapoints(List<ShowStatisticResourceResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ShowStatisticResourceResponse addDatapointsItem(ShowStatisticResourceResponseBodyDatapoints datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ShowStatisticResourceResponse withDatapoints(
        Consumer<List<ShowStatisticResourceResponseBodyDatapoints>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 资源分布
     * @return datapoints
     */
    public List<ShowStatisticResourceResponseBodyDatapoints> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<ShowStatisticResourceResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
    }

    public ShowStatisticResourceResponse withTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总数
     * @return totalCount
     */
    public Long getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowStatisticResourceResponse that = (ShowStatisticResourceResponse) obj;
        return Objects.equals(this.metricName, that.metricName) && Objects.equals(this.datapoints, that.datapoints)
            && Objects.equals(this.totalCount, that.totalCount);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricName, datapoints, totalCount);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowStatisticResourceResponse {\n");
        sb.append("    metricName: ").append(toIndentedString(metricName)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
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
