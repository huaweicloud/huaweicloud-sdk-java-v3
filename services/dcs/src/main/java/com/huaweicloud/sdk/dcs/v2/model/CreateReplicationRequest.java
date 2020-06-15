package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.AddReplicationBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class CreateReplicationRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private AddReplicationBody body = null;

    public CreateReplicationRequest withInstanceId(String instanceId) {
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

    public CreateReplicationRequest withGroupId(String groupId) {
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

    public CreateReplicationRequest withBody(AddReplicationBody body) {
        this.body = body;
        return this;
    }

    public CreateReplicationRequest withBody(Consumer<AddReplicationBody> bodySetter) {
        if(this.body == null ){
            this.body = new AddReplicationBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public AddReplicationBody getBody() {
        return body;
    }

    public void setBody(AddReplicationBody body) {
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
        CreateReplicationRequest createReplicationRequest = (CreateReplicationRequest) o;
        return Objects.equals(this.instanceId, createReplicationRequest.instanceId) &&
            Objects.equals(this.groupId, createReplicationRequest.groupId) &&
            Objects.equals(this.body, createReplicationRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreateReplicationRequest {\n");
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

