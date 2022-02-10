package com.huaweicloud.sdk.css.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/** CreateClusterReq */
public class CreateClusterReq {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private CreateClusterBody cluster;

    public CreateClusterReq withCluster(CreateClusterBody cluster) {
        this.cluster = cluster;
        return this;
    }

    public CreateClusterReq withCluster(Consumer<CreateClusterBody> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new CreateClusterBody();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /** Get cluster
     * 
     * @return cluster */
    public CreateClusterBody getCluster() {
        return cluster;
    }

    public void setCluster(CreateClusterBody cluster) {
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
        CreateClusterReq createClusterReq = (CreateClusterReq) o;
        return Objects.equals(this.cluster, createClusterReq.cluster);
    }

    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateClusterReq {\n");
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
