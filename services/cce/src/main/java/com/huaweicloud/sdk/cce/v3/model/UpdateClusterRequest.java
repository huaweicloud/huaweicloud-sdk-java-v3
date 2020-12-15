package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.cce.v3.model.ClusterInformation;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateClusterRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorStatus")
    
    private String errorStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private ClusterInformation body = null;

    public UpdateClusterRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * Get clusterId
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    public UpdateClusterRequest withErrorStatus(String errorStatus) {
        this.errorStatus = errorStatus;
        return this;
    }

    


    /**
     * Get errorStatus
     * @return errorStatus
     */
    public String getErrorStatus() {
        return errorStatus;
    }

    public void setErrorStatus(String errorStatus) {
        this.errorStatus = errorStatus;
    }

    public UpdateClusterRequest withBody(ClusterInformation body) {
        this.body = body;
        return this;
    }

    public UpdateClusterRequest withBody(Consumer<ClusterInformation> bodySetter) {
        if(this.body == null ){
            this.body = new ClusterInformation();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public ClusterInformation getBody() {
        return body;
    }

    public void setBody(ClusterInformation body) {
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
        UpdateClusterRequest updateClusterRequest = (UpdateClusterRequest) o;
        return Objects.equals(this.clusterId, updateClusterRequest.clusterId) &&
            Objects.equals(this.errorStatus, updateClusterRequest.errorStatus) &&
            Objects.equals(this.body, updateClusterRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, errorStatus, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    errorStatus: ").append(toIndentedString(errorStatus)).append("\n");
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

