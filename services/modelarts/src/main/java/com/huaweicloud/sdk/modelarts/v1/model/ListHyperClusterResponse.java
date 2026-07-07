package com.huaweicloud.sdk.modelarts.v1.model;

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
public class ListHyperClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "hyper_clusters")

    private List<HyperCluster> hyperClusters = null;

    public ListHyperClusterResponse withHyperClusters(List<HyperCluster> hyperClusters) {
        this.hyperClusters = hyperClusters;
        return this;
    }

    public ListHyperClusterResponse addHyperClustersItem(HyperCluster hyperClustersItem) {
        if (this.hyperClusters == null) {
            this.hyperClusters = new ArrayList<>();
        }
        this.hyperClusters.add(hyperClustersItem);
        return this;
    }

    public ListHyperClusterResponse withHyperClusters(Consumer<List<HyperCluster>> hyperClustersSetter) {
        if (this.hyperClusters == null) {
            this.hyperClusters = new ArrayList<>();
        }
        hyperClustersSetter.accept(this.hyperClusters);
        return this;
    }

    /**
     * **参数解释**：Hyper Cluster列表。
     * @return hyperClusters
     */
    public List<HyperCluster> getHyperClusters() {
        return hyperClusters;
    }

    public void setHyperClusters(List<HyperCluster> hyperClusters) {
        this.hyperClusters = hyperClusters;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ListHyperClusterResponse that = (ListHyperClusterResponse) obj;
        return Objects.equals(this.hyperClusters, that.hyperClusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(hyperClusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListHyperClusterResponse {\n");
        sb.append("    hyperClusters: ").append(toIndentedString(hyperClusters)).append("\n");
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
