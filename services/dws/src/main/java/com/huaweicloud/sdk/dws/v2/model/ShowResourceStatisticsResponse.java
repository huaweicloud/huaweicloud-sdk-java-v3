package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowResourceStatisticsResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster_statistics")

    private StatusStatistics clusterStatistics;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "node_statistics")

    private StatusStatistics nodeStatistics;

    public ShowResourceStatisticsResponse withClusterStatistics(StatusStatistics clusterStatistics) {
        this.clusterStatistics = clusterStatistics;
        return this;
    }

    public ShowResourceStatisticsResponse withClusterStatistics(Consumer<StatusStatistics> clusterStatisticsSetter) {
        if (this.clusterStatistics == null) {
            this.clusterStatistics = new StatusStatistics();
            clusterStatisticsSetter.accept(this.clusterStatistics);
        }

        return this;
    }

    /**
     * Get clusterStatistics
     * @return clusterStatistics
     */
    public StatusStatistics getClusterStatistics() {
        return clusterStatistics;
    }

    public void setClusterStatistics(StatusStatistics clusterStatistics) {
        this.clusterStatistics = clusterStatistics;
    }

    public ShowResourceStatisticsResponse withNodeStatistics(StatusStatistics nodeStatistics) {
        this.nodeStatistics = nodeStatistics;
        return this;
    }

    public ShowResourceStatisticsResponse withNodeStatistics(Consumer<StatusStatistics> nodeStatisticsSetter) {
        if (this.nodeStatistics == null) {
            this.nodeStatistics = new StatusStatistics();
            nodeStatisticsSetter.accept(this.nodeStatistics);
        }

        return this;
    }

    /**
     * Get nodeStatistics
     * @return nodeStatistics
     */
    public StatusStatistics getNodeStatistics() {
        return nodeStatistics;
    }

    public void setNodeStatistics(StatusStatistics nodeStatistics) {
        this.nodeStatistics = nodeStatistics;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowResourceStatisticsResponse that = (ShowResourceStatisticsResponse) obj;
        return Objects.equals(this.clusterStatistics, that.clusterStatistics)
            && Objects.equals(this.nodeStatistics, that.nodeStatistics);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusterStatistics, nodeStatistics);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowResourceStatisticsResponse {\n");
        sb.append("    clusterStatistics: ").append(toIndentedString(clusterStatistics)).append("\n");
        sb.append("    nodeStatistics: ").append(toIndentedString(nodeStatistics)).append("\n");
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
