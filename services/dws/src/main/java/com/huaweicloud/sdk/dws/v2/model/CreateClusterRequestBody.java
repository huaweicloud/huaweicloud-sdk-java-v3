package com.huaweicloud.sdk.dws.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dws.v2.model.CreateClusterReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * This is a auto create Body Object
 */
public class CreateClusterRequestBody  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster")
    
    private CreateClusterReq cluster = null;

    public CreateClusterRequestBody withCluster(CreateClusterReq cluster) {
        this.cluster = cluster;
        return this;
    }

    public CreateClusterRequestBody withCluster(Consumer<CreateClusterReq> clusterSetter) {
        if(this.cluster == null ){
            this.cluster = new CreateClusterReq();
            clusterSetter.accept(this.cluster);
        }
        
        return this;
    }


    /**
     * Get cluster
     * @return cluster
     */
    public CreateClusterReq getCluster() {
        return cluster;
    }

    public void setCluster(CreateClusterReq cluster) {
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

