package com.huaweicloud.sdk.iotedge.v3.model;






import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotedge.v3.model.UpdateAppInstanceRequestDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateAppInstanceRequest  {


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="cluster_id")
    

    private String clusterId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="app_instance_id")
    

    private String appInstanceId;

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    

    private UpdateAppInstanceRequestDTO body;

    public UpdateAppInstanceRequest withClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }

    


    /**
     * 边缘集群ID
     * @return clusterId
     */
    public String getClusterId() {
        return clusterId;
    }

    public void setClusterId(String clusterId) {
        this.clusterId = clusterId;
    }

    

    public UpdateAppInstanceRequest withAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
        return this;
    }

    


    /**
     * 应用实例ID
     * @return appInstanceId
     */
    public String getAppInstanceId() {
        return appInstanceId;
    }

    public void setAppInstanceId(String appInstanceId) {
        this.appInstanceId = appInstanceId;
    }

    

    public UpdateAppInstanceRequest withBody(UpdateAppInstanceRequestDTO body) {
        this.body = body;
        return this;
    }

    public UpdateAppInstanceRequest withBody(Consumer<UpdateAppInstanceRequestDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateAppInstanceRequestDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateAppInstanceRequestDTO getBody() {
        return body;
    }

    public void setBody(UpdateAppInstanceRequestDTO body) {
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
        UpdateAppInstanceRequest updateAppInstanceRequest = (UpdateAppInstanceRequest) o;
        return Objects.equals(this.clusterId, updateAppInstanceRequest.clusterId) &&
            Objects.equals(this.appInstanceId, updateAppInstanceRequest.appInstanceId) &&
            Objects.equals(this.body, updateAppInstanceRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(clusterId, appInstanceId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateAppInstanceRequest {\n");
        sb.append("    clusterId: ").append(toIndentedString(clusterId)).append("\n");
        sb.append("    appInstanceId: ").append(toIndentedString(appInstanceId)).append("\n");
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

