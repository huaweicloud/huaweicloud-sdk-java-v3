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
public class ShowDetailsOfCustomAuthorizersV2Request  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="authorizer_id")
    
    private String authorizerId;

    public ShowDetailsOfCustomAuthorizersV2Request withInstanceId(String instanceId) {
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

    

    public ShowDetailsOfCustomAuthorizersV2Request withAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
        return this;
    }

    


    /**
     * Get authorizerId
     * @return authorizerId
     */
    public String getAuthorizerId() {
        return authorizerId;
    }

    public void setAuthorizerId(String authorizerId) {
        this.authorizerId = authorizerId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowDetailsOfCustomAuthorizersV2Request showDetailsOfCustomAuthorizersV2Request = (ShowDetailsOfCustomAuthorizersV2Request) o;
        return Objects.equals(this.instanceId, showDetailsOfCustomAuthorizersV2Request.instanceId) &&
            Objects.equals(this.authorizerId, showDetailsOfCustomAuthorizersV2Request.authorizerId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, authorizerId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowDetailsOfCustomAuthorizersV2Request {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    authorizerId: ").append(toIndentedString(authorizerId)).append("\n");
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

