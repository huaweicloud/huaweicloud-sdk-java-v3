package com.huaweicloud.sdk.rds.v3.model;

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
public class ListInstancesResourceMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_count")

    private Integer totalCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "resource_monitoring_infos")

    private List<ResourceMonitoringInfo> resourceMonitoringInfos = null;

    public ListInstancesResourceMetricsResponse withTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }

    /**
     * 总记录数
     * @return totalCount
     */
    public Integer getTotalCount() {
        return totalCount;
    }

    public void setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
    }

    public ListInstancesResourceMetricsResponse withResourceMonitoringInfos(
        List<ResourceMonitoringInfo> resourceMonitoringInfos) {
        this.resourceMonitoringInfos = resourceMonitoringInfos;
        return this;
    }

    public ListInstancesResourceMetricsResponse addResourceMonitoringInfosItem(
        ResourceMonitoringInfo resourceMonitoringInfosItem) {
        if (this.resourceMonitoringInfos == null) {
            this.resourceMonitoringInfos = new ArrayList<>();
        }
        this.resourceMonitoringInfos.add(resourceMonitoringInfosItem);
        return this;
    }

    public ListInstancesResourceMetricsResponse withResourceMonitoringInfos(
        Consumer<List<ResourceMonitoringInfo>> resourceMonitoringInfosSetter) {
        if (this.resourceMonitoringInfos == null) {
            this.resourceMonitoringInfos = new ArrayList<>();
        }
        resourceMonitoringInfosSetter.accept(this.resourceMonitoringInfos);
        return this;
    }

    /**
     * 资源监控信息
     * @return resourceMonitoringInfos
     */
    public List<ResourceMonitoringInfo> getResourceMonitoringInfos() {
        return resourceMonitoringInfos;
    }

    public void setResourceMonitoringInfos(List<ResourceMonitoringInfo> resourceMonitoringInfos) {
        this.resourceMonitoringInfos = resourceMonitoringInfos;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesResourceMetricsResponse that = (ListInstancesResourceMetricsResponse) obj;
        return Objects.equals(this.totalCount, that.totalCount)
            && Objects.equals(this.resourceMonitoringInfos, that.resourceMonitoringInfos);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalCount, resourceMonitoringInfos);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesResourceMetricsResponse {\n");
        sb.append("    totalCount: ").append(toIndentedString(totalCount)).append("\n");
        sb.append("    resourceMonitoringInfos: ").append(toIndentedString(resourceMonitoringInfos)).append("\n");
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
