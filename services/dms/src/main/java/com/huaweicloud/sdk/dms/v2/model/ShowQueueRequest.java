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
public class ShowQueueRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="queue_id")
    
    private String queueId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="include_deadletter")
    
    private Boolean includeDeadletter;

    public ShowQueueRequest withQueueId(String queueId) {
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

    public ShowQueueRequest withIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
        return this;
    }

    


    /**
     * Get includeDeadletter
     * @return includeDeadletter
     */
    public Boolean getIncludeDeadletter() {
        return includeDeadletter;
    }

    public void setIncludeDeadletter(Boolean includeDeadletter) {
        this.includeDeadletter = includeDeadletter;
    }
    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowQueueRequest showQueueRequest = (ShowQueueRequest) o;
        return Objects.equals(this.queueId, showQueueRequest.queueId) &&
            Objects.equals(this.includeDeadletter, showQueueRequest.includeDeadletter);
    }
    @Override
    public int hashCode() {
        return Objects.hash(queueId, includeDeadletter);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowQueueRequest {\n");
        sb.append("    queueId: ").append(toIndentedString(queueId)).append("\n");
        sb.append("    includeDeadletter: ").append(toIndentedString(includeDeadletter)).append("\n");
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

