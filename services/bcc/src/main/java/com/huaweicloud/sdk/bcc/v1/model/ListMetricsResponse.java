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
public class ListMetricsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Long count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoints")

    private List<ListMetricsResponseBodyDatapoints> datapoints = null;

    public ListMetricsResponse withCount(Long count) {
        this.count = count;
        return this;
    }

    /**
     * 指标记录总条数
     * minimum: 0
     * maximum: 65535
     * @return count
     */
    public Long getCount() {
        return count;
    }

    public void setCount(Long count) {
        this.count = count;
    }

    public ListMetricsResponse withDatapoints(List<ListMetricsResponseBodyDatapoints> datapoints) {
        this.datapoints = datapoints;
        return this;
    }

    public ListMetricsResponse addDatapointsItem(ListMetricsResponseBodyDatapoints datapointsItem) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        this.datapoints.add(datapointsItem);
        return this;
    }

    public ListMetricsResponse withDatapoints(Consumer<List<ListMetricsResponseBodyDatapoints>> datapointsSetter) {
        if (this.datapoints == null) {
            this.datapoints = new ArrayList<>();
        }
        datapointsSetter.accept(this.datapoints);
        return this;
    }

    /**
     * 指标数据
     * @return datapoints
     */
    public List<ListMetricsResponseBodyDatapoints> getDatapoints() {
        return datapoints;
    }

    public void setDatapoints(List<ListMetricsResponseBodyDatapoints> datapoints) {
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
        ListMetricsResponse that = (ListMetricsResponse) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.datapoints, that.datapoints);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, datapoints);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsResponse {\n");
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
