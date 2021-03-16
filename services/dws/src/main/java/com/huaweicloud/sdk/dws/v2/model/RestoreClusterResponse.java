package com.huaweicloud.sdk.dws.v2.model;




import com.huaweicloud.sdk.core.SdkResponse;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.Cluster;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Response Object
 */
public class RestoreClusterResponse extends SdkResponse {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster")
    
    private Cluster cluster;

    public RestoreClusterResponse withCluster(Cluster cluster) {
        this.cluster = cluster;
        return this;
    }

    public RestoreClusterResponse withCluster(Consumer<Cluster> clusterSetter) {
        if(this.cluster == null ){
            this.cluster = new Cluster();
            clusterSetter.accept(this.cluster);
        }
        
        return this;
    }


    /**
     * Get cluster
     * @return cluster
     */
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
        RestoreClusterResponse restoreClusterResponse = (RestoreClusterResponse) o;
        return Objects.equals(this.cluster, restoreClusterResponse.cluster);
    }
    @Override
    public int hashCode() {
        return Objects.hash(cluster);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class RestoreClusterResponse {\n");
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

