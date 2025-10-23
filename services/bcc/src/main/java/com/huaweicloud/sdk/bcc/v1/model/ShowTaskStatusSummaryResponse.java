package com.huaweicloud.sdk.bcc.v1.model;

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
public class ShowTaskStatusSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ShowTaskStatusSummaryResponseBodyFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private ShowTaskStatusSummaryResponseBodySummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<ShowTaskStatusSummaryResponseBodyDatapoints> datapoints = null;

    public ShowTaskStatusSummaryResponse withFilter(ShowTaskStatusSummaryResponseBodyFilter filter) {
        this.filter = filter;
        return this;
    }

    public ShowTaskStatusSummaryResponse withFilter(Consumer<ShowTaskStatusSummaryResponseBodyFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new ShowTaskStatusSummaryResponseBodyFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public ShowTaskStatusSummaryResponseBodyFilter getFilter() {
        return filter;
    }

    public void setFilter(ShowTaskStatusSummaryResponseBodyFilter filter) {
        this.filter = filter;
    }

    public ShowTaskStatusSummaryResponse withSummary(ShowTaskStatusSummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }

    public ShowTaskStatusSummaryResponse withSummary(Consumer<ShowTaskStatusSummaryResponseBodySummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new ShowTaskStatusSummaryResponseBodySummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public ShowTaskStatusSummaryResponseBodySummary getSummary() {
        return summary;
    }

    public void setSummary(ShowTaskStatusSummaryResponseBodySummary summary) {
        this.summary = summary;
    }

    public ShowTaskStatusSummaryResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 打点数据的条数
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ShowTaskStatusSummaryResponse withDatapoints(List<ShowTaskStatusSummaryResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ShowTaskStatusSummaryResponse addDatapointsItem(ShowTaskStatusSummaryResponseBodyDatapoints datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ShowTaskStatusSummaryResponse withDatapoints(
        Consumer<List<ShowTaskStatusSummaryResponseBodyDatapoints>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 打点数据
     * @return datapoints
     */
    public List<ShowTaskStatusSummaryResponseBodyDatapoints> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<ShowTaskStatusSummaryResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowTaskStatusSummaryResponse that = (ShowTaskStatusSummaryResponse) obj;
        return Objects.equals(this.filter, that.filter) && Objects.equals(this.summary, that.summary)
            && Objects.equals(this.count, that.count) && Objects.equals(this.datapoints, that.datapoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(filter, summary, count, datapoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowTaskStatusSummaryResponse {\n");
        sb.append("    filter: ").append(toIndentedString(filter)).append("\n");
        sb.append("    summary: ").append(toIndentedString(summary)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    datapoints: ").append(toIndentedString(datapoints)).append("\n");
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
