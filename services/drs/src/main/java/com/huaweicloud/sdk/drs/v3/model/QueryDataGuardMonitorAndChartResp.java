package com.huaweicloud.sdk.drs.v3.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * 容灾任务监控数据响应体
 */
public class QueryDataGuardMonitorAndChartResp {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "id")

    private String id;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "data_guard_minitor")

    private QueryDataGuardMonitorResponse dataGuardMinitor;

    public QueryDataGuardMonitorAndChartResp withId(String id) {
        this.id = id;
        return this;
    }

    /**
     * 任务id
     * @return id
     */
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public QueryDataGuardMonitorAndChartResp withDataGuardMinitor(QueryDataGuardMonitorResponse dataGuardMinitor) {
        this.dataGuardMinitor = dataGuardMinitor;
        return this;
    }

    public QueryDataGuardMonitorAndChartResp withDataGuardMinitor(
        Consumer<QueryDataGuardMonitorResponse> dataGuardMinitorSetter) {
        if (this.dataGuardMinitor == null) {
            this.dataGuardMinitor = new QueryDataGuardMonitorResponse();
            dataGuardMinitorSetter.accept(this.dataGuardMinitor);
        }

        return this;
    }

    /**
     * Get dataGuardMinitor
     * @return dataGuardMinitor
     */
    public QueryDataGuardMonitorResponse getDataGuardMinitor() {
        return dataGuardMinitor;
    }

    public void setDataGuardMinitor(QueryDataGuardMonitorResponse dataGuardMinitor) {
        this.dataGuardMinitor = dataGuardMinitor;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        QueryDataGuardMonitorAndChartResp queryDataGuardMonitorAndChartResp = (QueryDataGuardMonitorAndChartResp) o;
        return Objects.equals(this.id, queryDataGuardMonitorAndChartResp.id)
            && Objects.equals(this.dataGuardMinitor, queryDataGuardMonitorAndChartResp.dataGuardMinitor);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, dataGuardMinitor);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class QueryDataGuardMonitorAndChartResp {\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    dataGuardMinitor: ").append(toIndentedString(dataGuardMinitor)).append("\n");
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
