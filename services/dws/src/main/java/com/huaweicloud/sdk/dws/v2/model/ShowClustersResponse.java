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
public class ShowClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    private List<ClusterInfo> clusters = null;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "count")

    private Integer count;

    public ShowClustersResponse withClusters(List<ClusterInfo> clusters) {
        this.clusters = clusters;
        return this;
    }

    public ShowClustersResponse addClustersItem(ClusterInfo clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public ShowClustersResponse withClusters(Consumer<List<ClusterInfo>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * **参数解释**： 集群对象列表。 **取值范围**： 不涉及。
     * @return clusters
     */
    public List<ClusterInfo> getClusters() {
        return clusters;
    }

    public void setClusters(List<ClusterInfo> clusters) {
        this.clusters = clusters;
    }

    public ShowClustersResponse withCount(Integer count) {
        this.count = count;
        return this;
    }

    /**
     * **参数解释**： 集群对象列表总数。 **取值范围**： 不涉及。
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
        ShowClustersResponse that = (ShowClustersResponse) obj;
        return Objects.equals(this.clusters, that.clusters) && Objects.equals(this.count, that.count);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusters, count);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClustersResponse {\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
