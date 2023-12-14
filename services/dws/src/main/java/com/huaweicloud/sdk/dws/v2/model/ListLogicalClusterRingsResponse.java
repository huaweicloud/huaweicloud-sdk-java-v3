package com.huaweicloud.sdk.dws.v2.model;

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
public class ListLogicalClusterRingsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_rings")

    private List<LogicalClusterRingInfo> clusterRings = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ListLogicalClusterRingsResponse withClusterRings(List<LogicalClusterRingInfo> clusterRings) {
        this.clusterRings = clusterRings;
        return this;
    }

    public ListLogicalClusterRingsResponse addClusterRingsItem(LogicalClusterRingInfo clusterRingsItem) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        this.clusterRings.add(clusterRingsItem);
        return this;
    }

    public ListLogicalClusterRingsResponse withClusterRings(Consumer<List<LogicalClusterRingInfo>> clusterRingsSetter) {
        if (this.clusterRings == null) {
            this.clusterRings = new ArrayList<>();
        }
        clusterRingsSetter.accept(this.clusterRings);
        return this;
    }

    /**
     * 集群环列表信息
     * @return clusterRings
     */
    public List<LogicalClusterRingInfo> getClusterRings() {
        return clusterRings;
    }

    public void setClusterRings(List<LogicalClusterRingInfo> clusterRings) {
        this.clusterRings = clusterRings;
    }

    public ListLogicalClusterRingsResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 集群环数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogicalClusterRingsResponse that = (ListLogicalClusterRingsResponse) obj;
        return Objects.equals(this.clusterRings, that.clusterRings) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterRings, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogicalClusterRingsResponse {\n");
        sb.append("    clusterRings: ").append(toIndentedString(clusterRings)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
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
