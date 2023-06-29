package com.huaweicloud.sdk.eihealth.v1.model;

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
public class BatchDownloadResourceStatDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "metric_statistics")

    private List<ResourceStatDataRsp> metricStatistics = null;

    public BatchDownloadResourceStatDataResponse withMetricStatistics(List<ResourceStatDataRsp> metricStatistics) {
        this.metricStatistics = metricStatistics;
        return this;
    }

    public BatchDownloadResourceStatDataResponse addMetricStatisticsItem(ResourceStatDataRsp metricStatisticsItem) {
        if (this.metricStatistics == null) {
            this.metricStatistics = new ArrayList<>();
        }
        this.metricStatistics.add(metricStatisticsItem);
        return this;
    }

    public BatchDownloadResourceStatDataResponse withMetricStatistics(
        Consumer<List<ResourceStatDataRsp>> metricStatisticsSetter) {
        if (this.metricStatistics == null) {
            this.metricStatistics = new ArrayList<>();
        }
        metricStatisticsSetter.accept(this.metricStatistics);
        return this;
    }

    /**
     * 资源统计数据列表
     * @return metricStatistics
     */
    public List<ResourceStatDataRsp> getMetricStatistics() {
        return metricStatistics;
    }

    public void setMetricStatistics(List<ResourceStatDataRsp> metricStatistics) {
        this.metricStatistics = metricStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        BatchDownloadResourceStatDataResponse that = (BatchDownloadResourceStatDataResponse) obj;
        return Objects.equals(this.metricStatistics, that.metricStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(metricStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class BatchDownloadResourceStatDataResponse {\n");
        sb.append("    metricStatistics: ").append(toIndentedString(metricStatistics)).append("\n");
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
