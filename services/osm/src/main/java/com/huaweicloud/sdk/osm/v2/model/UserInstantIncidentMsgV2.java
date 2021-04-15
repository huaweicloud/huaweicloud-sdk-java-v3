package com.huaweicloud.sdk.osm.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.osm.v2.model.QueryMessageInfoV2;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * UserInstantIncidentMsgV2
 */
public class UserInstantIncidentMsgV2  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="incident_id")
    
    private String incidentId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="message_list")
    
    private List<QueryMessageInfoV2> messageList = null;
    
    public UserInstantIncidentMsgV2 withIncidentId(String incidentId) {
        this.incidentId = incidentId;
        return this;
    }

    


    /**
     * 工单id
     * @return incidentId
     */
    public String getIncidentId() {
        return incidentId;
    }

    public void setIncidentId(String incidentId) {
        this.incidentId = incidentId;
    }

    

    public UserInstantIncidentMsgV2 withMessageList(List<QueryMessageInfoV2> messageList) {
        this.messageList = messageList;
        return this;
    }

    
    public UserInstantIncidentMsgV2 addMessageListItem(QueryMessageInfoV2 messageListItem) {
        if(this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        this.messageList.add(messageListItem);
        return this;
    }

    public UserInstantIncidentMsgV2 withMessageList(Consumer<List<QueryMessageInfoV2>> messageListSetter) {
        if(this.messageList == null) {
            this.messageList = new ArrayList<>();
        }
        messageListSetter.accept(this.messageList);
        return this;
    }

    /**
     * 留言列表
     * @return messageList
     */
    public List<QueryMessageInfoV2> getMessageList() {
        return messageList;
    }

    public void setMessageList(List<QueryMessageInfoV2> messageList) {
        this.messageList = messageList;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        UserInstantIncidentMsgV2 userInstantIncidentMsgV2 = (UserInstantIncidentMsgV2) o;
        return Objects.equals(this.incidentId, userInstantIncidentMsgV2.incidentId) &&
            Objects.equals(this.messageList, userInstantIncidentMsgV2.messageList);
    }
    @Override
    public int hashCode() {
        return Objects.hash(incidentId, messageList);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class UserInstantIncidentMsgV2 {\n");
        sb.append("    incidentId: ").append(toIndentedString(incidentId)).append("\n");
        sb.append("    messageList: ").append(toIndentedString(messageList)).append("\n");
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

