package com.huaweicloud.sdk.rms.v1.model;

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
public class ShowConfigurationAggregatorSourcesStatusResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "aggregated_source_statuses")

    private List<AggregatedSourceStatus> aggregatedSourceStatuses = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "page_info")

    private PageInfo pageInfo;

    public ShowConfigurationAggregatorSourcesStatusResponse withAggregatedSourceStatuses(
        List<AggregatedSourceStatus> aggregatedSourceStatuses) {
        this.aggregatedSourceStatuses = aggregatedSourceStatuses;
        return this;
    }

    public ShowConfigurationAggregatorSourcesStatusResponse addAggregatedSourceStatusesItem(
        AggregatedSourceStatus aggregatedSourceStatusesItem) {
        if (this.aggregatedSourceStatuses == null) {
            this.aggregatedSourceStatuses = new ArrayList<>();
        }
        this.aggregatedSourceStatuses.add(aggregatedSourceStatusesItem);
        return this;
    }

    public ShowConfigurationAggregatorSourcesStatusResponse withAggregatedSourceStatuses(
        Consumer<List<AggregatedSourceStatus>> aggregatedSourceStatusesSetter) {
        if (this.aggregatedSourceStatuses == null) {
            this.aggregatedSourceStatuses = new ArrayList<>();
        }
        aggregatedSourceStatusesSetter.accept(this.aggregatedSourceStatuses);
        return this;
    }

    /**
     * 资源聚合器状态列表。
     * @return aggregatedSourceStatuses
     */
    public List<AggregatedSourceStatus> getAggregatedSourceStatuses() {
        return aggregatedSourceStatuses;
    }

    public void setAggregatedSourceStatuses(List<AggregatedSourceStatus> aggregatedSourceStatuses) {
        this.aggregatedSourceStatuses = aggregatedSourceStatuses;
    }

    public ShowConfigurationAggregatorSourcesStatusResponse withPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
        return this;
    }

    public ShowConfigurationAggregatorSourcesStatusResponse withPageInfo(Consumer<PageInfo> pageInfoSetter) {
        if (this.pageInfo == null) {
            this.pageInfo = new PageInfo();
            pageInfoSetter.accept(this.pageInfo);
        }

        return this;
    }

    /**
     * Get pageInfo
     * @return pageInfo
     */
    public PageInfo getPageInfo() {
        return pageInfo;
    }

    public void setPageInfo(PageInfo pageInfo) {
        this.pageInfo = pageInfo;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowConfigurationAggregatorSourcesStatusResponse showConfigurationAggregatorSourcesStatusResponse =
            (ShowConfigurationAggregatorSourcesStatusResponse) o;
        return Objects.equals(this.aggregatedSourceStatuses,
            showConfigurationAggregatorSourcesStatusResponse.aggregatedSourceStatuses)
            && Objects.equals(this.pageInfo, showConfigurationAggregatorSourcesStatusResponse.pageInfo);
    }

    @Override
    public int hashCode() {
        return Objects.hash(aggregatedSourceStatuses, pageInfo);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowConfigurationAggregatorSourcesStatusResponse {\n");
        sb.append("    aggregatedSourceStatuses: ").append(toIndentedString(aggregatedSourceStatuses)).append("\n");
        sb.append("    pageInfo: ").append(toIndentedString(pageInfo)).append("\n");
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
