package com.huaweicloud.sdk.bcc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * ListMetricsResponseBodyDatapoints
 */
public class ListMetricsResponseBodyDatapoints {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "timestamp")

    private Long timestamp;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "datapoint")

    private List<ListMetricsResponseBodyDatapoint> datapoint = null;

    public ListMetricsResponseBodyDatapoints withTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }

    /**
     * 指标时间，单位毫秒
     * @return timestamp
     */
    public Long getTimestamp() {
        return timestamp;
    }

    public void setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
    }

    public ListMetricsResponseBodyDatapoints withDatapoint(List<ListMetricsResponseBodyDatapoint> datapoint) {
        this.datapoint = datapoint;
        return this;
    }

    public ListMetricsResponseBodyDatapoints addDatapointItem(ListMetricsResponseBodyDatapoint datapointItem) {
        if (this.datapoint == null) {
            this.datapoint = new ArrayList<>();
        }
        this.datapoint.add(datapointItem);
        return this;
    }

    public ListMetricsResponseBodyDatapoints withDatapoint(
        Consumer<List<ListMetricsResponseBodyDatapoint>> datapointSetter) {
        if (this.datapoint == null) {
            this.datapoint = new ArrayList<>();
        }
        datapointSetter.accept(this.datapoint);
        return this;
    }

    /**
     * 数据点
     * @return datapoint
     */
    public List<ListMetricsResponseBodyDatapoint> getDatapoint() {
        return datapoint;
    }

    public void setDatapoint(List<ListMetricsResponseBodyDatapoint> datapoint) {
        this.datapoint = datapoint;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListMetricsResponseBodyDatapoints that = (ListMetricsResponseBodyDatapoints) obj;
        return Objects.equals(this.timestamp, that.timestamp) && Objects.equals(this.datapoint, that.datapoint);
    }

    @Override
    public int hashCode() {
        return Objects.hash(timestamp, datapoint);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListMetricsResponseBodyDatapoints {\n");
        sb.append("    timestamp: ").append(toIndentedString(timestamp)).append("\n");
        sb.append("    datapoint: ").append(toIndentedString(datapoint)).append("\n");
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
