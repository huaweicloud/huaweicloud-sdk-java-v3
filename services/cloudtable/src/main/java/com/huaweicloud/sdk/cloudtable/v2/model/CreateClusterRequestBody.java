package com.huaweicloud.sdk.cloudtable.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** 创建集群发起的请求的请求体对象。 */
public class CreateClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private Cluster cluster;

    public CreateClusterRequestBody withCluster(Cluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public CreateClusterRequestBody withCluster(Consumer<Cluster> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new Cluster();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /** Get cluster
     * 
     * @return cluster */
    public Cluster getCluster() {
        return cluster;
    }

    public void setCluster(Cluster cluster) {
        this.cluster = cluster;
    }

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreateClusterRequestBody createClusterRequestBody = (CreateClusterRequestBody) o;
        return Objects.equals(this.cluster, createClusterRequestBody.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterRequestBody {\n");
        sb.append("    cluster: ").append(toIndentedString(cluster)).append("\n");
        sb.append("}");
        return sb.toString();
    }

    /** Convert the given object to string with each line indented by 4 spaces (except the first line). */
    private String toIndentedString(java.lang.Object o) {
        if (o == null) {
            return "null";
        }
        return o.toString().replace("\n", "\n    ");
    }

}
