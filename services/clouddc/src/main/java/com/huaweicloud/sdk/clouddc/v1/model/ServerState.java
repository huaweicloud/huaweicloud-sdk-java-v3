package com.huaweicloud.sdk.clouddc.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * 服务器运行状态对象
 */
public class ServerState {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "dc_stats")

    private Map<String, Integer> dcStats = null;

    public ServerState withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ServerState withDcStats(Map<String, Integer> dcStats) {
        this.dcStats = dcStats;
        return this;
    }

    public ServerState putDcStatsItem(String key, Integer dcStatsItem) {
        if (this.dcStats == null) {
            this.dcStats = new HashMap<>();
        }
        this.dcStats.put(key, dcStatsItem);
        return this;
    }

    public ServerState withDcStats(Consumer<Map<String, Integer>> dcStatsSetter) {
        if (this.dcStats == null) {
            this.dcStats = new HashMap<>();
        }
        dcStatsSetter.accept(this.dcStats);
        return this;
    }

    /**
     * 数据中心名称对应数量映射
     * @return dcStats
     */
    public Map<String, Integer> getDcStats() {
        return dcStats;
    }

    public void setDcStats(Map<String, Integer> dcStats) {
        this.dcStats = dcStats;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ServerState that = (ServerState) obj;
        return Objects.equals(this.count, that.count) && Objects.equals(this.dcStats, that.dcStats);
    }

    @Override
    public int hashCode() {
        return Objects.hash(count, dcStats);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ServerState {\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    dcStats: ").append(toIndentedString(dcStats)).append("\n");
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
