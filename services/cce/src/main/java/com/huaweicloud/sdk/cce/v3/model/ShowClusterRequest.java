package com.huaweicloud.sdk.cce.v3.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ShowClusterRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    
    private String clusterId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="errorStatus")
    
    private String errorStatus;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="detail")
    
    private String detail;

    public ShowClusterRequest withClusterId(String clusterId) {
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

    

    public ShowClusterRequest withErrorStatus(String errorStatus) {
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

    

    public ShowClusterRequest withDetail(String detail) {
        this.detail = detail;
        return this;
    }

    


    /**
     * Get detail
     * @return detail
     */
    public String getDetail() {
        return detail;
    }

    public void setDetail(String detail) {
        this.detail = detail;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowClusterRequest showClusterRequest = (ShowClusterRequest) o;
        return Objects.equals(this.clusterId, showClusterRequest.clusterId) &&
            Objects.equals(this.errorStatus, showClusterRequest.errorStatus) &&
            Objects.equals(this.detail, showClusterRequest.detail);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, errorStatus, detail);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowClusterRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    errorStatus: ").append(toIndentedString(errorStatus)).append("\n");
        sb.append("    detail: ").append(toIndentedString(detail)).append("\n");
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

