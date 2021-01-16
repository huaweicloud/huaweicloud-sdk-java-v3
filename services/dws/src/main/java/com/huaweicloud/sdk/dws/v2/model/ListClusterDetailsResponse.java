package com.huaweicloud.sdk.dws.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.ClusterDetail;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class ListClusterDetailsResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster")
    
    private ClusterDetail cluster = null;

    public ListClusterDetailsResponse withCluster(ClusterDetail cluster) {
        this.cluster = cluster;
        return this;
    }

    public ListClusterDetailsResponse withCluster(Consumer<ClusterDetail> clusterSetter) {
        if(this.cluster == null ){
            this.cluster = new ClusterDetail();
            clusterSetter.accept(this.cluster);
        }
        
        return this;
    }


    /**
     * Get cluster
     * @return cluster
     */
    public ClusterDetail getCluster() {
        return cluster;
    }

    public void setCluster(ClusterDetail cluster) {
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
        ListClusterDetailsResponse listClusterDetailsResponse = (ListClusterDetailsResponse) o;
        return Objects.equals(this.cluster, listClusterDetailsResponse.cluster);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListClusterDetailsResponse {\n");
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

