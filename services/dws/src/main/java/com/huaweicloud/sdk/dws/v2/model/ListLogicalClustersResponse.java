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
public class ListLogicalClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "logical_clusters")

    private List<LogicalClusterInfo> logicalClusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "add_enable")

    private Boolean addEnable;

    public ListLogicalClustersResponse withLogicalClusters(List<LogicalClusterInfo> logicalClusters) {
        this.logicalClusters = logicalClusters;
        return this;
    }

    public ListLogicalClustersResponse addLogicalClustersItem(LogicalClusterInfo logicalClustersItem) {
        if (this.logicalClusters == null) {
            this.logicalClusters = new ArrayList<>();
        }
        this.logicalClusters.add(logicalClustersItem);
        return this;
    }

    public ListLogicalClustersResponse withLogicalClusters(Consumer<List<LogicalClusterInfo>> logicalClustersSetter) {
        if (this.logicalClusters == null) {
            this.logicalClusters = new ArrayList<>();
        }
        logicalClustersSetter.accept(this.logicalClusters);
        return this;
    }

    /**
     * 逻辑集群列表信息
     * @return logicalClusters
     */
    public List<LogicalClusterInfo> getLogicalClusters() {
        return logicalClusters;
    }

    public void setLogicalClusters(List<LogicalClusterInfo> logicalClusters) {
        this.logicalClusters = logicalClusters;
    }

    public ListLogicalClustersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * 逻辑集群总数量
     * @return count
     */
    public Integer getCount() {
        return count;
    }

    public void setCount(Integer count) {
        this.count = count;
    }

    public ListLogicalClustersResponse withAddEnable(Boolean addEnable) {
        this.addEnable = addEnable;
        return this;
    }

    /**
     * 作为互斥结果，如果集群内有其他运维操作，该值为false，此时不能添加逻辑集群
     * @return addEnable
     */
    public Boolean getAddEnable() {
        return addEnable;
    }

    public void setAddEnable(Boolean addEnable) {
        this.addEnable = addEnable;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListLogicalClustersResponse that = (ListLogicalClustersResponse) obj;
        return Objects.equals(this.logicalClusters, that.logicalClusters) && Objects.equals(this.count, that.count)
            && Objects.equals(this.addEnable, that.addEnable);
    }

    @Override
    public int hashCode() {
        return Objects.hash(logicalClusters, count, addEnable);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLogicalClustersResponse {\n");
        sb.append("    logicalClusters: ").append(toIndentedString(logicalClusters)).append("\n");
        sb.append("    count: ").append(toIndentedString(count)).append("\n");
        sb.append("    addEnable: ").append(toIndentedString(addEnable)).append("\n");
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
