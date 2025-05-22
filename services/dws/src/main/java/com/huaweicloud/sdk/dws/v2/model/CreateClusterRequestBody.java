package com.huaweicloud.sdk.dws.v2.model;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;
import java.util.function.Consumer;

/**
 * **参数解释**： 创建集群的请求体。 **取值范围**： 非空对象。
 */
public class CreateClusterRequestBody {

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value = "cluster")

    private CreateClusterInfo cluster;

    public CreateClusterRequestBody withCluster(CreateClusterInfo cluster) {
        this.cluster = cluster;
        return this;
    }

    public CreateClusterRequestBody withCluster(Consumer<CreateClusterInfo> clusterSetter) {
        if (this.cluster == null) {
            this.cluster = new CreateClusterInfo();
            clusterSetter.accept(this.cluster);
        }

        return this;
    }

    /**
     * Get cluster
     * @return cluster
     */
    public CreateClusterInfo getCluster() {
        return cluster;
    }

    public void setCluster(CreateClusterInfo cluster) {
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
        CreateClusterRequestBody that = (CreateClusterRequestBody) obj;
        return Objects.equals(this.cluster, that.cluster);
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
