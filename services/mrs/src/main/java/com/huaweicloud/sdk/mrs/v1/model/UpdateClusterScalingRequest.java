package com.huaweicloud.sdk.mrs.v1.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.mrs.v1.model.ClusterScalingReq;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateClusterScalingRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    
    private ClusterScalingReq body;

    public UpdateClusterScalingRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 集群ID。获取方法，请参见[获取集群ID](https://support.huaweicloud.com/api-mrs/mrs_02_9001.html)。
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public UpdateClusterScalingRequest withBody(ClusterScalingReq body) {
        this.body = body;
        return this;
    }

    public UpdateClusterScalingRequest withBody(Consumer<ClusterScalingReq> bodySetter) {
        if(this.body == null ){
            this.body = new ClusterScalingReq();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ClusterScalingReq getBody() {
        return body;
    }

    public void setBody(ClusterScalingReq body) {
        this.body = body;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UpdateClusterScalingRequest updateClusterScalingRequest = (UpdateClusterScalingRequest) o;
        return Objects.equals(this.clusterId, updateClusterScalingRequest.clusterId) &&
            Objects.equals(this.body, updateClusterScalingRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterScalingRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    body: ").append(toIndentedString(body)).append("\n");
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

