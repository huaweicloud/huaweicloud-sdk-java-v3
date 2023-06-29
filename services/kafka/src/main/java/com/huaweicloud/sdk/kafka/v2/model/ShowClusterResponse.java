package com.huaweicloud.sdk.kafka.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ShowClusterResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private ShowClusterRespCluster cluster;

    public ShowClusterResponse withCluster(ShowClusterRespCluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public ShowClusterResponse withCluster(Consumer<ShowClusterRespCluster> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new ShowClusterRespCluster();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public ShowClusterRespCluster getCluster() {
        return cluster;
    }

    public void setCluster(ShowClusterRespCluster cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || getClass() != obj.getClass()) {
            return false;
        }
        ShowClusterResponse that = (ShowClusterResponse) obj;
        return Objects.equals(this.cluster, that.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterResponse {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
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
