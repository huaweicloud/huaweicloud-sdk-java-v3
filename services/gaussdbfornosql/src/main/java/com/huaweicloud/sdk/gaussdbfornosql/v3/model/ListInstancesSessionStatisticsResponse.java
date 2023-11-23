package com.huaweicloud.sdk.gaussdbfornosql.v3.model;

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
public class ListInstancesSessionStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "total_connection_count")

    private Integer totalConnectionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "active_connection_count")

    private Integer activeConnectionCount;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_source_ips")

    private List<ListInstancesSessionStatisticsRespondBodyTopSourceIps> topSourceIps = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "top_dbs")

    private Object topDbs;

    public ListInstancesSessionStatisticsResponse withTotalConnectionCount(Integer totalConnectionCount) {
        this.totalConnectionCount = totalConnectionCount;
        return this;
    }

    /**
     * 总客户端连接数。
     * @return totalConnectionCount
     */
    public Integer getTotalConnectionCount() {
        return totalConnectionCount;
    }

    public void setTotalConnectionCount(Integer totalConnectionCount) {
        this.totalConnectionCount = totalConnectionCount;
    }

    public ListInstancesSessionStatisticsResponse withActiveConnectionCount(Integer activeConnectionCount) {
        this.activeConnectionCount = activeConnectionCount;
        return this;
    }

    /**
     * active_connection_count
     * @return activeConnectionCount
     */
    public Integer getActiveConnectionCount() {
        return activeConnectionCount;
    }

    public void setActiveConnectionCount(Integer activeConnectionCount) {
        this.activeConnectionCount = activeConnectionCount;
    }

    public ListInstancesSessionStatisticsResponse withTopSourceIps(
        List<ListInstancesSessionStatisticsRespondBodyTopSourceIps> topSourceIps) {
        this.topSourceIps = topSourceIps;
        return this;
    }

    public ListInstancesSessionStatisticsResponse addTopSourceIpsItem(
        ListInstancesSessionStatisticsRespondBodyTopSourceIps topSourceIpsItem) {
        if (this.topSourceIps == null) {
            this.topSourceIps = new ArrayList<>();
        }
        this.topSourceIps.add(topSourceIpsItem);
        return this;
    }

    public ListInstancesSessionStatisticsResponse withTopSourceIps(
        Consumer<List<ListInstancesSessionStatisticsRespondBodyTopSourceIps>> topSourceIpsSetter) {
        if (this.topSourceIps == null) {
            this.topSourceIps = new ArrayList<>();
        }
        topSourceIpsSetter.accept(this.topSourceIps);
        return this;
    }

    /**
     * 节点连接的各个客户端连接数汇总，从大到小取前十个，最多十个，展示客户端的ip地址和连接总数。
     * @return topSourceIps
     */
    public List<ListInstancesSessionStatisticsRespondBodyTopSourceIps> getTopSourceIps() {
        return topSourceIps;
    }

    public void setTopSourceIps(List<ListInstancesSessionStatisticsRespondBodyTopSourceIps> topSourceIps) {
        this.topSourceIps = topSourceIps;
    }

    public ListInstancesSessionStatisticsResponse withTopDbs(Object topDbs) {
        this.topDbs = topDbs;
        return this;
    }

    /**
     * 节点各数据库连接的客户端的ip和该ip连接节点的连接数，按连接数从高到低取前十个，最多十个。
     * @return topDbs
     */
    public Object getTopDbs() {
        return topDbs;
    }

    public void setTopDbs(Object topDbs) {
        this.topDbs = topDbs;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListInstancesSessionStatisticsResponse that = (ListInstancesSessionStatisticsResponse) obj;
        return Objects.equals(this.totalConnectionCount, that.totalConnectionCount)
            && Objects.equals(this.activeConnectionCount, that.activeConnectionCount)
            && Objects.equals(this.topSourceIps, that.topSourceIps) && Objects.equals(this.topDbs, that.topDbs);
    }

    @Override
    public int hashCode() {
        return Objects.hash(totalConnectionCount, activeConnectionCount, topSourceIps, topDbs);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListInstancesSessionStatisticsResponse {\n");
        sb.append("    totalConnectionCount: ").append(toIndentedString(totalConnectionCount)).append("\n");
        sb.append("    activeConnectionCount: ").append(toIndentedString(activeConnectionCount)).append("\n");
        sb.append("    topSourceIps: ").append(toIndentedString(topSourceIps)).append("\n");
        sb.append("    topDbs: ").append(toIndentedString(topDbs)).append("\n");
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
