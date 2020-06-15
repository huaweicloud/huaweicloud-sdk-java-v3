package com.huaweicloud.sdk.dcs.v2.model;

import java.util.Objects;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.dcs.v2.model.PriorityBody;
import com.fasterxml.jackson.annotation.*;
import com.huaweicloud.sdk.core.SdkResponse;

/**
 * Request Object
 */
public class UpdateSlavePriorityRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="instance_id")
    
    private String instanceId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="node_id")
    
    private String nodeId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private PriorityBody body = null;

    public UpdateSlavePriorityRequest withInstanceId(String instanceId) {
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

    public UpdateSlavePriorityRequest withGroupId(String groupId) {
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

    public UpdateSlavePriorityRequest withNodeId(String nodeId) {
        this.nodeId = nodeId;
        return this;
    }

    


    /**
     * Get nodeId
     * @return nodeId
     */
    public String getNodeId() {
        return nodeId;
    }

    public void setNodeId(String nodeId) {
        this.nodeId = nodeId;
    }

    public UpdateSlavePriorityRequest withBody(PriorityBody body) {
        this.body = body;
        return this;
    }

    public UpdateSlavePriorityRequest withBody(Consumer<PriorityBody> bodySetter) {
        if(this.body == null ){
            this.body = new PriorityBody();
        }
        bodySetter.accept(this.body);
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public PriorityBody getBody() {
        return body;
    }

    public void setBody(PriorityBody body) {
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
        UpdateSlavePriorityRequest updateSlavePriorityRequest = (UpdateSlavePriorityRequest) o;
        return Objects.equals(this.instanceId, updateSlavePriorityRequest.instanceId) &&
            Objects.equals(this.groupId, updateSlavePriorityRequest.groupId) &&
            Objects.equals(this.nodeId, updateSlavePriorityRequest.nodeId) &&
            Objects.equals(this.body, updateSlavePriorityRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(instanceId, groupId, nodeId, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UpdateSlavePriorityRequest {\n");
            sb.append("    instanceId: ").append(toIndentedString(instanceId)).append("\n");
            sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
            sb.append("    nodeId: ").append(toIndentedString(nodeId)).append("\n");
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

