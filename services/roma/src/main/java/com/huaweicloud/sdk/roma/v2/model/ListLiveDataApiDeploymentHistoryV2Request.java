package com.huaweicloud.sdk.roma.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class ListLiveDataApiDeploymentHistoryV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="ld_api_id")
    
    private String ldApiId;

    public ListLiveDataApiDeploymentHistoryV2Request withInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }

    


    /**
     * Get instanceId
     * @return instanceId
     */
    public String getInstanceId() {
        return instanceId;
    }

    public void setInstanceId(String instanceId) {
        this.instanceId = instanceId;
    }

    

    public ListLiveDataApiDeploymentHistoryV2Request withLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
        return this;
    }

    


    /**
     * Get ldApiId
     * @return ldApiId
     */
    public String getLdApiId() {
        return ldApiId;
    }

    public void setLdApiId(String ldApiId) {
        this.ldApiId = ldApiId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ListLiveDataApiDeploymentHistoryV2Request listLiveDataApiDeploymentHistoryV2Request = (ListLiveDataApiDeploymentHistoryV2Request) o;
        return Objects.equals(this.instanceId, listLiveDataApiDeploymentHistoryV2Request.instanceId) &&
            Objects.equals(this.ldApiId, listLiveDataApiDeploymentHistoryV2Request.ldApiId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, ldApiId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ListLiveDataApiDeploymentHistoryV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    ldApiId: ").append(toIndentedString(ldApiId)).append("\n");
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

