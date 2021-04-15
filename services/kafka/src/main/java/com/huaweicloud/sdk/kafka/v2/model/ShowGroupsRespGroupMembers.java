package com.huaweicloud.sdk.kafka.v2.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.kafka.v2.model.ShowGroupsRespGroupAssignment;
import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * ShowGroupsRespGroupMembers
 */
public class ShowGroupsRespGroupMembers  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="host")
    
    private String host;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="assignment")
    
    private List<ShowGroupsRespGroupAssignment> assignment = null;
    

    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="member_id")
    
    private String memberId;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="client_id")
    
    private String clientId;

    public ShowGroupsRespGroupMembers withHost(String host) {
        this.host = host;
        return this;
    }

    


    /**
     * 消费组consumer地址。
     * @return host
     */
    public String getHost() {
        return host;
    }

    public void setHost(String host) {
        this.host = host;
    }

    

    public ShowGroupsRespGroupMembers withAssignment(List<ShowGroupsRespGroupAssignment> assignment) {
        this.assignment = assignment;
        return this;
    }

    
    public ShowGroupsRespGroupMembers addAssignmentItem(ShowGroupsRespGroupAssignment assignmentItem) {
        if(this.assignment == null) {
            this.assignment = new ArrayList<>();
        }
        this.assignment.add(assignmentItem);
        return this;
    }

    public ShowGroupsRespGroupMembers withAssignment(Consumer<List<ShowGroupsRespGroupAssignment>> assignmentSetter) {
        if(this.assignment == null) {
            this.assignment = new ArrayList<>();
        }
        assignmentSetter.accept(this.assignment);
        return this;
    }

    /**
     * consumer分配到的分区信息。
     * @return assignment
     */
    public List<ShowGroupsRespGroupAssignment> getAssignment() {
        return assignment;
    }

    public void setAssignment(List<ShowGroupsRespGroupAssignment> assignment) {
        this.assignment = assignment;
    }

    

    public ShowGroupsRespGroupMembers withMemberId(String memberId) {
        this.memberId = memberId;
        return this;
    }

    


    /**
     * 消费组consumer的ID。
     * @return memberId
     */
    public String getMemberId() {
        return memberId;
    }

    public void setMemberId(String memberId) {
        this.memberId = memberId;
    }

    

    public ShowGroupsRespGroupMembers withClientId(String clientId) {
        this.clientId = clientId;
        return this;
    }

    


    /**
     * 客户端ID。
     * @return clientId
     */
    public String getClientId() {
        return clientId;
    }

    public void setClientId(String clientId) {
        this.clientId = clientId;
    }

    

    @Override
    public boolean equals(java.lang.Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        ShowGroupsRespGroupMembers showGroupsRespGroupMembers = (ShowGroupsRespGroupMembers) o;
        return Objects.equals(this.host, showGroupsRespGroupMembers.host) &&
            Objects.equals(this.assignment, showGroupsRespGroupMembers.assignment) &&
            Objects.equals(this.memberId, showGroupsRespGroupMembers.memberId) &&
            Objects.equals(this.clientId, showGroupsRespGroupMembers.clientId);
    }
    @Override
    public int hashCode() {
        return Objects.hash(host, assignment, memberId, clientId);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class ShowGroupsRespGroupMembers {\n");
        sb.append("    host: ").append(toIndentedString(host)).append("\n");
        sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
        sb.append("    memberId: ").append(toIndentedString(memberId)).append("\n");
        sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

