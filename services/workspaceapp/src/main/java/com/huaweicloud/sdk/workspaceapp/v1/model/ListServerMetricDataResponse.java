package com.huaweicloud.sdk.workspaceapp.v1.model;

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
public class ListServerMetricDataResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "server_metrics")

    private List<ServerMetricData> serverMetrics = null;

    public ListServerMetricDataResponse withServerMetrics(List<ServerMetricData> serverMetrics) {
        this.serverMetrics = serverMetrics;
        return this;
    }

    public ListServerMetricDataResponse addServerMetricsItem(ServerMetricData serverMetricsItem) {
        if (this.serverMetrics == null) {
            this.serverMetrics = new ArrayList<>();
        }
        this.serverMetrics.add(serverMetricsItem);
        return this;
    }

    public ListServerMetricDataResponse withServerMetrics(Consumer<List<ServerMetricData>> serverMetricsSetter) {
        if (this.serverMetrics == null) {
            this.serverMetrics = new ArrayList<>();
        }
        serverMetricsSetter.accept(this.serverMetrics);
        return this;
    }

    /**
     * 监控数据。
     * @return serverMetrics
     */
    public List<ServerMetricData> getServerMetrics() {
        return serverMetrics;
    }

    public void setServerMetrics(List<ServerMetricData> serverMetrics) {
        this.serverMetrics = serverMetrics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListServerMetricDataResponse that = (ListServerMetricDataResponse) obj;
        return Objects.equals(this.serverMetrics, that.serverMetrics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(serverMetrics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListServerMetricDataResponse {\n");
        sb.append("    serverMetrics: ").append(toIndentedString(serverMetrics)).append("\n");
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
