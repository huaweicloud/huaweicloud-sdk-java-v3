package com.huaweicloud.sdk.cdm.v1.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.dataformat.xml.annotation.JacksonXmlProperty;
import com.huaweicloud.sdk.core.SdkResponse;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.util.function.Consumer;

/**
 * Response Object
 */
public class ListClustersResponse extends SdkResponse {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "clusters")

    @JacksonXmlProperty(localName = "clusters")

    private List<Clusters> clusters = null;

    public ListClustersResponse withClusters(List<Clusters> clusters) {
        this.clusters = clusters;
        return this;
    }

    public ListClustersResponse addClustersItem(Clusters clustersItem) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        this.clusters.add(clustersItem);
        return this;
    }

    public ListClustersResponse withClusters(Consumer<List<Clusters>> clustersSetter) {
        if (this.clusters == null) {
            this.clusters = new ArrayList<>();
        }
        clustersSetter.accept(this.clusters);
        return this;
    }

    /**
     * 集群列表，请参见clusters参数说明
     * @return clusters
     */
    public List<Clusters> getClusters() {
        return clusters;
    }

    public void setClusters(List<Clusters> clusters) {
        this.clusters = clusters;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListClustersResponse listClustersResponse = (ListClustersResponse) o;
        return Objects.equals(this.clusters, listClustersResponse.clusters);
    }

    @Override
    public int hashCode() {
        return Objects.hash(clusters);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClustersResponse {\n");
        sb.append("    clusters: ").append(toIndentedString(clusters)).append("\n");
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
