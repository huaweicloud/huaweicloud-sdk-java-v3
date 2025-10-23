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
public class ShowTaskTypeSummaryResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "filter")

    private ShowTaskTypeSummaryResponseBodyFilter filter;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "summary")

    private ShowTaskTypeSummaryResponseBodySummary summary;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<ShowTaskTypeSummaryResponseBodyDatapoints> datapoints = null;

    public ShowTaskTypeSummaryResponse withFilter(ShowTaskTypeSummaryResponseBodyFilter filter) {
        this.filter = filter;
        return this;
    }

    public ShowTaskTypeSummaryResponse withFilter(Consumer<ShowTaskTypeSummaryResponseBodyFilter> filterSetter) {
        if (this.filter == null) {
            this.filter = new ShowTaskTypeSummaryResponseBodyFilter();
            filterSetter.accept(this.filter);
        }

        return this;
    }

    /**
     * Get filter
     * @return filter
     */
    public ShowTaskTypeSummaryResponseBodyFilter getFilter() {
        return filter;
    }

    public void setFilter(ShowTaskTypeSummaryResponseBodyFilter filter) {
        this.filter = filter;
    }

    public ShowTaskTypeSummaryResponse withSummary(ShowTaskTypeSummaryResponseBodySummary summary) {
        this.summary = summary;
        return this;
    }

    public ShowTaskTypeSummaryResponse withSummary(Consumer<ShowTaskTypeSummaryResponseBodySummary> summarySetter) {
        if (this.summary == null) {
            this.summary = new ShowTaskTypeSummaryResponseBodySummary();
            summarySetter.accept(this.summary);
        }

        return this;
    }

    /**
     * Get summary
     * @return summary
     */
    public ShowTaskTypeSummaryResponseBodySummary getSummary() {
        return summary;
    }

    public void setSummary(ShowTaskTypeSummaryResponseBodySummary summary) {
        this.summary = summary;
    }

    public ShowTaskTypeSummaryResponse withCount(Long count) {
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

    public ShowTaskTypeSummaryResponse withDatapoints(List<ShowTaskTypeSummaryResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ShowTaskTypeSummaryResponse addDatapointsItem(ShowTaskTypeSummaryResponseBodyDatapoints datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ShowTaskTypeSummaryResponse withDatapoints(
        Consumer<List<ShowTaskTypeSummaryResponseBodyDatapoints>> datapointsSetter) {
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
    public List<ShowTaskTypeSummaryResponseBodyDatapoints> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<ShowTaskTypeSummaryResponseBodyDatapoints> datapoints) {
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
        ShowTaskTypeSummaryResponse that = (ShowTaskTypeSummaryResponse) obj;
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
        sb.append("class ShowTaskTypeSummaryResponse {\n");
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
