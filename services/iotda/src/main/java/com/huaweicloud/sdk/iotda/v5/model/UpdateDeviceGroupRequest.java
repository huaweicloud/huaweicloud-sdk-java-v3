package com.huaweicloud.sdk.iotda.v5.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.iotda.v5.model.UpdateDeviceGroupDTO;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class UpdateDeviceGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="Instance-Id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private UpdateDeviceGroupDTO body;

    public UpdateDeviceGroupRequest withInstanceId(String instanceId) {
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

    

    public UpdateDeviceGroupRequest withGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }

    


    /**
     * Get groupId
     * @return groupId
     */
    public String getGroupId() {
        return groupId;
    }

    public void setGroupId(String groupId) {
        this.groupId = groupId;
    }

    

    public UpdateDeviceGroupRequest withBody(UpdateDeviceGroupDTO body) {
        this.body = body;
        return this;
    }

    public UpdateDeviceGroupRequest withBody(Consumer<UpdateDeviceGroupDTO> bodySetter) {
        if(this.body == null ){
            this.body = new UpdateDeviceGroupDTO();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public UpdateDeviceGroupDTO getBody() {
        return body;
    }

    public void setBody(UpdateDeviceGroupDTO body) {
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
        UpdateDeviceGroupRequest updateDeviceGroupRequest = (UpdateDeviceGroupRequest) o;
        return Objects.equals(this.instanceId, updateDeviceGroupRequest.instanceId) &&
            Objects.equals(this.groupId, updateDeviceGroupRequest.groupId) &&
            Objects.equals(this.body, updateDeviceGroupRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateDeviceGroupRequest {\n");
        sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

