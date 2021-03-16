package com.huaweicloud.sdk.dms.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class DeleteSpecifiedConsumerGroupRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_id")
    
    private String queueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="group_id")
    
    private String groupId;

    public DeleteSpecifiedConsumerGroupRequest withQueueId(String queueId) {
        this.queueId = queueId;
        return this;
    }

    


    /**
     * Get queueId
     * @return queueId
     */
    public String getQueueId() {
        return queueId;
    }

    public void setQueueId(String queueId) {
        this.queueId = queueId;
    }

    

    public DeleteSpecifiedConsumerGroupRequest withGroupId(String groupId) {
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

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        DeleteSpecifiedConsumerGroupRequest deleteSpecifiedConsumerGroupRequest = (DeleteSpecifiedConsumerGroupRequest) o;
        return Objects.equals(this.queueId, deleteSpecifiedConsumerGroupRequest.queueId) &&
            Objects.equals(this.groupId, deleteSpecifiedConsumerGroupRequest.groupId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueId, groupId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class DeleteSpecifiedConsumerGroupRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    groupId: ").append(toIndentedString(groupId)).append("\n");
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

