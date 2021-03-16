package com.huaweicloud.sdk.meeting.v1.model;





import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonValue;
import com.huaweicloud.sdk.meeting.v1.model.RestChairTokenReqBody;
import java.util.function.Consumer;
import java.util.Objects;

/**
 * Request Object
 */
public class SetRoleRequest  {



    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="conferenceID")
    
    private String conferenceID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="participantID")
    
    private String participantID;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Conference-Authorization")
    
    private String xConferenceAuthorization;


    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="body")
    
    private RestChairTokenReqBody body;

    public SetRoleRequest withConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
        return this;
    }

    


    /**
     * Get conferenceID
     * @return conferenceID
     */
    public String getConferenceID() {
        return conferenceID;
    }

    public void setConferenceID(String conferenceID) {
        this.conferenceID = conferenceID;
    }

    

    public SetRoleRequest withParticipantID(String participantID) {
        this.participantID = participantID;
        return this;
    }

    


    /**
     * Get participantID
     * @return participantID
     */
    public String getParticipantID() {
        return participantID;
    }

    public void setParticipantID(String participantID) {
        this.participantID = participantID;
    }

    

    public SetRoleRequest withXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
        return this;
    }

    


    /**
     * Get xConferenceAuthorization
     * @return xConferenceAuthorization
     */
    @JsonInclude(JsonInclude.Include.NON_NULL)
    @JsonProperty(value="X-Conference-Authorization")
    public String getXConferenceAuthorization() {
        return xConferenceAuthorization;
    }

    public void setXConferenceAuthorization(String xConferenceAuthorization) {
        this.xConferenceAuthorization = xConferenceAuthorization;
    }

    

    public SetRoleRequest withBody(RestChairTokenReqBody body) {
        this.body = body;
        return this;
    }

    public SetRoleRequest withBody(Consumer<RestChairTokenReqBody> bodySetter) {
        if(this.body == null ){
            this.body = new RestChairTokenReqBody();
            bodySetter.accept(this.body);
        }
        
        return this;
    }


    /**
     * Get body
     * @return body
     */
    public RestChairTokenReqBody getBody() {
        return body;
    }

    public void setBody(RestChairTokenReqBody body) {
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
        SetRoleRequest setRoleRequest = (SetRoleRequest) o;
        return Objects.equals(this.conferenceID, setRoleRequest.conferenceID) &&
            Objects.equals(this.participantID, setRoleRequest.participantID) &&
            Objects.equals(this.xConferenceAuthorization, setRoleRequest.xConferenceAuthorization) &&
            Objects.equals(this.body, setRoleRequest.body);
    }
    @Override
    public int hashCode() {
        return Objects.hash(conferenceID, participantID, xConferenceAuthorization, body);
    }
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SetRoleRequest {\n");
        sb.append("    conferenceID: ").append(toIndentedString(conferenceID)).append("\n");
        sb.append("    participantID: ").append(toIndentedString(participantID)).append("\n");
        sb.append("    xConferenceAuthorization: ").append(toIndentedString(xConferenceAuthorization)).append("\n");
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

